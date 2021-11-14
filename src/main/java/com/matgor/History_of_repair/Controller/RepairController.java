package com.matgor.History_of_repair.Controller;

import com.matgor.History_of_repair.Domain.Model.Repair;
import com.matgor.History_of_repair.Domain.Service.RepairService;
import com.matgor.History_of_repair.Domain.Service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
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
    public String processAddRepair(@Valid Repair repair, HttpServletRequest request, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "repair/addForm";
        }
        Long id =Long.parseLong(request.getParameter("id"));
        repair.setVehicle(vehicleService.getVehicle(id).orElseThrow());
        repairService.addRepair(repair);
        return "redirect:/repair/all";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String prepareEditVehicle(Model model, Long id){
        model.addAttribute("repair", repairService.getOneRepair(id));
        return "repair/editForm";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String processEditVehicle(@Valid Repair repair, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "repair/editForm";
        }
        repairService.addRepair(repair);
        return "redirect:/repair/all";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String allRepairs(Model model){
        List<Repair> allRepairs = repairService.allRepairs();
        model.addAttribute("allRepairs", allRepairs);
        return "repair/allRepairs";
    }


}
