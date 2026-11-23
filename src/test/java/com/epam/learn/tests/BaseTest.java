package com.epam.learn.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public String BASE_URL = "https://reqres.in/";
    public WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }
    @AfterMethod(alwaysRun = true)
    public void afterTest(){
        if (driver != null) {
            driver.quit();
        }
    }
}
