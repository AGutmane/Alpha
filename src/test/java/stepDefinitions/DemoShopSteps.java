package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DemoShopPage;


public class DemoShopSteps extends GeneralSteps {
    private DemoShopPage demoShopPage = new DemoShopPage(driver);

    public static String getDemoShopPageUrl() {
        return "http://www.demoshop24.com/";
    }

    @Given("^I am on demoshop homepage$")
    public void iAmOnDemoShopPage() throws Throwable {
        driver.get(getDemoShopPageUrl());
    }

    @When("^I click on the Desktops category in the web page navigation bar using PO$")
    public void iClickOnTheDesktopsCategoryInTheWebPageNavigationBarUsingPO() {
        demoShopPage.clickOnDesktopNav();
    }

    @And("^I click on Mac link in the dropdown menu using PO$")
    public void iClickOnMacLinkInTheDropdownMenuUsingPO() {
        demoShopPage.clickOnMacCategory();
    }

    @Then("^I click on iMac product item that appeared in the category using PO$")
    public void iClickOnIMacProductItemThatAppearedInTheCategoryUsingPO() {
        demoShopPage.clickOniMacProduct();
    }

    @And("^iMac product is opened on the own page using PO$")
    public void selectedProductIsOpenedOnTheOwnPageUsingPO() {
        demoShopPage.didiMacPageOpens();
    }

    @When("^I click on the Laptops and Notebooks category in the web page navigation bar using PO$")
    public void iClickOnTheLaptopsAndNotebooksCategoryInTheWebPageNavigationBarUsingPO() {
        demoShopPage.clickOnLaptopsNav();
    }

    @And("^I click on Show All Laptops and Notebooks link in the dropdown menu using PO$")
    public void iClickOnShowAllLaptopsAndNotebooksLinkInTheDropdownMenuUsingPO() {
        demoShopPage.clickOnShowAllLaptops();
    }

    @Then("^I click on MacBook Pro product item using PO$")
    public void iClickOnMacBookProProductItem() {
        demoShopPage.clickOnMacBookProProduct();
    }

    @And("^MacBook Pro product is opened on the own page using PO$")
    public void macbookProProductIsOpenedOnTheOwnPageUsingPO() {
        demoShopPage.didMacBookPageOpens();
    }

    @When("^I click on the Components category in the web page navigation bar using PO$")
    public void iClickOnTheComponentsCategoryInTheWebPageNavigationBarUsingPO() {
        demoShopPage.clickOnComponentsNav();
    }

    @And("^I click on Show All Components link in the dropdown menu using PO$")
    public void iClickOnShowAllComponentsLinkInTheDropdownMenuUsingPO() {
        demoShopPage.clickOnShowAllComponents();
    }

    @Then("^I click on Monitors subcategory using PO$")
    public void iClickOnMonitorsSubcategoryUsingPO() {
        demoShopPage.clickOnMonitorsGroup();
    }

    @And("^I click on Apple Cinema product using PO$")
    public void iClickOnAppleCinemaProductUsingPO() {
        demoShopPage.clickOnAppleCinemaProduct();
    }

    @Then("^Apple Cinema product is opened on the own page using PO$")
    public void appleCinemaProductIsOpenedOnTheOwnPageUsingPO() {
        demoShopPage.didAppleCinemaOpens();
    }

    @When("^I click on the Tablets category in the web page navigation bar using PO$")
    public void iClickOnTheTabletsCategoryInTheWebPageNavigationBarUsingPO() {
        demoShopPage.clickOnTabletsNav();
    }

    @And("^I click on Samsung Galaxy Tab product item using PO$")
    public void iClickOnSamsungGalaxyTabProductItemUsingPO() {
        demoShopPage.clickOnGalaxyTab();
    }

    @Then("^Samsung Galaxy Tab product is opened on the own page using PO$")
    public void samsungGalaxyTabProductIsOpenedOnTheOwnPageUsingPO() {
        demoShopPage.didGalaxyTabOpens();
    }

    @When("^I click on the Phones and PDAs category in the web page navigation bar using PO$")
    public void iClickOnThePhonesAndPDAsCategoryInTheWebPageNavigationBarUsingPO() {
        demoShopPage.clickOnCamerasNav();
    }

    @And("^I click on HTC Touch HD product item using PO$")
    public void iClickOnHTCTouchHDProductItemUsingPO() {
        demoShopPage.clickOnCanonEOS();
    }

    @Then("^HTC Touch HD product is opened on the own page using PO$")
    public void htcTouchHDProductIsOpenedOnTheOwnPageUsingPO() {
        demoShopPage.didCanonEOSOpens();
    }

    @When("^I click on the Players category in the web page navigation bar using PO$")
    public void iClickOnThePlayersCategoryInTheWebPageNavigationBarUsingPO() {
        demoShopPage.clickOnMP3Nav();
    }

    @And("^I click on Show All Players link in the dropdown menu using PO$")
    public void iClickOnShowAllPlayersLinkInTheDropdownMenuUsingPO() {
        demoShopPage.clickOnShowAllMP3();
    }

    @And("^I click on iPod Classic product using PO$")
    public void iClickOnIPodClassicProductUsingPO() {
        demoShopPage.clickOniPodClassic();
    }

    @Then("^iPod Classic product is opened on the own page using PO$")
    public void ipodClassicProductIsOpenedOnTheOwnPageUsingPO() {
        demoShopPage.didiPodClassicOpens();
    }
}
