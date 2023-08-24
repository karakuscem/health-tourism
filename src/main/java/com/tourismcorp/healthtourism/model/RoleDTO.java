package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseDTO;
import com.tourismcorp.healthtourism.util.BaseUserDTO;
import lombok.Data;

import java.util.Set;


@Data
public class RoleDTO extends BaseDTO {

    private String name;


    private String description;


    private Set<BaseUserDTO> users;

}
