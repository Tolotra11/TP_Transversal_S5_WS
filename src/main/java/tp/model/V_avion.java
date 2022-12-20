package tp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

// CREATE OR REPLACE VIEW V_avion AS 
// SELECT idAvion,matricule,idModele,image,nomModele,nbPlace,serie FROM Avion a
// JOIN Modele m 
// ON a.ModeleidModele = m.idModele;

@Entity
@Table(name = "v_avion")
public class V_avion {
    private int idAvion;
    private String matricule;
    private int idModele;
    private String image;
    private String nomModele;
    private int nbPlace;
    private String serie;
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
    
}
