package com.epam.learn.page;

import groovy.time.TimeDuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static groovy.time.TimeCategory.getSeconds;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait waiter;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        waiter = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
}
