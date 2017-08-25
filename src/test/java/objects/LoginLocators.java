package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import supports.BaseClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginLocators extends BaseClass{

    /**
     * txt --> text box
     * rad --> radio button
     * btn --> button
     * lbl --> label
     * lnk --> link
     * lst --> list
     * chk --> checkbox
     * tab --> tab
     */

    @FindBy(id = "com.kwiltapp.companion.debug:id/facebook_login_btn")
    public WebElement btn_LoginWithFaceBook;

    @FindBy(id = "com.kwiltapp.companion.debug:id/google_login_btn")
    public WebElement btn_LoginWithGoogle;

    @FindBy(id = "com.kwiltapp.companion.debug:id/miscrosoft_login_ntn")
    public WebElement btn_LoginWithMicrosoft;

    @FindBy(id = "com.kwiltapp.companion.debug:id/kik_login_btn")
    public WebElement btn_LoginWithKik;

    @FindBy(id = "com.kwiltapp.companion.debug:id/your_email_login")
    public WebElement btn_UseYourEmail;

    @FindBy(id = "com.kwiltapp.companion.debug:id/sign_up_tab")
    public WebElement tab_SignUp;

    @FindBy(id = "com.kwiltapp.companion.debug:id/email_login_edt")
    public WebElement txt_Email;

    @FindBy(id = "com.kwiltapp.companion.debug:id/password_login_edt")
    public WebElement txt_Password;

    @FindBy(id = "com.kwiltapp.companion.debug:id/btn_email_login")
    public WebElement btn_Login;

    @FindBy(id = "com.kwiltapp.companion.debug:id/forgot_your_password")
    public WebElement lbl_ForgotYourPassword;

    @FindBy(id = "com.kwiltapp.companion.debug:id/btn_back_login")
    public WebElement btn_BackToLoginOptions;

    @FindBy(id = "com.kwiltapp.companion.debug:id/skip_login_btn")
    public WebElement lbl_SkipForNow;

    public void logIn(String sEmail, String sPassword) throws InterruptedException {

//        Type email
        txt_Email.sendKeys(sEmail);

//        Type password
        txt_Password.sendKeys(sPassword);

//        Tap login
        btn_Login.click();

//        Wait for loading
        androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitForLoading();
    }

    public  void waitForLoading() throws InterruptedException {

//        Get size of text view list
        List<WebElement> lTextView = androidDriver.findElements(By.className("android.widget.TextView"));
        int iTextViewCount = lTextView.size();
        int i = 0;

//        Wait for size of list
        while (iTextViewCount != 9 & i <= 60){
            Thread.sleep(1000);
            lTextView = androidDriver.findElements(By.className("android.widget.TextView"));
            iTextViewCount = lTextView.size();
            i++;
        }
    }
}
