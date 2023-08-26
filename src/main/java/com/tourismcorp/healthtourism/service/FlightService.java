package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.FlightEntity;
import com.tourismcorp.healthtourism.database.repositories.FlightRepository;
import com.tourismcorp.healthtourism.mapper.FlightMapper;
import com.tourismcorp.healthtourism.model.FlightDTO;
import com.tourismcorp.healthtourism.model.requestDTO.FlightRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService extends BaseService<
        FlightEntity,
        FlightDTO,
        FlightRequestDTO,
        FlightMapper,
        FlightRepository> {

    @Autowired
    FlightMapper flightMapper;

    @Autowired
    FlightRepository flightRepository;

    @Override
    protected FlightMapper getMapper() {
        return this.flightMapper;
    }

    @Override
    protected FlightRepository getRepository() {
        return this.flightRepository;
    }
}
