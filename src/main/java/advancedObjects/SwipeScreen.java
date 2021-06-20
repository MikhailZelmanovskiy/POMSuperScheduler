package advancedObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SwipeScreen extends BaseScreenADV{
    public SwipeScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/button'][2]")
    MobileElement swipeBasic;

    @FindBy(how = How.XPATH, using = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/button'][5]")
    MobileElement swipeVertical;

    public SwipableBasic goToSwipeBasic(){
        swipeBasic.click();
        return new SwipableBasic(driver);
    }
    public SwipableVertical goToSwipeVertical(){
        swipeVertical.click();
        return new SwipableVertical(driver);
    }
}
