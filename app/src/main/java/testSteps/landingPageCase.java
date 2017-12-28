package testSteps;


import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

import cucumber.api.java.en.Given;
import io.appium.java_client.AppiumDriver;
import libr_f8.BaseConfiguration;
import serviceImplementation.landingPageServiceImpl;
import serviceInterface.landingPage;


/**
 * Created by keya on 12/24/17.
 */

public class landingPageCase  {
    private BaseConfiguration baseConfig = new BaseConfiguration();
    private static AppiumDriver driver = null;
    landingPage pageL = new landingPageServiceImpl();



    @Given("^I launch the app$")
    @Before
    public void initDriver() throws Exception {
        driver = baseConfig.loadDriver();
    }

    @Test()
    public void textValidation( ) throws Exception
    {
        pageL.textValidation( driver );

    }

    @Test
    public void skipButton( ) throws Exception
    {
        pageL.clickSkipButton( driver );

    }

    @After
    public void TearDown(){
        driver.quit();
    }
}