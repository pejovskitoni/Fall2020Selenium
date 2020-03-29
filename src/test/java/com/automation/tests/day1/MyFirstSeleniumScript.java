package com.automation.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript {
//test commit
    //test commit

    public static void main(String[] args) {
// 1st. setup chromedriver
        WebDriverManager.chromedriver().setup();

        // 2nd. create chromedriver object
        ChromeDriver driver = new ChromeDriver();

        // 3rd open a website (ex."google")
        driver.get("https://google.com");

    }

}
