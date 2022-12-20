CREATE TABLE Assurance (
  idAssurance    SERIAL NOT NULL, 
  datePaiement   date NOT NULL, 
  dateExpiration date NOT NULL, 
  prix           float8, 
  AvionidAvion   int4 NOT NULL, 
  PRIMARY KEY (idAssurance));
CREATE TABLE Avion (
  idAvion        SERIAL NOT NULL, 
  matricule      varchar(50) NOT NULL UNIQUE, 
  ModeleidModele int4 NOT NULL, 
  image          text, 
  PRIMARY KEY (idAvion));
CREATE TABLE Entretien (
  idEntretien                  SERIAL NOT NULL, 
  dateEntretien                date NOT NULL, 
  TypeEntretienidTypeEntretien int4 NOT NULL, 
  AvionidAvion                 int4 NOT NULL, 
  PRIMARY KEY (idEntretien));
CREATE TABLE Kilometrage (
  idKilometrage   SERIAL NOT NULL, 
  dateKilometrage date NOT NULL, 
  debutKm         float8 NOT NULL, 
  finKm           float8 NOT NULL, 
  AvionidAvion    int4 NOT NULL, 
  PRIMARY KEY (idKilometrage));
CREATE TABLE Modele (
  idModele  SERIAL NOT NULL, 
  nomModele varchar(50) NOT NULL, 
  nbPlace   int4 NOT NULL, 
  serie     varchar(20) NOT NULL, 
  PRIMARY KEY (idModele));
CREATE TABLE TypeEntretien (
  idTypeEntretien SERIAL NOT NULL, 
  type            varchar(50) NOT NULL, 
  PRIMARY KEY (idTypeEntretien));
CREATE TABLE Utilisateur (
  idUtilisateur SERIAL NOT NULL, 
  email         varchar(50) NOT NULL, 
  mdp           varchar(50) NOT NULL, 
  PRIMARY KEY (idUtilisateur));
ALTER TABLE Avion ADD CONSTRAINT FKAvion445296 FOREIGN KEY (ModeleidModele) REFERENCES Modele (idModele);
ALTER TABLE Kilometrage ADD CONSTRAINT FKKilometrag349088 FOREIGN KEY (AvionidAvion) REFERENCES Avion (idAvion);
ALTER TABLE Entretien ADD CONSTRAINT FKEntretien930062 FOREIGN KEY (TypeEntretienidTypeEntretien) REFERENCES TypeEntretien (idTypeEntretien);
ALTER TABLE Entretien ADD CONSTRAINT FKEntretien783295 FOREIGN KEY (AvionidAvion) REFERENCES Avion (idAvion);
ALTER TABLE Assurance ADD CONSTRAINT FKAssurance14862 FOREIGN KEY (AvionidAvion) REFERENCES Avion (idAvion);
