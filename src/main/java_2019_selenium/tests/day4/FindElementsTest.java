package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class FindElementsTest {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("http://chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //once we have opened the page, we have to capture the title.
        BrowserUtils.wait(2);
        String expectedTitle = driver.getTitle();
        //getTitle will bring back practice

        //Step 1. Open inspector in chrome and find locator for that element.
        //Step 2. Create object for WebElement.
        //Step 3. Use WebElement.
        WebElement button = driver.findElement(By.id("form_submit"));
        //Allow it to click on that element.
        button.click();
        // Reads title again, after clicking
        String actualTitle = driver.getTitle();
        //In this way, we are making sure that after clicking the button that we've stayed on the same page.



        //This variable is setup to perform the same function, and just has a different variable name.
        //iF Statement compares the two variable and verifies whether the argument is true, than prints out in
        // the terminal.
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test Passed !!!");
        }else{
            System.out.println("Test Failed");
            System.out.println("Expected title: "+expectedTitle);
            System.out.println("Actual title: "+actualTitle);
        }
        //The reason to have an else-if statement here is useful for the tester to see what if anything went wrong
        // with his script.

        //reusable code that doesn't require for you to throw an exception in the main method.
        BrowserUtils.wait(2);
        driver.close();
    }
}
