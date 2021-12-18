package pages.pickandstackscreens.stackscreens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import pages.AbstractScreen;

public class StacksScreen extends AbstractScreen {
    public StacksScreen(AppiumDriver driver) {
        super(driver);
    }

    //Elements

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"Empty list\"]/XCUIElementTypeOther[1]")
    private WebElement STACK1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"Empty list\"]/XCUIElementTypeOther[2]")
    private WebElement STACK2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@name=\"Empty list\"]/XCUIElementTypeOther[3]")
    private WebElement STACK3;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther")
    private WebElement STACK1_PICK1;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther")
    private WebElement STACK1_PICK2;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther")
    private WebElement STACK1_PICK3;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther")
    private WebElement STACK1_PICK4;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"close icon\"`][1]")
    private WebElement CLOSE_STACK1;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"close icon\"`][2]")
    private WebElement CLOSE_STACK2;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeImage[1]")
    private WebElement PROFILE_PIC;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeButton[1]")
    private WebElement PROFILE_USERNAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"share logo icon\"`][1]")
    private WebElement SHARE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeStaticText[1]")
    private WebElement STACK_TITLE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeStaticText[2]")
    private WebElement STACK_DESCRIPTION;

    @iOSXCUITFindBy(accessibility = "addPick")
    private WebElement ADD_PICK_BUTTON;

    @iOSXCUITFindBy(accessibility = "arrow left")
    private WebElement BACK_TO_STACKS;

    @iOSXCUITFindBy(iOSClassChain = "dots big")
    private WebElement OPTION_MENU;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
    private WebElement PICK1_USERNAME;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[4]")
    private WebElement PICK1_PROFILE_PIC;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"share logo icon\"`][2]")
    private WebElement PICK1_SHARE_BUTTON;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[3]")
    private WebElement PICK1_ADDED_TO_STACK;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
    private WebElement PICK1_TITLE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
    private WebElement PICK1_DESCRIPTION;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Shared Stacks\"`]/XCUIElementTypeStaticText[1]")
    private WebElement SHARED_STACKS_TEXT;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Shared Stacks\"`]/XCUIElementTypeStaticText[2]")
    private WebElement SHARED_STACK1_TITLE;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"Shared Stacks\"`]/XCUIElementTypeStaticText[3]")
    private WebElement SHARED_STACK1_AUTHOR_USERNAME;


    //Methods

    public StacksScreen tapStack(int stackNum) {

        if (stackNum == 2) {
            appiumUtils.click(STACK2);
        }
        if (stackNum == 3) {
            appiumUtils.click(STACK3);
        } else {
            appiumUtils.click(STACK1);
        }
        return this;
    }

    public StacksScreen tapPickInStack() {
        appiumUtils.click(STACK1_PICK1);
        return this;
    }

    public boolean isPickInStack1Displayed(int pickNum) {
        if (pickNum == 1) {
            return appiumUtils.isVisable(STACK1_PICK1);
        }
        if (pickNum == 2) {
            return appiumUtils.isVisable(STACK1_PICK2);
        }
        if (pickNum == 3) {
            return appiumUtils.isVisable(STACK1_PICK3);
        }
        if (pickNum == 4) {
            return appiumUtils.isVisable(STACK1_PICK3);
        } else return false;
    }

    public StacksScreen tapCloseStack1Button() {
        appiumUtils.click(CLOSE_STACK1);
        return this;
    }

    public StacksScreen tapCloseStack2Button() {
        appiumUtils.click(CLOSE_STACK2);
        return this;
    }

    public boolean isProfilePicDisplayed() {
        return appiumUtils.isVisable(PROFILE_PIC);
    }

    public String getProfileUsername() {
        return appiumUtils.getText(PROFILE_USERNAME);
    }

    public StacksScreen tapShareButton() {
        appiumUtils.click(SHARE_BUTTON);
        return this;
    }

    public String getStackTitle() {
        return appiumUtils.getText(STACK_TITLE);
    }

    public String getStackDescription() {
        return appiumUtils.getText(STACK_DESCRIPTION);
    }

    public StacksScreen tapAddPickButton() {
        appiumUtils.click(ADD_PICK_BUTTON);
        return this;
    }

    public StacksScreen tapBackToStacksButton() {
        appiumUtils.click(BACK_TO_STACKS);
        return this;
    }

    public StacksScreen tapOptionMenuButton() {
        appiumUtils.click(OPTION_MENU);
        return this;
    }

    public String getPick1Username() {
        return appiumUtils.getText(PICK1_USERNAME);
    }

    public boolean isPick1ProfilePicDisplayed() {
        return appiumUtils.isVisable(PICK1_PROFILE_PIC);
    }

    public StacksScreen tapPick1ShareButton() {
        appiumUtils.click(PICK1_SHARE_BUTTON);
        return this;
    }

    public String getPic1kAddedToStackText() {
        return appiumUtils.getText(PICK1_ADDED_TO_STACK);
    }

    public String getPick1Title() {
        return appiumUtils.getText(PICK1_TITLE);
    }

    public String getPick1Description() {
        return appiumUtils.getText(PICK1_DESCRIPTION);
    }

    public String getSharedStacksText() {
        return appiumUtils.getText(SHARED_STACKS_TEXT);
    }

    public String getSharedStack1Title() {
        return appiumUtils.getText(SHARED_STACK1_TITLE);
    }

    public String getSharedStack1AUTHOR_USERNAME() {
        return appiumUtils.getText(SHARED_STACK1_AUTHOR_USERNAME);
    }

}

