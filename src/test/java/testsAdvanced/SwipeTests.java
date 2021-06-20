package testsAdvanced;

import advancedObjects.DragScreen;
import config.ConfigAdvancedPages;
import org.testng.annotations.Test;

public class SwipeTests extends ConfigAdvancedPages {
    @Test
    public void gorizontSwipeTest(){
        new DragScreen(driver)
                .goToSwipe()
                .goToSwipeBasic()
                .swipeLeftToRight()
                .swipeRightToLeft();
    }

    @Test
    public void verticalSwipeTest(){
        new DragScreen(driver)
                .goToSwipe()
                .goToSwipeBasic()
                .swipeUpToDown()
                .swipeDpuwnToUp();
    }
}
