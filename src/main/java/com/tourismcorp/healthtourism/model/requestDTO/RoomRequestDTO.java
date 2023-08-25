package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.HotelDTO;
import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class RoomRequestDTO extends BaseDTO {

    private int roomNumber;

    private BigDecimal price;

    private HotelDTO hotel;

    private boolean isReserved;

    private Date exitDate;
}
