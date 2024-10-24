import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUP;

public class LoginPageTest {
    Faker faker=new Faker();
    String name=faker.name().firstName();
    String email=faker.internet().safeEmailAddress();
    String existEmail="abdo@gmail.com";
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();

    }
    @Test(priority=1)

    public void loginWithValidData() {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage = new HomePage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
    }@Test(priority=2)

    public void verifyUserCanNotLoginWithInvalidEmailFormat() {
        String email="abdo.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage = new HomePage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
    }@Test(priority=3)

    public void verifyUserCanNotLoginWithInvalidPassword() {
        String email="abdo14@gmail.com";
        String password="12345678788";
        loginPage=new LoginPage(driver);
        homePage = new HomePage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
    }@Test(priority=4)

    public void verifyUserCanNotLoginWithInvalidEmail() {
        String email="abdo145@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage = new HomePage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
    }@Test(priority=5)

    public void verifyUserCanNotLoginWhenTheEmailFieldIsLeftEmpty() {
        String email="";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage = new HomePage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
    }@Test(priority=6)

    public void verifyUserCanNotLoginWhenThePasswordFieldIsLeftEmpty() {
        String email="abdo14@gmail.com";
        String password="";
        loginPage=new LoginPage(driver);
        homePage = new HomePage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
    }
    @AfterClass
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}


