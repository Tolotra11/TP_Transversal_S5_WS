package tp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "typentretien")
public class TypeEntretien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtypeentretien")
    private int idTypeEntretien ;
    @Column(name = "type")
    private String type;
    public int getIdTypeEntretien() {
        return idTypeEntretien;
    }
    public void setIdTypeEntretien(int idTypeEntretien) {
        this.idTypeEntretien = idTypeEntretien;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
