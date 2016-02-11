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
@Table(name="RACE")
public class Race
{
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty intitule = new SimpleStringProperty(this, "intitule");

    private Specy specy;

    public Race() {
    }

    @OneToOne
    @JoinColumn(name = "ID_ESPECE")
    public Specy getSpecy() {
        return specy;
    }

    public void setSpecy(Specy specy) {
        this.specy = specy;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID_RACE")
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
