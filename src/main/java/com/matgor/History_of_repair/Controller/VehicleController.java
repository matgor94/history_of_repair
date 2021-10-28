package com.matgor.History_of_repair.Controller;

import com.matgor.History_of_repair.Domain.Model.Vehicle;
import com.matgor.History_of_repair.Domain.Service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String prepareAddVehicle(Model model){
        model.addAttribute("vehicle",  new Vehicle());
        return "vehicle/addForm";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddVehicle(@Valid Vehicle vehicle, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "vehicle/addForm";
        }
        vehicleService.addVehicle(vehicle);
        return "redirect:/vehicle/info";
    }
}
