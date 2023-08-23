package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Table
@Entity
public class RoomEntity extends BaseEntity {
    @Column
    private int roomNumber;

    @Column
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "hotel_entity_id", nullable = false)
    private HotelEntity hotel;
}
