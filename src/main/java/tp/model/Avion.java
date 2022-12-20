package tp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "avion")
public  class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idavion")
    private int idAvion;

    @Column(name = "modeleidmodele")
    private int idModele;

    @Column(name = "matricule")
    private String matricule;

    @Column(name = "image")
    private String image;

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public int getIdAvion() {
        return idAvion;
    }
    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
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
    
    
}
