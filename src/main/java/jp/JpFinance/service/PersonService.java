package jp.JpFinance.service;

import jp.JpFinance.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    /**
     * Metodo encardo de guardar.
     */
    public void save(Person person);

    public void update(Person person);

    public void delete(Person person);

    public Person getPerson(String ID);

    public List<Person> getAll();
}
