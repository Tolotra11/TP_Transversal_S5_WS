package tp.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "entretien")
public class Entretien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identretien")
    private int idEntretien;
    @Column(name = "dateentretien")
    private Date dateEntretien;
    @Column(name = "idtypeentretien")
    private int idTypeEntretien;
    @Column(name = "idavion")
    private int idAvion;
    public int getIdEntretien() {
        return idEntretien;
    }
    public void setIdEntretien(int idEntretien) {
        this.idEntretien = idEntretien;
    }
    public Date getDateEntretien() {
        return dateEntretien;
    }
    public void setDateEntretien(Date dateEntretien) {
        this.dateEntretien = dateEntretien;
    }
    public int getIdTypeEntretien() {
        return idTypeEntretien;
    }
    public void setIdTypeEntretien(int idTypeEntretien) {
        this.idTypeEntretien = idTypeEntretien;
    }
    public int getIdAvion() {
        return idAvion;
    }
    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }
    
}
