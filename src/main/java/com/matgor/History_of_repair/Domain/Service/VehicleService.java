package com.matgor.History_of_repair.Domain.Service;

import com.matgor.History_of_repair.Domain.Model.Vehicle;
import com.matgor.History_of_repair.Domain.Repository.VehicleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Modifying
    @Query("UPDATE vehicles u set u.producent=?1, u.model=?2, u.yearOfProduction=?3, u.km=?4, u.capacity=?5 where u.id=?6")
    public Vehicle editVehicle(String producent, String model, int yearOfProduction, int km, int capacity, Long id){
       Vehicle editedVehicle =  vehicleRepository.getOne(id);
       editedVehicle.setProducent(producent);
       editedVehicle.setModel(model);
       editedVehicle.setYearOfProduction(yearOfProduction);
       editedVehicle.setKm(km);
       editedVehicle.setCapacity(capacity);
       return vehicleRepository.save(editedVehicle);
    }

    public void deleteVehicle(Vehicle vehicle){
        vehicleRepository.delete(vehicle);
    }
}
