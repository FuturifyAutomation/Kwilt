package supports;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import objects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public abstract class BaseClass {

    public WebDriver webDriver;
    public AndroidDriver androidDriver;

    public HomeLocators HomeScreen;
    public LoginLocators LoginScreen;
    public SignUpLocators SignUpScreen;
    public TutorialLocators TutorialScreen;

    public org.testng.asserts.SoftAssert SoftAssert = new SoftAssert();

    public String time = new SimpleDateFormat("MMddHHmmss").format(Calendar.getInstance().getTime());
    public String email = time + "@gmail.com";

    @BeforeTest
    @Parameters({"platformVersion", "deviceName", "uRL", "appPackage", "appActivity"})
    public void setUp(String platformVersion, String deviceName, String uRL, String appPackage, String appActivity) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

//        Device information
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);

//        App Info
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
    }

    @AfterTest
    public void tearDown(){
        androidDriver.closeApp();
        androidDriver.quit();
    }
}
