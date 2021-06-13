package tests;

import config.ConfigBase;
import dto.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenobjects.SplashScreen;

public class LoginTest extends ConfigBase {

    @Test
    public void loginTest(){
       boolean isLogged =
               new SplashScreen(driver)
               .checkVersion("0.0.3")
               .fillEmail("strayn.mike@gmail.com")
               .fillPassword("Qwerty!23")
               .clicklogin()
               .skipWizard()
               .isFabAddPresent();

        Assert.assertTrue(isLogged);


    }


    @Test
    public void complitLoginTest() {
        boolean isLogged =
                new SplashScreen(driver)
                        .checkVersion("0.0.3")
                        .complitLogin(Credentials.builder().email("strayn.mike@gmail.com").password("Qwerty!23").build())
                        .skipWizard()
                        .isFabAddPresent();

        Assert.assertTrue(isLogged);
    }
}
