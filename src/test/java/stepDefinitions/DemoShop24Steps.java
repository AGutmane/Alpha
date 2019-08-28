package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DemoShop24Page;

public class DemoShop24Steps extends GeneralSteps {

    private DemoShop24Page demoShop24Page = new DemoShop24Page(driver);

    public static String getDemoShop() {
        return "http://www.demoshop24.com/";
    }
    
    @Before
    public void openBrowser() {
        driver.openBrowser();
    }

    @After
    public void closeBrowser() {
        driver.close();
    }
    
    @Given("^application is launched using PO$")
    public void abc() {
        getDemoShop();
    }


    @Then("^i see wishlist icon using PO$")
    public void iSeeWishlistIconUsingPO() {
        demoShop24Page.assertWishlistVisibility ();
    }


    @When("^i navigate to page Laptops and Notebooks using PO$")
    public void iNavigateToPageLaptopsAndNotebooksUsingPO() {
    }
}