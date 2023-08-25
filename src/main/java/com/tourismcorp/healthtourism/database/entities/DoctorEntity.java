package com.tourismcorp.healthtourism.database.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Data
@Table
@Entity
public class DoctorEntity extends UserEntity {

    @Column
    private String field;

    @ManyToOne
    @JoinColumn(name = "hospital_entity_id", nullable = false)
    private HospitalEntity hospital;
}
