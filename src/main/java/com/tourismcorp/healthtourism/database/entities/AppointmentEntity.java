package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class AppointmentEntity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "doctor_entity_id", nullable = false)
    private DoctorEntity doctor;

    @ManyToOne
    @JoinColumn(name = "patient_entity_id", nullable = false)
    private UserEntity patient;

    @ManyToOne
    @JoinColumn(name = "doctor_date_entity_id", nullable = false)
    private DateEntity date;

    @ManyToOne
    @JoinColumn(name = "hotel_entity_id", nullable = false)
    private HotelEntity hotel;

    @ManyToOne
    @JoinColumn(name = "room_entity_id", nullable = false)
    private RoomEntity room;

    @ManyToOne
    @JoinColumn(name = "room_date_entity_id", nullable = false)
    private DateEntity roomDate;

    @ManyToOne
    @JoinColumn(name = "hospital_entity_id", nullable = false)
    private HospitalEntity hospital;

    @ManyToOne
    @JoinColumn(name = "flight_entity_id", nullable = false)
    private FlightEntity flight;

    @ManyToOne
    @JoinColumn(name = "seat_entity_id", nullable = false)
    private SeatEntity seat;

    @ManyToOne
    @JoinColumn(name = "flight_date_entity_id", nullable = false)
    private DateEntity flightDate;
}
