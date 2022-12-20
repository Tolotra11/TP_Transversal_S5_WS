package tp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "modele") 
public class Modele {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmodele")
    private int idModele;
    @Column(name = "nommodele")
    private String nomModele;
    @Column(name = "nbplace")
    private int nbPlace;
    @Column(name= "serie")
    private String serie;
    public int getIdModele() {
        return idModele;
    }
    public void setIdModele(int idModele) {
        this.idModele = idModele;
    }
    public String getNomModele() {
        return nomModele;
    }
    public void setNomModele(String nomModele) {
        this.nomModele = nomModele;
    }
    public int getNbPlace() {
        return nbPlace;
    }
    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    
}
