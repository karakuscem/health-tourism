package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

@Data

public class AppointmentDTO extends BaseDTO {
    private DoctorDTO doctor;
    private UserDTO patient;
    private DateDTO date;
    private HotelDTO hotel;
    private RoomDTO room;
    private DateDTO roomDate;
    private HospitalDTO hospital;
    private FlightDTO flight;
    private SeatDTO seat;
    private DateDTO flightDate;

}
