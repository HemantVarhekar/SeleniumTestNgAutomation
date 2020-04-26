package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
   // private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
            this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        clickLink( "Form Authentication");
       // driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }

    public HoversPage clickoHovers(){
        clickLink( "Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickkeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickOnJavaScriptsAlert(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextmenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGEditor(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPage(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink ("Large & Deep DOM");
        return new InfiniteScrollPage(driver);

    }

    public DynamicScrollPage clickDynamicScrollPage(){
        clickLink("Infinite Scroll");
        return new DynamicScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsPage(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

}
