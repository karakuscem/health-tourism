package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

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

    @OneToMany(mappedBy = "airlineCompany", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FlightEntity> flight;

    @ManyToOne
    private BankAccountEntity bankAccount = null;
}
