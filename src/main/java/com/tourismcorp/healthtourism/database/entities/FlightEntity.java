package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Table
@Entity
@Data
public class FlightEntity extends BaseEntity {

    @Column
    private String flightNumber;
    @Column
    private String departure;
    @Column
    private String arrival;
    @Column
    private String departureTime;
    @Column
    private Date date;
    @Column
    private int price;

    @OneToMany(mappedBy = "flight")
    private List<SeatEntity> seat;
}
