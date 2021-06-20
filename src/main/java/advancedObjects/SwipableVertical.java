package advancedObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwipableVertical extends BaseScreenADV{
    public SwipableVertical(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/container']")
    List<MobileElement> list;


    public SwipableVertical swipeUpToDown(){
        MobileElement el = list.get(1);

        Rectangle rect = el.getRect();
        int yFrom = rect.getY()+20;
        int x = rect.getX()+rect.getWidth()/2;
        int yTo = rect.getY()+rect.getHeight()-20;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(x,yFrom))
                .moveTo(PointOption.point(x,yTo))
                .release().perform();
        return this;
    }
    public SwipableVertical swipeDpuwnToUp() {
        MobileElement el = list.get(3);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Rectangle rect = el.getRect();
        int yFrom = rect.getY()+rect.getHeight()-20;
        int x = rect.getX()+rect.getWidth()/2;
        int yTo = rect.getY()+20;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(x,yFrom))
                .moveTo(PointOption.point(x,yTo))
                .release().perform();
        return this;
    }

}