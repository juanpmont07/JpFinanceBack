package jp.JpFinance.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.JpFinance.daoImpl.BudgetDaoImpl;
import jp.JpFinance.dbModel.Budget;
import jp.JpFinance.service.BudgetService;

@Service
@Transactional
public class BudgetServiceImpl implements BudgetService {

	@Autowired
	BudgetDaoImpl budgetDaoImpl;
	
	
	@Override
	public void save(Budget budget) {
		budgetDaoImpl.save(budget);
		
	}

	@Override
	public void update(Budget budget) {
		budgetDaoImpl.save(budget);
		
	}

	@Override
	public void delete(Budget budget) {
		budgetDaoImpl.delete(budget);
	}

	@Override
	public List<Budget> getAll() {
		return (List<Budget>) budgetDaoImpl.findAll();
	}

}
