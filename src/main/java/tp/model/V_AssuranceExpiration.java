package tp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "v_moisexpirationassurancedetail")
public class V_AssuranceExpiration {
    @Id
    @Column(name = "idvehicule")
    private int idVehicule;
    @Column(name = "modele")
    private String modele;
    @Column(name = "marqueidmarque")
    private int marqueidmarque;
    @Column(name = "matricule")
    private String matricule;
    @Column(name = "idmarque")
    private int idmarque;
    @Column(name = "designationmarque")
    private String designationMarque;
    @Column(name = "moisexpiration")
    private int moisexpiration;
    @Column(name = "dateexpiration")
    private Date dateExpiration;
    public Date getDateExpiration() {
        return dateExpiration;
    }
    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    public int getIdVehicule() {
        return idVehicule;
    }
    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public int getMarqueidmarque() {
        return marqueidmarque;
    }
    public void setMarqueidmarque(int marqueidmarque) {
        this.marqueidmarque = marqueidmarque;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public int getIdmarque() {
        return idmarque;
    }
    public void setIdmarque(int idmarque) {
        this.idmarque = idmarque;
    }
    public String getDesignationMarque() {
        return designationMarque;
    }
    public void setDesignationMarque(String designationMarque) {
        this.designationMarque = designationMarque;
    }
    public int getMoisexpiration() {
        return moisexpiration;
    }
    public void setMoisexpiration(int moisexpiration) {
        this.moisexpiration = moisexpiration;
    }
    
}
