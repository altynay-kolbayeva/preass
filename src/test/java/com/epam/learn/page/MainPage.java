package com.epam.learn.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{

    private static final Logger log = LogManager.getLogger(MainPage.class);
    @FindBy (xpath = "//div[contains(@class, 'hero-cta')]/a")
    WebElement getYourApiKeysBtn;

    @FindBy (tagName = "h1")
    WebElement getYourApiKeysTitle;

    @FindBy (xpath = "//a[@data-visitors-source='app_project_landing']")
    WebElement viewDocsBtn;

    public MainPage(WebDriver driver){
        super(driver);
    }

    public MainPage clickGetYourApiKeysBtn(){
        getYourApiKeysBtn.click();
        log.info("Your API KEYS link is clicked");
        return this;
    }

    public boolean isGetYourKeysTitleDisplayed(){
        waiter.until(ExpectedConditions.visibilityOf(getYourApiKeysTitle));
        return getYourApiKeysTitle.isDisplayed() &
                getYourApiKeysTitle.getText().contains("Build real projects with collections");
    }

    public DocumentationPage clickViewDocsBtn(){
        waiter.until(ExpectedConditions.visibilityOf(getYourApiKeysTitle));
        viewDocsBtn.click();
        return new DocumentationPage(driver);
    }
}
