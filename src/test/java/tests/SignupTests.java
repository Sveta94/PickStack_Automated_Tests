package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.enterappscreens.AuthorizationScreen;
import pages.enterappscreens.LoginScreen;
import pages.enterappscreens.SignUpScreen;
import pages.enterappscreens.TutorialScreen;
import pages.intentionsscreens.ProfileIntentionsScreen;
import pages.mainscreens.FeedScreen;
import pages.mainscreens.SearchTheCollectiveScreen;
import pages.profilescreens.EditProfileScreen;
import pages.profilescreens.ProfileMainScreen;
import pages.profilescreens.ProfileOptionMenuScreen;
import root.TestDriver;
import steps.SignUpSteps;
import utils.AppiumUtils;

import java.util.Locale;

public class SignupTests extends TestDriver {

    AuthorizationScreen authorizationScreen;
    SignUpScreen signUpScreen;
    SignUpSteps signUpSteps;
    LoginScreen loginScreen;
    ProfileIntentionsScreen intentionsScreen;
    TutorialScreen tutorialScreen;
    SearchTheCollectiveScreen searchTheCollectiveScreen;
    FeedScreen feedScreen;
    ProfileMainScreen profileMainScreen;
    ProfileOptionMenuScreen profileOptionMenuScreen;
    ProfileIntentionsScreen profileIntentionsScreen;
    EditProfileScreen editProfileScreen;
    SoftAssert softAssert;
    AppiumUtils appiumUtils;


    @BeforeMethod
    public void setupTest() {
        authorizationScreen = new AuthorizationScreen(driver);
        signUpScreen = new SignUpScreen(driver);
        signUpSteps = new SignUpSteps(driver);
        loginScreen = new LoginScreen(driver);
        intentionsScreen = new ProfileIntentionsScreen(driver);
        tutorialScreen = new TutorialScreen(driver);
        feedScreen = new FeedScreen(driver);
        profileMainScreen = new ProfileMainScreen(driver);
        profileOptionMenuScreen = new ProfileOptionMenuScreen(driver);
        profileIntentionsScreen = new ProfileIntentionsScreen(driver);
        editProfileScreen = new EditProfileScreen(driver);
        searchTheCollectiveScreen = new SearchTheCollectiveScreen(driver);
        softAssert = new SoftAssert();
        appiumUtils = new AppiumUtils(driver);


    }


    @Test
    public void testSingUpWithNameUsername(){

        Faker fakerEng = new Faker(new Locale("eng"));
        String firstName = fakerEng.name().firstName();
        int randomInt = ((int)(Math.random()*9000)+1000);
        String userEmail = "svetlana+" + firstName.toLowerCase() + randomInt +"@gojilabs.com";
        String password = "Autotest00223344!";
        String username = firstName + randomInt;

        authorizationScreen.tapSignUpButton();
        //softAssert.assertTrue(signUpScreen.isLogoDisplayed());
        softAssert.assertEquals(signUpScreen.getSignUpText(),  "Sign Up");
        signUpSteps.createNewUser(userEmail, password);
        //softAssert.assertTrue(signUpScreen.isCheckmarkDisplayed());
        softAssert.assertEquals(signUpScreen.getWelcomeText(),"Welcome to the Collective");
        softAssert.assertEquals(signUpScreen.getThanksText(), "Thanks for joining us! Let’s create your profile.");
        signUpScreen.tapContinueButton();
        softAssert.assertEquals(signUpScreen.getYourNameText(), "What’s your name?");
        signUpScreen.setFullName(firstName);
        signUpScreen.tapContinueButton();
        softAssert.assertEquals(signUpScreen.getAddUsernameText(), "Add a username");
        softAssert.assertEquals(signUpScreen.getHelpFindYouText(), "Help people find you.");
        signUpScreen.setUsername(username);
        signUpScreen.tapContinueButton();
        signUpScreen.tapSkipButton();
        signUpScreen.tapSkipButton();
        intentionsScreen.tapSkipAndFinishButton();
        tutorialScreen.tapAllowButton();
       // softAssert.assertTrue(tutorialScreen.isCheckmarkDisplayed());
        softAssert.assertEquals(tutorialScreen.getProfileCreatedText(), "Great! Your profile has been created.");
        softAssert.assertEquals(tutorialScreen.getFollowTutorialText(), "Follow our tutorial to learn what you can do! You can access the tutorial at any time in settings.");
        tutorialScreen.tapSkipButton();
       // softAssert.assertTrue(feedScreen.isLogoDisplayed());
        softAssert.assertEquals(searchTheCollectiveScreen.getSearchTheCollectiveFieldText(), "Search the Collective");
        feedScreen.navigateToProfile();
        softAssert.assertTrue(profileMainScreen.isAvatarDisplayed());
        softAssert.assertAll();
    }

