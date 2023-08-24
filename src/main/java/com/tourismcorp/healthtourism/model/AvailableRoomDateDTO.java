package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data


public class AvailableRoomDateDTO extends BaseDTO {

    private List<RoomDTO> room;

    private List<DateDTO> date;
}
