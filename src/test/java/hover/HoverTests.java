package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {

    @Test
    public void testHourUser1(){
        var hoversPage = homePage.clickoHovers();
        var caption = hoversPage.hoverOverFigure(1);
        //hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(), "Caption is displayed");
        assertEquals(caption.getTitle(), "name: user1", "Title is incorrect");
        assertEquals(caption.getLinkText(),"View profile", "Link Text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "link text is incorrect");

    }
}
