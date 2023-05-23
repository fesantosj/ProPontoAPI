package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import models.Cargo;
import repositories.CargoRepository;

@Service
public class CargoService {
    
    @Autowired
    private CargoRepository cargoRepository = null;


    @Transactional
    public Cargo save(Cargo pCargo){
        return cargoRepository.save(pCargo);
    }

}
