package Main.model.dao;

import Main.model.bean.Race;

import javax.persistence.EntityManager;

/**
 * Created by lcorbel on 10/02/16.
 */
public class RaceDao implements Dao<Race>
{
    private EntityManager em;

    public RaceDao(EntityManager em) {
        this.em = em;
    }

    public Race find(int id) {
        return em.find(Race.class, id);
    }

    public Race saveAllChanges(Race o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        return o;
    }
}
