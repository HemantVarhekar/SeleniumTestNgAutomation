package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTests {

    private EventFiringWebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUP(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver =  new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        goHome();
        setCokkie();

    }

    @BeforeMethod
    public void goHome(){
        homePage = new HomePage(driver);
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void teraDown(){
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    @AfterMethod
    public void recordFailures(ITestResult result){
       if(ITestResult.FAILURE == result.getStatus()){
           var camera = (TakesScreenshot)driver;
           File screenShot = camera.getScreenshotAs(OutputType.FILE);
           try
           { Files.move(screenShot, new File("resources/screenShots/"+ result.getName()));}
           catch(IOException e) {
               e.printStackTrace();
           }
           // Files.move();
           System.out.println("Screenshot Path" +screenShot.getAbsolutePath());

       }

    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
       // options.setHeadless(true);
        return options;
    }

    private void setCokkie(){
        Cookie cookie = new Cookie.Builder( "tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

}
