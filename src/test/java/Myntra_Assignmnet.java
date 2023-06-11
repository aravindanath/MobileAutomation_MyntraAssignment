import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobilePlatform.ANDROID;

public class Myntra_Assignmnet {


    AndroidDriver driver; //Global References

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,ANDROID);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13");
        caps.setCapability(MobileCapabilityType.UDID,"33161JEGR13615");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 6a");
        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,"true");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.myntra.android");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.myntra.android.SplashActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"),caps);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='search']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='search_toolbar_right_element_press_0']/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.myntra.android:id/ll_mode_gallery")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@resource-id='com.google.android.documentsui:id/icon_thumb'])[1]")).click();
       for (int i = 0; i <10;i++){
           BaseClass.verticalSwipeByPercentages(driver,0.6, 0.3, 0.5);
       }
    }

}
