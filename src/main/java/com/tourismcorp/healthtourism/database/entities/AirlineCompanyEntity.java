package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class AirlineCompanyEntity extends BaseEntity {

    @Column
    private String companyName;
    @Column
    private String phoneNumber;
    @Column
    private String email;

    @OneToMany(mappedBy = "airlineCompany")
    private List<FlightEntity> flight;

    @ManyToOne
    private BankAccountEntity bankAccount = null;
}
