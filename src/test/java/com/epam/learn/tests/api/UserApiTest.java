package com.epam.learn.tests.api;

import com.epam.learn.utils.UsersApiUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserApiTest {
    UsersApiUtil usersApiUtil = new UsersApiUtil();
    @Test(description = "Правильность имейла при получении пользователя по id")
    public void getUserByIdTest(){
        Assert.assertEquals(usersApiUtil.getUserEmailById(2),"janet.weaver@reqres.in");
    }
}
