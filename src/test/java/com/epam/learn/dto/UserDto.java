package com.epam.learn.dto;

import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
}
