package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import supports.BaseClass;

public class PhotoStreamsLocators extends BaseClass {

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

     @FindBy(id = "com.kwiltapp.companion.debug:id/ms_add")
    public WebElement btn_AddSource;

     @FindBy(id = "com.kwiltapp.companion.debug:id/ms_switch")
    public WebElement rad_Switch;
}
