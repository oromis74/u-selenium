package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class DriverController {

    private final WebDriver driver;


    //TODO добавить поддержку selenoid и выбор браузера через параметы теста

    public DriverController() {

        FirefoxBinary firefoxBinary = new FirefoxBinary(FirefoxBinary.Channel.RELEASE);
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        this.driver = new FirefoxDriver(firefoxOptions);

//        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
//        this.driver = new ChromeDriver();
    }

    public WebDriver dr(){
        return driver;
    }
}
