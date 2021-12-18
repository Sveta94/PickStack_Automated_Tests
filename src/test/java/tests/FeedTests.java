package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.enterappscreens.AuthorizationScreen;
import pages.enterappscreens.LoginScreen;
import pages.mainscreens.FeedScreen;
import pages.mainscreens.SearchTheCollectiveScreen;
import pages.pickandstackscreens.pickscreens.EditPickScreen;
import pages.pickandstackscreens.pickscreens.PicksScreen;
import root.TestDriver;
import steps.AddPickSteps;
import steps.LoginSteps;
import utils.AppiumUtils;

import java.util.NoSuchElementException;

public class FeedTests extends TestDriver {

        AuthorizationScreen authorizationScreen;
        LoginScreen loginScreen;
        LoginSteps loginSteps;
        SearchTheCollectiveScreen searchTheCollectiveScreen;
        FeedScreen feedScreen;
        AddPickSteps addPickSteps;
        EditPickScreen editPickScreen;
        PicksScreen picksScreen;
        SoftAssert softAssert;
        AppiumUtils appiumUtils;

    @BeforeMethod
    public void setupTest() {

        authorizationScreen = new AuthorizationScreen(driver);
        loginScreen = new LoginScreen(driver);
        loginSteps = new LoginSteps(driver);
        feedScreen = new FeedScreen(driver);
        addPickSteps = new AddPickSteps(driver);
        editPickScreen = new EditPickScreen(driver);
        picksScreen = new PicksScreen(driver);
        searchTheCollectiveScreen = new SearchTheCollectiveScreen(driver);
        softAssert = new SoftAssert();
        appiumUtils = new AppiumUtils(driver);

    }

    @Test
    public void testFollowerNewPickOnFeed() throws InterruptedException {
        authorizationScreen.tapLoginButton();
        loginSteps.login("autotest1@auto.test", "Autotest1");
        loginScreen.tapAllowButton();
        addPickSteps.addPick("www.huffpost.com/entry/50-best-beauty-tips-the-only-beauty-advice-youll-ever-need_n_610874f5e4b0497e67026b0b/amp" + "\n");
        editPickScreen.setPickDescription("From basic beauty dos to don'ts.");
        editPickScreen.tapShareWithCollectiveButton();
        loginSteps.logout();
        loginSteps.login("autotest2@auto.test","Autotest2" );
        feedScreen.navigateToAddPick();
        feedScreen.navigateToFeed();
        feedScreen.tapPick1();
        softAssert.assertEquals(picksScreen.getProfileUsername(), "autotest1");
        softAssert.assertEquals(picksScreen.getPickTitle(), "The Only Beauty Tips You'll Ever Need");
        softAssert.assertEquals(picksScreen.getPickDescription(),"From basic beauty dos to don'ts.");
        softAssert.assertAll();
    }

    @Test
    public void testSearchPickByTitle() throws InterruptedException {
        authorizationScreen.tapLoginButton();
        loginSteps.login("autotest1@auto.test", "Autotest1");
        loginScreen.tapAllowButton();
        searchTheCollectiveScreen.tapSearchTheCollectiveField();
        searchTheCollectiveScreen.setSearchText("Samoyed" + "\n");
        Thread.sleep(2000);
        Assert.assertEquals(searchTheCollectiveScreen.getPick1Username(), "autotest2");
        Assert.assertEquals(searchTheCollectiveScreen.getPick1Title(), "Samoyed Dog Breed - Facts and Personality Traits");
    }

    @Test
    public void testSearchPickByDescription() throws InterruptedException {
        authorizationScreen.tapLoginButton();
        loginSteps.login("autotest2@auto.test", "Autotest2");
        loginScreen.tapAllowButton();
        searchTheCollectiveScreen.tapSearchTheCollectiveField();
        searchTheCollectiveScreen.setSearchText("Cristo rei" + "\n");
        Thread.sleep(2000);
        Assert.assertEquals(searchTheCollectiveScreen.getPick1Username(), "autotest1");
        Assert.assertEquals(searchTheCollectiveScreen.getPick1Description(), "The Cristo Rei is one of the most iconic monuments in Lisbon.  ");
    }


        @Test
        public void testSearchPickByNotes() throws InterruptedException {
            authorizationScreen.tapLoginButton();
            loginSteps.login("autotest2@auto.test", "Autotest2");
            loginScreen.tapAllowButton();
            searchTheCollectiveScreen.tapSearchTheCollectiveField();
            searchTheCollectiveScreen.setSearchText("search by note" + "\n");
            Thread.sleep(2000);
            Assert.assertEquals(searchTheCollectiveScreen.getPick1Username(), "autotest1");
            Assert.assertEquals(searchTheCollectiveScreen.getPick1Description(), "GUCCI  ");

        }

