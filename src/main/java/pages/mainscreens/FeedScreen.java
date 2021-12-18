package pages.mainscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class FeedScreen extends AbstractScreen {


    public FeedScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"logo_navbar\"`]")
    private WebElement MAIN_SCREEN_LOGO;

    @iOSXCUITFindBy(accessibility = "Feed")
    private WebElement FEED;

    @iOSXCUITFindBy(accessibility = "Activity")
    private WebElement ACTIVITY;

    @iOSXCUITFindBy(accessibility = "Add")
    private WebElement ADD;

    @iOSXCUITFindBy(accessibility = "Clips")
    private WebElement CLIPS;

    @iOSXCUITFindBy(accessibility = "Profile")
    private WebElement PROFILE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    private WebElement PICK1;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    private WebElement PICK1_USERNAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"clips icon\"`][1]")
    private WebElement PICK1_CLIP_ICON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"share logo icon\"`][1]")
    private WebElement PICK1_SHARE_ICON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    private WebElement PICK1_TITLE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    private WebElement PICK1_DESCRIPTION;

    @iOSXCUITFindBy(iOSClassChain = "The Only Beauty Tips You'll Ever Need")
    private WebElement BEAUTY_PICK_TITLE;

    @iOSXCUITFindBy(accessibility = "From basic beauty dos to don'ts.")
    private WebElement BEAUTY_PICK_DESCRIPTION;

    //Methods
    public boolean isLogoDisplayed() {
        return appiumUtils.isVisable(MAIN_SCREEN_LOGO);
    }

    public FeedScreen navigateToFeed() {
        appiumUtils.click(FEED);
        return this;
    }

    public FeedScreen navigateToActivity() {
        appiumUtils.click(ACTIVITY);
        return this;
    }

    public FeedScreen navigateToAddPick() {
        appiumUtils.click(ADD);
        return this;
    }

    public FeedScreen navigateToClips() {
        appiumUtils.click(CLIPS);
        return this;
    }

    public FeedScreen navigateToProfile() {
        appiumUtils.click(PROFILE);
        return this;
    }

    public FeedScreen tapPick1(){
        appiumUtils.click(PICK1);
        return this;
    }
    public String getPick1Username(){
        return appiumUtils.getText(PICK1_USERNAME);
    }

    public String getPick1Title(){
        return appiumUtils.getText(PICK1_TITLE);
    }

    public String getPick1Description(){
        return appiumUtils.getText(PICK1_DESCRIPTION);
    }

    public FeedScreen tapPick1ClipIcon(){
        appiumUtils.click(PICK1_CLIP_ICON);
        return this;
    }

    public FeedScreen tapPick1ShareIcon(){
        appiumUtils.click(PICK1_SHARE_ICON);
        return this;
    }

    public String getBeautyPickTitle(){
       return appiumUtils.getText(BEAUTY_PICK_TITLE);
    }

    public String getBeautyPickDescription(){
       return appiumUtils.getText(BEAUTY_PICK_DESCRIPTION);
    }
}