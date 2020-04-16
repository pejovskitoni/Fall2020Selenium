package com.automation.tests.day2;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
                                 // if you use Thread.sleep(mills:3000) you must add exception
    public static void main(String[] args) throws Exception{
        //to start selenium script we need:
        //setup webdriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
//You can use WebDriver as well as Chrome driver as a reference type. Since it's considered
// as a interface and a root in the higher hierarchy.
        //In selenium, everything starts from WebDriver interface'
        //ChromeDriver extends RemoteWebDriver --> implements WebDriver
        driver.get("http://google.com");//to open a website

        driver.manage().window().maximize();//to maximize browser or can use the next line of code
//        driver.manage().window().fullscreen();
        Thread.sleep(3000);//for demo, wait 3 seconds

        //method that return page title
        //you can also see it as tab name, in the browser
        String title = driver.getTitle();//returns <title>Some title</title> text
        String expectedTitle = "Google";//we provide it

        System.out.println("Title is..."+title);

        if(expectedTitle.equals(title)){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }
        //go to another website within the same window
        driver.navigate().to("http://amazon.com");
        Thread.sleep(3000);//for demo, wait 3 seconds

        if(driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }
        //comeback to google
        driver.navigate().back();
        Thread.sleep(3000);//for demo, wait 3 seconds

        //Calls on the method below and checks if the page title equals to Google.
        //.getTitle() - returns page title
        //MethodCall(arg1  .equals  (arg2)){
        verifyEquals(driver.getTitle(), "Google");

        //move forward in the browser history
        //again, going to amazon
        driver.navigate().forward();
        Thread.sleep(3000);//for demo, wait 3 seconds

        System.out.println("Title: "+driver.getTitle());
        //driver.getTitle() - returns page title of the page that is currently opened & not the url itself.
        //to get URL and gives it back to you as a string in the terminal.
        System.out.println("URL: "+ driver.getCurrentUrl());
        driver.navigate().refresh();//to reload page
        Thread.sleep(3000);//for demo, wait 3 seconds

        //driver.navigate().to() = driver.get()    Important !!!!
        //must be at the end
        driver.close();//to close browser
        //browser cannot close itself
    }

    /**
     * Check if to strings are same. If print TEST PASSED! message.
     * Otherwise, print TEST FAILED message
     * @param arg1
     * @param arg2
     */
    //All Methods are simply reusable piece's of code.
    //arg short for argument, this method replaces having to rewrite the if & else statement each time.
    public static void verifyEquals(String arg1, String arg2){
        if(arg1.equals(arg2)){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }
    }
}
