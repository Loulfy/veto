package Main;

import Main.model.BddContext;
import Main.model.bean.*;
import javafx.scene.control.Dialog;

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
        System.out.println("Hello World!");
        BddContext m = new BddContext();

        Account a = m.accounts().find(2);

        System.out.println(a.getLogin());

        m.close();
    }
}
