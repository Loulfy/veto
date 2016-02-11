package Main.model;

import Main.model.bean.Rdv;
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

    public BddContext()
    {
        em = Persistence.createEntityManagerFactory("VETO").createEntityManager();
        cities = new CityDao(em);
        persons = new PersonDao(em);
        species = new SpecyDao(em);
        races = new RaceDao(em);
        animals = new AnimalDao(em);
        rdvs = new RdvDao(em);
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

    public void close()
    {
        em.close();
    }
}
