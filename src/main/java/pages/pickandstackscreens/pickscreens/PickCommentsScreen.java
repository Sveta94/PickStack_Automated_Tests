package pages.pickandstackscreens.pickscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class PickCommentsScreen extends AbstractScreen {
    public PickCommentsScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(accessibility = "arrow left")
    private WebElement BACK_TO_PICK_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
    private WebElement USERNAME_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeStaticText[1]")
    private WebElement PICK_TITLE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeStaticText[2]")
    private WebElement PICK_DESCRIPTION;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
    private WebElement FIRST_USERNAME_AND_COMMENT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Reply\"`][1]")
    private WebElement REPLY1_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Delete\"`][1]")
    private WebElement DELETE1_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Reply\"`][2]")
    private WebElement REPLY2_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Delete\"`][2]")
    private WebElement DELETE2_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Reply\"`][3]")
    private WebElement REPLY3_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Delete\"`][3]")
    private WebElement DELETE3_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Reply\"`][4]")
    private WebElement REPLY4_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Delete\"`][4]")
    private WebElement DELETE4_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Hide Replies\"`][1]")
    private WebElement HIDE_REPLIES_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
    private WebElement REPLY1_USERNAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
    private WebElement REPLY1_TAG_AND_COMMENT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
    private WebElement REPLY2_USERNAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
    private WebElement REPLY2_TAG_AND_COMMENT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
    private WebElement ADD_COMMENT_PROFILE_PIC;

    @iOSXCUITFindBy(accessibility = "Add a comment...")
    private WebElement ADD_COMMENT_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"POST\"`]")
    private WebElement POST_COMMENT_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]")
    private WebElement SECOND_USERNAME_AND_COMMENT;

    //Methods

    public PickCommentsScreen tapBackToPickButton() {
        appiumUtils.click(BACK_TO_PICK_BUTTON);
        return this;
    }

    public String getUsernameText() {
        return appiumUtils.getText(USERNAME_TEXT);
    }

    public String getPickTitle() {
        return appiumUtils.getText(PICK_TITLE);
    }

    public String getPickDescription() {
        return appiumUtils.getText(PICK_DESCRIPTION);
    }

    public String getFirstUsernameAndComment() {
        return appiumUtils.getText(FIRST_USERNAME_AND_COMMENT);
    }

    public String getSecondUsernameAndComment() {
        return appiumUtils.getText(SECOND_USERNAME_AND_COMMENT);
    }

    public PickCommentsScreen tapReplyToCommentButton(int num) {

        if (num == 1) {
            appiumUtils.click(REPLY1_BUTTON);
        }
        if (num == 2) {
            appiumUtils.click(REPLY2_BUTTON);
        }
        if (num == 3) {
            appiumUtils.click(REPLY3_BUTTON);
        }
        if (num == 4) {
            appiumUtils.click(REPLY4_BUTTON);
        }

        return this;
    }

    public PickCommentsScreen tapDeleteCommentButton(int deleteNum) {

        if (deleteNum == 1) {
            appiumUtils.click(DELETE1_BUTTON);
        }
        if (deleteNum == 2) {
            appiumUtils.click(DELETE2_BUTTON);
        }

        if (deleteNum == 3) {
            appiumUtils.click(DELETE3_BUTTON);
        }
        if (deleteNum == 4) {
            appiumUtils.click(DELETE4_BUTTON);
        }
        return this;
    }

    public PickCommentsScreen tapHideRepliesButton() {
        appiumUtils.click(HIDE_REPLIES_BUTTON);
        return this;
    }

    public String getReply1Username() {
        return appiumUtils.getText(REPLY1_USERNAME);
    }

    public String getReply1TagAndComment() {
        return appiumUtils.getText(REPLY1_TAG_AND_COMMENT);
    }

    public String getReply2Username() {
        return appiumUtils.getText(REPLY2_USERNAME);
    }

    public String getReply2TagAndComment() {
        return appiumUtils.getText(REPLY2_TAG_AND_COMMENT);
    }

    public boolean isAddCommentProfilePicDisplayed() {
        return appiumUtils.isVisable(ADD_COMMENT_PROFILE_PIC);
    }

    public String getAddCommentText() {
        return appiumUtils.getText(ADD_COMMENT_TEXT);
    }

    public PickCommentsScreen setCommentText(String comment) {
        appiumUtils.sendText(ADD_COMMENT_TEXT, comment);
        return this;
    }

    public PickCommentsScreen tapPostCommentutton() {
        appiumUtils.click(POST_COMMENT_BUTTON);
        return this;
    }

}