    @Test
    public void testSearchStackByTitle() throws InterruptedException {
        authorizationScreen.tapLoginButton();
        loginSteps.login("autotest2@auto.test", "Autotest2");
        loginScreen.tapAllowButton();
        searchTheCollectiveScreen.tapSearchTheCollectiveField();
        searchTheCollectiveScreen.tapSearchStackButton();
        searchTheCollectiveScreen.tapSearchTheCollectiveField();
        searchTheCollectiveScreen.setSearchText("Wedding design" + "\n");
        Thread.sleep(2000);
        try{
            Assert.assertEquals(searchTheCollectiveScreen.getStack1Username(), "autotest1");
            Assert.assertEquals(searchTheCollectiveScreen.getStack1Title(), "Pinterest wedding design");
        }
        catch(NoSuchElementException e){
            e.printStackTrace();

        }

    }



    @Test
    public void testSearchStackByDescription() throws InterruptedException {
        authorizationScreen.tapLoginButton();
        loginSteps.login("autotest2@auto.test", "Autotest2");
        loginScreen.tapAllowButton();
        searchTheCollectiveScreen.tapSearchTheCollectiveField();
        searchTheCollectiveScreen.tapSearchStackButton();
        searchTheCollectiveScreen.tapSearchTheCollectiveField();
        searchTheCollectiveScreen.setSearchText("Decorations, white and green design" + "\n");
        Thread.sleep(2000);
        try{
            Assert.assertEquals(searchTheCollectiveScreen.getStack1Username(), "autotest1");
            Assert.assertEquals(searchTheCollectiveScreen.getStack1Title(), "Wedding Design");
        }
        catch(NoSuchElementException e){
            e.printStackTrace();

        }

    }

    @Test
    public void testSearchUserByName(){
        authorizationScreen.tapLoginButton();
        loginSteps.login("autotest2@auto.test", "Autotest2");
        loginScreen.tapAllowButton();
        searchTheCollectiveScreen.tapSearchTheCollectiveField();
        searchTheCollectiveScreen.tapSearchUserButton();
        searchTheCollectiveScreen.setSearchText("Peppy" + "\n");
        Assert.assertEquals(searchTheCollectiveScreen.getSearchUser1Name(), "Peppy Autotest");
        Assert.assertEquals(searchTheCollectiveScreen.getSearchUser1Username(), "vasilisatest");

    }

    @Test
    public void testSearchUserByUsername(){
        authorizationScreen.tapLoginButton();
        loginSteps.login("autotest1@auto.test", "Autotest1");
        loginScreen.tapAllowButton();
        searchTheCollectiveScreen.tapSearchTheCollectiveField();
        searchTheCollectiveScreen.tapSearchUserButton();
        searchTheCollectiveScreen.setSearchText("vasilisa" + "\n");
        Assert.assertEquals(searchTheCollectiveScreen.getSearchUser1Name(), "Peppy Autotest");
        Assert.assertEquals(searchTheCollectiveScreen.getSearchUser1Username(), "vasilisatest");

    }


    @Test
    public void testUserFollowButton(){
        authorizationScreen.tapLoginButton();
        loginSteps.login("autotest1@auto.test", "Autotest1");
        loginScreen.tapAllowButton();
        searchTheCollectiveScreen.tapSearchTheCollectiveField();
        searchTheCollectiveScreen.tapSearchUserButton();
        searchTheCollectiveScreen.setSearchText("vasilisa" + "\n");
        searchTheCollectiveScreen.tapUserMoreOptions();
        Assert.assertTrue(searchTheCollectiveScreen.isFollowButtonDisplayed());
        searchTheCollectiveScreen.tapCancelButton();
        searchTheCollectiveScreen.tapFollowFromSearchButton();
        searchTheCollectiveScreen.tapUserMoreOptions();
        Assert.assertTrue(searchTheCollectiveScreen.isUnfollowButtonDisplayed());

    }

    @Test
    public void testUserUnfollowButton(){
        authorizationScreen.tapLoginButton();
        loginSteps.login("autotest1@auto.test", "Autotest1");
        loginScreen.tapAllowButton();
        searchTheCollectiveScreen.tapSearchTheCollectiveField();
        searchTheCollectiveScreen.tapSearchUserButton();
        searchTheCollectiveScreen.setSearchText("vasilisa" + "\n");
        searchTheCollectiveScreen.tapUserMoreOptions();
        searchTheCollectiveScreen.tapUnfollowButton();
        searchTheCollectiveScreen.tapUserMoreOptions();
        Assert.assertTrue(searchTheCollectiveScreen.isFollowButtonDisplayed());

    }

    @Test
    public void testDeletePickFromFeed() throws InterruptedException {
        authorizationScreen.tapLoginButton();
        loginSteps.login("autotest3@auto.test", "Autotest3");
        loginScreen.tapAllowButton();
        addPickSteps.addPick("https://opensea.io/collection/art" + "\n");
        editPickScreen.setPickDescription("An online community of makers, developers, and traders is pushing the art world into new territory.");
        editPickScreen.tapShareWithCollectiveButton();
        feedScreen.navigateToAddPick();
        feedScreen.navigateToFeed();
        appiumUtils.scrollDown();
        feedScreen.tapPick1();
        picksScreen.tapDeleteButton();
        feedScreen.navigateToFeed();
        feedScreen.tapPick1();
        Assert.assertNotEquals(picksScreen.getPickTitle(),"Explore Art NFTs");

    }
}
