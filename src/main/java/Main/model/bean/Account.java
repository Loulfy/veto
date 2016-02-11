package Main.model.bean;

import javafx.beans.property.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lcorbel on 11/02/16.
 */

@Entity
@Table(name="PERSONNEL")
public class Account
{
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final StringProperty rank = new SimpleStringProperty(this, "rank");
    private final StringProperty login = new SimpleStringProperty(this, "login");
    private final StringProperty password = new SimpleStringProperty(this, "password");
    private final IntegerProperty register = new SimpleIntegerProperty(this, "register");
    private final IntegerProperty secu = new SimpleIntegerProperty(this, "secu");
    private final ObjectProperty<Date> date_entry = new SimpleObjectProperty<Date>(this, "date_entry");
    private final ObjectProperty<Date> date_leave = new SimpleObjectProperty<Date>(this, "date_leave");

    public Account(){
    }

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

    @Column(name = "RANG_UTILISATEUR", nullable = false)
    public String getRank() {
        return rank.get();
    }

    public StringProperty rankProperty() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank.set(rank);
    }

    @Column(name = "IDENTIFIANT", nullable = false, unique = true)
    public String getLogin() {
        return login.get();
    }

    public StringProperty loginProperty() {
        return login;
    }

    public void setLogin(String login) {
        this.login.set(login);
    }

    @Column(name = "MOT_DE_PASSE", nullable = false, unique = true)
    public String getPassword() {
        return password.get();
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    @Column(name = "MATRICULE", nullable = false)
    public int getRegister() {
        return register.get();
    }

    public IntegerProperty registerProperty() {
        return register;
    }

    public void setRegister(int register) {
        this.register.set(register);
    }

    @Column(name = "SECURITE_SOCIALE", nullable = false, unique = true)
    public int getSecu() {
        return secu.get();
    }

    public IntegerProperty secuProperty() {
        return secu;
    }

    public void setSecu(int secu) {
        this.secu.set(secu);
    }

    @Column(name = "DATE_ENTREE", nullable = false, columnDefinition = "DATETIME")
    public Date getDate_entry() {
        return date_entry.get();
    }

    public ObjectProperty<Date> date_entryProperty() {
        return date_entry;
    }

    public void setDate_entry(Date date_entry) {
        this.date_entry.set(date_entry);
    }

    @Column(name = "DATE_SORTIE", nullable = true, columnDefinition = "DATETIME")
    public Date getDate_leave() {
        return date_leave.get();
    }

    public ObjectProperty<Date> date_leaveProperty() {
        return date_leave;
    }

    public void setDate_leave(Date date_leave) {
        this.date_leave.set(date_leave);
    }
}
