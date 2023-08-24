package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.BankAccountDTO;
import com.tourismcorp.healthtourism.model.FlightDTO;
import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.List;

@Data
public class AirlineCompanyRequestDTO extends BaseDTO {

    private String companyName;

    private String phoneNumber;

    private String email;


    private List<FlightDTO> flight;


    private BankAccountDTO bankAccount;
}
