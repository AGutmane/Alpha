package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShopPagePO extends Page {

    // Find section "Desktops" from main menu 1st level
    @FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Desktops')]")
    public WebElement desktopsMainMenu;

    // Find section "Show All Desktops" from main menu 2nd level
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Show All Desktops')]")
    public WebElement allDesktops;

    //Find product "Apple Cinema 30" on product list page
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Apple Cinema 30\"')]")
    public WebElement appleCinemaDesktop;

    // Find section "Laptops & Notebooks" from main menu 1st level
    @FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Laptops & Notebooks')]")
    public WebElement laptopsMainMenu;

    // Find section "Show All Laptops & Notebooks" from main menu 2nd level
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Show All Laptops & Notebooks')]")
    public WebElement allLaptops;

    //Find product "HP LP3065" on product list page
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'HP LP3065')]")
    public WebElement hewlettPackardLaptop;

    // Find PRODUCT NAME on product page (for EACH PRODUCT)
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[1]/div[2]/h1")
    public WebElement productName;

    // Find "Description" tab on product page (for EACH PRODUCT!)
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Description')]")
    public WebElement productDescription;

    // Find "Specification" tab on product page (for EACH PRODUCT!)
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Specification')]")
    public WebElement productSpecification;

    // Find "Reviews" tab on product page (for EACH PRODUCT!)
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Reviews (0)')]")
    public WebElement productReviews;

    // Find "Available Options" menu on product page (for EACH PRODUCT!)
    @FindBy(how = How.ID, using = "product")
    public WebElement productAvailableOptions;

    // Find PRICE on product page (for Apple desktop)
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[1]/div[2]/ul[2]/li[2]/h2")
    public WebElement applePrice;

    // Find PRICE on product page (for HP laptop)
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
    public WebElement hpPrice;

    // Find product IMAGE on product page (for EACH PRODUCT!)
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[1]/ul[1]/li[1]/a/img")
    public WebElement productImage;

    // Find ADD TO CART BUTTON button on product page (for EACH PRODUCT!)
    @FindBy(how = How.ID, using = "button-cart")
    public WebElement addToCartButton;


    public ShopPagePO(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Clicking on Desktops section in main menu
    public void clickOnDesktopsSection() {
        desktopsMainMenu.click();
    }

    // Clicking on Show All Desktops main menu subsection
    public void clickOnAllDesktopsSubsection() {
        allDesktops.click();
    }

    // Clicking on "Apple Cinema" desktop in product list page
    public void clickOnAppleCinema() {
        appleCinemaDesktop.click();
    }

    // Clicking on Laptops & Notebooks section in main menu
    public void clickOnLaptopsSection() {
        laptopsMainMenu.click();
    }

    // Clicking on Show All Laptops & Notebooks main menu subsection
    public void clickOnAllLaptopsSubsection() {
        allLaptops.click();
    }

    // Clicking on "HP LP3065" laptop in product list page
    public void clickOnHpLaptop() {
        hewlettPackardLaptop.click();
    }

}
