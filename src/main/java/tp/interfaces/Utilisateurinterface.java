package tp.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

import tp.model.Utilisateur;



public interface Utilisateurinterface {
	 ArrayList<Utilisateur> findAll();
	 HashMap<String,Object> login(String email,String mdp) throws Exception;

}
