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

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class Demoshop24Steps extends GeneralSteps {
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

    @Then("^User navigates to login page$")
    public void loginpageopen() {
        homepageDemoshop.clickloginpage();
    }

    @Then("^User inputs credentials$")
    public void credentials(Map<String, String> userData) {
        homepageDemoshop.loginuser(userData.get("username"), userData.get("password"));
    }

    @Then("^User navigates back to homepage$")
    public void openhomepageagains() throws Throwable {
        homepageDemoshop.clickHomepagelogo();;
    }

    @When("^User adds 2 items from featured wishlist$")
    public void selectwishlistitems() {
        homepageDemoshop.clickMacbookWish();
    }

    @Then("^User Navigates to MP3players page$")
    public void open_Demoshop24_webpage_MP3players() throws Throwable {
        driver.get(getHomepageDemoshopURL2());
    }

    @Then("^Adds 2 items from MP3players page$")
    public void mp3playerpageadd2items() {
        homepageDemoshop.clickMP3playerpageadd2items();

    }

    @Then("^Navigates to wishlist page$")
    public void Gotowishlistpage() {
        homepageDemoshop.clickGotowishlistpage();

    }

    @And("^User sees selected element:$")
    public void userSeesSelectedElement(List<String> text) {
        List<WebElement> element = homepageDemoshop.getResultThing();
        for (String string : text) {
            for (WebElement e : element) {
                System.out.println(e.getText().contains(string));
            }
        }
    }

}


