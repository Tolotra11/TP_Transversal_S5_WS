package tp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import tp.model.Error;
import tp.model.V_vehiculesDetails;
import tp.model.Vehicule;
import tp.repository.V_vehiculesDetailsReprository;
import tp.repository.VehiculeRepository;
import tp.util.TokenUtil;

@RestController
public class VehiculeController {
    private final  VehiculeRepository repository;
    
    private final  V_vehiculesDetailsReprository v_repository;
    public VehiculeController(VehiculeRepository rep, V_vehiculesDetailsReprository v){
        this.repository = rep;
        v_repository = v;
    } 
    @CrossOrigin 
    @GetMapping("/Vehicules")
    public HashMap<String,Object> all(){
        HashMap<String,Object> map = null;
        List<Vehicule> liste = null;
        try{
            liste = repository.findAll();
            map = new HashMap<>();
            map.put("data",liste);
        }
        catch(Exception e){
            Error err = new Error();
            return err.getError(e.getMessage());
        }
        return map;
    }
    @CrossOrigin
    @PostMapping("/Vehicules")
    public Vehicule newVehicules(@RequestHeader(name="modele", required=false) String modele,@RequestHeader(name="matricule", required=false) String matricule, @RequestHeader(name="marqueidmarque", required=false) int marqueidmarque){
        Vehicule v = new Vehicule();
        v.setModele(modele);
        v.setMatricule(matricule);
        v.setMarqueidMarque(marqueidmarque);
        return repository.save(v);
    }
    @CrossOrigin
    @DeleteMapping("/Vehicules/{id}")
    public void deleteVehicule(@PathVariable int id){
        repository.deleteById(id);
        
    }
    @CrossOrigin
    @RequestMapping(value = "/Vehicules/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public HashMap<String,Object> replaceEmployee(@RequestBody Vehicule newV, @PathVariable int id) {
        HashMap<String,Object> map = new HashMap<>();
        Optional<Vehicule> kl = null;
        try{
            kl = repository.findById(id);
        }
        catch(Exception e){
            Error err = new Error();
            return err.getError(e.getMessage());
        }
        kl.map(
            vec -> {
                vec.setMarqueidMarque(newV.getMarqueidMarque());
                vec.setMatricule(newV.getMatricule());
                vec.setModele(newV.getModele());
                return repository.save(vec);
            });
        map.put("success", "Operation effectué avec succès");
        return map;
    }
    @CrossOrigin
    @GetMapping(value = "/Vehicules/{id}/Details")
    public HashMap<String,Object> vehiculeDetails(@PathVariable int id,@RequestHeader(name="token",required=false) String token){
        HashMap<String,Object> map = null;
        Optional<V_vehiculesDetails> liste = null;
        if(token == null || token.equals("")){
            Error err = new Error();
            return err.getError("You're not autorizhed");
        }
        else{
            String user = new TokenUtil().getUserByToken(token);
            if(user == null ){
                Error err = new Error();
                return err.getError("You're not autorizhed");
            }
            try{
                liste = v_repository.findById(id);
                map = new HashMap<>();
                map.put("data",liste.get());
            }
            catch(Exception e){
                Error err = new Error();
                return err.getError(e.getMessage());
            }

        }
        
        return map;

    }
    

}
