package jp.JpFinance.daoImpl;

import org.springframework.data.repository.CrudRepository;

import jp.JpFinance.dbModel.Budget;

public interface BudgetDaoImpl extends CrudRepository<Budget, Long> {

}
