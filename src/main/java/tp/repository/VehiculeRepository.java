package tp.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import tp.model.Vehicule;
public interface VehiculeRepository extends JpaRepository<Vehicule, Integer>{   
    
}
