package com.tourismcorp.healthtourism.database.entities;

import com.tourismcorp.healthtourism.util.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Table
@Entity
public class AvailableRoomDateEntity extends BaseEntity {

    @ManyToMany
    @JoinColumn(name = "room_entity_id", nullable = false)
    private List<RoomEntity> room;

    @ManyToMany
    @JoinColumn(name = "date_entity_id", nullable = false)
    private List<DateEntity> date;
}
