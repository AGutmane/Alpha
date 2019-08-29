package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

    //
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Apple Cinema 30\"')]")
    public WebElement appleCinemaLink;

    //
/*
    @FindBy(how = How.CLASS_NAME, using = "radio")
    public List<WebElement> radioButtons;
*/
    @FindBy(how = How.XPATH, using = "//div[@id='input-option218']//div[1]//label[1]")
    public WebElement radioButtons;
    //
/*
    @FindBy(how = How.CLASS_NAME, using = "checkbox")
    public List<WebElement> checkBoxes;
*/
    @FindBy(how = How.XPATH, using = "//div[@id='input-option223']//div[1]//label[1]")
    public WebElement checkBoxes;

    //
    @FindBy(how = How.ID, using = "input-option208")
    public WebElement inputTextField;

    //
    @FindBy(id="input-option217")
    public WebElement Select;

    //
    @FindBy(how = How.ID, using = "input-option209")
    public WebElement textArea;

    //
    @FindBy(how = How.XPATH, using = "//table[@class='table table-bordered']//a[contains(text(),'Apple Cinema 30\"')]")
    public WebElement getAppleCinemaTitleFromOwnCart;

    public DemoShopCartPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addItemToCart() {
        driver.waitForElementPresent(addToCartMacBookPro);
        addToCartMacBookPro.click();
    }

    public void clickOnCart() {
        driver.waitForElementPresent(shoppingCartButton);
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
        driver.waitForElementPresent(syncMasterProduct);
        syncMasterProduct.click();
    }

    public void addToCartFromOwnPage() throws InterruptedException {
        Thread.sleep(10000);
        driver.waitForElementPresent(addToCartFromOwnPage);
        addToCartFromOwnPage.click();
    }

    public String getSyncMasterTitleFromCart() {
        return getSyncMasterTitleFromCart.getText();
    }

    public void syncMasterAddedToCart() {
        assertEquals("Samsung SyncMaster 941BW", getSyncMasterTitleFromCart());
    }

    public void clickAppleCinema() {
        driver.waitForElementPresent(appleCinemaLink);
        appleCinemaLink.click();
    }

    public void chooseRadioButton() {
        //radioButtons.get(1).click();
        radioButtons.click();
    }

    public void chooseAllCheckBoxes() {
/*
        for (int i = 0; i < checkBoxes.size(); i++) {
            checkBoxes.get(i).click();
        }
*/
        checkBoxes.click();
    }

    public void enterTextToInput () {
        driver.waitForElementPresent(inputTextField);
        inputTextField.clear();
        inputTextField.sendKeys("Jevgenijs Fjodorovs");
    }

    public void selectItem () {
        Select dropdown = new Select(Select);
        dropdown.getOptions().get(1).click();
    }

    public void fillTextArea() {
        driver.waitForElementPresent(textArea);
        textArea.sendKeys("Text Text Text");
    }

    public void chooseFile() {
        driver.changeElementAttributeValue("input-option222", "value", "fed518332d8c44704c341ec47d57aee49b205ac9");
    }

    public String getAppleCinemaTitleFromOwnCart() {
        return getAppleCinemaTitleFromOwnCart.getText();
    }

    public void AppleCinemaAddedToCart() {
        assertEquals("Apple Cinema 30\"", getAppleCinemaTitleFromOwnCart());
    }

}
