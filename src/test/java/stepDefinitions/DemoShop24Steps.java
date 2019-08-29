package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DemoShop24Page;

public class DemoShop24Steps extends GeneralSteps {

    private DemoShop24Page demoShop24Page = new DemoShop24Page(driver);

    public static String getDemoShop() {
        return "http://www.demoshop24.com";
    }

    //  @Before
    // public void openBrowser() {
    //  driver.openBrowser();
//   }

    //  @After
    // public void closeBrowser() {
    //   driver.close();
    // }

    @Given("^application is launched using PO$")
    public void applicationLaunch() throws Throwable {
        driver.get(getDemoShop());

    }


    @Then("^i see wishlist icon using PO$")
    public void iSeeWishlistIconUsingPO() {
        demoShop24Page.assertWishlistVisibility();
    }


    @When("^i navigate to page Laptops and Notebooks using PO$")
    public void iNavigateToPageLaptopsAndNotebooksUsingPO() {
        demoShop24Page.clickonAllLaptopsAndNotebooks();
    }


    @When("^i navigate to page Components using PO$")
    public void iNavigateToPageComponentsUsingPO() {
        demoShop24Page.clickonComponents();
    }


    @When("^i navigate to page Tablets using PO$")
    public void iNavigateToPageTabletsUsingPO() {
        demoShop24Page.clickonTablets();
    }


    @Then("^i se heart icon next to each item MacBook, iPhone, Apple Cinema30, CanonEOS5D using PO$")
    public void iSeeHeartIconsAtMainPage() {
        demoShop24Page.assertMacBookHeartVisibility();
        demoShop24Page.assertiPhoneHeartVisibility();
        demoShop24Page.assertAppleCinema30HeartVisibility();
        demoShop24Page.assertCanonEOS5DHeartVisibility();
    }

    @When("^i navigate to MacBook product page using PO$")
    public void navigateMacBook() {
        demoShop24Page.clickonMacBook();
    }

    @Then("^i se heart icon next to MacBook item using PO$")
    public void iSeeHeartIconMacBook() {
        demoShop24Page.assertMacBookHeart2Visibility();
    }

    @And("^i navigate back to homepage using PO$")
    public void backToHomepage() {
        demoShop24Page.clickOnTestingDemoShop();
    }

    @When("^i navigate to iPhone product page using PO$")
    public void navigateiPhone() {
        demoShop24Page.clickoniPhone();
    }

    @Then("^i se heart icon next to iPhone item using PO$")
    public void iSeeHeartIconiPhone() {
        demoShop24Page.assertiPhoneHeart2Visibility();
    }

    @When("^i navigate to AppleCinema30 product page using PO$")
    public void navigateAppleCinema30() {
        demoShop24Page.clickonAppleCinema30();
    }

    @Then("^i se heart icon next to AppleCinema30 item using PO$")
    public void iSeeHeartIconAppleCinema30() {
        demoShop24Page.assertiAppleCinema30Heart2Visibility();
    }

    @When("^i navigate to CanonEOS5D product page using PO$")
    public void navigateCanonEOS5D() {
        demoShop24Page.clickonCanonEOS5D();
    }

    @Then("^i se heart icon next to CanonEOS5D item using PO$")
    public void iSeeHeartIconCanonEOS5D() {
        demoShop24Page.assertCanonEOS5DHeart2Visibility();
    }
}