package jp.JpFinance.service;

import java.util.List;

import jp.JpFinance.dbModel.Budget;

public interface BudgetService {


    public void save(Budget budget);

    public void update(Budget budget);

    public void delete(Budget budget);

    public List<Budget> getAll();
	
}
