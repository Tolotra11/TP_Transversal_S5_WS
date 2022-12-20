package tp.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import tp.model.Error;
import tp.model.Utilisateur;
import tp.repository.UtilisateurRepository;

@RestController
public class Utilisateurcontroller {
	@Autowired
	public UtilisateurRepository uinterface;
	
	
	@CrossOrigin
	@GetMapping("/utilisateurs")
	public  ArrayList<Utilisateur> findAll() {
		return uinterface.findAll();
	}
	@CrossOrigin
	@PostMapping("/utilisateurs")
	public HashMap<String,Object> login(@RequestHeader(name="email",required=true)String email,@RequestHeader(name="mdp",required=true)String mdp) {
		HashMap<String,Object> liste = new HashMap<>();
		try{
			liste = uinterface.login(email,mdp);;
		}
		catch(Exception e){
			Error err = new Error();
			return err.getError(e.getMessage());
		}
		return liste;
		
	}
}
