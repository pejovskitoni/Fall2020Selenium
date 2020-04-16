package tests.day3;

// import the necessary WebDriver tool so Selenium can run and manipulate the websites.
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
//import the method that was created in utils

public class BrowserFactoryTest {
    //So this class is acting as the test to our method that we created in another package under
    //the class BrowserFactory.


    public static void main(String[] args) {
        //now we can get webDriver like this
        //getDriver() method will return webDriver object
        //and we can use reference variable which is BrowserFactory to work with that object.


// WebDriver is the parent: Must call the class BrowserFactory, followed by the methods name.
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //how can we print a source code of the page?
        driver.get("http://practice.cybertekschool.com");
     //Variable.Method("Url");

        //gets the url's Html source code and prints it in the terminal below.
        System.out.println(driver.getPageSource());
                 //      Variable.method(parameters not given)

        // to finish test execution
        driver.quit();
    }
}
