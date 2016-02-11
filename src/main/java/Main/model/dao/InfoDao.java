package Main.model.dao;

import Main.model.bean.Info;
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
public class InfoDao implements Dao<Info>
{
    @Inject
    private Provider<EntityManager> em;

    @Transactional
    public Object find(int id) {
        return em.get().find(Info.class, id);
    }

    @Transactional
    public void saveAllChanges(Object o) {
        em.get().persist(o);
    }

    @Transactional
    public List<Object> findAll() {
        return em.get().createQuery("from "+Info.class.getName()).getResultList();
    }
}
