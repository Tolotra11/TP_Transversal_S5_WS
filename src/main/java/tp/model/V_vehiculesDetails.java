package tp.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "v_vehiculedetails")
public class V_vehiculesDetails {
    @Id
    @Column(name = "idvehicule")
    private int idVehicule;
    @Column(name = "idmarque")
    private int idMarque;
    @Column( name = "modele")
    private String modele;
    @Column(name = "matricule")
    private String matricule;
    @Column(name = "totalkm")
    private Double totalKm;
    @Column(name = "designationmarque")
    private String designationMarque;
    public String getDesignationMarque() {
        return designationMarque;
    }
    public void setDesignationMarque(String designationMarque) {
        this.designationMarque = designationMarque;
    }
    public int getIdVehicule() {
        return idVehicule;
    }
    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }
    public Integer getIdMarque() {
        return idMarque;
    }
    public void setIdMarque(Integer idMarque) {
        if(idMarque == null){
            this.idMarque = 0;
        }
        else{
            this.idMarque = idMarque;
        }        
        
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public void setIdMarque(int idMarque) {
        this.idMarque = idMarque;
    }
    public Double getTotalKm() {
        return totalKm;
    }
    public void setTotalKm(Double totalKm) {
        this.totalKm = totalKm;
    }
    
}
