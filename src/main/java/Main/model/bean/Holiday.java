package Main.model.bean;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lcorbel on 11/02/16.
 */

@Entity
@Table(name="CONGE")
public class Holiday
{
    private final IntegerProperty id = new SimpleIntegerProperty(this, "id");
    private final ObjectProperty<Date> begin = new SimpleObjectProperty<Date>(this, "begin");
    private final ObjectProperty<Date> end = new SimpleObjectProperty<Date>(this, "end");

    private Account account;

    public Holiday(){
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID_CONGE")
    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    @Column(name = "DATE_DEBUT", columnDefinition = "DATETIME", nullable = false)
    public Date getBegin() {
        return begin.get();
    }

    public ObjectProperty<Date> beginProperty() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin.set(begin);
    }

    @Column(name = "DATE_FIN", columnDefinition = "DATETIME", nullable = false)
    public Date getEnd() {
        return end.get();
    }

    public ObjectProperty<Date> endProperty() {
        return end;
    }

    public void setEnd(Date end) {
        this.end.set(end);
    }

    @OneToOne
    @JoinColumn(name = "ID_PERSONNE", nullable = false)
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
