package config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ConfigAdvancedPages {
    protected AppiumDriver<MobileElement> driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();


        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "qa27");
        capabilities.setCapability( MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        capabilities.setCapability("appPackage", "com.h6ah4i.android.example.advrecyclerview");
        capabilities.setCapability("appActivity", ".launcher.MainActivity");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("app","C:/Tools/AdvancedRecyclerView.apk");
        //capabilities.setCapability("noReset", "false");
        //capabilities.setCapability("fullReset", "true");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        //driver = EventFiringWebDriverFactory.getEventFiringWebDriver(driver,new AppiumListener());

    }
    @AfterMethod()
    public void tearDown(){
        //driver.resetApp();
        //driver.closeApp();
        driver.quit();
    }
}
