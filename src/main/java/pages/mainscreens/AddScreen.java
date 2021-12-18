package pages.mainscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class AddScreen extends AbstractScreen {

    public AddScreen(AppiumDriver driver) {
        super(driver);
    }

    //Main page elements
    @iOSXCUITFindBy(accessibility = "seacrh")
    private WebElement SEARCH_LOGO;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Share something you love\"`]")
    private WebElement SHARE_SOMETHING_YOU_LOVE_BUTTON;

    @iOSXCUITFindBy(accessibility = "or")
    private WebElement OR_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Ask friends for a recommendation.\"`]")
    private WebElement ASK_FOR_RECOMMENDATION_BUTTON;


    //Methods
    public boolean isSearchLogoDisplayed() {
        return appiumUtils.isVisable(SEARCH_LOGO);
    }

    public AbstractScreen tapShareSomethingYouLoveButton() {
        appiumUtils.click(SHARE_SOMETHING_YOU_LOVE_BUTTON);
        return this;
    }

    public boolean isOrTextDisplayed() {
        return appiumUtils.isVisable(OR_TEXT);
    }

    public AbstractScreen tapAskForRecommendationButton() {
        appiumUtils.click(ASK_FOR_RECOMMENDATION_BUTTON);
        return this;
    }


}
