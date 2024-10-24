import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUP;

public class SignUpTest {
    Faker faker=new Faker();
    String name=faker.name().firstName();
    String email=faker.internet().safeEmailAddress();
    String existEmail="abdo@gmail.com";
    WebDriver driver;
    HomePage homePage;
    SignUP signUP;
    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();

    }
    @Test(priority=1)

    public void signUpWithValidData(){
        signUP=new SignUP(driver);
        homePage=new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name,email);
        signUP.clickOnSignUpButton();
    }
    @Test(priority = 2)
    public void verifyThatTheRegistrationFailsWhenTheNameFieldIsLeftEmpty() {
        signUP = new SignUP(driver);
        homePage = new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.keepNameFieldEmpty(email);
        signUP.clickOnSignUpButton();
    }
    @Test(priority = 3)
    public void verifyThatTheRegistrationFailsWhenTheEmailFieldIsLeftEmpty(){
        signUP=new SignUP(driver);
        homePage=new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.keepEmailFieldEmpty(name);
        signUP.clickOnSignUpButton();

    }@Test(priority = 4)
    public void verifyThatTheRegistrationFailsWithInvalidData(){
        signUP=new SignUP(driver);
        homePage=new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterOnlyNumbersAtNameField(email);
        signUP.clickOnSignUpButton();

    }
    @Test(priority = 5)
    public void verifyThatTheRegistrationFailsWhenEnterInvalidEmailFormat(){
        signUP=new SignUP(driver);
        homePage=new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterInValidEmailFormat(name);
        signUP.clickOnSignUpButton();}
    @Test(priority = 6)

    public void verifyThatUserCanNoSignUpWithExistingEmail(){

        signUP=new SignUP(driver);
        homePage=new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name,existEmail);
        signUP.clickOnSignUpButton();

    }
    @AfterClass
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
