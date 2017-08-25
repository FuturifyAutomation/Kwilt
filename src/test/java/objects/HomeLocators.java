package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import supports.BaseClass;

public class HomeLocators extends BaseClass{
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

    @FindBy(id = "com.kwiltapp.companion.debug:id/action_drawer")
    public WebElement btn_Menu;

    @FindBy(xpath = ".//android.widget.TextView[@text='Photo Streams' and contains(@resource-id,'item_title_text')]")
    public WebElement btn_PhotoStream;

    @FindBy(xpath = ".//android.widget.TextView[@text='Preferences' and contains(@resource-id,'item_title_text')]")
    public WebElement btn_Preferences;

    @FindBy(xpath = ".//android.widget.TextView[@text='Account' and contains(@resource-id,'item_title_text')]")
    public WebElement btn_Account;

    @FindBy(xpath = ".//android.widget.TextView[@text='Share the love' and contains(@resource-id,'item_title_text')]")
    public WebElement btn_ShareTheLove;

    @FindBy(xpath = ".//android.widget.TextView[@text='Rate this App' and contains(@resource-id,'item_title_text')]")
    public WebElement btn_RateThisApp;

    @FindBy(xpath = ".//android.widget.TextView[@text='Help' and contains(@resource-id,'item_title_text')]")
    public WebElement btn_Help;

    @FindBy(xpath = ".//android.widget.TextView[@text='Log in' and contains(@resource-id,'item_title_text')]")
    public WebElement btn_LogIn;

    @FindBy(id = "com.kwiltapp.companion.debug:id/txt_title")
    public WebElement lbl_Title;

    @FindBy(xpath = ".//android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.app.ActionBar$Tab[1]/android.widget.ImageView[1]")
    public WebElement tab_Mosaic;

    @FindBy(xpath = ".//android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.app.ActionBar$Tab[2]/android.widget.ImageView[1]")
    public WebElement tab_Timlline;

    @FindBy(xpath = ".//android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.app.ActionBar$Tab[3]/android.widget.ImageView[1]")
    public WebElement tab_Location;

    @FindBy(xpath = ".//android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.app.ActionBar$Tab[4]/android.widget.ImageView[1]")
    public WebElement tab_PhotoStream;

    @FindBy(xpath = ".//android.widget.HorizontalScrollView[1]/android.widget.LinearLayout[1]/android.support.v7.app.ActionBar$Tab[5]/android.widget.ImageView[1]")
    public WebElement tab_Search;

    public void tapSlideBarItem(String item) throws InterruptedException {
        btn_Menu.click();
        Thread.sleep(1000);
        switch (item.toLowerCase()){
            case "photo streams":
                btn_PhotoStream.click();
                break;
            case "preferences":
                btn_Preferences.click();
                break;
            case "account":
                btn_Account.click();
                break;
            case "share the love":
                btn_ShareTheLove.click();
                break;
            case "rate this App":
                btn_RateThisApp.click();
                break;
            case "help":
                btn_Help.click();
                break;
            case "log in":
                btn_LogIn.click();
                break;
            default: break;
        }
    }
}
