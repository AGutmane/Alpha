package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.DemoShopPage;
import pageObjects.MainPage;
import static org.junit.Assert.*;


public class DemoShopSteps extends GeneralSteps {
    private DemoShopPage demoShopPage = new DemoShopPage(driver);

    /*protected WebDriverLib driver;

    public DemoShopSteps() { this.driver = new WebDriverLib(); }
*/

    public static String getDemoShopPageUrl() {
        return "http://www.demoshop24.com/";
    }

    @Given("^I am on demoshop24 homepage$")
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

    @And("^Selected product is opened on the own page using PO$")
    public void selectedProductIsOpenedOnTheOwnPageUsingPO() {
        demoShopPage.didPageOpen();
    }
}
