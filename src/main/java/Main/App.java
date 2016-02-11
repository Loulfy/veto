package Main;

import Main.model.BDD;
import Main.model.VetoContext;
import Main.model.VetoModule;
import Main.model.bean.*;

import Main.model.dao.CityDao;
import Main.model.dao.Dao;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");
        VetoContext m = BDD.createContext(BDD.State.LOCAL);

        m.begin();

        Dao t = m.cities();
        List<City> cities = t.findAll();

        for(City c : cities)
            System.out.println(c);

        m.end();
    }
}
