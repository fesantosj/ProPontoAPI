package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import models.Pessoa;
import services.PessoaService;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController {

    @Autowired
    private final PessoaService pessoaService = null;

    @PostMapping("/obterPessoaPorXimbelma")
    public ResponseEntity<Object> buscarPessoaPorXimbelma(@RequestBody Pessoa pRequest) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Paulo");
             

        System.out.println(pessoa.getNome());
        
        Object pessoa2 = new Object();

        return ResponseEntity.ok(null);
    }

}