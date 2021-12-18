package pages.profilescreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class ProfileMainScreen extends AbstractScreen {
    public ProfileMainScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(accessibility = "people icon")
    private WebElement FOLLOWERS_BUTTON;

    @iOSXCUITFindBy(accessibility = "dots big")
    private WebElement OPTION_MENU_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pickstack\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
    private WebElement PROFILE_PHOTO;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
    private WebElement NAME_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
    private WebElement USERNAME_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
    private WebElement BIO_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Invite a friend\"`]")
    private WebElement INVITE_FRIEND_BUTTON;

    @iOSXCUITFindBy(accessibility = "Search profile")
    private WebElement SEARCH_PROFILE_FIELD;

    @iOSXCUITFindBy(accessibility = "Clear text")
    private WebElement CLEAR_TEXT_BUTTON;

    @iOSXCUITFindBy(accessibility = "Picks")
    private WebElement PICKS_TAB;

    @iOSXCUITFindBy(accessibility = "Stacks")
    private WebElement STACKS_TAB;

    @iOSXCUITFindBy(accessibility = "https://apps.apple.com/us/app/pickstack-share-what-you-love/id1539149145")
    private WebElement INVITE_LINK;

    @iOSXCUITFindBy(accessibility = "Close")
    private WebElement CLOSE_INVITE_FRIEND_BUTTON;

    //hint window
    @iOSXCUITFindBy(accessibility = "Tap Add")
    private WebElement TAP_ADD_HEADER;

    @iOSXCUITFindBy(accessibility = "to add something new")
    private WebElement TAP_ADD_TEXT;

    @iOSXCUITFindBy(accessibility = "close icon")
    private WebElement CLOSE_TAP_ADD_BUTTON;

    @iOSXCUITFindBy(accessibility = "user_avatar")
    private WebElement USER_AVATAR;


    //Methods

    public ProfileMainScreen tapFollowersButton() {
        appiumUtils.click(FOLLOWERS_BUTTON);
        return this;
    }

    public ProfileMainScreen tapOptionMenuButton() {
        appiumUtils.click(OPTION_MENU_BUTTON);
        return this;
    }

    public boolean isProfilePhotoEnabled() {
        return appiumUtils.isEnabled(PROFILE_PHOTO);
    }

    public String getName() {
        return appiumUtils.getText(NAME_TEXT);
    }

    public String getUsername() {
        return appiumUtils.getText(USERNAME_TEXT);
    }


    public String getBio() {
        return appiumUtils.getText(BIO_TEXT);
    }

    public ProfileMainScreen tapInviteFriendButton() {
        appiumUtils.click(INVITE_FRIEND_BUTTON);
        return this;
    }

    public ProfileMainScreen setSearchText(String searchText) {
        appiumUtils.sendText(SEARCH_PROFILE_FIELD, searchText);
        return this;
    }

    public ProfileMainScreen tapClearSearchText() {
        appiumUtils.click(CLEAR_TEXT_BUTTON);
        return this;
    }

    public ProfileMainScreen navigateToPicksTab() {
        appiumUtils.click(PICKS_TAB);
        return this;
    }

    public ProfileMainScreen navigateToStacksTab() {
        appiumUtils.click(STACKS_TAB);
        return this;
    }

    public String getTapAddHeader() {
        return appiumUtils.getText(TAP_ADD_HEADER);
    }

    public String getTapAddText() {
        return appiumUtils.getText(TAP_ADD_TEXT);
    }

    public ProfileMainScreen tapCloseTapAddWindow() {
        appiumUtils.click(CLOSE_TAP_ADD_BUTTON);
        return this;
    }

    public String getInviteLink() {
        return appiumUtils.getText(INVITE_LINK);
    }

    public ProfileMainScreen tapCloseInviteFriendButton() {
        appiumUtils.click(CLOSE_INVITE_FRIEND_BUTTON);
        return this;
    }

    public boolean isAvatarDisplayed(){
        return appiumUtils.isEnabled(USER_AVATAR);
    }

}
