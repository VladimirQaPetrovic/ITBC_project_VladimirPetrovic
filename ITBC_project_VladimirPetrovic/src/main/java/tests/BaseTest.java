package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.ButtonPage;
import pages.RadioButtonPage;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private RadioButtonPage radioButtonPage;
    private ButtonPage buttonPage;
    private Actions actions;

    public RadioButtonPage getRadioButtonPage(){
        return radioButtonPage;
    }
    public ButtonPage getButtonPage(){
        return buttonPage;
    }
    public Actions getActions(){
        return actions;
    }
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
        driver = new ChromeDriver();
        wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        radioButtonPage = new RadioButtonPage(driver,wait);
        buttonPage = new ButtonPage(driver,wait);
        actions = new Actions(driver);
    }
    @BeforeMethod
    public void beforeEachTest(){
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void cleanUp(){
        driver.close();
    }
}
