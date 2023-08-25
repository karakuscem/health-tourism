package com.tourismcorp.healthtourism.model;

import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.Set;


@Data
public class RoleDTO extends BaseDTO {

    private String name;


    private String description;


    private Set<UserDTO> users;

}
