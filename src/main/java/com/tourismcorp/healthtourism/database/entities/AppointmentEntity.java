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
    @JoinColumn(name = "date_entity_id", nullable = false)
    private DateEntity date;

}
