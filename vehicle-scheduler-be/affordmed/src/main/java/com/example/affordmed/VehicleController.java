package com.example.affordmed;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluation-service")
public class VehicleController {
    private final VehicleRepository vehicleRepo;
    private final DepoRepository depoRepo;

    public VehicleController(VehicleRepository vehicleRepo, DepoRepository depoRepo){
        this.vehicleRepo = vehicleRepo;
        this.depoRepo = depoRepo;
    }

    @PostMapping("/depots")
    public Depot addDepot(@RequestBody Depot depot){
        return depoRepo.save(depot);
    }
    @GetMapping("/depots")
    public List<Depot> viewDepot(Vehicle vehicle){
        return depoRepo.findAll();
    }

    @PostMapping("/vehicles")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){
        return vehicleRepo.save(vehicle);
    }
    @GetMapping("/vehicles")
    public List<Vehicle> viewVehicle(@RequestBody Vehicle vehicle){
        return vehicleRepo.findAll();
    }
}
