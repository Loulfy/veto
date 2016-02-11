package Main;

import Main.model.BddContext;
import Main.model.bean.Account;
import Main.model.bean.Person;
import javafx.application.Application;
import javafx.scene.control.Dialog;
import javafx.stage.Stage;

/**
 * Created by lcorbel on 11/02/16.
 */
public class Fx extends Application
{
    @Override
    public void start(Stage primaryStage){
        BddContext m = new BddContext();

        Account a = m.accounts().find(1);

        Dialog<Person> test = new Dialog<Person>();
        m.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
