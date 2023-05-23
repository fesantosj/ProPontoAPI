package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import models.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long>{    
    
}
