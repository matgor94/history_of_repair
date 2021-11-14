package com.matgor.History_of_repair.Domain.Service;

import com.matgor.History_of_repair.Domain.Model.Vehicle;
import com.matgor.History_of_repair.Domain.Repository.VehicleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@Slf4j
@Repository
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle addVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }

    public Optional<Vehicle> getVehicle(Long id){
        return vehicleRepository.findById(id);
    }

    public List<Vehicle> allVehicles(){
        return vehicleRepository.findAll();
    }

    public void deleteVehicle(Vehicle vehicle){
        vehicleRepository.delete(vehicle);
    }
}
