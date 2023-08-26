package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
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
    private BigDecimal price;

    @OneToMany(mappedBy = "flight")
    private List<SeatEntity> seat;

    @ManyToOne(fetch = FetchType.LAZY)
    private AirlineCompanyEntity airlineCompany;
}
