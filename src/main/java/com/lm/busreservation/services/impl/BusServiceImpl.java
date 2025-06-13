package com.lm.busreservation.services.impl;

import com.lm.busreservation.entities.Bus;
import com.lm.busreservation.repos.BusRepository;
import com.lm.busreservation.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;
    @Override
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> allBus() {
        return busRepository.findAll();
    }
}
