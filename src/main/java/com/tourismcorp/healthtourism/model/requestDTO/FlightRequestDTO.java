package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.SeatDTO;
import com.tourismcorp.healthtourism.util.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class FlightRequestDTO extends BaseEntity {

    private String flightNumber;
    private String departure;
    private String arrival;
    private String departureTime;
    private Date date;
    private int price;
    private List<SeatDTO> seat;
}
