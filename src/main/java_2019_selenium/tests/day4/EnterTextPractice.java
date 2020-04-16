package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class EnterTextPractice {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //This line specifically looks for the locator name in the html source code By.name than
        //it's attribute "email".
        WebElement inputBox = driver.findElement(By.name("email"));
        //enters the text at the email box
        inputBox.sendKeys("jax42@gmail.com");

        //Clicks the the submit button for us.
        WebElement button = driver.findElement(By.id("form_submit"));
        //Allow it to click on that element.
        button.click();
        BrowserUtils.wait(5);

        String expectedUrl= "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        BrowserUtils.wait(5);
        driver.close();
    }
}
