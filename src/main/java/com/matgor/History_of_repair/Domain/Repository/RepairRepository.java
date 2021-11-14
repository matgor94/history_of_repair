package com.matgor.History_of_repair.Domain.Repository;

import com.matgor.History_of_repair.Domain.Model.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Long> {
    List<Repair> findAllByVehicle_Id(Long id);
}
