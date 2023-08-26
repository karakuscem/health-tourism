package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.RoleEntity;
import com.tourismcorp.healthtourism.database.repositories.RoleRepository;
import com.tourismcorp.healthtourism.mapper.RoleMapper;
import com.tourismcorp.healthtourism.model.RoleDTO;
import com.tourismcorp.healthtourism.model.requestDTO.RoleRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends BaseService<
        RoleEntity,
        RoleDTO,
        RoleRequestDTO,
        RoleMapper,
        RoleRepository>{

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    RoleRepository roleRepository;

    @Override
    protected RoleMapper getMapper() {
        return this.roleMapper;
    }

    @Override
    protected RoleRepository getRepository() {
        return this.roleRepository;
    }
}
