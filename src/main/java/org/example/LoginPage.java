package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    AndroidDriver driver;


    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]")
    WebElement UserName;
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/passwordET\"]")
    WebElement Password;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to login with given credentials\"]")
    WebElement LoginButton;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sendKeysUserName(String uname){
        UserName.sendKeys(uname);
    }

    public void sendKeysPassword(String pass){
        Password.sendKeys(pass);
    }

    public  void clickLoginButton(){
        LoginButton.click();
    }


}
