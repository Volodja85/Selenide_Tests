package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.softtest.unix.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;


import static com.softtest.unix.PropertyUtil.getDefaultBrowser;
import static com.softtest.unix.PropertyUtil.getDefaultTimeout;

@Listeners(UiTestListener.class)
public class TestRunner {


    protected final HomePage homePage = new HomePage();

    @BeforeSuite
    public void driverConfigurationAndTimeout() {
        Configuration.browser = getDefaultBrowser();
        Configuration.timeout = getDefaultTimeout() * 1000;
    }


    @AfterMethod
    public void methodClose() {
        homePage.goBack();

    }

    @AfterClass
    public void Close() {
        Selenide.closeWindow();
        Selenide.closeWebDriver();

    }

}
