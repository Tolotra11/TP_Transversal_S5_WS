package tp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "assurancedetail")
public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idassurancedetail")
    private int id;
    @Column(name = "datepaiement")
    private Date datepaiement;
    @Column(name = "dateexpiration")
    private Date dateexpiration;
    @Column(name = "prix")
    private double prix;
    @Column(name = "vehiculeidvehicule")
    private int vehiculeidvehicule;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDatepaiement() {
        return datepaiement;
    }
    public void setDatepaiement(Date datepaiement) {
        this.datepaiement = datepaiement;
    }
    public Date getDateexpiration() {
        return dateexpiration;
    }
    public void setDateexpiration(Date dateexpiration) {
        this.dateexpiration = dateexpiration;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getVehiculeidvehicule() {
        return vehiculeidvehicule;
    }
    public void setVehiculeidvehicule(int vehiculeidvehicule) {
        this.vehiculeidvehicule = vehiculeidvehicule;
    }
    
}
