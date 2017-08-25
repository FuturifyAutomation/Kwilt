package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import supports.BaseClass;

public class SignUpLocators extends BaseClass{

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

    @FindBy(id = "com.kwiltapp.companion.debug:id/facebook_signup_btn")
    public WebElement btn_SignUpWithFaceBook;

    @FindBy(id = "com.kwiltapp.companion.debug:id/google_signup_btn")
    public WebElement btn_SignUpWithGoogle;

    @FindBy(id = "com.kwiltapp.companion.debug:id/miscrosoft_sigin_ntn")
    public WebElement btn_SignUpWithMicrosoft;

    @FindBy(id = "com.kwiltapp.companion.debug:id/kik_signup_btn")
    public WebElement btn_SignUpWithKik;

    @FindBy(id = "com.kwiltapp.companion.debug:id/create_account")
    public WebElement btn_CreateKwiltAccount;

    @FindBy(id = "com.kwiltapp.companion.debug:id/login_tab")
    public WebElement tab_Login;

    @FindBy(id = "com.kwiltapp.companion.debug:id/email_edt")
    public WebElement txt_Email;

    @FindBy(id = "com.kwiltapp.companion.debug:id/password_edt")
    public WebElement txt_Password;

    @FindBy(id = "com.kwiltapp.companion.debug:id/pass_confirm_edt")
    public WebElement txt_ConfirmPassword;

    @FindBy(id = "com.kwiltapp.companion.debug:id/btn_sign_up")
    public WebElement btn_SignUp;

    @FindBy(id = "com.kwiltapp.companion.debug:id/btn_sign_up")
    public WebElement btn_BackToSignUpOptions;

    @FindBy(id = "com.kwiltapp.companion.debug:id/skip_sign_btn")
    public WebElement lbl_SkipForNow;

    @FindBy(id = "com.kwiltapp.companion.debug:id/txt_password_requires")
    public WebElement lbl_PasswordValidationMessage;

    @FindBy(id = "com.kwiltapp.companion.debug:id/txt_password_not_match")
    public WebElement lbl_PasswordsMatchingMessage;

    @FindBy(id = "com.kwiltapp.companion.debug:id/snackbar_text")
    public WebElement lbl_AccountExistingMessage;
}
