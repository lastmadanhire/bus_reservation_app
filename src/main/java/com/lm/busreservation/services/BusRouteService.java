package com.lm.busreservation.services;

import com.lm.busreservation.entities.Bus;
import com.lm.busreservation.entities.BusRoute;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BusRouteService {
    public BusRoute addBusRoute(BusRoute busRoute);
    public List<BusRoute>allBusRoute();
    public BusRoute findByRouteName(String routeName);
    public BusRoute findByCityFromAndCityTo(String cityFrom,String CityTo);
}
