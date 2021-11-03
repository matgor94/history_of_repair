package com.matgor.History_of_repair.Controller;

import com.matgor.History_of_repair.Domain.Service.VehicleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InfoVehicleController {
    private final VehicleService vehicleService;

    public InfoVehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String showInfo(){
        return "vehicle/info";
    }

}
