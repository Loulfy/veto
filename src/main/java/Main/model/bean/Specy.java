package Main.model.bean;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.*;

/**
 * Created by lcorbel on 09/02/16.
 */
@Entity
@Table(name="ESPECE")
public class Specy
{
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty intitule = new SimpleStringProperty(this, "intitule");

    public Specy(){
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID_ESPECE")
    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    @Column(name="INTITULE")
    public String getIntitule() {
        return intitule.get();
    }

    public StringProperty intituleProperty() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule.set(intitule);
    }
}
