package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import supports.BaseClass;

public class TutorialLocators extends BaseClass{

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

    @FindBy(id = "com.android.packageinstaller:id/permission_message")
    public WebElement lbl_Message;

    @FindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public WebElement btn_Allow;

    @FindBy(id = "com.android.packageinstaller:id/permission_deny_button")
    public WebElement btn_Deny;

    @FindBy(id = "com.kwiltapp.companion.debug:id/closeImage")
    public WebElement btn_Close;

    @FindBy(id = "com.kwiltapp.companion.debug:id/tutorial_button")
    public WebElement btn_NextTutorial;
}
