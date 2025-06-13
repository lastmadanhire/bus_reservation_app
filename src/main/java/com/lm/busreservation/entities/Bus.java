package com.lm.busreservation.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long busId;
    @Column(nullable = false)
    private String busName;
    @Column(nullable = false)
    private String busType;
    @Column(nullable = false)
    private int totalSeat;
    @Column(nullable = false,unique = true)
    private String busNumber;
}
