package com.matgor.History_of_repair.Config;

import com.matgor.History_of_repair.Domain.Model.Repair;
import com.matgor.History_of_repair.Domain.Model.Vehicle;
import com.matgor.History_of_repair.Domain.Repository.RepairRepository;
import com.matgor.History_of_repair.Domain.Repository.VehicleRepository;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class DataSetUp {
    private AtomicBoolean atomicBoolean = new AtomicBoolean(false);
    private final VehicleRepository vehicleRepository;
    private final RepairRepository repairRepository;

    public DataSetUp(VehicleRepository vehicleRepository, RepairRepository repairRepository) {
        this.vehicleRepository = vehicleRepository;
        this.repairRepository = repairRepository;
    }

    @EventListener
    @Transactional
    public void loadData(ContextRefreshedEvent contextRefreshedEvent){
        if (!atomicBoolean.getAndSet(true)){
            List<Repair> hondaRepairs = new ArrayList<>();
            List<Repair> lagunaRepairs = new ArrayList<>();
            Vehicle honda = new Vehicle(null, "Honda", "Civic", 2004, 235000, 1992,hondaRepairs);
            vehicleRepository.save(honda);
            Vehicle laguna = new Vehicle(null, "Renault", "Laguna", 2005, 330000, 1950, lagunaRepairs);
            vehicleRepository.save(laguna);

            Repair klockiTyl = new Repair(null, "Klocki hamulcowe tył - Bosh", 250, 125, honda);
            repairRepository.save(klockiTyl);
            Repair olejSilnikowy = new Repair(null, "Olej silnikowy -  Valvoline Max Life 5W40", 150, 60, laguna);
            repairRepository.save(olejSilnikowy);
            Repair rozrzad = new Repair(null, "Rozrzad - DAYCO", 500, 300, honda);


            hondaRepairs.add(klockiTyl);
            hondaRepairs.add(olejSilnikowy);
            hondaRepairs.add(rozrzad);

            lagunaRepairs.add(klockiTyl);
            lagunaRepairs.add(olejSilnikowy);


        }
    }
}
