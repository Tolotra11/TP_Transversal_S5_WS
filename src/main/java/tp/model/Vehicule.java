package tp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "vehicule")
public  class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvehicule")
    private int idVehicule;

    @Column(name = "marqueidmarque")
    private int MarqueidMarque;

    @Column(name = "modele")
    private String modele;

    @Column(name = "matricule")
    private String matricule;

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public int getIdVehicule() {
        return idVehicule;
    }
    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }  
    public int getMarqueidMarque() {
        return MarqueidMarque;
    }
    public void setMarqueidMarque(int marqueidMarque) {
        MarqueidMarque = marqueidMarque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
   
}
