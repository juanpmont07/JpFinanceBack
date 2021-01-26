package jp.JpFinance.service;

import java.util.List;

import jp.JpFinance.dbModel.Budget;
import jp.JpFinance.dbModel.IncomExpenses;

public interface IncomeExpensesService {


    public void save(IncomExpenses person);
    
    public void saveAll(List<IncomExpenses> person);

    public void update(IncomExpenses person);

    public void delete(IncomExpenses person);

    public List<IncomExpenses> getAll();

	public Budget calculateValue(Budget budget);
	
}
