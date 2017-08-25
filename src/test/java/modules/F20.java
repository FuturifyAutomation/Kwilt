package modules;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import objects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class F20{

    private AndroidDriver androidDriver;

    private HomeLocators HomeScreen;
    private LoginLocators LoginScreen;
    private SignUpLocators SignUpScreen;
    private TutorialLocators TutorialScreen;
    private PhotoStreamsLocators PhotoStreamsScreen;

    private SoftAssert SoftAssert = new SoftAssert();

    @BeforeTest
    @Parameters({"platformVersion", "deviceName", "uRL", "appPackage", "appActivity"})
    public void setUp(String platformVersion, String deviceName, String uRL, String appPackage, String appActivity) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

//        Device information
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);

//        App info
        caps.setCapability("app", "./src/test/builds/Kwilt_v2.2(12)_010617.apk");
        caps.setCapability("appPackage",appPackage);
        caps.setCapability("appActivity",appActivity);
        caps.setCapability("resetKeyboard", true);
        caps.setCapability("unicodeKeyboard", true);

//        Server inform
        androidDriver = new AndroidDriver(new URL(uRL), caps);
        androidDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        HomeScreen = PageFactory.initElements(androidDriver, HomeLocators.class);
        LoginScreen = PageFactory.initElements(androidDriver, LoginLocators.class);
        SignUpScreen = PageFactory.initElements(androidDriver, SignUpLocators.class);
        TutorialScreen = PageFactory.initElements(androidDriver, TutorialLocators.class);
        PhotoStreamsScreen = PageFactory.initElements(androidDriver, PhotoStreamsLocators.class);
    }

    @Test
    public void test() throws InterruptedException {
        LoginScreen.btn_UseYourEmail.click();
        LoginScreen.lbl_SkipForNow.click();

        if(TutorialScreen.lbl_Message.isEnabled()){
            TutorialScreen.btn_Allow.click();
        }

        TutorialScreen.btn_Close.click();

        if(TutorialScreen.lbl_Message.isEnabled()){
            TutorialScreen.btn_Allow.click();
        }

        List<WebElement> thumbnailList = androidDriver.findElements(By.id("com.kwiltapp.companion.debug:id/thumbnail"));
        SoftAssert.assertEquals(12, thumbnailList.size());

        HomeScreen.tapSlideBarItem("Photo Streams");
        SoftAssert.assertEquals(PhotoStreamsScreen.rad_Switch.getAttribute("checked"), "true");
        SoftAssert.assertEquals(PhotoStreamsScreen.rad_Switch.getText(), "ON");
        androidDriver.pressKeyCode(AndroidKeyCode.BACK);
        HomeScreen.tapSlideBarItem("Preferences");
    }

    @AfterTest
    public void tearDown(){
        androidDriver.closeApp();
        androidDriver.quit();
    }
}
