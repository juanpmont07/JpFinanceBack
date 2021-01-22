package jp.JpFinance.daoImpl;

import org.springframework.data.repository.CrudRepository;

import jp.JpFinance.dbModel.IncomExpenses;

public interface IncomExpensesDaoImpl extends CrudRepository<IncomExpenses, Long> {

	
}
