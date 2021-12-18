package pages.mainscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class ClipsScreen extends AbstractScreen {
    public ClipsScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(accessibility = "Search")
    private WebElement SEARCH_FIELD;

    @iOSXCUITFindBy(accessibility = "Clear text")
    private WebElement CLEAR_SEARCH_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Cancel\"`]")
    private WebElement CANCEL_SEARCH_BUTTON;

    @iOSXCUITFindBy(accessibility = "Picks")
    private WebElement PICKS_BUTTON;

    @iOSXCUITFindBy(accessibility = "Stacks")
    private WebElement STACKS_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
    private WebElement NO_SEARCH_RESULT_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Search web\"`]")
    private WebElement SEARCH_THE_WEB_BUTTON;


    //Methods

    public ClipsScreen setClipSearchText(String clipSearch) {
        appiumUtils.sendText(SEARCH_FIELD, clipSearch);
        return this;
    }

    public ClipsScreen tapClearSearchButton() {
        appiumUtils.click(CLEAR_SEARCH_BUTTON);
        return this;
    }

    public ClipsScreen tapCancelSearchButton() {
        appiumUtils.click(CANCEL_SEARCH_BUTTON);
        return this;
    }

    public ClipsScreen tapPicksTab() {
        appiumUtils.click(PICKS_BUTTON);
        return this;
    }

    public ClipsScreen tapStacksTab() {
        appiumUtils.click(STACKS_BUTTON);
        return this;
    }

    public boolean isNoSearchResultTextDisplayed() {
        return appiumUtils.isVisable(NO_SEARCH_RESULT_TEXT);
    }

    public ClipsScreen tapSearchTheWebButton() {
        appiumUtils.click(SEARCH_THE_WEB_BUTTON);
        return this;
    }


}