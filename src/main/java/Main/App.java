package Main;

import Main.model.BddContext;
import Main.model.bean.Animal;
import Main.model.bean.City;
import Main.model.bean.Rdv;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BddContext m = new BddContext();

        m.close();
    }
}
