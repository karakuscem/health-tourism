package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Table
@Entity
public class HospitalEntity extends BaseEntity {
    @Column
    private String hospitalName;
    @Column
    private String phoneNumber;
    @Column
    private String email;

    @OneToMany(mappedBy = "hospital")
    private List<DoctorEntity> doctor;

    @ManyToOne
    private BankAccountEntity bankAccount;
}
