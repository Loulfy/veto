package Main.model.dao;

import Main.model.bean.Person;

import javax.persistence.EntityManager;

/**
 * Created by lcorbel on 08/02/16.
 */
public class PersonDao implements Dao<Person>
{
    private EntityManager em;

    public PersonDao(EntityManager em) {
        this.em = em;
    }

    public Person find(int id) {
        return em.find(Person.class, id);
    }

    public Person saveAllChanges(Person o) {
        return null;
    }
}
