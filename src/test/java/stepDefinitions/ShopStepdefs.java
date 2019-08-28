package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Page;
import pageObjects.ShopPagePO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopStepdefs extends GeneralSteps {
    private ShopPagePO shopPagePO = new ShopPagePO(driver);

    public static String getShopPagePOUrl() {
        return "http://www.demoshop24.com/";
    }

    @Given("^I am on demoshop24 homepage$")
    public void iAmOnDemoshopPage() throws Throwable {
        driver.get(getShopPagePOUrl());
    }

    @When("^I navigate to Desktops category on menu using PO$")
    public void iNavigateToDesktopsCategoryOnMenuUsingPO() {
        shopPagePO.clickOnDesktopsSection();
    }

    @And("^click on Show All Desktops using PO$")
    public void clickOnShowAllDesktopsUsingPO() {
        shopPagePO.clickOnAllDesktopsSubsection();
    }

    @And("^click on Apple Cinema on product list page using PO$")
    public void clickOnAppleCinemaOnProductListPageUsingPO() {
        shopPagePO.clickOnAppleCinema();
    }

    @Then("^product name is displayed using PO$")
    public void productNameIsDisplayedUsingPO() {
        assertTrue(shopPagePO.productName.isDisplayed());

    }
    @And("^description tab is displayed using PO$")
    public void descriptionTabIsDisplayedUsingPO() {
        assertTrue(shopPagePO.productDescription.isDisplayed());
    }

    @And("^Specification tab is displayed using PO$")
    public void specificationTabIsDisplayedUsingPO() {
        assertTrue(shopPagePO.productSpecification.isDisplayed());
    }

    @And("^Review tab is displayed using PO$")
    public void reviewTabIsDisplayedUsingPO() {
        assertTrue(shopPagePO.productReviews.isDisplayed());
    }

    @And("^Available option menu is displayed using PO$")
    public void availableOptionMenuIsDisplayedUsingPO() {
        assertTrue(shopPagePO.productAvailableOptions.isDisplayed());
    }

    @And("^price is displayed using PO$")
    public void priceIsDisplayedUsingPO() {
        assertTrue(shopPagePO.applePrice.isDisplayed());
    }

    @And("^image is displayed using PO$")
    public void imageIsDisplayedUsingPO() {
        assertTrue(shopPagePO.productImage.isDisplayed());
    }

    // Scenario 2

    @When("^I navigate to Laptops category on menu using PO$")
    public void iNavigateToLaptopsCategoryOnMenuUsingPO() {
        shopPagePO.clickOnLaptopsSection();
    }

    @And("^click on Show All Laptops using PO$")
    public void clickOnShowAllLaptopsUsingPO() {
        shopPagePO.clickOnAllLaptopsSubsection();
    }

    @And("^click on HP in product list page using PO$")
    public void clickOnHpInProductListPageUsingPO() {
        shopPagePO.clickOnHpLaptop();
    }

    @Then("^another product name is displayed using PO$")
    public void anotherProductNameIsDisplayedUsingPO() {
        assertTrue(shopPagePO.productName.isDisplayed());
    }

    @And("^another price is displayed using PO$")
    public void anotherPriceIsDisplayedUsingPO() {
        assertTrue(shopPagePO.hpPrice.isDisplayed());
    }

}
