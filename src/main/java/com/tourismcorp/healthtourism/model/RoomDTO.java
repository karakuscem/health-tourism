package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RoomDTO extends BaseDTO {

    private int roomNumber;


    private BigDecimal price;

    private HotelDTO hotel;
}
