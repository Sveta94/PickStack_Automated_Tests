package pages.pickandstackscreens.pickscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class PicksScreen extends AbstractScreen {
    public PicksScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
    private WebElement PICK1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
    private WebElement PICK2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")
    private WebElement PICK3;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[4]")
    private WebElement PICK4;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[5]")
    private WebElement PICK5;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[6]")
    private WebElement PICK6;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeImage[1]")
    private WebElement PROFILE_PIC;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pickstack\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeButton[1]")
    private WebElement PROFILE_USERNAME;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pickstack\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeStaticText[1]")
    private WebElement PICK_TITLE;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Pickstack\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeStaticText[2]")
    private WebElement PICK_DESCRIPTION;


    @iOSXCUITFindBy(accessibility = "NOTES")
    private WebElement NOTES;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeTextView")
    private WebElement NOTES_TEXT;

    @iOSXCUITFindBy(accessibility = "file_icon")
    private WebElement ADD_TO_STACK_ICON;

    @iOSXCUITFindBy(accessibility = "Add to Stack")
    private WebElement ADD_TO_STACK_BUTTON;

    @iOSXCUITFindBy(accessibility = "comment_icon")
    private WebElement COMMENT_ICON;

    @iOSXCUITFindBy(accessibility = "comment_dot_icon")
    private WebElement COMMENT_DOT_ICON;

    @iOSXCUITFindBy(accessibility = "Comment")
    private WebElement COMMENT_BUTTON;

    @iOSXCUITFindBy(accessibility = "arrow_icon")
    private WebElement SEND_TO_FRIEND_ICON;

    @iOSXCUITFindBy(accessibility = "Send to a friend")
    private WebElement SEND_TO_FRIEND_BUTTON;

    @iOSXCUITFindBy(accessibility = "share_icon")
    private WebElement OPEN_WEBSITE_ICON;

    @iOSXCUITFindBy(accessibility = "Open website")
    private WebElement OPEN_WEBSITE_BUTTON;

    @iOSXCUITFindBy(accessibility = "pencil_icon")
    private WebElement EDIT_ICON;

    @iOSXCUITFindBy(accessibility = "Edit details")
    private WebElement EDIT_BUTTON;

    @iOSXCUITFindBy(accessibility = "file_dark_icon")
    private WebElement REMOVE_FROM_STACK_ICON;

    @iOSXCUITFindBy(accessibility = "Remove from Stack")
    private WebElement REMOVE_FROM_STACK_BUTTON;

    @iOSXCUITFindBy(accessibility = "trash_icon")
    private WebElement DELETE_ICON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Delete pick\"]")
   // @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText")
    private WebElement DELETE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Close\"`]")
    private  WebElement CLOSE_BUTTON;



    //Methods

    public PicksScreen tapPick(int pickNum) {

        if(pickNum==2) {
            appiumUtils.click(PICK2);
        }
        if(pickNum==3) {
            appiumUtils.click(PICK3);
        }
        if(pickNum==4) {
            appiumUtils.click(PICK4);
        }

        if(pickNum==5) {
            appiumUtils.click(PICK5);
        }

        if(pickNum==6) {
            appiumUtils.click(PICK6);
        }

        else {
            appiumUtils.click(PICK1);
        }
        return this;
    }

    public boolean isProfilePicDisplayed(){
        return appiumUtils.isVisable(PROFILE_PIC);
    }

    public String getProfileUsername(){
       return appiumUtils.getText(PROFILE_USERNAME);
    }

    public String getPickTitle(){
        return appiumUtils.getText(PICK_TITLE);
    }

    public String getPickDescription(){
        return appiumUtils.getText(PICK_DESCRIPTION);
    }

    public boolean isAddToStackIconDisplayed(){
        return appiumUtils.isVisable(ADD_TO_STACK_ICON);
    }

    public PicksScreen tapAddToStackButton(){
        appiumUtils.click(ADD_TO_STACK_BUTTON);
        return this;
    }

    public boolean isCommentIconDisplayed(){
        return appiumUtils.isVisable(COMMENT_ICON);
    }

    public boolean isCommentDOTIconDisplayed(){
        return appiumUtils.isVisable(COMMENT_DOT_ICON);
    }

    public PicksScreen tapCommentButton(){
        appiumUtils.click(COMMENT_BUTTON);
        return this;
    }

    public boolean isSendToFriendIconDisplayed(){
        return appiumUtils.isVisable(SEND_TO_FRIEND_ICON);
    }

    public PicksScreen tapSendToFriendButton(){
        appiumUtils.click(SEND_TO_FRIEND_BUTTON);
        return this;
    }

    public boolean isOpenWebsiteIconDisplayed(){
        return appiumUtils.isVisable(OPEN_WEBSITE_ICON);
    }

    public PicksScreen tapOpenWebsiteButton(){
        appiumUtils.click(OPEN_WEBSITE_BUTTON);
        return this;
    }

    public boolean isEditIconDisplayed(){
        return appiumUtils.isVisable(EDIT_ICON);
    }

    public PicksScreen tapEditButton(){
        appiumUtils.click(EDIT_BUTTON);
        return this;
    }

    public boolean isRemoveFromStackIconDisplayed(){
        return appiumUtils.isVisable(REMOVE_FROM_STACK_ICON);
    }

    public PicksScreen tapRemoveFromStackButton(){
        appiumUtils.click(REMOVE_FROM_STACK_BUTTON);
        return this;
    }

    public boolean isDeleteIconDisplayed(){
        return appiumUtils.isVisable(DELETE_ICON);
    }

    public PicksScreen tapDeleteButton(){
        appiumUtils.click(DELETE_BUTTON);
        return this;
    }

    public PicksScreen tapCloseButton(){
       appiumUtils.click(CLOSE_BUTTON);
        return this;
    }

    public boolean isNotesHeaderDisplayed(){
        return appiumUtils.isVisable(NOTES);
    }

    public String getNotesText(){
        return appiumUtils.getText(NOTES_TEXT);
    }

}
