package jp.JpFinance.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.JpFinance.daoImpl.IncomExpensesDaoImpl;
import jp.JpFinance.dbModel.IncomExpenses;
import jp.JpFinance.service.IncomeExpensesService;

@Service
@Transactional
public class IncomeExpensesServiceImpl implements IncomeExpensesService {

	@Autowired
	IncomExpensesDaoImpl incomeExpensesDao;
	
	@Override
	public void save(IncomExpenses incom) {
		incomeExpensesDao.save(incom);
	}

	@Override
	public void update(IncomExpenses incom) {
		incomeExpensesDao.save(incom);
		
	}

	@Override
	public void delete(IncomExpenses incom) {
		incomeExpensesDao.delete(incom);
		
	}

	@Override
	public List<IncomExpenses> getAll() {
		return (List<IncomExpenses>) incomeExpensesDao.findAll();
	}

}
