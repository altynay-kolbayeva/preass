package com.epam.learn.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocumentationPage extends BasePage {


    @FindBy (tagName = "h1")
    WebElement titlePage;

    public DocumentationPage(WebDriver driver) {
        super(driver);
    }

    public boolean titlePageIsOpened()
    {
        return titlePage.isDisplayed() & titlePage.getText().equals("Documentation");
    }

}
