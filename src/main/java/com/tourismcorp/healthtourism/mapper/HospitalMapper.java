package com.tourismcorp.healthtourism.mapper;

import com.tourismcorp.healthtourism.database.entities.HospitalEntity;
import com.tourismcorp.healthtourism.model.HospitalDTO;
import com.tourismcorp.healthtourism.model.requestDTO.HospitalRequestDTO;
import com.tourismcorp.healthtourism.util.IBaseMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HospitalMapper implements IBaseMapper<HospitalEntity, HospitalDTO, HospitalRequestDTO> {
    @Override
    public HospitalDTO entityToDTO(HospitalEntity entity) {
        HospitalDTO dto = new HospitalDTO();
        dto.setId(entity.getId());
        dto.setUuid(entity.getUuid());
        dto.setCreationDate(entity.getCreationDate());
        dto.setUpdatedDate(entity.getUpdatedDate());
        dto.setHospitalName(entity.getHospitalName());
        dto.setPhoneNumber(entity.getPhoneNumber());
        dto.setEmail(entity.getEmail());
        //dto.setDoctor(entity.getDoctor());
        //dto.setBankAccount(entity.getBankAccount());

        return dto;
    }

    @Override
    public HospitalEntity dtoToEntity(HospitalDTO dto) {
        HospitalEntity entity = new HospitalEntity();
        entity.setId(dto.getId());
        entity.setUuid(dto.getUuid());
        entity.setCreationDate(dto.getCreationDate());
        entity.setUpdatedDate(dto.getUpdatedDate());
        entity.setHospitalName(dto.getHospitalName());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setEmail(dto.getEmail());
        //entity.setDoctor(dto.getDoctor());
        //entity.setBankAccount(dto.getBankAccount());

        return entity;
    }

    @Override
    public List<HospitalDTO> entityListToDTOList(List<HospitalEntity> entityList) {
        List<HospitalDTO> dtoList = new ArrayList<>();
        for (HospitalEntity entity : entityList) {
            HospitalDTO dto = entityToDTO(entity);
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public List<HospitalEntity> dtoListToEntityList(List<HospitalDTO> dtoList) {
        List<HospitalEntity> entityList = new ArrayList<>();
        for (HospitalDTO dto : dtoList) {
            HospitalEntity entity = dtoToEntity(dto);
            entityList.add(entity);
        }
        return entityList;
    }

    @Override
    public HospitalEntity requestDTOToEntity(HospitalRequestDTO requestDTO) {
        HospitalEntity entity = new HospitalEntity();
        entity.setUuid(requestDTO.getUuid());
        entity.setCreationDate(requestDTO.getCreationDate());
        entity.setUpdatedDate(requestDTO.getUpdatedDate());
        entity.setHospitalName(requestDTO.getHospitalName());
        entity.setPhoneNumber(requestDTO.getPhoneNumber());
        entity.setEmail(requestDTO.getEmail());
        //entity.setDoctor(requestDTO.getDoctor());
        //entity.setBankAccount(requestDTO.getBankAccount());

        return entity;
    }

    @Override
    public List<HospitalEntity> requestDTOListToEntityList(List<HospitalRequestDTO> dtoList) {
        List<HospitalEntity> entityList = new ArrayList<>();
        for (HospitalRequestDTO dto : dtoList) {
            HospitalEntity entity = requestDTOToEntity(dto);
            entityList.add(entity);
        }
        return entityList;
    }

    @Override
    public HospitalEntity requestDTOToExistEntity(HospitalRequestDTO requestDTO, HospitalEntity entity) {
        if (requestDTO.getUuid() != null) {
            entity.setUuid(requestDTO.getUuid());
        }
        if (requestDTO.getCreationDate() != null) {
            entity.setCreationDate(requestDTO.getCreationDate());
        }
        if (requestDTO.getUpdatedDate() != null) {
            entity.setUpdatedDate(requestDTO.getUpdatedDate());
        }
        if (requestDTO.getHospitalName() != null) {
            entity.setHospitalName(requestDTO.getHospitalName());
        }
        if (requestDTO.getPhoneNumber() != null) {
            entity.setPhoneNumber(requestDTO.getPhoneNumber());
        }
        if (requestDTO.getEmail() != null) {
            entity.setEmail(requestDTO.getEmail());
        }
        //if (requestDTO.getDoctor() != null) {
        //    entity.setDoctor(requestDTO.getDoctor());
        //}
        //if (requestDTO.getBankAccount() != null) {
        //    entity.setBankAccount(requestDTO.getBankAccount());
        //}

        return entity;
    }
}
