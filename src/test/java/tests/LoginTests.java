package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.enterappscreens.AuthorizationScreen;
import pages.enterappscreens.LoginScreen;
import pages.enterappscreens.SignUpScreen;
import pages.mainscreens.FeedScreen;
import pages.mainscreens.SearchTheCollectiveScreen;
import pages.profilescreens.ProfileMainScreen;
import root.TestDriver;
import steps.LoginSteps;
import utils.AppiumUtils;

public class LoginTests extends TestDriver {

    AuthorizationScreen authorizationScreen;
    SignUpScreen signUpScreen;
    LoginScreen loginScreen;
    LoginSteps loginSteps;
    SearchTheCollectiveScreen searchTheCollectiveScreen;
    FeedScreen feedScreen;
    SoftAssert softAssert;
    AppiumUtils appiumUtils;
    ProfileMainScreen profileMainScreen;

    @BeforeMethod
    public void setupTest() {

        authorizationScreen = new AuthorizationScreen(driver);
        signUpScreen = new SignUpScreen(driver);
        loginScreen = new LoginScreen(driver);
        loginSteps = new LoginSteps(driver);
        feedScreen = new FeedScreen(driver);
        searchTheCollectiveScreen = new SearchTheCollectiveScreen(driver);
        softAssert = new SoftAssert();
        appiumUtils = new AppiumUtils(driver);
        profileMainScreen = new ProfileMainScreen(driver);

    }

    @Test
    public void testLogIn(){
        authorizationScreen.tapLoginButton();
        softAssert.assertEquals(loginScreen.getLoginText(), "Log In");
        loginSteps.login("svetlana+1@gojilabs.com", "Qwerty0123456789");
        softAssert.assertEquals(loginScreen.getSendNotificationText(),"“Pickstack” Would Like to Send You Notifications");
        loginScreen.tapAllowButton();
        softAssert.assertEquals(searchTheCollectiveScreen.getSearchTheCollectiveFieldText(), "Search the Collective");
        softAssert.assertAll();
    }

    @Test
    public void testLogInInvalidEmailOrPass(){
        authorizationScreen.tapLoginButton();
        loginSteps.login("svetlana+1@gojilabs.com", "Qwerty01234567");
        loginScreen.clearPasswordField();
        loginScreen.setPassword("Qwerty0123456789");
        loginScreen.tapLoginButton();
        loginScreen.tapAllowButton();
        Assert.assertEquals(searchTheCollectiveScreen.getSearchTheCollectiveFieldText(), "Search the Collective");
    }

    @Test
    public void testLogInInvalidEmail(){
        authorizationScreen.tapLoginButton();
        loginSteps.login("svetlana+1@go.c", "Qwerty01234567");
        softAssert.assertEquals(loginScreen.getWrongEmailText(), "Please, enter valid email address");
        loginScreen.tapOkButton();
        softAssert.assertEquals(loginScreen.getLoginText(), "Log In");
        softAssert.assertAll();
    }

    @Test
    public void testLogInInvalidPassword(){
        authorizationScreen.tapLoginButton();
        loginSteps.login("svetlana+1@gojilabs.com", "Qwer");
        softAssert.assertEquals(loginScreen.getWrongPasswordText(), "Password should be at least 6 characters long");
        loginScreen.tapOkButton();
        softAssert.assertEquals(loginScreen.getLoginText(), "Log In");
        softAssert.assertAll();
    }

    @Test
    public void testNavigateToSignUpScreen(){
        authorizationScreen.tapLoginButton();
        loginScreen.tapSignUpFromLoginPageButton();
        Assert.assertEquals(signUpScreen.getSignUpText(), "Sign Up");
    }


}
