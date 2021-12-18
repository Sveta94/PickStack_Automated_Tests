package pages.pickandstackscreens.stackscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class StacksOptionMenuScreen extends AbstractScreen {

    public StacksOptionMenuScreen(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(accessibility = "pencil_icon")
    private WebElement EDIT_BUTTON;

    @iOSXCUITFindBy(accessibility = "Edit details")
    private WebElement EDIT_DETAILS_TEXT;

    @iOSXCUITFindBy(accessibility = "arrow_icon")
    private WebElement SEND_TO_FRIEND_BUTTON;

    @iOSXCUITFindBy(accessibility = "Send to a friend")
    private WebElement SEND_TO_FRIEND_TEXT;

    @iOSXCUITFindBy(accessibility = "yellow_hide")
    private WebElement HIDE_STACK_BUTTON;

    @iOSXCUITFindBy(accessibility = "Hide stack")
    private WebElement HIDE_STACK_TEXT;

    @iOSXCUITFindBy(accessibility = "Show stack")
    private WebElement SHOW_STACK_TEXT;

    @iOSXCUITFindBy(accessibility = "trash_icon")
    private WebElement DELETE_BUTTON;

    @iOSXCUITFindBy(accessibility = "Delete stack")
    private WebElement DELETE_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Close\"`]")
    private WebElement CLOSE_BUTTON;


    //Methods

    public StacksOptionMenuScreen tapEditButton(){
        appiumUtils.click(EDIT_BUTTON);
        return this;
    }

    public String getEditDetailsText(){
        return appiumUtils.getText(EDIT_DETAILS_TEXT);

    }

    public StacksOptionMenuScreen tapSendToFriendButton(){
        appiumUtils.click(SEND_TO_FRIEND_BUTTON);
        return this;
    }

    public String getSendToFriendText(){
        return appiumUtils.getText(SEND_TO_FRIEND_TEXT);

    }

    public StacksOptionMenuScreen tapHideStackButton(){
        appiumUtils.click(HIDE_STACK_BUTTON);
        return this;
    }

    public String getHideStackText(){
        return appiumUtils.getText(HIDE_STACK_TEXT);

    }

    public String getShowStackText(){
        return appiumUtils.getText(SHOW_STACK_TEXT);

    }

    public StacksOptionMenuScreen tapDeleteStackButton(){
        appiumUtils.click(DELETE_BUTTON);
        return this;
    }

    public String getDeleteStackText(){
        return appiumUtils.getText(DELETE_TEXT);

    }

    public StacksOptionMenuScreen tapCloseButton(){
        appiumUtils.click(CLOSE_BUTTON);
        return this;
    }

}
