package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebDriver;
import pageObjects.ReviewPO;


public class MyStepdefs005 extends GeneralSteps {

    public ReviewPO reviewPO = new ReviewPO(driver);

    public static String getDemoShopHomePage() {
        return "http://demoshop24.com/";
    }

    @Given("^I am on Demoshop homepage$")
    public void iAmOnDemoshopHomepage() {
        driver.get(getDemoShopHomePage());
    }

    @When("^I click Featured product MacBook using PO$")
    public void iClickFeaturedProductMacBookUsingPO() {
        reviewPO.clickMacBookProduct();
    }

//    @And("^I am on product page using PO$")
//    public void iAmOnProductPage() {
//
//    }

    @And("^click write a review using PO$")
    public void clickWriteAReview() {
        reviewPO.clickReviewLink();
    }

    @Then("^I am able to write a review for selected product using PO$")
    public void iAmAbleToWriteAReviewForSelectedProduct() { reviewPO.writeReview(); }

//    @Given("^I am on MacBook product page$")
//    public void iAmOnMacBookProductPage() {
//
//    }

//    @When("^I enter name in Your name field using PO$")
//    public void iEnterNameInYourNameField() {
//
//    }
//
//    @And("^type text \"([^\"]*)\" in \"([^\"]*)\" field using PO$")
//    public void typeTextInField(String arg0, String arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @And("^select Rating option using PO$")
//    public void selectRatingOption() {
//
//    }

    @And("^click continue using PO$")
    public void clickContinue() { reviewPO.clickContinueReviewButton(); }

    @Then("^I get \"([^\"]*)\" using PO$")
    public void iGet(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^type text (\\d+) characters long in Your review field using PO$")
    public void typeTextCharactersLongInYourReviewField(int arg0) {

    }

    @Then("^I get message using PO$")
    public void iGetMessage() {
    }

    @And("^type text \"([^\"]*)\" in Your review field using PO$")
    public void typeTextInYourReviewFieldUsingPO(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
