package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    AndroidDriver driver;


    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/fullNameET\"]")
    WebElement FullName;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/address1ET\"]")
    WebElement AddressLine1;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/address2ET\"]")
    WebElement AddressLine2;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/cityET\"]")
    WebElement City;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/stateET\"]")
    WebElement State;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/zipET\"]")
    WebElement Zip;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/countryET\"]")
    WebElement Country;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Saves user info for checkout\"]")
    WebElement ToPayment;



    public  CheckoutPage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void sendKeysFullName(String str){
        FullName.sendKeys(str);
    }
    public void sendKeysAddressLine1(String str){
        AddressLine1.sendKeys(str);
    }
    public void sendKeysAddressLine2(String str){
        AddressLine2.sendKeys(str);
    }
    public void sendKeysCity(String str){
        City.sendKeys(str);
    }
    public void sendKeysState(String str){
        State.sendKeys(str);
    }
    public void sendKeysZip(String str){
        Zip.sendKeys(str);
    }
    public void sendKeysCountry(String str){
        Country.sendKeys(str);
    }

    public void clickToPayment(){
        ToPayment.click();
    }

}
