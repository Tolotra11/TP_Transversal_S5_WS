package tp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// CREATE OR REPLACE View V_MoisExpirationAssuranceDetail AS
// SELECT v.*,moisExpiration,dateexpiration FROM v_avion v
// JOIN V_MoisExpirationAssurance va 
// ON v.idavion = va.avionidavion;

@Entity
@Table(name = "v_moisexpirationassurancedetail")
public class V_AssuranceExpiration {
    @Id
    @Column(name= "idavion")
    private int idAvion;
    @Column(name= "matricule")
    private String matricule;
    @Column(name= "idmodele")
    private int idModele;
    @Column(name= "image")
    private String image;
    @Column(name = "nommodele")
    private String nomModele;
    @Column(name = "nbplace")
    private int nbPlace;
    @Column(name = "serie")
    private String serie;
    @Column(name = "moisexpiration")
    private double moisExpiration;
    @Column(name = "dateexpiration")
    private Date dateExpiration;
    public int getIdAvion() {
        return idAvion;
    }
    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public int getIdModele() {
        return idModele;
    }
    public void setIdModele(int idModele) {
        this.idModele = idModele;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
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
    public double getMoisExpiration() {
        return moisExpiration;
    }
    public void setMoisExpiration(double moisExpiration) {
        this.moisExpiration = moisExpiration;
    }
    public Date getDateExpiration() {
        return dateExpiration;
    }
    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    
        
}
