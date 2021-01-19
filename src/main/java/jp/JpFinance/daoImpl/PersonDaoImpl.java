package jp.JpFinance.daoImpl;

import org.springframework.data.repository.CrudRepository;

import jp.JpFinance.model.Person;
import org.springframework.stereotype.Repository;

public interface PersonDaoImpl extends CrudRepository<Person, Long>{

}
