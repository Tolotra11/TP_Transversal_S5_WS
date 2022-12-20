package tp.repository;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import tp.interfaces.Utilisateurinterface;
import tp.model.Utilisateur;
import tp.util.TokenUtil;

@Repository
public class UtilisateurRepository implements Utilisateurinterface{
	 @Autowired
	 public JdbcTemplate jdbcTemplate; 
	 @Autowired
	 public TokenUtil tokenutil;
	 @Override
	 	public ArrayList<Utilisateur> findAll() {
	        String sql = "SELECT * FROM utilisateur";
	        return  (ArrayList<Utilisateur>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<Utilisateur>(Utilisateur.class));
	    }
	 
	 @Override
	 	public HashMap<String,Object> login(String email,String mdp) throws Exception {
			HashMap<String,Object> val = new HashMap<>();
			HashMap<String,Object> fin = new HashMap<>();
	        String sql = "SELECT * FROM utilisateur where email='"+email+"' and "+" mdp=md5('"+mdp+"')";
	        System.out.println(sql);
	        ArrayList<Utilisateur> user= (ArrayList<Utilisateur>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<Utilisateur>(Utilisateur.class));
			if(user.isEmpty()){
					throw new Exception("Mot de passe ou email incorrect");		
			}
			String token = tokenutil.generateToken(user.get(0));
			val.put("token", token);
			val.put("idutilisateur",user.get(0).getIdutilisateur());
			val.put("email", user.get(0).getEmail());
			fin.put("data", val);
			return fin;
	        
	 }
	 
}
