package com.matgor.History_of_repair.Controller;

import com.matgor.History_of_repair.Domain.Model.Repair;
import com.matgor.History_of_repair.Domain.Service.RepairService;
import com.matgor.History_of_repair.Domain.Service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/repair")
public class RepairController {

    private final RepairService repairService;
    private final VehicleService vehicleService;
    public RepairController(RepairService repairService, VehicleService vehicleService) {
        this.repairService = repairService;
        this.vehicleService = vehicleService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String prepareAddRepair(Model model){
        model.addAttribute("repair", new Repair());
        return "repair/addForm";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddRepair(@Valid Repair repair, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "repair/addForm";
        }
        repairService.addRepair(repair);
        List<Repair> repairsOfCar = repairService.allRepairByVehicle(vehicleService.getVehicle(1L).orElseThrow());
        model.addAttribute("repairsOfCar", repairsOfCar);
        return "repair/repairs";
    }


}
