package tp.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import tp.model.Error;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tp.repository.KilometrageRepository;
import tp.model.Kilometrage;
@CrossOrigin
@RestController
public class KilometrageController {
    private final KilometrageRepository repository;
    public KilometrageController(KilometrageRepository rep){
        this.repository = rep;
    }
    @GetMapping("/Kilometrages")
    public HashMap<String,Object> findAll(){
        List<Kilometrage> liste = null;
        HashMap<String,Object> map = null;
        try{
            liste = repository.findAll();
            map = new HashMap<>();
            map.put("data", liste);
        }
        catch(Exception e){
           Error err = new Error();
           return err.getError(e.getMessage());
        }
        return map;
    }
    @PostMapping("/Kilometrages")
    public Kilometrage save(@RequestHeader(name="dateKm", required=false) String date,@RequestHeader(name="debutKm", required=false) double debutkm, @RequestHeader(name="finkm", required=false) double finkm,@RequestHeader(name="vehiculeidvehicule", required=false) int idVehicule){
        Kilometrage km = new Kilometrage();
        km.setDateKilometrage(Date.valueOf(date));
        km.setDebutKm(debutkm);
        km.setFinKm(finkm);
        km.setAvionIdAvion(idVehicule);
        return repository.save(km);
    }
    @DeleteMapping("/Kilometrages/{id}")
    public void delete(@RequestParam int id){
        repository.deleteById(id);
    }

     @PutMapping("/Kilometrages/{id}")
    public HashMap<String,Object> replaceEmployee(@RequestBody Kilometrage newKm, @PathVariable int id) {
        HashMap<String,Object> map = new HashMap<>();
        Optional<Kilometrage> kl = null;
        try{
            kl = repository.findById(id);
        }
        catch(Exception e){
            Error err = new Error();
            return err.getError(e.getMessage());
        }
        kl.map(
            Kilometrages -> {
                Kilometrages.setDateKilometrage(newKm.getDateKilometrage());
                Kilometrages.setDebutKm(newKm.getDebutKm());
                Kilometrages.setFinKm(newKm.getFinKm());
                Kilometrages.setAvionIdAvion(newKm.getAvionIdAvion());
                return repository.save(Kilometrages);
            });
        map.put("succes", "Operation effectué avec succès");
        return map;
    }

}
