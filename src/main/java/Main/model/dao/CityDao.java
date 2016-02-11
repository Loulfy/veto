package Main.model.dao;

import Main.model.bean.City;

import javax.persistence.EntityManager;

/**
 * Created by lcorbel on 04/02/16.
 */
public class CityDao implements Dao<City>
{
    private EntityManager em;

    public CityDao(EntityManager em) {
        this.em = em;
    }

    public City find(int id) {
        return em.find(City.class, id);
    }

    public City saveAllChanges(City o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        return o;
    }
}
