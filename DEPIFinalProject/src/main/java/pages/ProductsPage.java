package pages;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    By productsName = By.xpath("//*[@class=\"col-sm-4\"]//p");
    By productsPrice = By.xpath("//*[@class=\"col-sm-4\"]//h2");
    By productsImage = By.xpath("//*[@src=\"/get_product_picture/4\"]");
    By addItemToCart = By.xpath("//*[@class=\"productinfo text-center\"]//*[@data-product-id=\"1\"] ");
    By addToCartInPage=By.xpath("//*[@class=\"btn btn-default cart\"]");
    By viewCartAfterAdding = By.xpath("//*[@class=\"modal-content\"]//*[@href=\"/view_cart\"]");
    By continueShopping = By.xpath("//*[@class=\"btn btn-success close-modal btn-block\"]");
    By viewProductsButton = By.xpath("//*[@href=\"/product_details/1\"]");
    By womenMenu = By.xpath("//*[@href=\"#Women\"]");
    By subcategories = By.xpath("//*[@id=\"Women\"]/div\n");
    By dressButton = By.xpath("//*[@href=\"/category_products/1\"]");
    By dressProducts = By.xpath("//*[@class=\"title text-center\"]");
    By firstProduct = By.xpath("href=\"/product_details/3\"");
    By allBrands = By.xpath("//*[@class=\"nav nav-pills nav-stacked\"]");
    By poloBrand = By.xpath("//*[@href=\"/brand_products/Polo\"]");
    By poloBrandTittle = By.xpath("//*[@class=\"title text-center\"]");
    By poloCounter = By.xpath("//*[@href=\"/brand_products/Polo\"]//*[@class=\"pull-right\"]");
    By popUpMessage = By.xpath("//p[text()='Your product has been added to cart.']");
    By searchBar = By.id("search_product");
    By searchButtonn = By.xpath("//*[@class=\"btn btn-default btn-lg\"]");
    By titleOfSearch = By.xpath("//*[@class=\"title text-center\"]");
    By productQty = By.id("quantity");
    By reviewProductName = By.id("name");
    By reviewProductEmail = By.id("email");
    By reviewProductReview = By.id("review");
    By reviewButtonSubmit = By.id("button-review");
    By blueTopImg=By.xpath("//*[@src=\"/get_product_picture/1\"]");
    By blueTopPrice=By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/h2");
    By blueTopName=By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/p");
    /***************************************** Actions ********************************************/
    public void clickOnAddToCart() {driver.findElement(addItemToCart).click();}
    public void clickAddToCartInPage() {driver.findElement(addToCartInPage).click();}

    public void clickOnViewCart() {driver.findElement(viewCartAfterAdding).click();}

    public void clickOnContinueShopping() {driver.findElement(continueShopping).click();}

    public void clickOnViewProducts() {driver.findElement(viewProductsButton).click();}

    public void clickOnDressButton() {
        driver.findElement(dressButton).click();
    }

    public void clickOnWomenCategory() {
        driver.findElement(womenMenu).click();
    }

    public void clickOnBrandPolo() {
        driver.findElement(poloBrand).click();
    }

    public void dataToSearchBar() {
        driver.findElement(searchBar).sendKeys("dress");
    }  public void wrongDataToSearchBar() {
        driver.findElement(searchBar).sendKeys("labTop");
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButtonn).click();
    }

    public void clickOnViewProductButton() {
        driver.findElement(viewProductsButton).click();
    }

    public void setProductQuantatiyToZero() {
        driver.findElement(productQty).clear();
        driver.findElement(productQty).sendKeys("0");
    }

    public void enterreviewProductName() {
        driver.findElement(reviewProductName).sendKeys("Ahmed");
    }

    public void enterreviewProductEmail() {
        driver.findElement(reviewProductEmail).sendKeys("ahmed123@gmail.com");
    }

    public void enterreviewProductReview() {
        driver.findElement(reviewProductReview).sendKeys("Great product");
    }

    public void enterreviewButtonSubmit() {
        driver.findElement(reviewButtonSubmit).click();
    }

    /***************************************** Assertion ********************************************/
    public void verifyProductDetailsLikeAreDisplayedCorrectly() {
        Assert.assertTrue(driver.findElement(productsName).isDisplayed());
        Assert.assertTrue(driver.findElement(productsPrice).isDisplayed());
        Assert.assertTrue(driver.findElement(productsImage).isDisplayed());
    }

    public void verifyAllSubcategoriesUnderAMainCategoryAreDisplayedCorrectly() {
        Assert.assertTrue(driver.findElement(subcategories).isDisplayed());
    }

    public void productListUpdatesToShowOnlyProductsRelatedToTheWomenCategory() {
        Assert.assertTrue(driver.findElement(dressProducts).isDisplayed());
    }

    public void verifyThatAllAvailableBrandsAreListedOnThePage() {
        Assert.assertTrue(driver.findElement(allBrands).isDisplayed());
    }

    public void verifyBrandPoloFiltersProductsBasedOnTheSelectedBrand() {
        Assert.assertTrue(driver.findElement(poloBrandTittle).isDisplayed());
    }

    public void verifyTheConsistencyOfTheProductCountDisplayedForEachBrand() {
        Assert.assertTrue(driver.findElement(poloCounter).isDisplayed());
        double Number = driver.findElements(By.xpath("//*[@class=\"features_items\"]//*[@class=\"col-sm-4\"]")).size();
        String poloNumber=driver.findElement(poloCounter).getText().replaceAll("[^0-9]","");
        Double poloNumberDouble=Double.parseDouble(poloNumber);
       Assert.assertEquals(poloNumberDouble,Number);
    }
    public void verifyThatpopUpMessageAfterAddingAProductToTheCart(){
        Assert.assertTrue(driver.findElement(popUpMessage).isDisplayed());}
    public void verifyAllProductsAreDisplayedWhenSearchingForBlankProduct(){
        Assert.assertTrue(driver.findElement(titleOfSearch).isDisplayed());}
    public void dressButtonIsVisable(){
        Assert.assertTrue(driver.findElement(dressButton).isDisplayed());
    }
    public void verifyProductDetailsLikeNamePriceAndImagesAreDisplayedCorrectly(){
        Assert.assertTrue(driver.findElement(blueTopImg).isDisplayed());
        Assert.assertTrue(driver.findElement(blueTopPrice).isDisplayed());
        Assert.assertTrue(driver.findElement(blueTopName).isDisplayed());
    }




















}