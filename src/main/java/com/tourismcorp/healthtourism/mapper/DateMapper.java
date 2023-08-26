package com.tourismcorp.healthtourism.mapper;

import com.tourismcorp.healthtourism.database.entities.DateEntity;
import com.tourismcorp.healthtourism.model.DateDTO;
import com.tourismcorp.healthtourism.model.requestDTO.DateRequestDTO;
import com.tourismcorp.healthtourism.util.IBaseMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DateMapper implements IBaseMapper<DateEntity, DateDTO, DateRequestDTO> {
    @Override
    public DateDTO entityToDTO(DateEntity entity) {
        DateDTO dateDTO = new DateDTO();
        dateDTO.setUuid(entity.getUuid());
        dateDTO.setCreationDate(entity.getCreationDate());
        dateDTO.setUpdatedDate(entity.getUpdatedDate());
        dateDTO.setId(entity.getId());
        dateDTO.setDate(entity.getDate());

        return dateDTO;
    }

    @Override
    public DateEntity dtoToEntity(DateDTO dto) {
        DateEntity dateEntity = new DateEntity();
        dateEntity.setUuid(dto.getUuid());
        dateEntity.setCreationDate(dto.getCreationDate());
        dateEntity.setUpdatedDate(dto.getUpdatedDate());
        dateEntity.setId(dto.getId());
        dateEntity.setDate(dto.getDate());

        return dateEntity;
    }

    @Override
    public List<DateDTO> entityListToDTOList(List<DateEntity> entityList) {
        List<DateDTO> dateDTOList = new ArrayList<>();
        for (DateEntity entity : entityList) {
            DateDTO dto = entityToDTO(entity);
            dateDTOList.add(dto);
        }
        return dateDTOList;
    }

    @Override
    public List<DateEntity> dtoListToEntityList(List<DateDTO> dtoList) {
        List<DateEntity> dateEntityList = new ArrayList<>();
        for (DateDTO dto : dtoList) {
            DateEntity entity = dtoToEntity(dto);
            dateEntityList.add(entity);
        }
        return dateEntityList;
    }

    @Override
    public DateEntity requestDTOToEntity(DateRequestDTO requestDTO) {
        DateEntity dateEntity = new DateEntity();
        dateEntity.setUuid(requestDTO.getUuid());
        dateEntity.setCreationDate(requestDTO.getCreationDate());
        dateEntity.setUpdatedDate(requestDTO.getUpdatedDate());
        dateEntity.setId(requestDTO.getId());
        dateEntity.setDate(requestDTO.getDate());

        return dateEntity;
    }

    @Override
    public List<DateEntity> requestDTOListToEntityList(List<DateRequestDTO> dtoList) {
        List<DateEntity> dateEntityList = new ArrayList<>();
        for (DateRequestDTO dto : dtoList) {
            DateEntity entity = requestDTOToEntity(dto);
            dateEntityList.add(entity);
        }
        return dateEntityList;
    }

    @Override
    public DateEntity requestDTOToExistEntity(DateRequestDTO requestDTO, DateEntity entity) {
        if (requestDTO.getDate() != null)
            entity.setDate(requestDTO.getDate());

        return entity;
    }
}
