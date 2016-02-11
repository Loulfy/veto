package Main.model.bean;

import javafx.beans.property.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lcorbel on 10/02/16.
 */

@Entity
@Table(name="RENDEZ_VOUS")
public class Rdv
{
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty object = new SimpleStringProperty(this, "object");
    private final ObjectProperty<Date> date = new SimpleObjectProperty<Date>(this, "date");

    private Set<Animal> animals = new HashSet<Animal>(0);

    public Rdv(){
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID_RDV")
    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    @Column(name = "OBJET")
    public String getObject() {
        return object.get();
    }

    public StringProperty objectProperty() {
        return object;
    }

    public void setObject(String object) {
        this.object.set(object);
    }

    @Column(name = "DATE", columnDefinition = "DATETIME")
    public Date getDate() {
        return date.get();
    }

    public ObjectProperty<Date> dateProperty() {
        return date;
    }

    public void setDate(Date date) {
        this.date.set(date);
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "PRENDRE_RDV", joinColumns = {@JoinColumn(name = "ID_RDV", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "ID_ANIMAL", nullable = false, updatable = true) })
    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
