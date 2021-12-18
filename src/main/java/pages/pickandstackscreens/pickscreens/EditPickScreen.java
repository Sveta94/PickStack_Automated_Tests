package pages.pickandstackscreens.pickscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class EditPickScreen extends AbstractScreen {
    public EditPickScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
    private WebElement PICK_TITLE;

    @iOSXCUITFindBy(accessibility = "close icon")
    private WebElement CLOSE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain= "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeImage")
    private WebElement PICK_IMAGE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \" Edit Photo\"`]")
    private WebElement EDIT_PHOTO_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextView")
    private WebElement PICK_TITLE_EDIT_FIELD;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
    private WebElement PICK_TITLE_COUNTER; //60

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView")
    private WebElement PICK_DESCRIPTION_EDIT_FIELD;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
    private WebElement PICK_DESCRIPTION_COUNTER; //120

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    private WebElement ADD_NOTES_FIELD;

    @iOSXCUITFindBy(accessibility = "This pick helps people...")
    private WebElement PICK_INTENTIONS;

    @iOSXCUITFindBy(accessibility = "Add to Stack")
    private WebElement ADD_PICK_TO_STACK_BUTTON;

    @iOSXCUITFindBy(accessibility = "sheet_icon")
    private WebElement ADD_PICK_TO_STACK_ICON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]")
    private WebElement PICK_IN_STACK;

    @iOSXCUITFindBy(accessibility = "close_icon")
    private WebElement DELETE_PICK_FROM_STACK;

    //New pick
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Share with Collective\"`]")
    private WebElement SHARE_WITH_COLLECTIVE_BUTTON;

    //Edit pick
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Done\"`]")
    private WebElement DONE_BUTTON;


    //Methods
    public String getPickTitle(){
      return appiumUtils.getText(PICK_TITLE);
    }

    public EditPickScreen tapCloseButton(){
        appiumUtils.click(CLOSE_BUTTON);
        return this;
    }

    public boolean isPickImageDisplayed(){
       return appiumUtils.isVisable(PICK_IMAGE);
    }

    public EditPickScreen tapEditPhotoButton(){
        appiumUtils.click(EDIT_PHOTO_BUTTON);
        return this;
    }

    public String getPickTitleHintText(){
        return appiumUtils.getText(PICK_TITLE_EDIT_FIELD);
    }

    public EditPickScreen setPickTitle(String pickTitle){
        appiumUtils.sendText(PICK_TITLE_EDIT_FIELD,pickTitle);
        return this;
    }

    public String getTitleCounter(){
        return appiumUtils.getText(PICK_TITLE_COUNTER);
    }

    public String getPickDescriptionHintText(){
        return appiumUtils.getText(PICK_DESCRIPTION_EDIT_FIELD);
    }

    public EditPickScreen setPickDescription(String pickDescription){
        appiumUtils.sendText(PICK_DESCRIPTION_EDIT_FIELD,pickDescription);
        return this;
    }

    public String getDescriptionCounter(){
        return appiumUtils.getText(PICK_DESCRIPTION_COUNTER);
    }

    public String getPickNotesHintText(){
        return appiumUtils.getText(ADD_NOTES_FIELD);
    }

    public EditPickScreen setPickNotes(String pickNotes){
        appiumUtils.sendText(ADD_NOTES_FIELD,pickNotes);
        return this;
    }

    public EditPickScreen tapPickIntentions(){
        appiumUtils.click(PICK_INTENTIONS);
        return this;
    }

    public boolean isAddPickToStackIconDisplayed(){
        return appiumUtils.isVisable(ADD_PICK_TO_STACK_ICON);
    }

    public EditPickScreen tapAddPickToStackButton(){
        appiumUtils.click(ADD_PICK_TO_STACK_BUTTON);
        return this;
    }

    public String getPickInStackTitle(){
        return appiumUtils.getText(PICK_IN_STACK);
    }

    public  EditPickScreen tapDeletePickFromStack(){
        appiumUtils.click(DELETE_PICK_FROM_STACK);
        return this;
    }

    public EditPickScreen tapShareWithCollectiveButton(){
        appiumUtils.click(SHARE_WITH_COLLECTIVE_BUTTON);
        return this;
    }

    public EditPickScreen tapDoneButton(){
        appiumUtils.click(DONE_BUTTON);
        return this;
    }

}
