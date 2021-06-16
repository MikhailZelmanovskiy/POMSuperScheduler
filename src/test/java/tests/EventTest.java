package tests;

import config.ConfigBase;
import dto.Credentials;
import dto.Event;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenobjects.SplashScreen;

public class EventTest extends ConfigBase{

    @Test
    public void eventCreationTest(){
        boolean isLogged =
                new SplashScreen(driver)
                        .checkVersion("0.0.3")
                        .complitLogin(Credentials.builder().email("strayn.mike@gmail.com").password("Qwerty!23").build())
                        .skipWizard()
                        .initCreateNew()
                        .fillCreationForm(Event.builder().title("Plus").type("Minus").breaks(3).ammount(25).build())
                        .confirmCreation()
                        .isFabAddPresent();

        Assert.assertTrue(isLogged);
    }
}