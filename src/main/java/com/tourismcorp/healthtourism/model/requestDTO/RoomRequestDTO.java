package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.HotelDTO;
import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RoomRequestDTO extends BaseDTO {

    private int roomNumber;


    private BigDecimal price;

    private HotelDTO hotel;
}
