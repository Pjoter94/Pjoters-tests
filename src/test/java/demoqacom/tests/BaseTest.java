package demoqacom.tests;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private final int millis = 500;
    public static Logger log = LogManager.getLogger();

    @BeforeTest
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
        ChromeDriverManager.chromedriver();
        driver = new ChromeDriver();
        log.info("Webdriver initialization");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(millis));
        driver.manage().window().maximize();
        log.info("Maximize window");
        driver.get("https://demoqa.com/");
        log.info("Get defined url");
        }


    @AfterTest
    public void afterSuite() {
        if (null != driver) {
            driver.close();
            driver.quit();
            log.info("Quit Webdriver");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}