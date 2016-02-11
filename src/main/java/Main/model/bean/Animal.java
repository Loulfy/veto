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
@Table(name="ANIMAL")
public class Animal
{
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty name = new SimpleStringProperty(this, "name");
    private final IntegerProperty weight = new SimpleIntegerProperty(this, "weight");
    private final ObjectProperty<Date> birth = new SimpleObjectProperty<Date>(this, "birth");
    private final ObjectProperty<Date> death = new SimpleObjectProperty<Date>(this, "death");

    private Race race;
    private Person person;

    private Set<Rdv> rdvs = new HashSet<Rdv>(0);

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID_ANIMAL")
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

    @Column(name = "POIDS", nullable = true)
    public int getWeight() {
        return weight.get();
    }

    public IntegerProperty weightProperty() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight.set(weight);
    }

    @Column(name = "DATE_NAISSANCE")
    public Date getBirth() {
        return birth.get();
    }

    public ObjectProperty<Date> birthProperty() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth.set(birth);
    }

    @Column(name = "DATE_DECES")
    public Date getDeath() {
        return death.get();
    }

    public ObjectProperty<Date> deathProperty() {
        return death;
    }

    public void setDeath(Date death) {
        this.death.set(death);
    }

    @OneToOne
    @JoinColumn(name = "ID_RACE")
    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    @OneToOne
    @JoinColumn(name = "ID_PERSONNE")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "animals")
    public Set<Rdv> getRdvs() {
        return rdvs;
    }

    public void setRdvs(Set<Rdv> rdvs) {
        this.rdvs = rdvs;
    }
}
