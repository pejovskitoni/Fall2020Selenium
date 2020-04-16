package utils;

//Utils refers to utilities and is generally kept by developers for making use of reusable code.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
//create a method that will return webdriver object.
    // This method will take one parameter-String browser
    // Based on the value of the browser parameter
    //The method will return corresponded webdriver object
    //if browser = chrome, then return chromedriver object
    public static WebDriver getDriver(String browser) {
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
          return null;
    }

    }

