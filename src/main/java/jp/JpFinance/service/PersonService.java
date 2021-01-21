package jp.JpFinance.service;

import java.util.List;

import jp.JpFinance.dbModel.Person;

public interface PersonService {
    /**
     * Metodo encardo de guardar.
     */
    public void save(Person person);

    public void update(Person person);

    public void delete(Person person);

    public Person getPerson(String ID);

    public List<Person> getAll();
    
    public Person login(String email, String password);
}
