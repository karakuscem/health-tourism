package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.DateDTO;
import com.tourismcorp.healthtourism.model.RoomDTO;
import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data


public class AvailableRoomDateRequestDTO extends BaseDTO {

    private List<RoomDTO> room;

    private List<DateDTO> date;
}
