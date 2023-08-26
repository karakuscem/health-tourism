package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.AirlineCompanyEntity;
import com.tourismcorp.healthtourism.database.repositories.AirlineCompanyRepository;
import com.tourismcorp.healthtourism.mapper.AirlineCompanyMapper;
import com.tourismcorp.healthtourism.model.AirlineCompanyDTO;
import com.tourismcorp.healthtourism.model.requestDTO.AirlineCompanyRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineCompanyService extends BaseService<
        AirlineCompanyEntity,
        AirlineCompanyDTO,
        AirlineCompanyRequestDTO,
        AirlineCompanyMapper,
        AirlineCompanyRepository> {

    private final AirlineCompanyRepository airlineCompanyRepository;

    private final AirlineCompanyMapper airlineCompanyMapper;

    @Autowired
    public AirlineCompanyService(AirlineCompanyRepository airlineCompanyRepository, AirlineCompanyMapper airlineCompanyMapper) {
        this.airlineCompanyRepository = airlineCompanyRepository;
        this.airlineCompanyMapper = airlineCompanyMapper;
    }


    @Override
    protected AirlineCompanyMapper getMapper() {
        return this.airlineCompanyMapper;
    }

    @Override
    protected AirlineCompanyRepository getRepository() {
        return this.airlineCompanyRepository;
    }
}