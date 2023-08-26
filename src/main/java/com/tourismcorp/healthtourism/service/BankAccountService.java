package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.BankAccountEntity;
import com.tourismcorp.healthtourism.database.repositories.BankAccountRepository;
import com.tourismcorp.healthtourism.mapper.BankAccountMapper;
import com.tourismcorp.healthtourism.model.BankAccountDTO;
import com.tourismcorp.healthtourism.model.requestDTO.BankAccountRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BankAccountService extends BaseService<
        BankAccountEntity,
        BankAccountDTO,
        BankAccountRequestDTO,
        BankAccountMapper,
        BankAccountRepository> {

    @Autowired
    BankAccountMapper bankAccountMapper;

    @Autowired
    BankAccountRepository bankAccountRepository;


    @Override
    protected BankAccountMapper getMapper() {
        return this.bankAccountMapper;
    }

    @Override
    protected BankAccountRepository getRepository() {
        return this.bankAccountRepository;
    }

}
