package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.DoctorEntity;
import com.tourismcorp.healthtourism.database.repositories.DoctorRepository;
import com.tourismcorp.healthtourism.mapper.DoctorMapper;
import com.tourismcorp.healthtourism.model.DoctorDTO;
import com.tourismcorp.healthtourism.model.requestDTO.DoctorRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService extends BaseService<
        DoctorEntity,
        DoctorDTO,
        DoctorRequestDTO,
        DoctorMapper,
        DoctorRepository> {

    @Autowired
    DoctorMapper doctorMapper;

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    protected DoctorMapper getMapper() {
        return this.doctorMapper;
    }

    @Override
    protected DoctorRepository getRepository() {
        return this.doctorRepository;
    }
}
