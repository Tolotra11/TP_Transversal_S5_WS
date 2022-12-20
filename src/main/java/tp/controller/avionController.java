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
import tp.model.V_avionDetails;
import tp.model.Avion;
import tp.repository.V_avionDetailsReprository;
import tp.repository.AvionRepository;
import tp.util.TokenUtil;

@RestController
public class avionController {
    private final  AvionRepository repository;
    
    private final  V_avionDetailsReprository v_repository;
    public avionController(AvionRepository rep, V_avionDetailsReprository v){
        this.repository = rep;
        v_repository = v;
    } 
    @CrossOrigin 
    @GetMapping("/avions")
    public HashMap<String,Object> all(){
        HashMap<String,Object> map = null;
        List<Avion> liste = null;
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
    @PostMapping("/avions")
    public Avion newVehicules(@RequestHeader(name="idmodele", required=false) int modele,@RequestHeader(name="matricule", required=false) String matricule, @RequestHeader(name="modeleidmodele", required=false) int marqueidmarque,@RequestHeader(name="image", required=false) String image){
        Avion v = new Avion();
        v.setIdModele(modele);
        v.setMatricule(matricule);
        v.setIdModele(marqueidmarque);
        v.setImage(image);
        return repository.save(v);
    }
    @CrossOrigin
    @DeleteMapping("/avions/{id}")
    public void deleteVehicule(@PathVariable int id){
        repository.deleteById(id);
        
    }
    @CrossOrigin
    @RequestMapping(value = "/avions/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public HashMap<String,Object> replaceEmployee(@RequestBody Avion newV, @PathVariable int id) {
        HashMap<String,Object> map = new HashMap<>();
        Optional<Avion> kl = null;
        try{
            kl = repository.findById(id);
        }
        catch(Exception e){
            Error err = new Error();
            return err.getError(e.getMessage());
        }
        kl.map(
            vec -> {
                vec.setMatricule(newV.getMatricule());
                vec.setIdModele(newV.getIdModele());
                vec.setImage(newV.getImage());
                return repository.save(vec);
            });
        map.put("success", "Operation effectué avec succès");
        return map;
    }
    @CrossOrigin
    @GetMapping(value = "/avions/{id}/Details")
    public HashMap<String,Object> vehiculeDetails(@PathVariable int id,@RequestHeader(name="token",required=false) String token){
        HashMap<String,Object> map = null;
        List<V_avionDetails> liste = null;
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
                liste = v_repository.detailsForPlane(id);
                map = new HashMap<>();
                map.put("data",liste);
            }
            catch(Exception e){
                Error err = new Error();
                return err.getError(e.getMessage());
            }

        }
        
        return map;

    }
    

}
