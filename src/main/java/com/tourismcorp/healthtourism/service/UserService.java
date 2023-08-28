package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.UserEntity;
import com.tourismcorp.healthtourism.database.repositories.UserRepository;
import com.tourismcorp.healthtourism.database.specification.UserSpecification;
import com.tourismcorp.healthtourism.mapper.UserMapper;
import com.tourismcorp.healthtourism.model.UserDTO;
import com.tourismcorp.healthtourism.model.requestDTO.UserRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<
        UserEntity,
        UserDTO,
        UserRequestDTO,
        UserMapper,
        UserRepository,
        UserSpecification> {


    private final UserRepository userRepository;

    private final UserMapper userMapper;

    private final UserSpecification userSpecification;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper, UserSpecification userSpecification) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.userSpecification = userSpecification;
    }

    @Override
    protected UserMapper getMapper() {
        return this.userMapper;
    }

    @Override
    protected UserRepository getRepository() {
        return this.userRepository;
    }

    @Override
    protected UserSpecification getSpecification() {
        return this.userSpecification;
    }
}
