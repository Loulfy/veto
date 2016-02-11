package Main.model;

import Main.model.dao.*;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by lcorbel on 04/02/16.
 */
public class BddContext
{
    private EntityManager em;

    private CityDao cities;
    private PersonDao persons;
    private SpecyDao species;
    private RaceDao races;
    private AnimalDao animals;
    private RdvDao rdvs;
    private AccountDao accounts;
    private HolidayDao holidays;

    public BddContext()
    {
        em = Persistence.createEntityManagerFactory("ONLINE").createEntityManager();
        cities = new CityDao(em);
        persons = new PersonDao(em);
        species = new SpecyDao(em);
        races = new RaceDao(em);
        animals = new AnimalDao(em);
        rdvs = new RdvDao(em);
        accounts = new AccountDao(em);
        holidays = new HolidayDao(em);

    }

    public CityDao cities()
    {
        return cities;
    }

    public PersonDao persons() { return persons; }

    public SpecyDao species() { return species; }

    public RaceDao races() { return races; }

    public AnimalDao animals() { return animals; }

    public RdvDao rdvs() { return rdvs; }

    public AccountDao accounts() { return accounts; }

    public HolidayDao holidays() { return holidays; }

    public void close()
    {
        em.close();
    }
}
