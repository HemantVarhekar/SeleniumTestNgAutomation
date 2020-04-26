package navigationb;

import base.BaseTests;
import org.testng.annotations.Test;
import utils.WindowManager;

public class NavigationTest extends BaseTests {

    @Test
    public void testNavigation(){
        homePage.clickDynamicLoadingPage().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goToURL("https://www.google.co.in/");
    }

    @Test
    public void tabSwitchTest(){
        homePage.clickMultipleWindowsPage().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
