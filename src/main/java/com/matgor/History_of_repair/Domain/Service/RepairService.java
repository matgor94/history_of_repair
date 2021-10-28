package com.matgor.History_of_repair.Domain.Service;

import com.matgor.History_of_repair.Domain.Model.Repair;
import com.matgor.History_of_repair.Domain.Model.Vehicle;
import com.matgor.History_of_repair.Domain.Repository.RepairRepository;
import com.matgor.History_of_repair.Domain.Repository.VehicleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@Repository
@Transactional
public class RepairService {
    private final RepairRepository repairRepository;
    private final VehicleRepository vehicleRepository;
    public RepairService(RepairRepository repairRepository, VehicleRepository vehicleRepository) {
        this.repairRepository = repairRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Repair addRepair(Repair repair){
        return repairRepository.save(repair);
    }

    public Optional<Repair> getOneRepair(Long id){
        return repairRepository.findById(id);
    }

    public List<Repair> allRepairByVehicle(Vehicle vehicle){
        return repairRepository.findAllById(vehicle.getId());
    }
    @Modifying
    @Query("update repair u set u.desctription=?1, u.jobCost=?2, u.partsCost=?3 where u.id=?4")
    public Repair editRepair(String desctription, int jobCost, int partsCost, Long id){
        Repair editedRepair = repairRepository.getOne(id);
        editedRepair.setDesctription(desctription);
        editedRepair.setJobCost(jobCost);
        editedRepair.setPartsCost(partsCost);
        return repairRepository.save(editedRepair); 
    }

    public void deleteRepair(Repair repair){
        repairRepository.delete(repair);
    }
}
