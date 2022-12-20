package tp.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


// CREATE OR REPLACE VIEW v_avionDetails AS 
// SELECT idAvion,matricule,idModele,image,nomModele,nbPlace,serie,idEntretien,dateEntretien,idTypeEntretien,type,idKilometrage,dateKilometrage,debutKm,finKm,idAssurance,datePaiement,dateExpiration,prix FROM V_avion va
// JOIN V_entretien ve 
// ON va.idAvion = ve.AvionidAvion
// JOIN Kilometrage k
// ON va.idAvion = k.AvionidAvion
// JOIN Assurance a
// ON va.idAvion = a.AvionidAvion;

@Entity
@Table(name = "v_aviondetails")
public class V_avionDetails {
    @Id
    @Column(name = "idavion")
    private int idAvion;
    @Column(name = "matricule")
    private String matricule;
    @Column(name= "idmodele")
    private int idModele;
    @Column(name = "image")
    private String image;
    @Column(name = "nommodele")
    private String nomModele;
    @Column(name = "nbplace")
    private int nbPlace;
    @Column(name = "serie")
    private String serie;
    @Column(name = "identretien")
    private int idEntretien;
    @Column(name = "dateentretien")
    private Date dateEntretien;
    @Column(name = "idtypeentretien")
    private int idTypeEntretien;
    @Column(name = "type")
    private String type;
    @Column(name = "idkilometrage")
    private int idKilometrage;
    @Column(name = "datekilometrage")
    private Date dateKilometrage;
    @Column(name = "debutkm")
    private double debutKm;
    @Column(name = "finkm")
    private double finKm;
    @Column(name = "idassurance")
    private int idAssurance;
    @Column(name = "datepaiement")
    private Date datePaiement;
    @Column(name = "dateexpiration")
    private Date dateExpiration;
    @Column(name = "prix")
    private double prix;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getIdKilometrage() {
        return idKilometrage;
    }
    public void setIdKilometrage(int idKilometrage) {
        this.idKilometrage = idKilometrage;
    }
    public Date getDateKilometrage() {
        return dateKilometrage;
    }
    public void setDateKilometrage(Date dateKilometrage) {
        this.dateKilometrage = dateKilometrage;
    }
    public double getDebutKm() {
        return debutKm;
    }
    public void setDebutKm(double debutKm) {
        this.debutKm = debutKm;
    }
    public double getFinKm() {
        return finKm;
    }
    public void setFinKm(double finKm) {
        this.finKm = finKm;
    }
    public int getIdAssurance() {
        return idAssurance;
    }
    public void setIdAssurance(int idAssurance) {
        this.idAssurance = idAssurance;
    }
    public Date getDatePaiement() {
        return datePaiement;
    }
    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }
    public Date getDateExpiration() {
        return dateExpiration;
    }
    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}
