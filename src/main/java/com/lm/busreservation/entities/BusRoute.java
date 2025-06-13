package com.lm.busreservation.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BusRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long routeId;
    @Column(nullable = false)
    private String routeName;
    @Column(nullable = false)
    private String cityFrom;
    @Column(nullable = false)
    private String cityTo;
    @Column(nullable = false)
    private Double distanceInKm;
}
