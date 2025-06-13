package com.lm.busreservation.controllers;

import com.lm.busreservation.entities.BusRoute;
import com.lm.busreservation.models.ResponseModel;
import com.lm.busreservation.services.BusRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/route")
public class BusRouteController {
    @Autowired
    private BusRouteService busRouteService;

    @PostMapping("/add")
    public ResponseModel<BusRoute> addBusRoute(@RequestBody BusRoute busRoute){
        BusRoute savedBusRoute=busRouteService.addBusRoute(busRoute);
        return new ResponseModel<>(HttpStatus.OK.value(),"Bus route added successfully",savedBusRoute);
    }

    @GetMapping("/all")
    public ResponseEntity<List<BusRoute>> allBusRoute(){
        return ResponseEntity.ok(busRouteService.allBusRoute());
    }

    @GetMapping("/{routeName}")
    public ResponseEntity<BusRoute> findByRouteName(@PathVariable(name = "routeName") String routeName){
        return ResponseEntity.ok(busRouteService.findByRouteName(routeName));
    }

    @GetMapping("/query")
    public ResponseEntity<BusRoute> findByCity(
            @RequestParam String cityFrom,
            @RequestParam String cityTo
            ){

        return ResponseEntity.ok(busRouteService.findByCityFromAndCityTo(cityFrom,cityTo));
    }
}
