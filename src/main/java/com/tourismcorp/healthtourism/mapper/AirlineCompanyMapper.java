package com.tourismcorp.healthtourism.mapper;

import com.tourismcorp.healthtourism.database.entities.AirlineCompanyEntity;
import com.tourismcorp.healthtourism.model.AirlineCompanyDTO;
import com.tourismcorp.healthtourism.model.requestDTO.AirlineCompanyRequestDTO;
import com.tourismcorp.healthtourism.util.IBaseMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public abstract class AirlineCompanyMapper implements IBaseMapper<AirlineCompanyEntity,
        AirlineCompanyDTO, AirlineCompanyRequestDTO> {

    @Override
    public AirlineCompanyDTO entityToDTO(AirlineCompanyEntity entity) {
        AirlineCompanyDTO airlineCompanyDTO = new AirlineCompanyDTO();
        airlineCompanyDTO.setUuid(entity.getUuid());
        airlineCompanyDTO.setCreationDate(entity.getCreationDate());
        airlineCompanyDTO.setUpdatedDate(entity.getUpdatedDate());
        airlineCompanyDTO.setId(entity.getId());
        airlineCompanyDTO.setCompanyName(entity.getCompanyName());
        airlineCompanyDTO.setPhoneNumber(entity.getPhoneNumber());
        airlineCompanyDTO.setEmail(entity.getEmail());
        //airlineCompanyDTO.setFlight(entity.getFlight()); // need flight mapper
        //airlineCompanyDTO.setBankAccount(entity.getBankAccount()); // need bank account mapper

        return airlineCompanyDTO;
    }

    @Override
    public AirlineCompanyEntity dtoToEntity(AirlineCompanyDTO dto) {
        AirlineCompanyEntity airlineCompanyEntity = new AirlineCompanyEntity();
        airlineCompanyEntity.setUuid(dto.getUuid());
        airlineCompanyEntity.setCreationDate(dto.getCreationDate());
        airlineCompanyEntity.setUpdatedDate(dto.getUpdatedDate());
        airlineCompanyEntity.setId(dto.getId());
        airlineCompanyEntity.setCompanyName(dto.getCompanyName());
        airlineCompanyEntity.setPhoneNumber(dto.getPhoneNumber());
        airlineCompanyEntity.setEmail(dto.getEmail());
        //airlineCompanyEntity.setFlight(dto.getFlight()); // need flight mapper
        //airlineCompanyEntity.setBankAccount(dto.getBankAccount()); // need bank account mapper

        return airlineCompanyEntity;
    }

    @Override
    public List<AirlineCompanyDTO> entityListToDTOList(List<AirlineCompanyEntity> airlineCompanyEntities) {
        List<AirlineCompanyDTO> airlineCompanyDTOList = new ArrayList<>();
        for (AirlineCompanyEntity entity : airlineCompanyEntities) {
            AirlineCompanyDTO dto = entityToDTO(entity);
            airlineCompanyDTOList.add(dto);
        }
        return airlineCompanyDTOList;
    }

    @Override
    public List<AirlineCompanyEntity> dtoListToEntityList(List<AirlineCompanyDTO> airlineCompanyDTOS) {
        List<AirlineCompanyEntity> airlineCompanyEntityList = new ArrayList<>();
        for (AirlineCompanyDTO dto : airlineCompanyDTOS) {
            AirlineCompanyEntity entity = dtoToEntity(dto);
            airlineCompanyEntityList.add(entity);
        }
        return airlineCompanyEntityList;
    }

    @Override
    public AirlineCompanyEntity requestDTOToEntity(AirlineCompanyRequestDTO requestDTO) {
        AirlineCompanyEntity airlineCompanyEntity = new AirlineCompanyEntity();
        airlineCompanyEntity.setUuid(requestDTO.getUuid());
        airlineCompanyEntity.setCreationDate(requestDTO.getCreationDate());
        airlineCompanyEntity.setUpdatedDate(requestDTO.getUpdatedDate());
        airlineCompanyEntity.setId(requestDTO.getId());
        airlineCompanyEntity.setCompanyName(requestDTO.getCompanyName());
        airlineCompanyEntity.setPhoneNumber(requestDTO.getPhoneNumber());
        airlineCompanyEntity.setEmail(requestDTO.getEmail());
        //airlineCompanyEntity.setFlight(requestDTO.getFlight()); // need flight mapper
        //airlineCompanyEntity.setBankAccount(requestDTO.getBankAccount()); // need bank account mapper

        return airlineCompanyEntity;
    }

    @Override
    public List<AirlineCompanyEntity> requestDTOListToEntityList(List<AirlineCompanyRequestDTO> requestDTOList) {
        List<AirlineCompanyEntity> airlineCompanyEntityList = new ArrayList<>();
        for (AirlineCompanyRequestDTO requestDTO : requestDTOList) {
            AirlineCompanyEntity entity = requestDTOToEntity(requestDTO);
            airlineCompanyEntityList.add(entity);
        }
        return airlineCompanyEntityList;
    }

    @Override
    public AirlineCompanyEntity requestDTOToExistEntity(AirlineCompanyRequestDTO requestDTO, AirlineCompanyEntity entity) {
        entity.setUuid(requestDTO.getUuid());
        entity.setCreationDate(requestDTO.getCreationDate());
        entity.setUpdatedDate(requestDTO.getUpdatedDate());
        entity.setId(requestDTO.getId());
        entity.setCompanyName(requestDTO.getCompanyName());
        entity.setPhoneNumber(requestDTO.getPhoneNumber());
        entity.setEmail(requestDTO.getEmail());
        //entity.setFlight(requestDTO.getFlight()); // need flight mapper
        //entity.setBankAccount(requestDTO.getBankAccount()); // need bank account mapper

        return entity;
    }
}
