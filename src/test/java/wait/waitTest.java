package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class waitTest extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingpage = homePage.clickDynamicLoadingPage().clickExample1();
        loadingpage.clickStart();
        assertEquals(loadingpage.getTextDisplayed(), "Hello World!", "Loading text is incorrect");



    }
}