    @Test
    public void testSingUpWithPhoto(){

        signUpSteps.createNewUser();
        softAssert.assertEquals(signUpScreen.getUploadPhotoText(), "Upload a profile photo");
        softAssert.assertEquals(signUpScreen.getRecognizeYouText(), "Help people recognize you.");
        signUpSteps.choosePhotoFromLibrary();
        signUpScreen.tapSkipButton();
        intentionsScreen.tapSkipAndFinishButton();
        tutorialScreen.tapAllowButton();
        tutorialScreen.tapSkipButton();
        softAssert.assertEquals(searchTheCollectiveScreen.getSearchTheCollectiveFieldText(), "Search the Collective");
        feedScreen.navigateToProfile();
        softAssert.assertTrue(profileMainScreen.isProfilePhotoEnabled());
        softAssert.assertAll();

    }



    @Test
    public void testSingUpWithBio(){

        signUpSteps.createNewUser();
        signUpScreen.tapSkipButton();
        softAssert.assertEquals(signUpScreen.getAddBioText(), "Add a bio");
        softAssert.assertEquals(signUpScreen.getAboutYouText(), "Tell us a little about yourself.");
        signUpScreen.setBio("When I was a child I used to collect coins. I collected coins from different countries.My father brought Italian, French, Swiss coins for me from his business. My coin collection was small but cute...aaaaaaaa");
        signUpScreen.tapContinueButton();
        intentionsScreen.tapSkipAndFinishButton();
        tutorialScreen.tapAllowButton();
        tutorialScreen.tapSkipButton();
        feedScreen.navigateToProfile();
        profileMainScreen.tapOptionMenuButton();
        profileOptionMenuScreen.tapEditProfileButton();
        softAssert.assertEquals(editProfileScreen.getBioText(), "When I was a child I used to collect coins. I collected coins from different countries.My father brought Italian, French, Swiss coins for me from his business. My coin collection was small but cute...");
        softAssert.assertAll();
    }

    @Test
    public void testSingUpWitIntentions(){

        signUpSteps.createNewUser();
        signUpScreen.tapSkipButton();
        signUpScreen.tapSkipButton();
        softAssert.assertEquals(intentionsScreen.getAddIntentionsText(), "Add your intentions");
        softAssert.assertEquals(intentionsScreen.getSelectIntentionsText(), "Select 3 or more intentions below.");
        intentionsScreen.tapSignUpTravelSmarterCheckbox();
        appiumUtils.scrollUp();
        intentionsScreen.tapSignUpBeSuccessfulCheckbox();
        intentionsScreen.tapFinishButton();
        tutorialScreen.tapAllowButton();
        tutorialScreen.tapSkipButton();
        feedScreen.navigateToProfile();
        profileMainScreen.tapOptionMenuButton();
        profileOptionMenuScreen.tapEditProfileButton();
        softAssert.assertTrue(profileIntentionsScreen.isTravelSmarterCircleChecked());
        softAssert.assertTrue(profileIntentionsScreen.isBeSuccessfulCircleChecked());

    }

