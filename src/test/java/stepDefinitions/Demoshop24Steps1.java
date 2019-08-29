package stepDefinitions;

import java.util.List;
import java.util.Map;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import pageObjects.HomepageDemoshop;
import pageObjects.LoginPage;
import pageObjects.MainPage;
import pageObjects.ResultPage;

import static junit.framework.TestCase.assertFalse;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Demoshop24Steps1 extends GeneralSteps {
    private HomepageDemoshop homepageDemoshop = new HomepageDemoshop(driver);

    public static String getHomepageDemoshopURL() {
        return "http://www.demoshop24.com/";
    }

    public static String getHomepageDemoshopURL2() {
        return "http://www.demoshop24.com/index.php?route=product/category&path=34";
    }

    @Given("^Open application, homepage$")
    public void open_Demoshop24_webpage() throws Throwable {
        driver.get(getHomepageDemoshopURL());
    }

    @And("^User navigates to login page$")
    public void loginpageopen() {
        homepageDemoshop.clickloginpage();
    }

    @And("^User inputs credentials$")
    public void credentials(Map<String, String> userData) {
        homepageDemoshop.loginuser(userData.get("username"), userData.get("password"));
    }

    @And("^User navigates back to homepage$")
    public void openhomepageagains() throws Throwable {
        homepageDemoshop.clickHomepagelogo();
        ;
    }

    @And("^User adds 2 items Macbook, Iphone from featured wishlist$")
    public void selectwishlistitems() {
        homepageDemoshop.clickMacbookWish();
    }

    @And("^User Navigates to MP3players page$")
    public void open_Demoshop24_webpage_MP3players() throws Throwable {
        driver.get(getHomepageDemoshopURL2());
    }

    @And("^Adds 2 items iPod Classic,iPod Nano from MP3players page$")
    public void mp3playerpageadd2items() {
        homepageDemoshop.clickMP3playerpageadd2items();

    }

    @And("^Navigates to wishlist page$")
    public void Gotowishlistpage() throws InterruptedException {
        homepageDemoshop.clickGotowishlistpage();

    }

    @Then("^User sees selected element:$")
    public void userSeesSelectedElement(List<String> text) {
        List<WebElement> element = homepageDemoshop.getResultThing();
        boolean innerLoop = false;
        boolean outerLoop = true;
        for (String string : text) {
            innerLoop = false;
            for (WebElement e : element) {
                if (e.getText().contains(string)) {
                    innerLoop = true;
                }
            }
            if (!innerLoop) {
                outerLoop = false;
            }
        }
        assertTrue(outerLoop);
    }

    @And("^Wishlist icon has number of 4 assigned to it$")
    public void wishlistnumber() {
        System.out.println(homepageDemoshop.getwishlistspan());
        assertEquals("Wish List (4)", homepageDemoshop.getwishlistspan());
    }

    //Scenario: Check add and remove functionality of the wishlist2

    @When("^User adds 1 item Iphone from featured wishlist$")
    public void selectiphonewish() {
        homepageDemoshop.clickfeaturedIphoneWish();
    }

    @And("^User navigates to Phones&PDAs page$")
    public void Gotophonepda() throws InterruptedException {
        homepageDemoshop.clickphonepda();
    }

    @And("^Adds 2 items HTC Touch HD,iPhone - again from list$")
    public void selecthtc() {
        homepageDemoshop.clickiphonehtcwish();
    }

    @And("^Wishlist icon has number of 2 assigned to it$")
    public void wishlistnumber2() {
        System.out.println(homepageDemoshop.getwishlistspan());
        assertEquals("Wish List (2)", homepageDemoshop.getwishlistspan());
    }

    @And("^User Removes first item from wishlist$")
    public void selectremovefirstwishlistitem() throws InterruptedException {
        homepageDemoshop.clickremovefirstwishlistitem();

    }

    @Then("^User doesn't see these elements:$")
    public void userSeesSelectedElement2(List<String> text) {
        List<WebElement> element = homepageDemoshop.getResultThing();
        boolean innerLoop = true;
        boolean outerLoop = false;
        for (String string : text) {
            innerLoop = true;
            for (WebElement e : element) {
                if (e.getText().contains(string)) {
                    innerLoop = false;
                }
            }
            if (!innerLoop) {
                outerLoop = true;
            }
        }
        assertFalse(outerLoop);
    }


    @And("^Wishlist icon has number of 3 assigned to it$")
    public void wishlistnumber3() {
        System.out.println(homepageDemoshop.getwishlistspan());
        assertEquals("Wish List (3)", homepageDemoshop.getwishlistspan());
    }

    @And("^User Removes all 4 items from wishlist$")
    public void selectremovefirstwishlistitemtall() throws InterruptedException {
        homepageDemoshop.clickremovefirstwishlistitemall();

    }

    @And("^Wishlist icon has number of 0 assigned to it$")
    public void wishlistnumber0() {
        System.out.println(homepageDemoshop.getwishlistspan());
        assertEquals("Wish List (0)", homepageDemoshop.getwishlistspan());
    }

    @And("^User adds first item to shopping cart$")
    public void selectshoppingcart() throws InterruptedException {
        homepageDemoshop.clickaddshoppingcart();

    }

    @And("^User navigates to shopping cart page$")
    public void Gotoshoppingcartpage() throws InterruptedException {
        homepageDemoshop.clickaddshoppingcartbutton();

    }

    @Then("^User sees transfered element:$")
    public void userSeesShoppingCartElement(List<String> text) throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> element = homepageDemoshop.getShoppingThing();
        boolean innerLoop = false;
        boolean outerLoop = true;
        for (String string : text) {
            innerLoop = false;
            for (WebElement e : element) {
                if (e.getText().contains(string)) {
                    innerLoop = true;
                }
            }
            if (!innerLoop) {
                outerLoop = false;
            }
        }
        assertTrue(outerLoop);
    }

    @And("^User adds all items to shopping cart$")
    public void selectshoppingcartall() throws InterruptedException {
        homepageDemoshop.clickaddshoppingcartall();

    }
}
