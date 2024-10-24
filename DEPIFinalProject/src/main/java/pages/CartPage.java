package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage {
    WebDriver driver;
    Faker faker=new Faker();
    public CartPage(WebDriver driver){this.driver=driver;}

    By emptyCartMessage=By.id("empty_cart");
    By productNameInCart=By.xpath("//*[@class=\"cart_description\"]//h4");
    By productImageInCart=By.xpath("//*[@class=\"product_image\"]t");
    By productPriceInCart=By.xpath("//*[@class=\"cart_price\"]");
    By productQuantityInCart=By.xpath("//*[@class=\"cart_quantity\"]");
    By deleteProductFromCart=By.xpath("//*[@class=\"cart_quantity_delete\"]");
    By checkOutButton=By.xpath("//*[@class=\"btn btn-default check_out\"]");
    By cartDetails=By.xpath("//*[@class=\"cart_description\"]");
    By address=By.xpath("//*[@class=\"address_address1 address_address2\"][2]");
    By totalAmount=By.xpath("//*[@class=\"table table-condensed\"]//tr[2]//td[4]");
    By comment=By.xpath("//*[@class=\"form-control\"]");
    By placeOrder=By.xpath("//*[@class=\"btn btn-default check_out\"]");
    By cardName=By.xpath("//*[@data-qa=\"name-on-card\"]");
    By cardNumber=By.xpath("//*[@class=\"form-control card-number\"]");
    By cvc=By.xpath("//*[@class=\"form-control card-cvc\"]");
    By monthExpiration=By.xpath("//*[@class=\"form-control card-expiry-month\"]");
    By yearExpiration=By.xpath("//*[@data-qa=\"expiry-year\"]");
    By continueButton=By.xpath("//*[@data-qa=\"continue-button\"]");
    By submitButton=By.id("submit");

    /***************************************** Actions ********************************************/


    public void clickOnDeleteProductFromCartButton(){
        driver.findElement(deleteProductFromCart).click();
    }
    public void clickOnCheckOutButton(){
        driver.findElement(checkOutButton).click();

    }
    public void enterAComment(){
        driver.findElement(comment).sendKeys("Thank You");


    }  public void clickOnPlaceOrderButton(){
        driver.findElement(placeOrder).click();

    }  public void enterPaymentValidData( ){
driver.findElement(cardName).sendKeys("Cib");
driver.findElement(cardNumber).sendKeys("123345587/7");
driver.findElement(cvc).sendKeys("335");
driver.findElement(monthExpiration).sendKeys("2");
driver.findElement(yearExpiration).sendKeys("2026");
    }
public void enterInvalidDataAtNameField( ){
driver.findElement(cardName).sendKeys("125!@$$");
driver.findElement(cardNumber).sendKeys("123345587/7");
driver.findElement(cvc).sendKeys("335");
driver.findElement(monthExpiration).sendKeys("2");
driver.findElement(yearExpiration).sendKeys("2026");
    }
public void enterInvalidDataAtCardNumberField( ){
driver.findElement(cardName).sendKeys("cib");
driver.findElement(cardNumber).sendKeys("abcde");
driver.findElement(cvc).sendKeys("335");
driver.findElement(monthExpiration).sendKeys("2");
driver.findElement(yearExpiration).sendKeys("2026");
    }
public void enterInvalidCcv( ){
driver.findElement(cardName).sendKeys("cib");
driver.findElement(cardNumber).sendKeys("1255488578");
driver.findElement(cvc).sendKeys("cderg");
driver.findElement(monthExpiration).sendKeys("2");
driver.findElement(yearExpiration).sendKeys("2026");
    }
public void enterExpiredData( ){
driver.findElement(cardName).sendKeys("cib");
driver.findElement(cardNumber).sendKeys("1255488578");
driver.findElement(cvc).sendKeys("cderg");
driver.findElement(monthExpiration).sendKeys("2");
driver.findElement(yearExpiration).sendKeys("1992");

    }public void blankDataForCardNumber( ){
driver.findElement(cardName).sendKeys("cib");
driver.findElement(cardNumber).sendKeys("");
driver.findElement(cvc).sendKeys("125");
driver.findElement(monthExpiration).sendKeys("2");
driver.findElement(yearExpiration).sendKeys("2027");

    }public void blankDataForCcv( ){
driver.findElement(cardName).sendKeys("cib");
driver.findElement(cardNumber).sendKeys("120228969988");
driver.findElement(cvc).sendKeys("");
driver.findElement(monthExpiration).sendKeys("2");
driver.findElement(yearExpiration).sendKeys("2026");

    }
public void clickOnPayAndConfirmButton(){
    driver.findElement(submitButton).click();
}public void clickOnContinueButton(){
    driver.findElement(continueButton).click();
}

    /***************************************** Assertions ********************************************/
    public void messageOfEmptyCArt(){
        Assert.assertEquals(driver.findElement(emptyCartMessage).getText()," Cart is empty! Click here to buy products.");

    }
    public void checkAllDetailsAreDisplayed(){
        Assert.assertTrue(driver.findElement(productNameInCart).isDisplayed());
        Assert.assertTrue(driver.findElement(productImageInCart).isDisplayed());
        Assert.assertTrue(driver.findElement(productPriceInCart).isDisplayed());
        Assert.assertTrue(driver.findElement(productQuantityInCart).isDisplayed());
    }
    public void checkThatUserRedirectedToCheckOutPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("checkout"));


    }public void checkThatTheCartRetainsProducts(){
        Assert.assertTrue(driver.findElement(cartDetails).isDisplayed());


    }public void checkTheAddress(){
        Assert.assertEquals(driver.findElement(address).getText(),"alexandria");}

    public void checkTheTotal(){
        System.out.println(driver.findElement(totalAmount).getText().replaceAll("[^0-9]",""));
        Assert.assertEquals(driver.findElement(totalAmount).getText().replaceAll("[^0-9]",""),"500");


    }





}
