import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class ProductPageTest {
    WebDriver driver;
    HomePage homePage;
    ProductsPage productsPage;
    @BeforeTest
    public void setup (){
        driver=new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    public void verifyTheFunctionalityOfTheDropDownListForTheCategoryItems(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnWomenCategory();
        productsPage.dressButtonIsVisable();

    } @Test(priority = 2)
    public void verifyProductDetailsLikeAreDisplayedCorrectly(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.verifyProductDetailsLikeAreDisplayedCorrectly();

    }
    @Test(priority = 3)
    public void verifyAddingProductToTheCartWorksCorrectly(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
    }
    @Test(priority = 4)
    public void verifyAddingAProductToTheCartWorksCorrectly() throws InterruptedException {
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnViewCart();    }

    @Test(priority = 5 )
    public void verifyTheFunctionalityOfTheContinueShoppingButtonAfterAddingProduct

            () throws InterruptedException {
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        Thread.sleep(1000);
        productsPage.clickOnContinueShopping();
    }
    @Test(priority = 6 )
    public void verifyViewProductsFunctionality
            ()  {
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnViewProducts();
    }@Test(priority = 6 )
    public void verifyAllSubcategoriesUnderAMainCategoryAreDisplayedCorrectly
            ()  {
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnWomenCategory();
        productsPage.verifyAllSubcategoriesUnderAMainCategoryAreDisplayedCorrectly();
    }
    @Test(priority = 7 )
    public void verifyThatTheProductListUpdatesToShowOnlyProductsRelatedToTheWomenCategory() {
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnWomenCategory();
        productsPage.clickOnDressButton();
        productsPage.productListUpdatesToShowOnlyProductsRelatedToTheWomenCategory();}
    @Test(priority = 8 )
    public void verifyThatAllAvailableBrandsAreListedOnThePage() {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.verifyThatAllAvailableBrandsAreListedOnThePage();}
    @Test(priority = 9 )
    public void verifyBrandPoloFiltersProductsBasedOnTheSelectedBrand
            () throws InterruptedException {
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnBrandPolo();
        productsPage.verifyBrandPoloFiltersProductsBasedOnTheSelectedBrand();
        Thread.sleep(1000);}
        @Test(priority = 10 )
    public void verifyTheConsistencyOfTheProductCountDisplayedForEachBrand
            () throws InterruptedException {
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnBrandPolo();
        productsPage.verifyTheConsistencyOfTheProductCountDisplayedForEachBrand();
        Thread.sleep(1000);}
    @Test(priority = 11)
    public void verifyAddingAProductToTheCartWorksCorrectlyPopMessageShown(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnAddToCart();
        productsPage.verifyThatpopUpMessageAfterAddingAProductToTheCart();}
    @Test(priority = 12)
    public void verifySearchingForProductsByNameWorksCorrectly(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.dataToSearchBar();
        productsPage.clickOnSearchButton();}
    @Test(priority = 13)
    public void verifyAllProductsAreDisplayedWhenSearchingForBlankProduct(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnSearchButton();
        productsPage.verifyAllProductsAreDisplayedWhenSearchingForBlankProduct();}
    @Test(priority = 14)
    public void verifyViewProductsButtonFunctionality(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnViewProductButton();}
    @Test(priority = 15)
    public void verifyTheAbilityToChooseAProductAndSelectASpecificQuantity(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnViewProductButton();}
    @Test(priority = 16)
    public void verifyTheAbilityToChooseAProductWithZeroQuantity(){
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnViewProductButton();
        productsPage.setProductQuantatiyToZero();
        productsPage.clickAddToCartInPage();}
    @Test(priority = 17)
    public void verifyTheAbilityToWriteAndSubmitReviewForProduct()  {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.clickOnViewProductButton();
        productsPage.enterreviewProductName();
        productsPage.enterreviewProductEmail();
        productsPage.enterreviewProductReview();
        productsPage.enterreviewButtonSubmit();}
    @Test(priority = 18)
    public void verifyProductDetailsLikeNamePriceAndImagesAreDisplayedCorrectly()  {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.verifyProductDetailsLikeNamePriceAndImagesAreDisplayedCorrectly();
    }
    @Test(priority = 19)
    public void verifyNoResultsAreDisplayedWhenSearchingForANonExistentProduct()  {
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        homePage.clickOnProductIcon();
        productsPage.wrongDataToSearchBar();
        productsPage.clickOnSearchButton();}



    @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}