package jp.JpFinance.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.JpFinance.daoImpl.IncomExpensesDaoImpl;
import jp.JpFinance.dbModel.Budget;
import jp.JpFinance.dbModel.IncomExpenses;
import jp.JpFinance.service.BudgetService;
import jp.JpFinance.service.IncomeExpensesService;

@Service
@Transactional
public class IncomeExpensesServiceImpl implements IncomeExpensesService {

	@Autowired
	IncomExpensesDaoImpl incomeExpensesDao;
	
	@Autowired
	BudgetService budgetService;
	
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

	@Override
	public Budget calculateValue(Budget budget) {
		
		List<IncomExpenses> inEx = incomeExpensesDao.getAllValueById(budget.getId());
		//se trae la suma de todos ingresos
		float valueSum = (float) inEx.stream().filter(p-> p.getIsexpense() == 0).mapToDouble(l -> l.getValue()).sum();
		//se trae la suma de todos egresos
		float valueRest = (float) inEx.stream().filter(p-> p.getIsexpense() == 1).mapToDouble(l -> l.getValue()).sum();
		
		float result = valueSum - valueRest;
		
		budget.setValue(result);
		
		budgetService.update(budget);
		
		return budget;
	}

	@Override
	public void saveAll(List<IncomExpenses> incom) {
		incomeExpensesDao.saveAll(incom);
	}

}
