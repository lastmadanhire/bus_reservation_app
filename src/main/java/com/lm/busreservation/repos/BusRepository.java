package com.lm.busreservation.repos;

import com.lm.busreservation.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus,Long> {

}
