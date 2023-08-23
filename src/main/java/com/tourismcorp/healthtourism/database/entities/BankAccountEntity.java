package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table
@Data
public class BankAccountEntity extends BaseEntity {

    @Column
    private String bankName;
    @Column
    private String accountNumber;
    @Column
    private BigDecimal balance;

}
