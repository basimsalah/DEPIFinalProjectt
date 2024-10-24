package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    WebDriver driver;
    public RegistrationPage(WebDriver driver){
        this.driver=driver;
    }
    By genderLocator=By.id("id_gender1");
    By passwordLocator=By.id("password");
    By dayLocator=By.id("days");
    By monthLocator=By.id("months");
    By yearLocator=By.id("years");
    By newsletterLocator=By.id("newsletter");
    By optionLocator=By.id("optin");
    By first_nameLocator=By.id("first_name");
    By last_nameLocator=By.id("last_name");
    By companyLocator=By.id("company");
    By address1Locator=By.id("address1");
    By address2Locator=By.id("address2");
    By countryLocator=By.id("country");
    By stateLocator=By.id("state");
    By cityLocator=By.id("city");
    By zipcodeLocator=By.id("zipcode");
    By mobile_numberLocator=By.id("mobile_number");
    By createAccountButton=By.xpath("//*[@data-qa=\"create-account\"]");
    By continueButton=By.xpath("//*[@data-qa=\"continue-button\"]");
    By titleLocator=By.xpath("(//h2[@class=\"title text-center\"])[1]");
    /***************************************** Actions ********************************************/
    public void fillAllValidData(String password,String firstName,String lastName,String company,String address1,String address2,String state,String city,String zipCode,String mobileNumber) {
        driver.findElement(genderLocator).click();
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(first_nameLocator).sendKeys(firstName);
        driver.findElement(last_nameLocator).sendKeys(lastName);
        driver.findElement(companyLocator).sendKeys(company);
        driver.findElement(address1Locator).sendKeys(address1);
        driver.findElement(address2Locator).sendKeys(address2);
        driver.findElement(stateLocator).sendKeys(state);
        driver.findElement(cityLocator).sendKeys(city);
        driver.findElement(zipcodeLocator).sendKeys(zipCode);
        driver.findElement(mobile_numberLocator).sendKeys(mobileNumber);
        driver.findElement(genderLocator).click();
        driver.findElement(newsletterLocator).click();
        driver.findElement(optionLocator).click();

    }
    public void selectRandomOptions(int dayNumber,int monthNumber,int yearNumber,int countryNumber) {
        Select selectDay = new Select(driver.findElement(dayLocator));
        selectDay.selectByIndex(dayNumber);
        Select selectMonth = new Select(driver.findElement(monthLocator));
        selectMonth.selectByIndex(monthNumber);
        Select selectYear = new Select(driver.findElement(yearLocator));
        selectYear.selectByIndex(yearNumber);
        Select selectCountry = new Select(driver.findElement(countryLocator));
        selectCountry.selectByIndex(countryNumber);
    }
public void clickOnCreteAccountButton(){
        driver.findElement(createAccountButton).click();
}public void clickOnCreteContinueButton(){
        driver.findElement(continueButton).click();
}
//public void clickOnMr(){
//        driver.findElement(genderLocator).click();
//}

    /***************************************** Assertions ********************************************/

}
