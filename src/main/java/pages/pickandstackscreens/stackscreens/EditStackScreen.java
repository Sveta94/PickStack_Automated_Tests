package pages.pickandstackscreens.stackscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class EditStackScreen extends AbstractScreen {
    public EditStackScreen(AppiumDriver driver) {
        super(driver);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Edit Stack\"`]")
    private WebElement EDIT_STACK_TEXT;

    @iOSXCUITFindBy(accessibility = "close icon")
    private WebElement CLOSE_BUTTON;

    @iOSXCUITFindBy(accessibility = "Save")
    private WebElement SAVE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextView")
    private WebElement TITLE;

    @iOSXCUITFindBy(accessibility = "25")
    private WebElement TITLE_COUNTER;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView")
    private WebElement DESCRIPTION;

    @iOSXCUITFindBy(accessibility = "112")
    private WebElement DESCRIPTION_COUNTER;

    @iOSXCUITFindBy(accessibility = "hide")
    private WebElement HIDE_ICON;

    @iOSXCUITFindBy(accessibility = "Hide Stack")
    private WebElement HIDE_STACK_TEXT;

    @iOSXCUITFindBy(accessibility = "circle_checked")
    private WebElement HIDDEN_STACK_CHECKBOX;

    @iOSXCUITFindBy(accessibility = "circle")
    private WebElement NON_HIDDEN_STACK_CHECKBOX;


    //Methods

    public String getEditStackText(){
        return appiumUtils.getText(EDIT_STACK_TEXT);
    }

    public EditStackScreen tapCloseStackButton(){
        appiumUtils.click(CLOSE_BUTTON);
        return this;
    }

    public EditStackScreen tapSaveButton(){
        appiumUtils.click(SAVE_BUTTON);
        return this;
    }

    public String getStackTitle(){
        return appiumUtils.getText(TITLE);
    }

    public String getStackTitleCounter(){
        return appiumUtils.getText(TITLE_COUNTER);
    }

    public String getStackDescription(){
        return appiumUtils.getText(DESCRIPTION);
    }

    public String getStackDescriptionCounter(){
        return appiumUtils.getText(DESCRIPTION_COUNTER);
    }

    public boolean isHideIconDisplayed(){
        return appiumUtils.isVisable(HIDE_ICON);
    }

    public EditStackScreen tapHideStackButton(){
        appiumUtils.click(HIDE_STACK_TEXT);
        return this;
    }

    public boolean isStackHidden(){
        return appiumUtils.isVisable(HIDDEN_STACK_CHECKBOX);
    }

    public boolean isStackNotHidden(){
        return appiumUtils.isVisable(NON_HIDDEN_STACK_CHECKBOX);
    }


}
