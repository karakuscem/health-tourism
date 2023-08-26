package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.*;
import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

@Data

public class AppointmentRequestDTO extends BaseDTO {
    private DoctorRequestDTO doctor;
    private UserRequestDTO patient;
    private DateRequestDTO date;
    private HotelRequestDTO hotel;
    private RoomRequestDTO room;
    private DateRequestDTO roomDate;
    private HospitalRequestDTO hospital;
    private FlightRequestDTO flight;
    private SeatRequestDTO seat;
    private DateRequestDTO flightDate;

}
