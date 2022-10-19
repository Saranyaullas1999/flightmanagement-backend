package com.nestdigital.flightmanagementbackend.Controller;

import com.nestdigital.flightmanagementbackend.Model.FlightModel;
import com.nestdigital.flightmanagementbackend.dao.FlghtDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlghtDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddFlight(@RequestBody FlightModel flight){
        System.out.println(flight.toString());
        dao.save(flight);
        return "{Status:'Success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewflight")
    private List<FlightModel> Viewflight(){
        return (List<FlightModel>)dao.findAll();
    }
}
