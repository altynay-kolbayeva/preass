package com.epam.learn.tests.ui;

import com.epam.learn.page.MainPage;
import com.epam.learn.tests.BaseTest;
import org.testng.annotations.Test;

public class DocumentationPageTest extends BaseTest {
    @Test
    public void documentationPageIsOpened() {
        MainPage mainPage = new MainPage(driver);

        mainPage.clickGetYourApiKeysBtn()
                .clickViewDocsBtn()
                .titlePageIsOpened();
    }
}
