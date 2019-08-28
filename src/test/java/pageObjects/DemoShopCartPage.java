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

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'MacBook Pro')]")
    public WebElement macBookProProduct;

    //Extract "Add to Cart" button in the Laptops & Notebooks section
    //@FindBy(how = How.XPATH, using = "//body//div[@class='row']//div[@class='row']//div[4]//div[1]//div[2]//div[2]//button[1]")
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[2]/button[1]")
    public WebElement addToCartMacBookPro;

    //Extract "Shopping Cart" button that is located in the webpage top right corner
    //@FindBy(how = How.CLASS_NAME, using = "btn-lg")
    //@FindBy(how = How.XPATH, using = "//div[@id='cart']") <---- works!
    @FindBy(how = How.XPATH, using = "//nav[@id='top']//li[4]//a[1]")
    public WebElement shoppingCartButton;

/*
    //Extract "View Cart" link that appears in the dropdown menu after click on the "Shopping Cart" button
    @FindBy(how = How.XPATH, using = "//body//div[@id='cart']//div//a[1]")
    public WebElement viewCartLink;
*/

    //Extract name of the selected product from the shopping cart table
    @FindBy(how = How.XPATH, using = "//table[@class='table table-bordered']//a[contains(text(),'MacBook Pro')]")
    public WebElement productNameInTheCart;

    //Extract the selected product quantity from the "Shopping cart" table
    @FindBy(how = How.XPATH, using = "//input[@name='quantity[1032]']")
    public WebElement productQuantityInCart;

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

/*
    public void clickViewCartLink() {
        viewCartLink.click();
    }
*/

    public String getSelectedProductName() {
        return productNameInTheCart.getText();
    }

    public String returnMacBookTitle() {
        return macBookProProduct.getText();
    }

    public void checkProductInCart() {
        //String x = "MacBook Pro";
        assertEquals(returnMacBookTitle(), getSelectedProductName());
    }

    public void checkItemsQuantity() {
        assertEquals(productQuantityInCart.getText(), "1");
    }

}
