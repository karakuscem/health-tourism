package com.tourismcorp.healthtourism.model.requestDTO;

import com.tourismcorp.healthtourism.model.UserDTO;
import com.tourismcorp.healthtourism.util.BaseDTO;
import lombok.Data;

import java.util.Set;


@Data
public class RoleRequestDTO extends BaseDTO {

    private String name;


    private String description;


    private Set<UserDTO> users;

}
