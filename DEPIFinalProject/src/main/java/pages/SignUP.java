package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUP {
    WebDriver driver;

    public SignUP(WebDriver driver){
        this.driver=driver;
    }

    By nameLocator=By.xpath("//*[@data-qa=\"signup-name\"]");
    By emailLocator=By.xpath("//*[@data-qa=\"signup-email\"]");
    By signUpButtonLocator=By.xpath("//*[@data-qa=\"signup-button\"]");
    /***************************************** Actions ********************************************/
public void enterValidNameAndEmail(String name,String email){
    driver.findElement(nameLocator).sendKeys(name);
    driver.findElement(emailLocator).sendKeys(email);
}
    public void clickOnSignUpButton(){
        driver.findElement(signUpButtonLocator).click();
    }
    public void keepNameFieldEmpty(String email){
        driver.findElement(nameLocator).sendKeys("");
        driver.findElement(emailLocator).sendKeys(email);
    }
    public void keepEmailFieldEmpty(String name){
        driver.findElement(nameLocator).sendKeys(name);
        driver.findElement(emailLocator).sendKeys("");
    }
    public void enterOnlyNumbersAtNameField(String email){
        driver.findElement(nameLocator).sendKeys("1234");
        driver.findElement(emailLocator).sendKeys(email);
    }public void enterInValidEmailFormat(String name){
        driver.findElement(nameLocator).sendKeys(name);
        driver.findElement(emailLocator).sendKeys("abdo.com");
    }



    /***************************************** Assertions ********************************************/

}
