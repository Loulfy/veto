package Main.model.dao;

import Main.model.bean.Specy;

import javax.persistence.EntityManager;

/**
 * Created by lcorbel on 09/02/16.
 */
public class SpecyDao implements Dao<Specy>
{
    private EntityManager em;

    public SpecyDao(EntityManager em) {
        this.em = em;
    }

    public Specy find(int id) {
        return em.find(Specy.class, id);
    }

    public Specy saveAllChanges(Specy o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        return o;
    }
}
