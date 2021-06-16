package tests;

import config.ConfigBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import screenobjects.SplashScreen;

public class VersionTest extends ConfigBase {
    @Test
    public void versionTest(){
        String version = new SplashScreen(driver).getCurrentVersion();
        Assert.assertEquals(version, "0.0.3");
    }
}
