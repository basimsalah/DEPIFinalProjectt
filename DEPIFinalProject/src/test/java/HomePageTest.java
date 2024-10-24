import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import pages.SignUP;

public class HomePageTest {
    WebDriver driver;
    Faker fake =new Faker();
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
    HomePage homePage;
    LoginPage loginPage;
    RegistrationPage register;
    SignUP signUP;


    @BeforeTest
    public void setup (){
        driver=new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();

    }
    @Test
    public void homePage() {
        homePage = new HomePage(driver);
    }
    @Test(priority = 1)
    public void VerifyThatTheAutomationExerciseLogoIsDisplayed(){
        homePage.VerifyThatTheAutomationExerciseLogoIsDisplayed();}
    @Test(priority = 2)
    public void  VerifythattheHomebuttonfunctionall(){
        homePage.VerifythattheHomebuttonfunctionall();}
    @Test (priority = 3)
    public void verifyThatTheHomePageButtonsArePresent (){
        homePage.verifyThatTheHomePageButtonsArePresent();}
    @Test(priority = 4)
    public void verifyThatTheContactusbuttonisfunctional(){
        homePage.verifyThatTheContactusbuttonisfunctional();}
    @Test(priority = 5)
    public void verifyThatTheContactUsButtonIsPresent(){
        homePage.verifyThatTheContactusbuttonispresent();}
    @Test (priority = 6)
    public void verifySubscriptionInHomepage(){
        homePage.verifySubscriptionInHomepage();}

    @Test (priority = 7)
    public void VerifythattheAutomationExerciselogoisredirectingustothehomepage(){
        homePage.VerifythattheAutomationExerciselogoisredirectingustothehomepage();}

    @Test (priority = 8)
    public void verifythattheusernameispresentinLoggedinasicon(){

        loginPage =new LoginPage(driver);
        homePage = new HomePage(driver);
        register =new RegistrationPage(driver);
        signUP=new SignUP(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name,email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password,firstName,lastName,company,address,address2,state,city,zipCode,mobileNumber);
        register.selectRandomOptions(dayNumber,monthNumber,yearNumber,countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.verifythattheusernameispresentinLoggedinasicon(name);
    }
    @Test(priority = 9)
    public void verifythattheDeleteAccountbuttonispresent() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        register = new RegistrationPage(driver);
        signUP = new SignUP(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name, email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password, firstName, lastName, company, address, address2, state, city, zipCode, mobileNumber);
        register.selectRandomOptions(dayNumber, monthNumber, yearNumber, countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.verifythattheDeleteAccountbuttonispresent();
    }
    @Test(priority = 10)
    public void verifythattheDeleteAccountbuttonFunctional() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        register = new RegistrationPage(driver);
        signUP = new SignUP(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name, email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password, firstName, lastName, company, address, address2, state, city, zipCode, mobileNumber);
        register.selectRandomOptions(dayNumber, monthNumber, yearNumber, countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.verifythattheDeleteAccountbuttonfunctional();

    }
    @Test(priority = 9)
    public void verifyThatTheLogOutButtonfunctional() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        register = new RegistrationPage(driver);
        signUP = new SignUP(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name, email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password, firstName, lastName, company, address, address2, state, city, zipCode, mobileNumber);
        register.selectRandomOptions(dayNumber, monthNumber, yearNumber, countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.verifyThatTheLogOuttButtonfunctional();
    }
    @Test(priority = 9)
    public void verifyThatTheLogOutButtonPresent(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        register = new RegistrationPage(driver);
        signUP = new SignUP(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name, email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password, firstName, lastName, company, address, address2, state, city, zipCode, mobileNumber);
        register.selectRandomOptions(dayNumber, monthNumber, yearNumber, countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.verifyThatTheLogOutButtonPresent();
    }
    @Test(priority = 10)
    public void verifythattheCartbuttonfunctional() {
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        register = new RegistrationPage(driver);
        signUP = new SignUP(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name, email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password, firstName, lastName, company, address, address2, state, city, zipCode, mobileNumber);
        register.selectRandomOptions(dayNumber, monthNumber, yearNumber, countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.clickOnCartIcon();
    }
    @Test(priority = 10)
    public void verifythattheCartbuttonispresent(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        register = new RegistrationPage(driver);
        signUP = new SignUP(driver);
        homePage.clickOnSignUpIcon();
        signUP.enterValidNameAndEmail(name, email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password, firstName, lastName, company, address, address2, state, city, zipCode, mobileNumber);
        register.selectRandomOptions(dayNumber, monthNumber, yearNumber, countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.verifythattheCartbuttonispresent();}
    @Test(priority = 11)
    public void verifythattheProductsbuttonfunctional(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        register = new RegistrationPage(driver);
        signUP = new SignUP(driver);
        homePage.clickOnSignUpIcon();

        signUP.enterValidNameAndEmail(name, email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password, firstName, lastName, company, address, address2, state, city, zipCode, mobileNumber);
        register.selectRandomOptions(dayNumber, monthNumber, yearNumber, countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.clickOnProductIcon();}
    @Test(priority = 11)
    public void verifythattheProductsbuttonispresent(){
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        register = new RegistrationPage(driver);
        signUP = new SignUP(driver);
        homePage.clickOnSignUpIcon();

        signUP.enterValidNameAndEmail(name, email);
        signUP.clickOnSignUpButton();
        register.fillAllValidData(password, firstName, lastName, company, address, address2, state, city, zipCode, mobileNumber);
        register.selectRandomOptions(dayNumber, monthNumber, yearNumber, countryNumber);
        register.clickOnCreteAccountButton();
        register.clickOnCreteContinueButton();
        homePage.verifythattheProductsbuttonispresent();
    }




    @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}


