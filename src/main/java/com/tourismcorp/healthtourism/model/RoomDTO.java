package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class RoomDTO extends BaseDTO {

    private int roomNumber;

    private BigDecimal price;

    private HotelDTO hotel;

    private boolean isReserved;

    private Date exitDate;
}
