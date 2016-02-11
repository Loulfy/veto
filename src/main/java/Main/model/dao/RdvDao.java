package Main.model.dao;

import Main.model.bean.Rdv;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by loulfy on 11/02/16.
 */

@Singleton
public class RdvDao implements Dao<Rdv>
{
    @Inject
    private Provider<EntityManager> em;

    @Transactional
    public Object find(int id) {
        return em.get().find(Rdv.class, id);
    }

    @Transactional
    public void saveAllChanges(Object o) {
        em.get().persist(o);
    }

    public List<Object> findAll() {
        return em.get().createQuery("from "+Rdv.class.getName()).getResultList();
    }
}
