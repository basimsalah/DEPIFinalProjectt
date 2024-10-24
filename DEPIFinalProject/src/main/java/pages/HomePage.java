package pages;
import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver=driver;
    }
    By homeIcon = By.xpath("//*[@class=\"fa fa-home\"]");
    By productIcon = By.xpath("//*[@href=\"/products\"]");
    By cartIcon = By.xpath("//*[@href=\"/view_cart\"]");
    By signupLoginIcon = By.xpath("//*[@href=\"/login\"]");
    By testcases = By.xpath("//*[@href=\"/test_cases\"]");
    By apiTestingIcon = By.xpath("//*[@href=\"/api_list\"]");
    By videioTurIcon = By.xpath("//*[@href=\"https://www.youtube.com/c/AutomationExercise\"]");
    By contactUsIcon = By.xpath("//*[@href=\"/contact_us\"]");
    By logoLocator = By.xpath("//*[@src=\"/static/images/home/logo.png\"]");
    By deleteAccount=By.xpath("//*[@href=\"/delete_account\"]");
    By viewSubstraction=By.id("id=\"susbscribe_email\"");
    By substraction=By.xpath("//*[@class=\"col-sm-3 col-sm-offset-1\"] //h2");
    By loginLink = By.xpath("//a[@href=\"/login\"]");
    By logoutLink = By.xpath("//*[@href=\"/logout\"]");
    By nameispresentinLoggedin = By.xpath("//*[@class=\"nav navbar-nav\"]//b");

    /***************************************** Actions ********************************************/

    public void clickOnSignUpIcon(){driver.findElement(loginLink).click();}
    public void clickOnLogOutIcon(){driver.findElement(logoutLink).click();}
    public void VerifythattheAutomationExerciselogoisredirectingustothehomepage(){driver.findElement(logoLocator).click();}
    public void VerifythattheHomebuttonfunctionall(){driver.findElement((homeIcon)).click();}
    public void verifyThatTheContactusbuttonisfunctional(){driver.findElement(contactUsIcon).click();}
    public void VerifythattheSignupLoginbuttonfunctional(){driver.findElement(signupLoginIcon).click();}
    public void verifythattheDeleteAccountbuttonfunctional(){  driver.findElement(deleteAccount).click();}
    public void verifyThatTheLogOuttButtonfunctional(){driver.findElement(logoutLink).click();}
    public void clickOnCartIcon(){driver.findElement(cartIcon).click();}
    public void clickOnProductIcon(){driver.findElement(productIcon).click();}

    /***************************************** Assertions ********************************************/
    public void VerifyThatTheAutomationExerciseLogoIsDisplayed(){
        Assert.assertTrue(driver.findElement(logoLocator).isDisplayed());
    }
    public void verifyThatTheHomePageButtonsArePresent(){
        Assert.assertTrue(driver.findElement(homeIcon).isDisplayed());
        Assert.assertTrue(driver.findElement(productIcon).isDisplayed());
        Assert.assertTrue(driver.findElement(cartIcon).isDisplayed());
        Assert.assertTrue(driver.findElement(signupLoginIcon).isDisplayed());
        Assert.assertTrue(driver.findElement(testcases).isDisplayed());
        Assert.assertTrue(driver.findElement(apiTestingIcon).isDisplayed());
        Assert.assertTrue(driver.findElement(videioTurIcon).isDisplayed());
        Assert.assertTrue(driver.findElement(contactUsIcon).isDisplayed());
        Assert.assertTrue(driver.findElement(deleteAccount).isDisplayed());

    }
    public void verifyThatTheContactusbuttonispresent(){
        Assert.assertTrue(driver.findElement(contactUsIcon).isDisplayed());}
    public void verifySubscriptionInHomepage(){
        driver.findElement(viewSubstraction).click();
        Assert.assertTrue(driver.findElement(substraction).isDisplayed());}
    public void VerifythattheSignupLoginbuttonispresent(){Assert.assertTrue(driver.findElement(signupLoginIcon).isDisplayed());}
    public void verifythattheusernameispresentinLoggedinasicon(String name)
    {Assert.assertTrue(driver.findElement(nameispresentinLoggedin).isDisplayed());
        Assert.assertEquals(driver.findElement(nameispresentinLoggedin).getText(),name);}
    public void verifyThatTheLogOutButtonPresent(){Assert.assertTrue(driver.findElement(logoutLink).isDisplayed());}
    public void verifythattheProductsbuttonispresent(){Assert.assertTrue(driver.findElement(productIcon).isDisplayed());}
    public void verifythattheDeleteAccountbuttonispresent(){Assert.assertTrue(driver.findElement(deleteAccount).isDisplayed());}
    public void verifythattheCartbuttonispresent(){Assert.assertTrue(driver.findElement(cartIcon).isDisplayed());}





}
