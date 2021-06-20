package testsAdvanced;

import advancedObjects.DragScreen;
import config.ConfigAdvancedPages;
import org.testng.annotations.Test;

public class DragTests extends ConfigAdvancedPages {
    @Test
    public void dragTest(){
        new DragScreen(driver)
                .goToDragableBasic()
                .dragDown()
                .dragDownCount(3);
    }
}
