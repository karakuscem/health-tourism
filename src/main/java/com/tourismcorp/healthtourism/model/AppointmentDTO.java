package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data

public class AppointmentDTO extends BaseDTO {
    private DoctorDTO doctor;
    private UserDTO patient;
    private Date date;
    private HotelDTO hotel;
    private RoomDTO room;
    private Date roomDate;
    private HospitalDTO hospital;
    private FlightDTO flight;
    private SeatDTO seat;
    private Date flightDate;

}
