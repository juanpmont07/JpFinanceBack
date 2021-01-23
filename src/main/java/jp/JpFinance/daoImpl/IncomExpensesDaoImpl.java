package jp.JpFinance.daoImpl;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jp.JpFinance.dbModel.IncomExpenses;

public interface IncomExpensesDaoImpl extends CrudRepository<IncomExpenses, Long> {

	@Query(value = "select ie.* from budget b inner join incomexpenses ie on b.id = ie.idBudget where b.id = ?1", 
			  nativeQuery = true)
			List<IncomExpenses> getAllValueById(long id);
	
}
