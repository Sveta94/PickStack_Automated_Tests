package pages.pickandstackscreens.pickscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class AddPickToStackScreen extends AbstractScreen {
    public AddPickToStackScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Add to\"`]")
    private WebElement ADD_TO_TEXT;

    @iOSXCUITFindBy(accessibility = "close icon")
    private WebElement CLOSE_STACKS_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther")
    private WebElement FIRST_EXISTING_STACK;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"+ New stack\"`]")
    private WebElement NEW_STACK_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"New Stack\"`]")
    private WebElement NEW_STACK_TEXT;

    @iOSXCUITFindBy(accessibility = "close icon")
    private WebElement CLOSE_NEW_STACK_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextView[`value == \"Add Title\"`]")
    private WebElement STACK_TITLE_FIELD;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextView[`value == \"Description\"`]")
    private WebElement STACK_DESCRIPTION_FIELD;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]")
    private WebElement STACK_INTENTIONS;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]")
    private WebElement HIDE_STACK_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Create Stack\"`]")
    private WebElement CREATE_STACK_BUTTON;


    //Methods

    public boolean isAddToStackTextDisplayed() {
        return appiumUtils.isVisable(ADD_TO_TEXT);
    }

    public AddPickToStackScreen tapCloseStackButton() {
        appiumUtils.click(CLOSE_STACKS_BUTTON);
        return this;
    }

    public AddPickToStackScreen tapFirstStack() {
        appiumUtils.click(FIRST_EXISTING_STACK);
        return this;
    }

    public AddPickToStackScreen tapNewStackButton() {
        appiumUtils.click(NEW_STACK_BUTTON);
        return this;
    }

    public boolean isNewStackTextDisplayed() {
        return appiumUtils.isVisable(NEW_STACK_TEXT);
    }

    public AddPickToStackScreen tapCloseNewStackButton() {
        appiumUtils.click(CLOSE_NEW_STACK_BUTTON);
        return this;
    }


    public AddPickToStackScreen setStackDescription(String description) {
        appiumUtils.sendText(STACK_DESCRIPTION_FIELD, description);
        return this;
    }

    public AddPickToStackScreen tapStackIntentions() {
        appiumUtils.click(STACK_INTENTIONS);
        return this;
    }

    public AddPickToStackScreen tapHideStackButton() {
        appiumUtils.click(HIDE_STACK_BUTTON);
        return this;
    }

    public AddPickToStackScreen tapCreateStackButton() {
        appiumUtils.click(CREATE_STACK_BUTTON);
        return this;
    }



}
