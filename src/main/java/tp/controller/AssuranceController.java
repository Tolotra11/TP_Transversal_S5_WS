package tp.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tp.model.V_AssuranceExpiration;
import tp.repository.V_AssuranceExpirationRepository;

@RestController
public class AssuranceController {
    @Autowired
    public V_AssuranceExpirationRepository expRepository;
    @CrossOrigin
    @GetMapping("/expirations")
    public HashMap<String,Object> lExpiration(){
        HashMap<String,Object> val = new HashMap<>();
        List<V_AssuranceExpiration> lv = expRepository.findAll();
        val.put("data", lv);
        return val;
    }
}
