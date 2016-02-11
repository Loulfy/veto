package Main.model.dao;

import Main.model.bean.Specy;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by lcorbel on 09/02/16.
 */

@Singleton
public class SpecyDao implements Dao<Specy>
{
    @Inject
    private Provider<EntityManager> em;

    @Transactional
    public Object find(int id) {
        return em.get().find(Specy.class, id);
    }

    @Transactional
    public void saveAllChanges(Object o) {
        em.get().persist(o);
    }

    public List<Object> findAll() {
        return em.get().createQuery("from "+Specy.class.getName()).getResultList();
    }
}
