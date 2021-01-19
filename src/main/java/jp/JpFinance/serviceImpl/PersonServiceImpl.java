package jp.JpFinance.serviceImpl;

import jp.JpFinance.daoImpl.PersonDaoImpl;
import jp.JpFinance.model.Person;
import jp.JpFinance.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
    @Autowired//dependencia que dice que se va a dar inyeccion de dependencias
    PersonDaoImpl personDao;

    @Override
    public void save(Person person) {
        personDao.save(person);

    }

    @Override
    public void update(Person person) {
        personDao.save(person);
    }

    @Override
    public void delete(Person person) {
        personDao.delete(person);

    }

    @Override
    public Person getPerson(String ID) {
        return personDao.findById(Long.parseLong(ID)).get();
    }

    @Override
    public List<Person> getAll() {
        return (List<Person>) personDao.findAll();
    }
}
