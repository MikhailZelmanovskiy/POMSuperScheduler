package advancedObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwipableBasic extends BaseScreenADV{
    public SwipableBasic(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(id = "com.h6ah4i.android.example.advrecyclerview:id/container")
    List<MobileElement> list;

    public SwipableBasic swipeLeftToRight(){
        MobileElement el = list.get(0);

        Rectangle rect = el.getRect();
        int xFrom = rect.getX()+20;
        int y = rect.getY()+rect.getHeight()/2;
        int xTo = rect.getX()+rect.getWidth()-20;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,y))
                .moveTo(PointOption.point(xTo,y))
                .release().perform();
        return this;
    }
    
    public SwipableBasic swipeRightToLeft(){
        MobileElement el = list.get(3);

        Rectangle rect = el.getRect();
        int xFrom = rect.getX()+rect.getWidth()-20;
        int y = rect.getY()+rect.getHeight()/2;
        int xTo = rect.getX()+20;

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom,y))
                .moveTo(PointOption.point(xTo,y))
                .release().perform();
        return this;
    }

    public SwipableBasic swipeUpToDown(){

    return this;
    }
    public SwipableBasic swipeDpuwnToUp(){

        return this;
    }

}
