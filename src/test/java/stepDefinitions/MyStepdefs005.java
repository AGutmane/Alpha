package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import flowWorkers.WebDriverLib;
import javafx.scene.layout.Background;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.ReviewPO;

import static org.junit.Assert.assertTrue;


public class MyStepdefs005 extends GeneralSteps {

    public ReviewPO reviewPO = new ReviewPO(driver);

    public static String getDemoShopHomePage() {
        return "http://demoshop24.com/";
    }

    public static String getProductPage() { return "http://www.demoshop24.com/index.php?route=product/product&product_id=43"; }

    @Given("^I am on Demoshop homepage$")
    public void iAmOnDemoshopHomepage() {
        driver.get(getDemoShopHomePage());
    }

    @When("^I click Featured product MacBook using PO$")
    public void iClickFeaturedProductMacBookUsingPO() {
        reviewPO.clickMacBookProduct();
    }

    @And("^click write a review using PO$")
    public void clickWriteAReview() {
        reviewPO.clickReviewLink();
    }

    @And("^I see MacBook review page using PO$")
    public void iSeeMacBookReviewPage() { reviewPO.MacBookReviewPage(); }

    @And("^I enter name and review using PO$")
    public void iEnterNameAndReviewUsingPO() {reviewPO.writeReview(); }

    @And("^select Rating option using PO$")
    public void selectRatingOption() { reviewPO.clickOption(); }

    @And("^click continue using PO$")
    public void clickContinue() { reviewPO.clickContinueReviewButton(); }

    @Then("^I get success message using PO$")
    public void iGetSuccessMessage() { reviewPO.iGetSuccessMessage(); }


//    @And("^I find Your review field using PO$")
//    public void iFindYourReviewFieldUsingPO() { reviewPO.findYourReviewField();
//    }
}



