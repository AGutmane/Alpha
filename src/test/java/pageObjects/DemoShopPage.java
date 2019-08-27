package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class DemoShopPage extends Page{

    // Extract "Desktop" from navigation bar section
    @FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Desktops')]")
    private WebElement desktopNavigationBar;

    // Extract "Mac" category from "Desktop" dropdown menu
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Mac (1)')]")
    private WebElement macCategory;

    //Extract link to iMac product in the "Mac" category
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'iMac')]")
    private WebElement iMacProduct;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'iMac')]")
    private WebElement iMacTitle;

    public DemoShopPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnDesktopNav() {
        desktopNavigationBar.click();
    }

    public void clickOnMacCategory() {
        macCategory.click();
    }

    public void clickOniMacProduct() {
        iMacProduct.click();
    }

    private String getiMacProductTitle() {
        return iMacProduct.getText();
    }

    public void didPageOpen() {
        assertEquals((getiMacProductTitle()), (iMacTitle.getText()));
    }

}
