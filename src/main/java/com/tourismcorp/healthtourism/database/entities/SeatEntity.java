package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class SeatEntity extends BaseEntity {

    @Column
    private int seatNumber;

    @Column
    private boolean isReserved;

    @ManyToOne
    @JoinColumn(name = "flight_entity_id", nullable = false)
    private FlightEntity flight;
}
