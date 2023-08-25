package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Table
@Entity
public class RoomEntity extends BaseEntity {
    @Column
    private int roomNumber;

    @Column
    private BigDecimal price;

    @Column
    private boolean isReserved;

    @Column
    private Date exitDate;

    @ManyToOne
    @JoinColumn(name = "hotel_entity_id", nullable = false)
    private HotelEntity hotel;

    /*
    @PreUpdate
    public void preUpdate() {
        if (exitDate != null) {
            isReserved = true; // exitDate atanıyorsa isReserved true olmalı
        }
    }*/
}
