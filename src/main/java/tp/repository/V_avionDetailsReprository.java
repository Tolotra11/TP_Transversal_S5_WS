package tp.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import tp.model.V_avionDetails;


public interface V_avionDetailsReprository extends JpaRepository<V_avionDetails,Integer>{
    @Query(
        value = "SELECT * FROM v_avionDetails WHERE idavion = ?1"
    )
    public List<V_avionDetails> detailsForPlane(int id); 
}