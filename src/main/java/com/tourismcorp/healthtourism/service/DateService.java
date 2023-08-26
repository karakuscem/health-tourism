package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.DateEntity;
import com.tourismcorp.healthtourism.database.repositories.DateRepository;
import com.tourismcorp.healthtourism.mapper.DateMapper;
import com.tourismcorp.healthtourism.model.DateDTO;
import com.tourismcorp.healthtourism.model.requestDTO.DateRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DateService extends BaseService<
        DateEntity,
        DateDTO,
        DateRequestDTO,
        DateMapper,
        DateRepository> {

    @Autowired
    DateMapper dateMapper;

    @Autowired
    DateRepository dateRepository;

    @Override
    protected DateMapper getMapper() {
        return this.dateMapper;
    }

    @Override
    protected DateRepository getRepository() {
        return this.dateRepository;
    }
}
