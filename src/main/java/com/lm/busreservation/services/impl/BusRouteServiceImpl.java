package com.lm.busreservation.services.impl;

import com.lm.busreservation.entities.Bus;
import com.lm.busreservation.entities.BusRoute;
import com.lm.busreservation.models.ReservationApiException;
import com.lm.busreservation.repos.BusRouteRepository;
import com.lm.busreservation.services.BusRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusRouteServiceImpl implements BusRouteService {
    @Autowired
    private BusRouteRepository busRouteRepository;
    @Override
    public BusRoute addBusRoute(BusRoute busRoute) {
        return busRouteRepository.save(busRoute);
    }

    @Override
    public List<BusRoute> allBusRoute() {
        return busRouteRepository.findAll();
    }

    @Override
    public BusRoute findByRouteName(String routeName) {
        return busRouteRepository.findByRouteName(routeName).orElseThrow(() -> new ReservationApiException(HttpStatus.BAD_REQUEST,"Bus route not found"));
    }

    @Override
    public BusRoute findByCityFromAndCityTo(String cityFrom, String cityTo) {
        return busRouteRepository.findByCityFromAndCityTo(cityFrom,cityTo).orElseThrow(()->new ReservationApiException(HttpStatus.BAD_GATEWAY,"Route City not found"));
    }
}
