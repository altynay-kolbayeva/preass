package com.epam.learn.tests.ui;

import com.epam.learn.page.MainPage;
import com.epam.learn.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest extends BaseTest {
    MainPage mainPage;


    @Test(description = "Тестирование основной страницы")
    public void getYourApiKeysTitlePageIsOpened(){
        mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.clickGetYourApiKeysBtn().isGetYourKeysTitleDisplayed());
    }
}
