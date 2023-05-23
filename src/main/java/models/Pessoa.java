package models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Pessoa extends EntidadeAbstrata<Long>{
    private String nome;
    private String rg;
    private String cpf;
    private String email;    
}

