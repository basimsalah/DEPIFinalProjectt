import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;
import pages.SignUP;

public class RegistrationTest {
    Faker fake=new Faker();
    String name=fake.name().firstName();
    String email=fake.internet().safeEmailAddress();
    String password=fake.internet().password();
    String firstName=fake.name().firstName();

    String lastName=fake.name().lastName();
    String company=fake.company().name();
    String address=fake.address().fullAddress();
    String address2=fake.address().fullAddress();
    String state=fake.address().state();
    String city=fake.address().city();
    String zipCode=fake.address().zipCode();
    String mobileNumber=fake.phoneNumber().phoneNumber();
    int dayNumber=fake.number().numberBetween(2,31);
    int monthNumber=fake.number().numberBetween(2,12);
    int yearNumber=fake.number().numberBetween(10,50);
    int countryNumber=fake.number().numberBetween(1,4);

    WebDriver driver;
    HomePage homePage;
    SignUP signUP;
    RegistrationPage register;
    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();

    }
    @Test(priority=1)

    public void registerWithValidData(){
        register=new RegistrationPage(driver);
        signUP=new SignUP(driver);
        homePage=new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name,email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password,firstName,lastName,company,address,address2,state,city,zipCode,mobileNumber);
        register.selectRandomOptions(dayNumber,monthNumber,yearNumber,countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.clickOnLogOutIcon();    }
    @Test(priority=2)

    public void VerifyThatTheRegistrationFailsWhenAllMandatoryFieldsAreEmpty  (){
        String email=fake.internet().safeEmailAddress();
        register=new RegistrationPage(driver);
        signUP=new SignUP(driver);
        homePage=new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name,email);
        signUP.clickOnSignUpButton();
        register.clickOnCreteAccountButton();
    }@Test(priority=3)

    public void VerifyThatTheRegistrationFailsWhenUsingInvalidFirstName  (){
        String firstName="123";
        String email=fake.internet().safeEmailAddress();

        register=new RegistrationPage(driver);
        signUP=new SignUP(driver);
        homePage=new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name,email);

        signUP.clickOnSignUpButton();
        register.fillAllValidData(password,firstName,lastName,company,address,address2,state,city,zipCode,mobileNumber);
        register.selectRandomOptions(dayNumber,monthNumber,yearNumber,countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();

        homePage.clickOnLogOutIcon();
    }

    @Test(priority=4)

    public void VerifyThatTheRegistrationFailsWhenUsingInvalidLastName  (){
        String lastName="2589";
        String email=fake.internet().safeEmailAddress();

        register=new RegistrationPage(driver);
        signUP=new SignUP(driver);
        homePage=new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name,email);

        signUP.clickOnSignUpButton();
        register.fillAllValidData(password,firstName,lastName,company,address,address2,state,city,zipCode,mobileNumber);
        register.selectRandomOptions(dayNumber,monthNumber,yearNumber,countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();

        homePage.clickOnLogOutIcon();
    }
    @Test(priority=5)

    public void VerifyThatTheRegistrationFailsWhenUsingInvalidMobileNumber (){
        String mobileNumber="abcderr";
        String email=fake.internet().safeEmailAddress();

        register=new RegistrationPage(driver);
        signUP=new SignUP(driver);
        homePage=new HomePage(driver);

        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name,email);

        signUP.clickOnSignUpButton();
        register.fillAllValidData(password,firstName,lastName,company,address,address2,state,city,zipCode,mobileNumber);
        register.selectRandomOptions(dayNumber,monthNumber,yearNumber,countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();

        homePage.clickOnLogOutIcon();
    }
    @Test(priority=6)

    public void VerifyThatUserCanLogoutSuccessfully (){
        String email=fake.internet().safeEmailAddress();
        register=new RegistrationPage(driver);
        signUP=new SignUP(driver);
        homePage=new HomePage(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name,email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password,firstName,lastName,company,address,address2,state,city,zipCode,mobileNumber);
        register.selectRandomOptions(dayNumber,monthNumber,yearNumber,countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.clickOnLogOutIcon();
    }


    @AfterClass
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}