    @Test
    public void testSignUpWithTutorial(){
        signUpSteps.createNewUser();
        signUpScreen.tapSkipButton();
        signUpScreen.tapSkipButton();
        intentionsScreen.tapSkipAndFinishButton();
        softAssert.assertEquals(tutorialScreen.getSendNotificationText(),"“Pickstack” Would Like to Send You Notifications");
        tutorialScreen.tapAllowButton();
        //softAssert.assertTrue(tutorialScreen.isCheckmarkDisplayed());
        softAssert.assertEquals(tutorialScreen.getProfileCreatedText(), "Great! Your profile has been created.");
        softAssert.assertEquals(tutorialScreen.getFollowTutorialText(), "Follow our tutorial to learn what you can do! You can access the tutorial at any time in settings.");
        tutorialScreen.tapStartTutorialButton();
        tutorialScreen.tapBackButton();
        //softAssert.assertTrue(tutorialScreen.isCheckmarkDisplayed());
        tutorialScreen.tapStartTutorialButton();
        //softAssert.assertTrue(tutorialScreen.isPage1PhotoDisplayed());
        softAssert.assertEquals(tutorialScreen.getPage1Counter(), "1 of 6");
        softAssert.assertEquals(tutorialScreen.getPage1Header(),"What is Pickstack");
        softAssert.assertEquals(tutorialScreen.getPage1Text(),"Pickstack is a tool for storing and sharing what you truly love. There are no paid endorsements. No likes.");
        tutorialScreen.tapContinueButton();
       // softAssert.assertTrue(tutorialScreen.isPage2PhotoDisplayed());
        softAssert.assertEquals(tutorialScreen.getPage2Counter(), "2 of 6");
        softAssert.assertEquals(tutorialScreen.getPage2Header(),"Posting your favorite picks");
        softAssert.assertEquals(tutorialScreen.getPage2Text(),"Post new picks directly from your browser by pressing the share icon or from inside the app by pressing the “Add” button.");
        tutorialScreen.tapContinueButton();
        //softAssert.assertTrue(tutorialScreen.isPage3PhotoDisplayed());
        softAssert.assertEquals(tutorialScreen.getPage3Counter(), "3 of 6");
        softAssert.assertEquals(tutorialScreen.getPage3Header(),"Stacks");
        softAssert.assertEquals(tutorialScreen.getPage3Text(),"Stack your favorite picks into a collection you share.");
        tutorialScreen.tapContinueButton();
        //softAssert.assertTrue(tutorialScreen.isPage4PhotoDisplayed());
        softAssert.assertEquals(tutorialScreen.getPage4Counter(), "4 of 6");
        softAssert.assertEquals(tutorialScreen.getPage4Header(),"Sharing");
        softAssert.assertEquals(tutorialScreen.getPage4Text(),"You can share picks and stacks with your friends by tapping this button.");
        tutorialScreen.tapContinueButton();
        //softAssert.assertTrue(tutorialScreen.isPage5PhotoDisplayed());
        softAssert.assertEquals(tutorialScreen.getPage5Counter(), "5 of 6");
        softAssert.assertEquals(tutorialScreen.getPage5Header(),"Clips");
        softAssert.assertEquals(tutorialScreen.getPage5Text(),"Press the paperclip when you want to save a pick or stack to your private stash.");
        tutorialScreen.tapContinueButton();
        //softAssert.assertTrue(tutorialScreen.isPage6PhotoDisplayed());
        softAssert.assertEquals(tutorialScreen.getPage6Counter(), "6 of 6");
        softAssert.assertEquals(tutorialScreen.getPage6Header(),"Other Actions");
        softAssert.assertEquals(tutorialScreen.getPage6Text(),"Click directly on pictures to access their options.");
        tutorialScreen.tapFinishButton();
        //softAssert.assertTrue(feedScreen.isLogoDisplayed());
        Assert.assertEquals(searchTheCollectiveScreen.getSearchTheCollectiveFieldText(), "Search the Collective");
        softAssert.assertAll();
    }

    @Test
    public void testNavigateToSignUpScreen(){
        authorizationScreen.tapSignUpButton();
        signUpScreen.tapLogInFromSignUpPageButton();
        Assert.assertEquals(loginScreen.getLoginText(), "Log In");
    }


    @Test
    public void testTermsOfServiceLink(){
        authorizationScreen.tapSignUpButton();
        signUpScreen.tapTermsOfServiceLink();
        Assert.assertEquals(signUpScreen.getPrivacyTitle(), "Privacy & Terms");
    }


}
