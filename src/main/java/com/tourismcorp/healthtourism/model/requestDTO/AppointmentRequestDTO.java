package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.*;
import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data

public class AppointmentRequestDTO extends BaseDTO {
    private DoctorRequestDTO doctor;
    private UserRequestDTO patient;
    private Date date;
    private HotelRequestDTO hotel;
    private RoomRequestDTO room;
    private Date roomDate;
    private HospitalRequestDTO hospital;
    private FlightRequestDTO flight;
    private SeatRequestDTO seat;
    private Date flightDate;

}
