package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Table
@Entity
public class HotelEntity extends BaseEntity {

    @Column
    private String hotelName;

    @Column
    private String phoneNumber;

    @Column
    private String email;

    @OneToMany(mappedBy = "hotel")
    private List<RoomEntity> room;

    @ManyToOne
    private BankAccountEntity bankAccount;

}
