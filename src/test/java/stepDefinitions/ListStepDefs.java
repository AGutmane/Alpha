package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObjects.ShopPagePO;

import static org.junit.Assert.assertTrue;

public class ListStepDefs extends GeneralSteps {
    private ShopPagePO shopPagePO = new ShopPagePO(driver);

    public static String getShopPagePOUrl() {

        return "http://www.demoshop24.com/";
    }

    // Scenario: Add first product to Compare list

    @And("^click on Compare this Product button using PO$")
    public void clickOnCompareThisProductButtonUsingPO() {
        shopPagePO.clickOnCompareButton();
    }

    @And("^I see Success message using PO$")
    public void iSeeSuccessMessageUsingPO() {
        assertTrue(shopPagePO.successComparisonMessage.isDisplayed());
    }

    @And("^I click on Product comparison link using PO$")
    public void iClickOnProductComparisonLinkUsingPO() {
        shopPagePO.clickOnProductComparisonLink();
    }

    @Then("^I see Apple Cinema in Product Comparison page using PO$")
    public void iSeeAppleCinemaInProductComparisonPageUsingPO() {
        assertTrue(shopPagePO.comparedAppleCinema.isDisplayed());
    }

    @And("^I see HP in Product Comparison page using PO$")
    public void iSeeHpInProductComparisonPageUsingPO() {
        assertTrue(shopPagePO.comparedHpProduct.isDisplayed());
    }

}
