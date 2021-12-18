package pages.intentionsscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class PickStackIntentionsScreen extends AbstractScreen {
    public PickStackIntentionsScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(accessibility = "gift")
    private WebElement INTENTIONS_ICON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeStaticText")
    private WebElement INTENTIONS;

    @iOSXCUITFindBy(accessibility = "Cancel")
    private WebElement INTENTIONS_CANCEL_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Intentions\"`]")
    private WebElement INTENTIONS_TEXT;

    @iOSXCUITFindBy(accessibility = "Done")
    private WebElement INTENTIONS_DONE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private WebElement SAVE_TIME_CHECKBOX;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private WebElement BUY_BETTER_PRODUCTS;



    //Methods

    public boolean isIntentionsIconDisplayed(){
        return appiumUtils.isVisable(INTENTIONS_ICON);
    }

    public PickStackIntentionsScreen tapIntentionsButton(){
        appiumUtils.click(INTENTIONS);
        return this;
    }


    public PickStackIntentionsScreen tapCancelIntentionsButton() {
        appiumUtils.click(INTENTIONS_CANCEL_BUTTON);
        return this;
    }

    public boolean isIntentionsTextDisplayed() {
        return appiumUtils.isVisable(INTENTIONS_TEXT);
    }

    public PickStackIntentionsScreen tapIntentionsDoneButton() {
        appiumUtils.click(INTENTIONS_DONE_BUTTON);
        return this;
    }

    public PickStackIntentionsScreen tapSaveTimeCheckbox() {
        appiumUtils.click(SAVE_TIME_CHECKBOX);
        return this;
    }

    public PickStackIntentionsScreen tapBuyBetterProductsCheckbox() {
        appiumUtils.click(BUY_BETTER_PRODUCTS);
        return this;
    }


}
