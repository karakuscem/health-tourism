package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.HospitalEntity;
import com.tourismcorp.healthtourism.database.repositories.HospitalRepository;
import com.tourismcorp.healthtourism.mapper.HospitalMapper;
import com.tourismcorp.healthtourism.model.HospitalDTO;
import com.tourismcorp.healthtourism.model.requestDTO.HospitalRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService extends BaseService<
        HospitalEntity,
        HospitalDTO,
        HospitalRequestDTO,
        HospitalMapper,
        HospitalRepository> {

    @Autowired
    HospitalMapper hospitalMapper;

    @Autowired
    HospitalRepository hospitalRepository;

    @Override
    protected HospitalMapper getMapper() {
        return this.hospitalMapper;
    }

    @Override
    protected HospitalRepository getRepository() {
        return this.hospitalRepository;
    }
}
