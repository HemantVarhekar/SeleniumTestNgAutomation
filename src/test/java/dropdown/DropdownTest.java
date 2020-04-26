package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {

    @Test

    public void testSelectOptions(){
       var dropdownPage = homePage.clickDropDown();
       String option = "Option 1";

       dropdownPage.selectFromDropdown(option);
       var selectedOptions = dropdownPage.getSelectOptions();

       assertEquals(selectedOptions.size(),1, "incorrect number of option");
       assertTrue(selectedOptions.contains(option),"option not selected");
    }
}
