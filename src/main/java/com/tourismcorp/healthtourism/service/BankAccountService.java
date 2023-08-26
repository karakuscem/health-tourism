package com.tourismcorp.healthtourism.service;

import com.tourismcorp.healthtourism.database.entities.BankAccountEntity;
import com.tourismcorp.healthtourism.database.repositories.BankAccountRepository;
import com.tourismcorp.healthtourism.mapper.BankAccountMapper;
import com.tourismcorp.healthtourism.model.BankAccountDTO;
import com.tourismcorp.healthtourism.model.requestDTO.BankAccountRequestDTO;
import com.tourismcorp.healthtourism.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
