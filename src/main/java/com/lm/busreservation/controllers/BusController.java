package com.lm.busreservation.controllers;

import com.lm.busreservation.entities.Bus;
import com.lm.busreservation.models.ResponseModel;
import com.lm.busreservation.services.BusService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    @Autowired
    private BusService busService;

    @PostMapping("/add")
    public ResponseModel<Bus> addBus(@RequestBody Bus bus){
        final Bus savedBus=busService.addBus(bus);
        return new ResponseModel<>(HttpStatus.OK.value(),"Bus added successfully",savedBus);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Bus>> allBus(){
        return ResponseEntity.ok(busService.allBus());
    }

}
