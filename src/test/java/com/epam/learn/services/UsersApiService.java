package com.epam.learn.services;

import com.epam.learn.dto.UserDto;
import lombok.extern.log4j.Log4j2;

import java.util.List;

import static io.restassured.RestAssured.given;

@Log4j2
public class UsersApiService extends BaseApi{
    public List<UserDto> getAllUsers(){
        log.info("Get all users");
        return given().when()
                .get(BASE_API_URL+"/api/users?page=2")
                .then()
                .statusCode(200)
                .extract().body().jsonPath().getList("data", UserDto.class);
    }

    public UserDto getUserById(int id){
        log.info("Get user by id {}", id);
        return given().pathParam("id", id)
                .when()
                .get(BASE_API_URL+"/api/users/{id}")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getObject("data", UserDto.class);
    }
}
