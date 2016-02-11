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

import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        System.out.println("Hello World!");
        VetoContext m = BDD.createContext(BDD.State.LOCAL);

        m.begin();

        Dao t = m.accounts();
        Account a = (Account) t.find(1);

        /*
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = formatter.parse("10-05-2016");
        Date date2 = formatter.parse("10-42-2666");
        Holiday h = new Holiday();
        h.setAccount(a);
        h.setBegin(date1);
        h.setEnd(date2);*/

        /*
        Account a = new Account();
        a.setPerson((Person) m.persons().find(1));
        a.setDate_entry(new Date());
        a.setLogin("srenouleau");
        a.setPassword("pouet");
        a.setRank("admin");
        a.setRegister(42);
        a.setSecu(666);
        m.accounts().saveAllChanges(a);*/

        //m.holidays().saveAllChanges(h);

        for(Holiday h : a.getHolidays())
            System.out.println(h.getBegin());

        m.end();
    }
}
