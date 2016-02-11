package Main.model.bean;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.*;

/**
 * Created by lcorbel on 05/02/16.
 */

@Entity
@Table(name="PERSONNE")
public class Person
{
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty name = new SimpleStringProperty(this, "name");
    private final StringProperty firstname = new SimpleStringProperty(this, "firstname");
    private final StringProperty adress = new SimpleStringProperty(this, "adress");
    private final StringProperty email = new SimpleStringProperty(this, "email");

    private City city;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID_PERSONNE")
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

    @Column(name="PRENOM")
    public String getFirstname() {
        return firstname.get();
    }

    public StringProperty firstnameProperty() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname.set(firstname);
    }

    @Column(name="ADRESSE")
    public String getAdress() {
        return adress.get();
    }

    public StringProperty adressProperty() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress.set(adress);
    }

    @Column(name="EMAIL")
    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    @OneToOne
    @JoinColumn(name = "ID_VILLE", nullable = true)
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "PERSON(ID="+id.get()+"; NAME="+name.get()+"; FIRSTNAME="+firstname.get()+")";
    }
}
