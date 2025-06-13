package com.lm.busreservation.services;

import com.lm.busreservation.entities.Bus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BusService {
    public Bus addBus(Bus bus);
    public List<Bus> allBus();
}
