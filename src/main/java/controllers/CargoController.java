package controllers;

import org.postgresql.translation.messages_pt_BR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Cargo;
import repositories.CargoRepository;
import services.CargoService;

@RestController
@RequestMapping("api/cargo")
@CrossOrigin(origins = "*")
public class CargoController {

    @Autowired
    private final CargoService service =  null;
    
    @PostMapping("/criarCargo")
    public ResponseEntity<Object> criarCargo(@RequestBody Cargo pCargo){
        Cargo cargo = new Cargo();
        cargo = pCargo;
        System.out.println("RECEBAAAA");

        try {
            return ResponseEntity.ok(service.save(cargo));
        } catch (Exception e) {
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }

    }
    
    
}
