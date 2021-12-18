package pages.pickandstackscreens.pickscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class PickWebSearchScreen extends AbstractScreen {
    public PickWebSearchScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Close\"`]")
    private WebElement CLOSE_WEB_SEARCH_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSearchField")
    private WebElement SEARCH_FIELD;

    @iOSXCUITFindBy(accessibility = "Clear text")
    private WebElement CLEAR_TEXT_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"arrow_hint\"`]")
    private WebElement ARROW_HINT;

    @iOSXCUITFindBy(accessibility = "Type something you love here.")
    private WebElement HINT_HEADER;

    @iOSXCUITFindBy(accessibility = "Reminder: you can also add a new pick directly from your web browser by pressing the share button.")
    private WebElement HINT_TEXT;

    @iOSXCUITFindBy(accessibility = "close icon")
    private WebElement CLOSE_HINT_BUTTON;

    @iOSXCUITFindBy(accessibility = "back arrow")
    private WebElement BACK_ARROW;

    @iOSXCUITFindBy(accessibility = "forward arrow")
    private WebElement FORWARD_ARROW;

    @iOSXCUITFindBy(accessibility = "share")
    private WebElement SHARE_BUTTON;

    @iOSXCUITFindBy(accessibility = "Create pick")
    private WebElement CREATE_PICK_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Aceito\"`][2]")
    private WebElement GOOGLE_ACCEPT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"AGREE\"`]")
    private WebElement AGREE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Click create pick\"`]")
    private WebElement PICK_HINT_HEADER;

    @iOSXCUITFindBy(accessibility = "when you’re on the webpage you’d like to share.")
    private WebElement PICK_HINT_TEXT;

    @iOSXCUITFindBy(accessibility = "close icon")
    private WebElement CLOSE_HINT;



    //Methods

    public PickWebSearchScreen tapCloseWebSearchButton() {
        appiumUtils.click(CLOSE_WEB_SEARCH_BUTTON);
        return this;
    }

    public PickWebSearchScreen setSearchFieldText(String text) {
        appiumUtils.sendText(SEARCH_FIELD, text);
        return this;
    }

    public PickWebSearchScreen clearSearchText() {
        appiumUtils.click(CLEAR_TEXT_BUTTON);
        return this;
    }

    public boolean isArrowHintDisplayed() {
        return appiumUtils.isVisable(ARROW_HINT);
    }

    public boolean isHintHeaderDisplayed() {
        return appiumUtils.isVisable(HINT_HEADER);
    }

    public boolean isHintTextDisplayed() {
        return appiumUtils.isVisable(HINT_TEXT);
    }

    public PickWebSearchScreen tapCloseHintButton() {
        appiumUtils.click(CLOSE_HINT_BUTTON);
        return this;
    }

    public PickWebSearchScreen tapBackArrow() {
        appiumUtils.click(BACK_ARROW);
        return this;
    }

    public PickWebSearchScreen tapForwardArrow() {
        appiumUtils.click(FORWARD_ARROW);
        return this;
    }

    public PickWebSearchScreen tapShareButton() {
        appiumUtils.click(SHARE_BUTTON);
        return this;
    }

    public PickWebSearchScreen tapCreatePickButton() {
        appiumUtils.click(CREATE_PICK_BUTTON);
        return this;
    }

    public PickWebSearchScreen tapGoogleAcceptButton(){
        appiumUtils.click(GOOGLE_ACCEPT);
        return this;
    }
    
    public PickWebSearchScreen tapAgreeButton(){
        appiumUtils.click(AGREE_BUTTON);
        return this;
    }


}
