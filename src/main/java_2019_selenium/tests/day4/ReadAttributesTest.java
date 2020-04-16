package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class ReadAttributesTest {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("\"http://practice.cybertekschool.com/forgot_password\"");
        WebElement input = driver.findElement(By.name("email"));
       //Attribute color in Html is light brown color.
        //to read the value of an attribute
        //name="email" name is an attribute, email is a value of an attribute.
        System.out.println(input.getAttribute("pattern" ) );
        input.sendKeys("random_email@gmail.com");
        // How to read the entered text?
        //It's going to be inside value attribute
        System.out.println(input.getAttribute("value"));
        //Note: If a button has a type of "submit", we can use the .submit( ) method instead
        //of click().

        //So the email that you'll be entering in the email box, will not be considering as a string or
        //rather it will be treated as a value.

        WebElement retrievePasswordButton = driver.findElement(By.id ("form_submit"));
        //Locates the element and sets up the function to be performed.

        //alternative to click, only if type="submit"
        retrievePasswordButton.submit();
        //And than the variable is used to perform the action of submitting.

        driver.close();

    }
}
