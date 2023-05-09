package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Pessoa;
import repositories.PessoaRepositoy;

@Service
public class PessoaService {
    @Autowired
    private final PessoaRepositoy pessoaRepositoy = null;
    private Pessoa pessoa;
    
    
}
