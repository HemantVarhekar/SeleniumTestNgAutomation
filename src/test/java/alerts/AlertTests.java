package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertpage = homePage.clickOnJavaScriptsAlert();
        alertpage.triggerAlert();
        alertpage.alert_ClickToAccept();
        assertEquals(alertpage.getResult(),"You successfuly clicked an alert", "Result is incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickOnJavaScriptsAlert();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_ClickToDismiss();
        assertEquals(text,"I am a JS Confirm", "Alert text is incorrect");


    }

    @Test
    public void testSetInputInAlert(){
        var alertPage = homePage.clickOnJavaScriptsAlert();
        alertPage.triggerPrompt();

        String text = "Hemant Rocks!";
        alertPage.alert_SetInput(text);
        alertPage.alert_ClickToAccept();
        assertEquals(alertPage.getResult(), "You entered: " + text, "Text is incorrect");
    }

}
