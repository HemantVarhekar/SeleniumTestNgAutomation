package javaScript;

import base.BaseTests;
import org.testng.annotations.Test;

public class javaScriptTest extends BaseTests {
    @Test
    public void testScrollTable(){
        homePage.clickInfiniteScroll().scrollToTable();

    }

    @Test
    public void scrollToSection(){
        homePage.clickDynamicScrollPage().scrollToParagraph(5);
    }
}
