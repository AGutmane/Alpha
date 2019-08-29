package stepDefinitions;

import pageObjects.DemoShopCartPage;
import pageObjects.DemoShopPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.MainPage;
import static org.junit.Assert.*;

public class DemoShopCartSteps extends GeneralSteps {
    private DemoShopCartPage demoShopCartPage = new DemoShopCartPage(driver);
    private DemoShopPage demoShopPage = new DemoShopPage(driver);

    public static String getDemoShopPageUrl() {
        return "http://www.demoshop24.com/";
    }

    @Given("^I am on demoshop24 homepage to test Shopping Cart$")
    public void iAmOnDemoShopPage() throws Throwable {
        driver.get(getDemoShopPageUrl());
    }

/*
    Scenario 1
*/

    @When("^Customer clicks on the Laptops and Notebooks category in the web page navigation bar using PO$")
    public void customerClickOnTheLaptopsAndNotebooksCategoryInTheWebPageNavigationBarUsingPO() {
        demoShopPage.clickOnLaptopsNav();
    }

    @And("^Customer clicks on Show All Laptops and Notebooks link in the dropdown menu using PO$")
    public void customerClicksOnShowAllLaptopsAndNotebooksLinkInTheDropdownMenuUsingPO() {
        demoShopPage.clickOnShowAllLaptops();
    }

    @Then("^Customer clicks on ADD TO CART button for MacBook Pro product using PO$")
    public void customerClicksOnADDTOCARTButtonForMacBookProProductUsingPO() {
        demoShopCartPage.addItemToCart();
    }

    @And("^Customer clicks on the Shopping Cart button in the web page header using PO$")
    public void customerClicksOnTheShoppingCartButtonInTheWebpageTopRightCorner() {
        demoShopCartPage.clickOnCart();
    }

    @Then("^Selected product is successfully added to Shopping Cart with correct items quantity using PO$")
    public void selectedProductIsSuccessfullyAddedToShoppingCartWithCorrectItemsQuantity() {
        demoShopCartPage.checkProductInCart();
        //demoShopCartPage.checkItemsQuantity();
    }

/*
    Scenario 2
*/

    @When("^Customer clicks on the Components category in the web page navigation bar using PO$")
    public void customerClicksOnTheComponentsCategoryInTheWebPageNavigationBarUsingPO() {
        demoShopPage.clickOnComponentsNav();
    }

    @And("^Customer clicks on Show All Components and Notebooks link in the dropdown menu using PO$")
    public void customerClicksOnShowAllComponentsAndNotebooksLinkInTheDropdownMenuUsingPO() {
        demoShopPage.clickOnShowAllComponents();
    }

    @Then("^Customer clicks on the Monitors subcategory using PO$")
    public void customerClicksOnTheMonitorsSubcategory() {
        demoShopPage.clickOnMonitorsGroup();
    }

    @And("^Customer choose Samsung SyncMaster BW product using PO$")
    public void customerChooseSamsungSyncMasterBWProduct() {
        demoShopCartPage.chooseSyncMaster();
    }

    @Then("^Customer clicks on ADD TO CART button for Samsung SyncMaster BW in the product own page using PO$")
    public void customerClicksOnADDTOCARTButtonForSamsungSyncMasterBWInTheProductOwnPageUsingPO() throws InterruptedException {
        demoShopCartPage.addToCartFromOwnPage();
    }

    @Then("^Selected product is successfully added to Shopping Cart from own page using PO$")
    public void selectedProductIsSuccessfullyAddedToShoppingCartFromOwnPageUsingPO() {
        demoShopCartPage.syncMasterAddedToCart();
    }

    @And("^Customer choose Apple Cinema product using PO$")
    public void customerChooseAppleCinemaProductUsingPO() {
        demoShopCartPage.clickAppleCinema();
    }

    @Then("^Customer fills and necessary additional options using PO$")
    public void customerFillsAndNecessaryAdditionalOptions() {
        demoShopCartPage.chooseRadioButton();
        demoShopCartPage.chooseAllCheckBoxes();
        demoShopCartPage.enterTextToInput();
        demoShopCartPage.selectItem();
        demoShopCartPage.fillTextArea();
        demoShopCartPage.chooseFile();
    }

    @And("^Customer clicks on ADD TO CART button for Apple Cinema in the product own page using PO$")
    public void customerClicksOnADDTOCARTButtonForAppleCinemaInTheProductOwnPageUsingPO() throws InterruptedException {
        demoShopCartPage.addToCartFromOwnPage();
    }

    @Then("^Apple Cinema is successfully added to Shopping Cart from own page using PO$")
    public void appleCinemaIsSuccessfullyAddedToShoppingCartFromOwnPageUsingPO() {
        demoShopCartPage.AppleCinemaAddedToCart();
    }
}
