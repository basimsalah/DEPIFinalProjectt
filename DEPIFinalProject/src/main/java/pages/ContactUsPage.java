package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ContactUsPage {
    WebDriver driver;

    public ContactUsPage(WebDriver driver) {this.driver = driver;}

    By contactUsButton = By.xpath("//*[@href=\"/contact_us\"]");
    By GetInTouchTitle = By.xpath("//*[@class=\"contact-form\"]//h2");
    By name = By.xpath("//*[@data-qa=\"name\"]");
    By email = By.xpath("//*[@data-qa=\"email\"]");
    By subject = By.xpath("//*[@data-qa=\"subject\"]");
    By yourMessageHere = By.id("message");
    By uploadFile = By.name("upload_file");
    By submitButton = By.name("submit");


/***************************************** Actions ********************************************/
public void clickOnContactUsButton(){driver.findElement(contactUsButton).click();}
public void enterName(){driver.findElement(name).sendKeys("Mohamed");}
public void enterEmail(){driver.findElement(email).sendKeys("mohamed123@gmail.com");}
    public void enterInvalidEmail(){driver.findElement(email).sendKeys("mohamed123gmailcom");}

    public void enterSubject(){driver.findElement(subject).sendKeys("Return Order");}
public void enterMessage(){driver.findElement(yourMessageHere).sendKeys("Return I need to return the order because the size is wrong");}
    public void UploadFileIs(){driver.findElement(uploadFile).sendKeys("C:\\Users\\dell\\Desktop\\TestProject\\TestFile.pdf");}
    public void clickOnSubmitButtonInvalid() {driver.findElement(submitButton).click();}

        public void clickOnSubmitButton(){driver.findElement(submitButton).click();
      driver.switchTo().alert().accept();}


/***************************************** Assertions ********************************************/
    public void CheckGetInTouchIsVisible(){
        Assert.assertTrue(driver.findElement(GetInTouchTitle).isDisplayed());}


}