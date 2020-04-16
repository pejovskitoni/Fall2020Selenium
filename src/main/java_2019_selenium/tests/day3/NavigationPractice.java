package tests.day3;
// Note any import that is grey make sure to delete.
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;
//Create a webdriver object, to work with a browser.

public class NavigationPractice {
    public static void main(String[] args ) {
//      the variable name is not important here what you name it. Just make sure you call
//     the class and method name from
//         the utils package.
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();// this function maximizes the browser window.
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        //Since the method is static, we invoke it by calling it by it's class followed by the
        // custom method name that we created. And as a parameter, we provide the seconds
        // within it's ().

        //Calling the static method that was created in Package utils
        // class name BrowserUtils. followed by the method variable name wait
        BrowserUtils.wait(3);

        //page title refers to the tab being opened in the browser.
        System.out.println(driver.getTitle() );

        // navigates back to google (previous URL)
        driver.navigate().back();

        //move forward to the amazon again
        driver.navigate().forward();
        //to refresh/reload a webpage/website
        driver.navigate().refresh();

        //shutdown browser
        driver.quit();

//        you can invoke driver.get followed by the website after closing it.
//        Otherwise you will get an error Exception.
//        driver.get("http://google.com");

        //The only way around this is if you have another tab open or create the webdriver
        // again after you close() or quit() it.

    }
}

