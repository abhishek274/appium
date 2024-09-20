import io.appium.java_client.android.AndroidDriver;
import org.example.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Scroll_Test extends AppTest {
    AndroidDriver driver;

    @BeforeClass
    public void Initialize() throws MalformedURLException {
        driver=Setup();
    }
    @Test
    public void Scroll(){

        while (true) {
            try {
                System.out.println(driver);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                WebElement element = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Test.sllTheThings() T-Shirt\"]"));

                if (element.isDisplayed()) {
                    System.out.println("Element found!");
                    element.click();
                    break;
                }
            } catch (NoSuchElementException e) {
                Actions ac = new Actions();
                ac.swipeUntilElementFound(driver);
            }
            }

    }
@Test
    public void placeOrder(){
        while (true) {
            try {
                System.out.println(driver);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                WebElement element = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Test.sllTheThings() T-Shirt\"]"));

                if (element.isDisplayed()) {
                    System.out.println("Element found!");
                    element.click();
                    break;
                }
            } catch (NoSuchElementException e) {
                Actions ac = new Actions();
                ac.swipeUntilElementFound(driver);
            }
        }
    ProductPage productPage = new ProductPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);
        productPage.clickIncreaseCount();
        productPage.clickAddToCart();
        productPage.clickOnCart();
        productPage.clickProceedToCheckout();
        loginPage.sendKeysUserName("bod@example.com");
        loginPage.sendKeysPassword("10203040");
        loginPage.clickLoginButton();
        checkoutPage.sendKeysFullName("Abhi");
        checkoutPage.sendKeysAddressLine1("1121 Hid Rdg");
        checkoutPage.sendKeysAddressLine2("apt1");
        checkoutPage.sendKeysCity("irv");
        checkoutPage.sendKeysState("TX");
        checkoutPage.sendKeysZip("65478");
        checkoutPage.sendKeysCountry("US");
        checkoutPage.clickToPayment();
    }
}
