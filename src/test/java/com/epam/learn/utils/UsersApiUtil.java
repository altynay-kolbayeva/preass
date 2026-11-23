package com.epam.learn.utils;

import com.epam.learn.services.UsersApiService;

public class UsersApiUtil {
    private final UsersApiService usersApiService;

    public UsersApiUtil() {
        usersApiService = new UsersApiService();
    }

    public String getUserEmailById(int id){
        return usersApiService.getUserById(id).getEmail();
    }
}
