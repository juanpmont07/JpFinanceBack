package jp.JpFinance.daoImpl;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jp.JpFinance.dbModel.Person;

public interface PersonDaoImpl extends CrudRepository<Person, Long>{

	
	@Query(value = "select * from person where email = ?1 and password = ?2", 
			  nativeQuery = true)
			Person validateEmail(String email, String password);
}
