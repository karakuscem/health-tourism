package com.tourismcorp.healthtourism.util;

import java.util.List;
import java.util.UUID;

public abstract class BaseService<
        Entity extends BaseEntity,
        DTO extends BaseDTO,
        RequestDTO extends BaseDTO,
        Mapper extends IBaseMapper<Entity, DTO, RequestDTO>,
        Repository extends IBaseRepository<Entity>> {

    protected abstract Mapper getMapper();

    protected abstract Repository getRepository();

    public DTO save(RequestDTO requestDTO) {
        Entity entity = getMapper().requestDTOToEntity(requestDTO);
        getRepository().save(entity);
        return getMapper().entityToDTO(entity);
    }

    public DTO update(Long id, RequestDTO requestDTO) {
        Entity entity = getRepository().findById(id).orElse(null);
        if (entity != null) {
            entity = getMapper().requestDTOToExistEntity(requestDTO, entity);
            getRepository().save(entity);
            return getMapper().entityToDTO(entity);
        } else {
            return null;
        }
    }

    public DTO getByUUID(UUID uuid) {
        Entity entity = getRepository().findByUUID(uuid).orElse(null);
        if (entity != null) {
            return getMapper().entityToDTO(entity);
        } else {
            return null;
        }
    }

    public DTO deleteByUUID(UUID uuid) {
        Entity entity = getRepository().findByUUID(uuid).orElse(null);
        if (entity != null) {
            getRepository().delete(entity);
            return getMapper().entityToDTO(entity);
        } else {
            return null;
        }
    }

    public List<DTO> getAll() {
        List<Entity> entities = getRepository().findAll();
        return getMapper().entityListToDTOList(entities);
    }
}
