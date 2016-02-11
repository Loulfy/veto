package Main.model;

import Main.model.bean.Holiday;
import Main.model.dao.*;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created by loulfy on 11/02/16.
 */
public class VetoModule extends AbstractModule
{
    @Override
    protected final void configure() {
        bind(VetoContext.class);
        bind(Dao.class).annotatedWith(Names.named("City")).to(CityDao.class);
        bind(Dao.class).annotatedWith(Names.named("Person")).to(PersonDao.class);
        bind(Dao.class).annotatedWith(Names.named("Specy")).to(SpecyDao.class);
        bind(Dao.class).annotatedWith(Names.named("Race")).to(RaceDao.class);
        bind(Dao.class).annotatedWith(Names.named("Animal")).to(AnimalDao.class);
        bind(Dao.class).annotatedWith(Names.named("Rdv")).to(RdvDao.class);
        bind(Dao.class).annotatedWith(Names.named("Account")).to(AccountDao.class);
        bind(Dao.class).annotatedWith(Names.named("Holiday")).to(HolidayDao.class);
    }
}
