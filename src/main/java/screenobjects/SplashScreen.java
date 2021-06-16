package screenobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashScreen extends BaseScreen{

    public SplashScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@resource-id ='com.example.svetlana.scheduler:id/app_version_res']")
    MobileElement versionTextView;

    public String getCurrentVersion(){
        return versionTextView.getText();
    }

    public LoginScreen checkVersion(String version) {
        shouldHave(versionTextView,version,35);
        getCurrentVersion();
        return new LoginScreen(driver);
    }
}
