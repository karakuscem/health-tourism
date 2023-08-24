package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.util.BaseDTO;
import com.tourismcorp.healthtourism.util.BaseUserDTO;
import lombok.Data;

import java.util.Set;


@Data
public class RoleRequestDTO<T extends BaseUserDTO> extends BaseDTO {

    private String name;


    private String description;


    private Set<T> users;

}
