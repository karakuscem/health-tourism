package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.AvailableRoomDateEntity;
import com.tourismcorp.healthtourism.database.repositories.AvailableRoomDateRepository;
import com.tourismcorp.healthtourism.mapper.AvailableRoomDateMapper;
import com.tourismcorp.healthtourism.model.AvailableRoomDateDTO;
import com.tourismcorp.healthtourism.model.requestDTO.AvailableRoomDateRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvailableRoomDateService extends BaseService<
        AvailableRoomDateEntity,
        AvailableRoomDateDTO,
        AvailableRoomDateRequestDTO,
        AvailableRoomDateMapper,
        AvailableRoomDateRepository> {

    @Autowired
    AvailableRoomDateMapper availableRoomDateMapper;

    @Autowired
    AvailableRoomDateRepository availableRoomDateRepository;

    @Override
    protected AvailableRoomDateMapper getMapper() {
        return this.availableRoomDateMapper;
    }

    @Override
    protected AvailableRoomDateRepository getRepository() {
        return this.availableRoomDateRepository;
    }
}
