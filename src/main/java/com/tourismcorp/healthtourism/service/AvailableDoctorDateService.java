package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.AvailableDoctorDateEntity;
import com.tourismcorp.healthtourism.database.repositories.AvailableDoctorDateRepository;
import com.tourismcorp.healthtourism.mapper.AvailableDoctorDateMapper;
import com.tourismcorp.healthtourism.model.AvailableDoctorDateDTO;
import com.tourismcorp.healthtourism.model.requestDTO.AvailableDoctorDateRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvailableDoctorDateService extends BaseService<
        AvailableDoctorDateEntity,
        AvailableDoctorDateDTO,
        AvailableDoctorDateRequestDTO,
        AvailableDoctorDateMapper,
        AvailableDoctorDateRepository> {

    @Autowired
    AvailableDoctorDateMapper availableDoctorDateMapper;

    @Autowired
    AvailableDoctorDateRepository availableDoctorDateRepository;

    @Override
    protected AvailableDoctorDateMapper getMapper() {
        return this.availableDoctorDateMapper;
    }

    @Override
    protected AvailableDoctorDateRepository getRepository() {
        return this.availableDoctorDateRepository;
    }
}
