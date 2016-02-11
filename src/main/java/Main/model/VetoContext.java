package Main.model;

import Main.model.dao.Dao;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.persist.UnitOfWork;

/**
 * Created by lcorbel on 04/02/16.
 */

@Singleton
public class VetoContext
{
    @Inject
    private UnitOfWork database;

    @Inject
    @Named("City")
    private Dao cities;
    @Inject
    @Named("Person")
    private Dao persons;
    @Inject
    @Named("Specy")
    private Dao species;
    @Inject
    @Named("Race")
    private Dao races;
    @Inject
    @Named("Animal")
    private Dao animals;
    @Inject
    @Named("Rdv")
    private Dao rdvs;
    @Inject
    @Named("Account")
    private Dao accounts;
    @Inject
    @Named("Holiday")
    private Dao holidays;
    @Inject
    @Named("Info")
    private Dao infos;

    public void begin()
    {
        database.begin();
    }

    public void end()
    {
        database.end();
    }

    public Dao cities() { return cities; }

    public Dao persons() { return persons; }

    public Dao species() { return species; }

    public Dao races() { return races; }

    public Dao animals() { return animals; }

    public Dao rdvs() { return rdvs; }

    public Dao accounts() { return accounts; }

    public Dao holidays() { return holidays; }

    public Dao infos() { return infos; }
}
