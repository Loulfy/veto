package Main.model.dao;

import Main.model.bean.Account;

import javax.persistence.EntityManager;

/**
 * Created by lcorbel on 11/02/16.
 */
public class AccountDao implements Dao<Account>
{
    private EntityManager em;

    public AccountDao(EntityManager em) {
        this.em = em;
    }

    public Account find(int id) {
        return em.find(Account.class, id);
    }

    public Account saveAllChanges(Account o) {
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
        return o;
    }
}
