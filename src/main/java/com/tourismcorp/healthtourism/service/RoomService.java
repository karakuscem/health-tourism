package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.RoomEntity;
import com.tourismcorp.healthtourism.database.repositories.RoomRepository;
import com.tourismcorp.healthtourism.mapper.RoomMapper;
import com.tourismcorp.healthtourism.model.RoomDTO;
import com.tourismcorp.healthtourism.model.requestDTO.RoomRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService extends BaseService<
        RoomEntity,
        RoomDTO,
        RoomRequestDTO,
        RoomMapper,
        RoomRepository> {

    @Autowired
    RoomMapper roomMapper;

    @Autowired
    RoomRepository roomRepository;

    @Override
    protected RoomMapper getMapper() {
        return this.roomMapper;
    }

    @Override
    protected RoomRepository getRepository() {
        return this.roomRepository;
    }
}
