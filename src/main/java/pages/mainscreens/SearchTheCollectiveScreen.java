package pages.mainscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class SearchTheCollectiveScreen extends AbstractScreen {

    public SearchTheCollectiveScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements
    @iOSXCUITFindBy(accessibility = "Search the Collective")
    private WebElement SEARCH_THE_COLLECTIVE_FIELD;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    private WebElement CANCEL_SEARCH_BUTTON;

    @iOSXCUITFindBy(accessibility = "Clear text")
    private WebElement CLEAR_SEARCH_TEXT_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Picks\"]")
    private WebElement SEARCH_PICKS_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Stacks\"]")
    private WebElement SEARCH_STACKS_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Users\"]")
    private WebElement SEARCH_USERS_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Follow\"]")
    private WebElement USER_FOLLOW_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"dots\"]")
    private WebElement USER_MORE_OPTIONS_BUTTON;

    @iOSXCUITFindBy(accessibility = "Follow")
    private WebElement FOLLOW_BUTTON;

    @iOSXCUITFindBy(accessibility = "Unfollow")
    private WebElement UNFOLLOW_BUTTON;

    @iOSXCUITFindBy(accessibility = "Cancel")
    private WebElement CANCEL_BUTTON;

    @iOSXCUITFindBy(accessibility = "Remove follower")
    private WebElement REMOVE_FOLLOWER_BUTTON;

    @iOSXCUITFindBy(accessibility = "Follow back")
    private WebElement FOLLOW_BACK_BUTTON;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSheet[@name=\" \"]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther" )
    private WebElement CLOSE_MORE_OPTIONS_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[`label == \"Search results\"`]/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
    private WebElement SEARCH_USER1_NAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[`label == \"Search results\"`]/XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
    private WebElement SEARCH_USER1_USERNAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[`label == \"Search results\"`]/XCUIElementTypeCell/XCUIElementTypeButton[1]")
    private WebElement SEARCH_PICK1_USERNAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[`label == \"Search results\"`]/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
    private WebElement SEARCH_PICK1_TITLE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[`label == \"Search results\"`]/XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
    private WebElement SEARCH_PICK1_DESCRIPTION;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[`label == \"Search results\"`]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    private WebElement  SEARCH_STACK1_USERNAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[`label == \"Search results\"`]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    private WebElement  SEARCH_STACK1_TITLE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTable[`label == \"Search results\"`]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    private WebElement  SEARCH_STACK1_DESCRIPTION;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"clips icon\"`][1]")
    private WebElement SEARCH_CLIP1_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"share logo icon\"`][1]")
    private WebElement SEARCH_SHARE1_BUTTON;






    //Methods

    public String getSearchTheCollectiveFieldText(){
       return appiumUtils.getText(SEARCH_THE_COLLECTIVE_FIELD);
    }

    public SearchTheCollectiveScreen tapSearchTheCollectiveField() {
        appiumUtils.click(SEARCH_THE_COLLECTIVE_FIELD);
        return this;
    }

    public SearchTheCollectiveScreen setSearchText(String searchText){
        appiumUtils.sendText(SEARCH_THE_COLLECTIVE_FIELD,searchText);
        return this;
    }

    public SearchTheCollectiveScreen clearSearchText(){
        try {
            appiumUtils.click(CLEAR_SEARCH_TEXT_BUTTON);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return this;

    }
    public SearchTheCollectiveScreen tapSearchPickButton(){
        appiumUtils.click(SEARCH_PICKS_BUTTON);

        return this;
    }

    public SearchTheCollectiveScreen tapSearchStackButton(){
        appiumUtils.click(SEARCH_STACKS_BUTTON);
        return this;
    }

    public SearchTheCollectiveScreen tapSearchUserButton(){
        appiumUtils.click(SEARCH_USERS_BUTTON);
        return this;
    }

    public SearchTheCollectiveScreen tapFollowFromSearchButton(){
        try {
            appiumUtils.click(USER_FOLLOW_BUTTON);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return this;
    }
    public boolean isFollowButtonDisplayed(){
        return appiumUtils.isEnabled(FOLLOW_BUTTON);
    }

    public boolean isUnfollowButtonDisplayed(){
        return appiumUtils.isEnabled(UNFOLLOW_BUTTON);
    }

    public SearchTheCollectiveScreen tapUnfollowButton(){
        appiumUtils.click(UNFOLLOW_BUTTON);
        return this;
    }

    public boolean isRemoveFollowerButtonDisplayed(){
        return appiumUtils.isEnabled(REMOVE_FOLLOWER_BUTTON);
    }
    public SearchTheCollectiveScreen tapUserMoreOptions(){
        appiumUtils.click(USER_MORE_OPTIONS_BUTTON);
        return this;
    }

    public SearchTheCollectiveScreen tapFollowButton(){
        try {
            appiumUtils.click(FOLLOW_BUTTON);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return this;
    }

    public SearchTheCollectiveScreen tapCancelButton(){
        appiumUtils.click(CANCEL_BUTTON);
        return this;
    }

    public SearchTheCollectiveScreen tapRemoveFollower(){
        try {
            appiumUtils.click(REMOVE_FOLLOWER_BUTTON);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return this;
    }

    public SearchTheCollectiveScreen tapFollowBack(){
        try {
            appiumUtils.click(FOLLOW_BACK_BUTTON);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return this;
    }

    public SearchTheCollectiveScreen tapCloseMoreOptions(){
        appiumUtils.click(CLOSE_MORE_OPTIONS_BUTTON);
        return this;
    }

    public String getPick1Username(){
        return appiumUtils.getText(SEARCH_PICK1_USERNAME);
    }

    public String getPick1Title(){
        return appiumUtils.getText(SEARCH_PICK1_TITLE);
    }

    public String getPick1Description(){
        return appiumUtils.getText(SEARCH_PICK1_DESCRIPTION);
    }

    public String getStack1Username(){
        return appiumUtils.getText(SEARCH_STACK1_USERNAME);
    }

    public String getStack1Title(){
        return appiumUtils.getText(SEARCH_STACK1_TITLE);
    }

    public String getStack1Description(){
        return appiumUtils.getText(SEARCH_STACK1_DESCRIPTION);
    }

    public SearchTheCollectiveScreen tapSearchClip1Button(){
        appiumUtils.click(SEARCH_CLIP1_BUTTON);
        return this;
    }

    public SearchTheCollectiveScreen tapSearchShare1Button(){
        appiumUtils.click(SEARCH_SHARE1_BUTTON);
        return this;
    }

    public String getSearchUser1Name(){
        return appiumUtils.getText(SEARCH_USER1_NAME);
    }

    public String getSearchUser1Username(){
        return appiumUtils.getText(SEARCH_USER1_USERNAME);
    }



}
