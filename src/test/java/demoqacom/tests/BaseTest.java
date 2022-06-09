package demoqacom.tests;

import demoqacom.utills.ConfigFileReader;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    public static Logger log = LogManager.getLogger();
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        ConfigFileReader configFileReader = new ConfigFileReader();
        String browser = configFileReader.getBrowser();
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", configFileReader.getChromeDriverPath());
            ChromeDriverManager.chromedriver();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", configFileReader.getFirefoxDriverPath());
            FirefoxDriverManager.firefoxdriver();
            driver = new FirefoxDriver();
        }

        log.info("Webdriver initialization");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(configFileReader.getImplicitlyWait()));
        driver.manage().window().maximize();
        log.info("Maximize window");
        driver.get(configFileReader.getApplicationUrl());
        log.info("Get defined url");
    }


    @AfterTest
    public void tearDown() {
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