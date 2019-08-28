package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Page;
import pageObjects.ShopPagePO;

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
    }
}
