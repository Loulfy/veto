package Main.model.dao;

import Main.model.bean.Animal;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by lcorbel on 10/02/16.
 */

@Singleton
public class AnimalDao implements Dao<Animal>
{
    @Inject
    private Provider<EntityManager> em;

    @Transactional
    public Object find(int id) {
        return em.get().find(Animal.class, id);
    }

    @Transactional
    public void saveAllChanges(Object o) {
        em.get().persist(o);
    }

    public List<Object> findAll() {
        return em.get().createQuery("from "+Animal.class.getName()).getResultList();
    }
}
