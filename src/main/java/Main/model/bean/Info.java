package Main.model.bean;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.*;

/**
 * Created by loulfy on 11/02/16.
 */

@Entity
@Table(name="INFORMATION")
public class Info
{
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty name = new SimpleStringProperty(this, "name");
    private final StringProperty status = new SimpleStringProperty(this, "status");
    private final StringProperty siret = new SimpleStringProperty(this, "siret");
    private final StringProperty ape = new SimpleStringProperty(this, "ape");
    private final IntegerProperty urssaf = new SimpleIntegerProperty(this, "urssaf");
    private final StringProperty address = new SimpleStringProperty(this, "address");

    private City city;

    public Info(){
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID_INFORMATION")
    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    @Column(name="NOM_ENTREPRISE")
    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    @Column(name="STATUT")
    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    @Column(name="SIRET")
    public String getSiret() {
        return siret.get();
    }

    public StringProperty siretProperty() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret.set(siret);
    }

    @Column(name="APE")
    public String getApe() {
        return ape.get();
    }

    public StringProperty apeProperty() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape.set(ape);
    }

    @Column(name="NUMERO_URSSAF")
    public int getUrssaf() {
        return urssaf.get();
    }

    public IntegerProperty urssafProperty() {
        return urssaf;
    }

    public void setUrssaf(int urssaf) {
        this.urssaf.set(urssaf);
    }

    @Column(name="ADRESSE")
    public String getAddress() {
        return address.get();
    }

    public StringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    @OneToOne
    @JoinColumn(name = "ID_VILLE", nullable = true)
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
