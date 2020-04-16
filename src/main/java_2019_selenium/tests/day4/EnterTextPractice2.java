package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class EnterTextPractice2 {

    public static void main(String[] args) {
        // As usually we are starting by setting up driver.
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //Locates the element responsible for where user puts their email at.
        WebElement input = driver.findElement(By.name("email"));
        //This alternative allows you to enter your email as well as submitting
        //it on one line.
        //Keys.Enter will automate the Enter button for you.
        input.sendKeys("random@yahoo.com", Keys.ENTER);
        BrowserUtils.wait(4);
        //This brings back the webElement's text
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));

        String expectedMessage = "Your email has been sent.";


        //While this code works with line 23 to verify if the element retrieved =
        // to the retrieved text from the confirmationMessage.
        String actualMessage = confirmationMessage.getText();

        //Than this if-else statement verifies that the expectedMessage equals the actualMessage.
        if (expectedMessage.equals(actualMessage) ){
            System.out.println("Test Passed");

        }else{
            System.out.println("Test Failed");
        }
        driver.close();


    }
}
