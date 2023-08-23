package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table
public class AvailableDoctorDateEntity extends BaseEntity {

    @ManyToMany
    @JoinColumn(name = "doctor_entity_id", nullable = false)
    private List<DoctorEntity> doctor;

    @ManyToMany
    @JoinColumn(name = "date_entity_id", nullable = false)
    private List<DateEntity> date;

}
