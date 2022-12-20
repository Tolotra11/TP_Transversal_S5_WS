package tp.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import tp.model.Avion;
public interface AvionRepository extends JpaRepository<Avion, Integer>{   
    
}
