package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){this.driver=driver;}
    By loginEmailLocator= By.xpath("//*[@data-qa=\"login-email\"] ");
    By loginPasswordlLocator= By.xpath("//*[@data-qa=\"login-password\"]");
    By loginButtonlLocator= By.xpath("//*[@data-qa=\"login-button\"]");
    /***************************************** Actions ********************************************/
  public void enterDataToLogin(String email,String password){
    driver.findElement(loginEmailLocator).sendKeys(email);
    driver.findElement(loginPasswordlLocator).sendKeys(password);
    driver.findElement(loginButtonlLocator).click();
}
}

