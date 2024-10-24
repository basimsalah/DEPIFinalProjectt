import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class ContactUsPageTest {
    WebDriver driver;
    HomePage homePage;
    ContactUsPage cotactUs;
 LoginPage loginPage;



    @BeforeTest
    public void setup (){
        driver=new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();}

    @Test (priority = 1)
    public void verifyUserCanSubmitAContactFormWithValidDetails()  {
        homePage=new HomePage(driver);
        cotactUs=new ContactUsPage(driver);
cotactUs.clickOnContactUsButton();
cotactUs.CheckGetInTouchIsVisible();
cotactUs.enterName();
cotactUs.enterEmail();
cotactUs.enterSubject();
cotactUs.enterMessage();
cotactUs.UploadFileIs();
cotactUs.clickOnSubmitButton();}

    @Test (priority = 2)
    public void verifyUserCanSubmitAContactFormWithInvalidEmailAddress()  {
       homePage=new HomePage(driver);
     cotactUs=new ContactUsPage(driver);
cotactUs.clickOnContactUsButton();
cotactUs.enterName();
cotactUs.enterInvalidEmail();
cotactUs.enterSubject();
cotactUs.enterMessage();
cotactUs.clickOnSubmitButton();}
    @Test (priority = 3)
    public void verifyThatLeavingAnyRequiredFieldEmptyShowsAnAppropriateErrorMessage()  {
       homePage=new HomePage(driver);
     cotactUs=new ContactUsPage(driver);
cotactUs.clickOnContactUsButton();
cotactUs.enterEmail();
cotactUs.clickOnSubmitButton();}

    @Test (priority = 4)
    public void verifyThatTheAttachFileButtonAllowsUsersUploadAFileSuccessfully()  {
        homePage=new HomePage(driver);
        cotactUs=new ContactUsPage(driver);
        cotactUs.clickOnContactUsButton();
        cotactUs.enterName();
        cotactUs.enterEmail();
        cotactUs.enterSubject();
        cotactUs.enterMessage();
        cotactUs.UploadFileIs();
        cotactUs.clickOnSubmitButton();}

    @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }}









