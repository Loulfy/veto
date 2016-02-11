package Main.model.dao;

import Main.model.bean.Holiday;

import javax.persistence.EntityManager;

/**
 * Created by lcorbel on 11/02/16.
 */
public class HolidayDao implements Dao<Holiday>
{
    private EntityManager em;

    public HolidayDao(EntityManager em) {
        this.em = em;
    }

    public Holiday find(int id) {
        return em.find(Holiday.class, id);
    }

    public Holiday saveAllChanges(Holiday o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        return o;
    }
}
