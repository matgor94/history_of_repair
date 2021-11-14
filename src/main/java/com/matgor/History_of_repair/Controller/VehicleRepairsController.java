package com.matgor.History_of_repair.Controller;

import com.matgor.History_of_repair.Domain.Model.Repair;

import com.matgor.History_of_repair.Domain.Service.RepairService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class VehicleRepairsController {

    private final RepairService repairService;

    public VehicleRepairsController(RepairService repairService) {
        this.repairService = repairService;
    }


    @RequestMapping(value = "/vehicleRepairs")
    public String allVehicleRepairsProcess(Model model, HttpServletRequest request){
        Long idVehicle = Long.parseLong(request.getParameter("id"));
        List<Repair> repairList = repairService.allRepairsByVehicle(idVehicle);
        model.addAttribute("repairs", repairList);
        double costAllParts = 0;
        double costAllJobs = 0;
        for (Repair rep : repairList) {
            costAllParts += rep.getPartsCost();
            costAllJobs += rep.getJobCost();
        }
        double allRepairsCost = costAllJobs + costAllParts;
        model.addAttribute("partsCost", costAllParts);
        model.addAttribute("jobsCost", costAllJobs);
        model.addAttribute("allCost", allRepairsCost);
        model.addAttribute("id", idVehicle);
        return "vehicle/vehicleRepairs";
    }
}
