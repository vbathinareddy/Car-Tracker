package io.tar.controller;

import io.tar.entity.Vehicle;
import io.tar.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class VehicleController {
    @Autowired
    VehicleService service;
    @ResponseBody
    @RequestMapping(value = "/vehicles", method = RequestMethod.PUT, headers = "Accept=application/json",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<String> create(@RequestBody Vehicle[] v) {
        List<String> response = new ArrayList<String>();
        for (Vehicle vehicle: v) {

            service.create(vehicle);
            response.add(vehicle.toString());
        }
        return response;
    }
}

