package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Data
@Table
@Entity
public class DoctorEntity extends BaseEntity {

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String field;

    @ManyToMany(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JoinColumn(name = "role_id", nullable = false)
    private Set<RoleEntity> roles;

    @ManyToOne
    @JoinColumn(name = "hospital_entity_id", nullable = false)
    private HospitalEntity hospital;
}
