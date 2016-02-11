package Main.model.dao;

import Main.model.bean.Animal;

import javax.persistence.EntityManager;

/**
 * Created by lcorbel on 10/02/16.
 */
public class AnimalDao implements Dao<Animal>
{
    private EntityManager em;

    public AnimalDao(EntityManager em) {
        this.em = em;
    }

    public Animal find(int id) {
        return em.find(Animal.class, id);
    }

    public Animal saveAllChanges(Animal o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        return o;
    }
}
