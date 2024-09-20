package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {


private AndroidDriver driver;
    @FindBy(id = "Test.sllTheThings() T-Shirt")
    WebElement Hoodie;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    WebElement increaseCount;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    WebElement addToCart;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    WebElement clickCart;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirms products for checkout\"]")
    WebElement proceedToCheckout;
    public ProductPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickIncreaseCount(){
        increaseCount.click();
    }
    public void clickAddToCart(){
        addToCart.click();
    }

    public void clickOnCart(){
        clickCart.click();
    }
    public void clickProceedToCheckout(){
        proceedToCheckout.click();
    }


}
