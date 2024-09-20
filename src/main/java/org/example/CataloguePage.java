package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CataloguePage {
    AndroidDriver driver;


    @FindBy(id = "Test.sllTheThings() T-Shirt")
    WebElement Hoodie;

    public void clickHoodieImage(){
        Hoodie.click();
    }

}
