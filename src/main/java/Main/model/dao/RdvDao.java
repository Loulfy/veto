package Main.model.dao;

import Main.model.bean.Rdv;

import javax.persistence.EntityManager;
import java.util.Enumeration;

/**
 * Created by loulfy on 11/02/16.
 */
public class RdvDao implements Dao<Rdv>
{
    private EntityManager em;

    public RdvDao(EntityManager em) {
        this.em = em;
    }

    public Rdv find(int id) {
        return em.find(Rdv.class, id);
    }

    public Rdv saveAllChanges(Rdv o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        return o;
    }
}
