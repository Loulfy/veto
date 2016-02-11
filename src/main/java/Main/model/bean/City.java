package Main.model.bean;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.*;

/**
 * Created by lcorbel on 03/02/16.
 */
@Entity
@Table(name="VILLE")
public class City
{
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty name = new SimpleStringProperty(this, "name");
    private final StringProperty cp = new SimpleStringProperty(this, "cp");

    public City() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID_VILLE")
    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    @Column(name="NOM")
    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    @Column(name="CP")
    public String getCp() {
        return cp.get();
    }

    public StringProperty cpProperty() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp.set(cp);
    }

    @Override
    public String toString()
    {
        return "VILLE(ID="+id.get()+"; NAME="+name.get()+"; CP="+cp.get()+")";
    }
}
