package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Pessoa;
import java.util.List;

@Repository
public interface PessoaRepositoy extends JpaRepository<Pessoa, Long>{
    
}
