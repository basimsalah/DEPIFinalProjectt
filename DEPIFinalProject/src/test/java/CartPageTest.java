import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.WebSocketFrame;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class CartPageTest {
    WebDriver driver;

    HomePage homePage;
    CartPage cartPage;
    LoginPage loginPage;
    ProductsPage productsPage;
    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();

    }
    @Test(priority=1)

    public void verifyTheMessageDisplayedForAnEmptyShoppingCart(){
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        homePage.clickOnCartIcon();
        cartPage.messageOfEmptyCArt();


    }@Test(priority=2)

    public void verifyThatTheCartPageDisplaysASummaryOfAllItemsAddedToTheCart() throws InterruptedException {
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.checkAllDetailsAreDisplayed();



    }
    @Test(priority=3)

    public void verifyThatTheRemoveButtonRemovesTheSelectedProductFromTheCart() throws InterruptedException {
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnDeleteProductFromCartButton();




    }

    @Test(priority=4)

    public void verifyTheProceedToCheckoutButtonRedirectsToTheCheckoutPage() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
        cartPage.checkThatUserRedirectedToCheckOutPage();

    }
    @Test(priority=5)

    public void verifyThatTheCartRetainsTheProductsAfterRefreshingThePage() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
        cartPage.checkThatUserRedirectedToCheckOutPage();
        driver.navigate().refresh();
        cartPage.checkThatTheCartRetainsProducts();

    }
    @Test(priority=6)

    public void verifyDeliveryAddressInCheckoutIsSameAddressFilledAtTheTimeRegistrationOfAccount() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
        cartPage.checkThatUserRedirectedToCheckOutPage();
        cartPage.checkTheAddress();

    }
    @Test(priority=7)

    public void verifyCheckoutListAndTotalPriceCalculationCorrectly() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
        cartPage.checkThatUserRedirectedToCheckOutPage();
        cartPage.checkTheTotal();

    }@Test(priority=8)

    public void verifyTheAvailabilityToAddACommentForTheSelectedOrders() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();

    }@Test(priority=9)

    public void verifyTheFunctionalityForThePlaceOrder() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();
       cartPage.clickOnPlaceOrderButton();

    }@Test(priority=10)

    public void verifyThatThePaymentFormIncludesAllValidDataFoRequiredFields() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();
       cartPage.clickOnPlaceOrderButton();
       cartPage.enterPaymentValidData();
        cartPage.clickOnPayAndConfirmButton();


    }@Test(priority=11)

    public void verifyThatThePaymentFormIncludesInvalidDataForNameOnCardAndValidValuesInOtherFields() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();
       cartPage.clickOnPlaceOrderButton();
       cartPage.enterInvalidDataAtNameField();
        cartPage.clickOnPayAndConfirmButton();


    }@Test(priority=12)

    public void verifyThatThePaymentFormIncludesInvalidDataForCardNumberAndValidValuesInOtherFields() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();
       cartPage.clickOnPlaceOrderButton();
       cartPage.enterInvalidDataAtCardNumberField();
        cartPage.clickOnPayAndConfirmButton();


    }@Test(priority=13)

    public void verifyThatThePaymentFormIncludesInvalidDataForCcvAndValidValuesInOtherFields() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();
       cartPage.clickOnPlaceOrderButton();
       cartPage.enterInvalidCcv();
        cartPage.clickOnPayAndConfirmButton();
    }@Test(priority=14)

    public void verifyThatThePaymentFormIncludesExpiredDataForExpirationAndValidValuesInOtherField() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();
       cartPage.clickOnPlaceOrderButton();
       cartPage.enterExpiredData();
        cartPage.clickOnPayAndConfirmButton();
    }
@Test(priority=14)

    public void verifyThatThePaymentFormIncludesBlankDataForCardNumberAndValidValuesInOtherField() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();
       cartPage.clickOnPlaceOrderButton();
       cartPage.blankDataForCardNumber();
    cartPage.clickOnPayAndConfirmButton();
    }@Test(priority=15)

    public void verifyThatThePaymentFormIncludesBlankDataForCcv() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();
       cartPage.clickOnPlaceOrderButton();
       cartPage.blankDataForCcv();
        cartPage.clickOnPayAndConfirmButton();
    }
@Test(priority=16)

    public void verifyTheFunctionalityOfPayAndConfirmOrder() throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();
       cartPage.clickOnPlaceOrderButton();
       cartPage.enterPaymentValidData();
       cartPage.clickOnPayAndConfirmButton();
    }
@Test(priority=17)

    public void verifyTheFunctionalityOfContinueButton () throws InterruptedException {
        String email="abdo15@gmail.com";
        String password="12345678";
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnSignUpIcon();
        loginPage.enterDataToLogin(email,password);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
        homePage.clickOnCartIcon();
        cartPage.clickOnCheckOutButton();
       cartPage.enterAComment();
       cartPage.clickOnPlaceOrderButton();
       cartPage.enterPaymentValidData();
       cartPage.clickOnPayAndConfirmButton();
       cartPage.clickOnContinueButton();
    }

    @AfterClass
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

