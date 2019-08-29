package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.*;

public class DemoShopCartPage extends Page {

    private DemoShopPage demoShopPage = new DemoShopPage(driver);

    //Extract "Add to Cart" button in the Laptops & Notebooks section
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[2]/button[1]")
    public WebElement addToCartMacBookPro;

    //Extract "Shopping Cart" button that is located in the webpage top right corner
    @FindBy(how = How.XPATH, using = "//nav[@id='top']//li[4]//a[1]")
    public WebElement shoppingCartButton;

    //Extract name of the selected product from the shopping cart table
    @FindBy(how = How.XPATH, using = "//table[@class='table table-bordered']//a[contains(text(),'MacBook Pro')]")
    public WebElement productNameInTheCart;

    //
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Samsung SyncMaster 941BW')]")
    public WebElement syncMasterProduct;

    //
    @FindBy(how = How.XPATH, using = "//button[@id='button-cart']")
    public WebElement addToCartFromOwnPage;

    //
    @FindBy(how = How.XPATH, using = "//table[@class='table table-bordered']//a[contains(text(),'Samsung SyncMaster 941BW')]")
    public WebElement getSyncMasterTitleFromCart;

    public DemoShopCartPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addItemToCart() {
        addToCartMacBookPro.click();
    }

    public void clickOnCart() {
        shoppingCartButton.click();
    }

    public String getSelectedProductName() {
        return productNameInTheCart.getText();
    }

    public void checkProductInCart() {
        String macBookProTitle = "MacBook Pro";
        assertEquals(macBookProTitle, getSelectedProductName());
    }

    public void chooseSyncMaster() {
        syncMasterProduct.click();
    }

    public void addToCartFromOwnPage() {
        addToCartFromOwnPage.click();
    }

    public String getSyncMasterTitleFromCart() {
        return getSyncMasterTitleFromCart.getText();
    }

    public void syncMasterAddedToCart() {
        assertEquals("Samsung SyncMaster 941BW", getSyncMasterTitleFromCart());
    }

}
