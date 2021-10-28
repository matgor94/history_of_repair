package com.matgor.History_of_repair.Domain.Repository;

import com.matgor.History_of_repair.Domain.Model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
