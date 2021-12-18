package pages.mainscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class ActivityScreen extends AbstractScreen {

    public ActivityScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeNavigationBar[`name == \"Activity\"`]")
    private WebElement ACTIVITY_TEXT;

    @iOSXCUITFindBy(accessibility = "Search Activity")
    private WebElement SEARCH_ACTIVITY_FIELD;

    @iOSXCUITFindBy(accessibility = "Clear text")
    private WebElement CLEAR_TEXT_BUTTON;

    @iOSXCUITFindBy (accessibility = "Activity")
    private WebElement ACTIVITY_TAB;

    @iOSXCUITFindBy(accessibility = "Inbox")
    private WebElement INBOX_TAB;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    private WebElement FIRST_CELL;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[3]")
    private WebElement USER_PROFILE_LINK;

    //Methods

    public String getActivityText() {
        return appiumUtils.getText(ACTIVITY_TEXT);
    }

    public ActivityScreen setSearchText(String searchText) {
         appiumUtils.sendText(SEARCH_ACTIVITY_FIELD, searchText);
         return this;
    }

    public ActivityScreen tapClearTextButton(){
        try {
            appiumUtils.click(CLEAR_TEXT_BUTTON);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return this;
    }

    public ActivityScreen tapActivityTab(){
        appiumUtils.click(ACTIVITY_TAB);
        return this;
    }

    public ActivityScreen tapInboxTab(){
        appiumUtils.click(INBOX_TAB);
        return this;
    }

    public ActivityScreen tapFirstItem(){
        appiumUtils.click(FIRST_CELL);
        return this;
    }

    public boolean isFirstItemDisplayed(){
        return appiumUtils.isVisable(FIRST_CELL);
    }

    public ActivityScreen tapUserProfileLink(){
        appiumUtils.click(USER_PROFILE_LINK);
        return this;
    }


}
