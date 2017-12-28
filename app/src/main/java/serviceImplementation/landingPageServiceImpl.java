package serviceImplementation;


import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import libr_f8.UIElementsContants;
import libr_f8.XpathConstants;
import serviceInterface.landingPage;


/**
 * Created by keya on 12/24/17.
 */

public class landingPageServiceImpl implements landingPage {

    String a =null;
    @Override
    public void textValidation(AppiumDriver driver) {

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        a = driver.findElement(By.xpath(XpathConstants.text_validation.appName )).getText();
        System.out.print( a );
        Assert.assertEquals(UIElementsContants.appName, driver.findElement(By.xpath(XpathConstants.text_validation.appName )).getText());
        Assert.assertEquals( UIElementsContants.devConDate,driver.findElement( By.xpath( XpathConstants.text_validation.devConDate  ) ).getText() );
    }
    @When("^I click on the skip button$")
    @Override
    public void clickSkipButton(AppiumDriver driver) {
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.xpath(XpathConstants.text_validation.skipButton)).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        a = driver.findElement(By.xpath(XpathConstants.Schedule.headerSchedule)).getText();
        Assert.assertEquals(UIElementsContants.schedule,a);
    }
}
