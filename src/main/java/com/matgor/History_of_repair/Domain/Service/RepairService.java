package com.matgor.History_of_repair.Domain.Service;

import com.matgor.History_of_repair.Domain.Model.Repair;
import com.matgor.History_of_repair.Domain.Repository.RepairRepository;
import lombok.extern.slf4j.Slf4j;
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
    public RepairService(RepairRepository repairRepository) {
        this.repairRepository = repairRepository;
    }

    public Repair addRepair(Repair repair){
        return repairRepository.save(repair);
    }

    public Optional<Repair> getOneRepair(Long id){
        return repairRepository.findById(id);
    }

    public List<Repair> allRepairs(){
        return repairRepository.findAll();
    }

    public List<Repair> allRepairsByVehicle(Long id){
        return repairRepository.findAllByVehicle_Id(id);
    }

    public void deleteRepair(Repair repair){
        repairRepository.delete(repair);
    }
}
