package tp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kilometrage")
public class Kilometrage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idkilometrage")
    private int idKilometrage;
    public int getIdKilometrage() {
        return idKilometrage;
    }
    public void setIdKilometrage(int idKilometrage) {
        this.idKilometrage = idKilometrage;
    }
    @Column(name = "datekilometrage")
    private Date dateKilometrage;
    public Date getDateKilometrage() {
        return dateKilometrage;
    }
    public void setDateKilometrage(Date dateKilometrage) {
        this.dateKilometrage = dateKilometrage;
    }
    @Column(name = "debutkm")
    private double debutKm;
    public double getDebutKm() {
        return debutKm;
    }
    public void setDebutKm(double debutKm) {
        this.debutKm = debutKm;
    }
    @Column(name = "finkm")
    private double finKm;
    public double getFinKm() {
        return finKm;
    }
    public void setFinKm(double finKm) {
        this.finKm = finKm;
    }
    @Column(name = "avionidavion")
    private int avionIdAvion;
    public int getAvionIdAvion() {
        return avionIdAvion;
    }
    public void setAvionIdAvion(int avionIdAvion) {
        this.avionIdAvion = avionIdAvion;
    }
}
