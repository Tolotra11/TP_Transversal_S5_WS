CREATE TABLE Modele (
  idModele  SERIAL NOT NULL, 
  nomModele varchar(50) NOT NULL, 
  nbPlace   int4 NOT NULL, 
  serie     varchar(20) NOT NULL, 
  PRIMARY KEY (idModele));

insert into Modele values(default,'Airbus',359,'A340');
insert into Modele values(default,'Airbus',520,'A380');
insert into Modele values(default,'Boeing',408,'777');
insert into Modele values(default,'Boeing',524,'747');
insert into Modele values(default,'Boeing',400,'787');

CREATE TABLE Avion (
  idAvion        SERIAL NOT NULL, 
  matricule      varchar(50) NOT NULL UNIQUE, 
  ModeleidModele int4 NOT NULL, 
  image          text, 
  PRIMARY KEY (idAvion));

  insert into Avion values(default,'5R-ZTI',1,null);
  insert into Avion values(default,'5R-RPT',2,null);
  insert into Avion values(default,'5R-MAP',3,null);
  insert into Avion values(default,'5R-WRE',4,null);
  insert into Avion values(default,'5R-TVZ',5,null);


CREATE TABLE Assurance (
  idAssurance    SERIAL NOT NULL, 
  datePaiement   date NOT NULL, 
  dateExpiration date NOT NULL, 
  prix           float8, 
  AvionidAvion   int4 NOT NULL, 
  PRIMARY KEY (idAssurance));

  insert into Assurance values (default,'2022-12-18','2023-03-18',70000.00,1);
  insert into Assurance values (default,'2022-11-11','2022-12-11',20000.00,2);
  insert into Assurance values (default,'2022-12-07','2023-06-07',140000.00,3);
  insert into Assurance values (default,'2022-10-20','2023-01-20',70000.00,4);
  insert into Assurance values (default,'2022-12-02','2023-12-02',280000.00,5);

CREATE TABLE TypeEntretien (
  idTypeEntretien SERIAL NOT NULL, 
  type            varchar(50) NOT NULL, 
  PRIMARY KEY (idTypeEntretien));

  insert into TypeEntretien values(default,'vidange');
  insert into TypeEntretien values(default,'pneu');
  insert into TypeEntretien values(default,'ailes');
  insert into TypeEntretien values(default,'frein');




CREATE TABLE Entretien (
  idEntretien                  SERIAL NOT NULL, 
  dateEntretien                date NOT NULL, 
  TypeEntretienidTypeEntretien int4 NOT NULL, 
  AvionidAvion                 int4 NOT NULL, 
  PRIMARY KEY (idEntretien));

  insert into Entretien values(default,'2022-12-28',1,1);
  insert into Entretien values(default,'2023-04-04',2,2);
  insert into Entretien values(default,'2023-05-01',3,3);
  insert into Entretien values(default,'2023-02-10',4,4);
  insert into Entretien values(default,'2023-02-07',4,5);


CREATE TABLE Kilometrage (
  idKilometrage   SERIAL NOT NULL, 
  dateKilometrage date NOT NULL, 
  debutKm         float8 NOT NULL, 
  finKm           float8 NOT NULL, 
  AvionidAvion    int4 NOT NULL, 
  PRIMARY KEY (idKilometrage));

  insert into Kilometrage values(default,'2022-12-24',60756.17,66578.48,1);
  insert into Kilometrage values(default,'2022-12-26',66578.48,70578.48,1);
  insert into Kilometrage values(default,'2022-12-27',70578.48,75431.02,1);

  insert into Kilometrage values(default,'2022-12-21',120756.04,124578.08,2);
  insert into Kilometrage values(default,'2022-12-22',120756.04,124578.08,2);

  insert into Kilometrage values(default,'2022-12-30',208431.14,214135.13,3);
  insert into Kilometrage values(default,'2022-12-31',2214135.13,228135.08,3);
  insert into Kilometrage values(default,'2023-01-02',228135.08,232135.13,3);

  insert into Kilometrage values(default,'2022-12-30',80471.07,86578.41,4);
  insert into Kilometrage values(default,'2022-12-31',86578.41,90047.89,4);

  insert into Kilometrage values(default,'2022-12-22',90123.17,95934.10,5);
  insert into Kilometrage values(default,'2022-12-24',95934.10,100434.11,5);
  insert into Kilometrage values(default,'2022-12-25',100434.11,103934.10,5);



CREATE TABLE Utilisateur (
  idUtilisateur SERIAL NOT NULL, 
  email         varchar(50) NOT NULL, 
  mdp           varchar(50) NOT NULL, 
  PRIMARY KEY (idUtilisateur));

insert into Utilisateur values(default,'groupe1@gmail.com',md5('root'));

ALTER TABLE Avion ADD CONSTRAINT FKAvion445296 FOREIGN KEY (ModeleidModele) REFERENCES Modele (idModele);
ALTER TABLE Kilometrage ADD CONSTRAINT FKKilometrag349088 FOREIGN KEY (AvionidAvion) REFERENCES Avion (idAvion);
ALTER TABLE Entretien ADD CONSTRAINT FKEntretien930062 FOREIGN KEY (TypeEntretienidTypeEntretien) REFERENCES TypeEntretien (idTypeEntretien);
ALTER TABLE Entretien ADD CONSTRAINT FKEntretien783295 FOREIGN KEY (AvionidAvion) REFERENCES Avion (idAvion);
ALTER TABLE Assurance ADD CONSTRAINT FKAssurance14862 FOREIGN KEY (AvionidAvion) REFERENCES Avion (idAvion);
