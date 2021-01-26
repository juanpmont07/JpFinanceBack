package jp.JpFinance.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import jp.JpFinance.model.CreditSimulator;
import jp.JpFinance.model.MonthlyFee;
import jp.JpFinance.service.CreditSimulatorService;

@Service
@Transactional
public class CreditSimulatorServiceImpl implements CreditSimulatorService {

	@Override
	public CreditSimulator calculateQuotas(CreditSimulator creditSim) {
		
		float interest = (float) (creditSim.getInterest() * 0.01);
		
		float valueFee = creditSim.getValue() / creditSim.getNumberFee();
		
		float capitalValue = creditSim.getValue();
		
		float valueTotal = 0;
		
		List<MonthlyFee> monthlyFee = new ArrayList<>();
				
		for (int i = 0; i < creditSim.getNumberFee(); i++) {
			
			MonthlyFee fee = new MonthlyFee();
			fee.setDescription("Month " + (i+1));
			fee.setInterest(capitalValue * interest);
			fee.setValue(valueFee);
			fee.setTotalValue(valueFee + fee.getInterest());
			
			capitalValue = capitalValue - valueFee;
			valueTotal = valueTotal + fee.getTotalValue();
			
			monthlyFee.add(fee);
		}
		
		creditSim.setFee(monthlyFee);
		creditSim.setValueTotal(valueTotal);
		
		
		return creditSim;
	}
	

}
