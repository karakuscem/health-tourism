package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.HotelEntity;
import com.tourismcorp.healthtourism.database.repositories.HotelRepository;
import com.tourismcorp.healthtourism.mapper.HotelMapper;
import com.tourismcorp.healthtourism.model.HotelDTO;
import com.tourismcorp.healthtourism.model.requestDTO.HotelRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService extends BaseService<
        HotelEntity,
        HotelDTO,
        HotelRequestDTO,
        HotelMapper,
        HotelRepository> {

    @Autowired
    HotelMapper hotelMapper;

    @Autowired
    HotelRepository hotelRepository;

    @Override
    protected HotelMapper getMapper() {
        return this.hotelMapper;
    }

    @Override
    protected HotelRepository getRepository() {
        return this.hotelRepository;
    }
}
