package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppTest {
         AndroidDriver driver;
public AndroidDriver Setup() throws MalformedURLException {

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName","Android");
//        caps.setCapability("appium:deviceName","emulator-5554");
//        caps.setCapability("appium:automationName","UiAutomator2");
//        caps.setCapability("appium:appPackage","com.saucelabs.mydemoapp.android");
//        caps.setCapability("appium:appActivity","com.saucelabs.mydemoapp.android.view.activities.SplashActivity");
//
//      driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
//return driver;





    MutableCapabilities caps = new MutableCapabilities();
//    caps.setCapability("platformName", "Android");
//    caps.setCapability("appium:app", "storage:filename=mda-2.0.2-23.apk");  // The filename of the mobile app
//    caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
//    caps.setCapability("appium:platformVersion", "15.0");  // Set to the desired Android version
//    caps.setCapability("appium:automationName", "UiAutomator2");
    caps.setCapability("platformName", "Android");
    caps.setCapability("appium:app", "storage:filename=mda-2.0.2-23.apk");  // The filename of the mobile app
    caps.setCapability("appium:deviceName", "Google Pixel 8 GoogleAPI Emulator");
    caps.setCapability("appium:platformVersion", "15.0");
    caps.setCapability("appium:automationName", "UiAutomator2");

    MutableCapabilities sauceOptions = new MutableCapabilities();
    sauceOptions.setCapability("username", "oauth-duggiralaabhishek5-6c093");
    sauceOptions.setCapability("accessKey", "bc45025f-8b24-4db2-9c27-94342d0c44e1");
    sauceOptions.setCapability("build", "appium-build-FNULJ");
    sauceOptions.setCapability("name", "Place Order");
    sauceOptions.setCapability("deviceOrientation", "PORTRAIT");

    caps.setCapability("sauce:options", sauceOptions);
    URL url = new URL("https://ondemand.us-west-1.saucelabs.com:443/wd/hub");
     driver = new AndroidDriver(url, caps);
     return driver;




}
}
