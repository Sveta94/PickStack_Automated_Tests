package pages.enterappscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class TutorialScreen extends AbstractScreen {

    public TutorialScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name == \"checkmark_large\"`]")
    private WebElement CHECKMARK;

    @iOSXCUITFindBy(accessibility = "Great! Your profile has been created.")
    private WebElement PROFILE_CREATED_TEXT;

    @iOSXCUITFindBy(accessibility = "Follow our tutorial to learn what you can do! You can access the tutorial at any time in settings.")
    private WebElement FOLLOW_TUTORIAL_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Start Tutorial\"`]")
    private WebElement START_TUTORIAL_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Skip\"`]")
    private WebElement SKIP_BUTTON;

    @iOSXCUITFindBy(accessibility = "tutorial_1")
    private WebElement TUTORIAL_PAGE1;

    @iOSXCUITFindBy(accessibility = "arrow left")
    private WebElement BACK_BUTTON;

    @iOSXCUITFindBy(accessibility = "What is Pickstack")
    private WebElement PAGE1_HEADER;

    @iOSXCUITFindBy(accessibility = "Pickstack is a tool for storing and sharing what you truly love. There are no paid endorsements. No likes.")
    private WebElement PAGE1_TEXT;

    @iOSXCUITFindBy(accessibility = "1 of 6")
    private WebElement PAGE1_OF6;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Skip Tutorial\"`]")
    private WebElement SKIP_TUTORIAL_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Continue\"`]")
    private WebElement CONTINUE_BUTTON;

    @iOSXCUITFindBy(accessibility = "tutorial_2")
    private WebElement TUTORIAL_PAGE2;

    @iOSXCUITFindBy(accessibility = "Posting your favorite picks")
    private WebElement PAGE2_HEADER;

    @iOSXCUITFindBy(accessibility = "Post new picks directly from your browser by pressing the share icon or from inside the app by pressing the “Add” button.")
    private WebElement PAGE2_TEXT;

    @iOSXCUITFindBy(accessibility = "2 of 6")
    private WebElement PAGE2_OF6;

    @iOSXCUITFindBy(accessibility = "tutorial_5")
    private WebElement TUTORIAL_PAGE3;

    @iOSXCUITFindBy(accessibility = "Stacks")
    private WebElement PAGE3_HEADER;

    @iOSXCUITFindBy(accessibility = "Stack your favorite picks into a collection you share.")
    private WebElement PAGE3_TEXT;

    @iOSXCUITFindBy(accessibility = "3 of 6")
    private WebElement PAGE3_OF6;

    @iOSXCUITFindBy(accessibility = "tutorial_3")
    private WebElement TUTORIAL_PAGE4;

    @iOSXCUITFindBy(accessibility = "Sharing")
    private WebElement PAGE4_HEADER;

    @iOSXCUITFindBy(accessibility = "You can share picks and stacks with your friends by tapping this button.")
    private WebElement PAGE4_TEXT;

    @iOSXCUITFindBy(accessibility = "4 of 6")
    private WebElement PAGE4_OF6;

    @iOSXCUITFindBy(accessibility = "tutorial_4")
    private WebElement TUTORIAL_PAGE5;

    @iOSXCUITFindBy(accessibility = "Clips")
    private WebElement PAGE5_HEADER;

    @iOSXCUITFindBy(accessibility = "Press the paperclip when you want to save a pick or stack to your private stash.")
    private WebElement PAGE5_TEXT;

    @iOSXCUITFindBy(accessibility = "5 of 6")
    private WebElement PAGE5_OF6;

    @iOSXCUITFindBy(accessibility = "tutorial_6")
    private WebElement TUTORIAL_PAGE6;

    @iOSXCUITFindBy(accessibility = "Other Actions")
    private WebElement PAGE6_HEADER;

    @iOSXCUITFindBy(accessibility = "Click directly on pictures to access their options.")
    private WebElement PAGE6_TEXT;

    @iOSXCUITFindBy(accessibility = "6 of 6")
    private WebElement PAGE6_OF6;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Finish\"`]")
    private WebElement FINISH_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"“Pickstack” Would Like to Send You Notifications\"`]")
    private WebElement SEND_NOTIFICATIONS_TEXT;

    @iOSXCUITFindBy(accessibility = "Allow")
    private WebElement ALLOW_BUTTON;

    @iOSXCUITFindBy(accessibility = "Don’t Allow")
    private WebElement DONT_ALLOW_BUTTON;

    //Methods

    public boolean isCheckmarkDisplayed() {
        return appiumUtils.isVisable(CHECKMARK);
    }

    public String getProfileCreatedText() {
        return appiumUtils.getText(PROFILE_CREATED_TEXT);
    }

    public String getFollowTutorialText() {
        return appiumUtils.getText(FOLLOW_TUTORIAL_TEXT);

    }

    public TutorialScreen tapStartTutorialButton() {
        appiumUtils.click(START_TUTORIAL_BUTTON);
        return this;
    }

    public TutorialScreen tapSkipButton() {
        appiumUtils.click(SKIP_BUTTON);
        return this;
    }

    public boolean isPage1PhotoDisplayed() {
        return appiumUtils.isVisable(TUTORIAL_PAGE1);
    }

    public boolean isPage2PhotoDisplayed() {
        return appiumUtils.isVisable(TUTORIAL_PAGE2);
    }

    public boolean isPage3PhotoDisplayed() {
        return appiumUtils.isVisable(TUTORIAL_PAGE3);
    }

    public boolean isPage4PhotoDisplayed() {
        return appiumUtils.isVisable(TUTORIAL_PAGE4);
    }

    public boolean isPage5PhotoDisplayed() {
        return appiumUtils.isVisable(TUTORIAL_PAGE5);
    }

    public boolean isPage6PhotoDisplayed() {
        return appiumUtils.isVisable(TUTORIAL_PAGE6);
    }

    public String getPage1Header() {
        return appiumUtils.getText(PAGE1_HEADER);
    }

    public String getPage2Header() {
        return appiumUtils.getText(PAGE2_HEADER);
    }

    public String getPage3Header() {
        return appiumUtils.getText(PAGE3_HEADER);
    }

    public String getPage4Header() {
        return appiumUtils.getText(PAGE4_HEADER);
    }

    public String getPage5Header() {
        return appiumUtils.getText(PAGE5_HEADER);
    }

    public String getPage6Header() {
        return appiumUtils.getText(PAGE6_HEADER);
    }

    public String getPage1Text() {
        return appiumUtils.getText(PAGE1_TEXT);
    }

    public String getPage2Text() {
        return appiumUtils.getText(PAGE2_TEXT);
    }

    public String getPage3Text() {
        return appiumUtils.getText(PAGE3_TEXT);
    }

    public String getPage4Text() {
        return appiumUtils.getText(PAGE4_TEXT);
    }

    public String getPage5Text() {
        return appiumUtils.getText(PAGE5_TEXT);
    }

    public String getPage6Text() {
        return appiumUtils.getText(PAGE6_TEXT);
    }

    public String getPage1Counter() {
        return appiumUtils.getText(PAGE1_OF6);
    }

    public String getPage2Counter() {
        return appiumUtils.getText(PAGE2_OF6);
    }

    public String getPage3Counter() {
        return appiumUtils.getText(PAGE3_OF6);
    }

    public String getPage4Counter() {
        return appiumUtils.getText(PAGE4_OF6);
    }

    public String getPage5Counter() {
        return appiumUtils.getText(PAGE5_OF6);
    }

    public String getPage6Counter() {
        return appiumUtils.getText(PAGE6_OF6);
    }

    public TutorialScreen tapBackButton(){
        appiumUtils.click(BACK_BUTTON);
        return this;
    }

    public TutorialScreen tapFinishButton(){
        appiumUtils.click(FINISH_BUTTON);
        return this;
    }

    public TutorialScreen tapContinueButton(){
        appiumUtils.click(CONTINUE_BUTTON);
        return this;
    }

    public String getSendNotificationText(){
        return appiumUtils.getText(SEND_NOTIFICATIONS_TEXT);
    }

    public TutorialScreen tapAllowButton(){
        appiumUtils.click(ALLOW_BUTTON);
        return this;
    }
    public TutorialScreen tapDontAllowButton(){
        appiumUtils.click(DONT_ALLOW_BUTTON);
        return this;
    }


}



