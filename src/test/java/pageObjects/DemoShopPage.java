package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

public class DemoShopPage extends Page {

    // Extract "Desktop" from navigation bar section
    @FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Desktops')]")
    public WebElement desktopNavigationBar;

    // Extract "Mac" category from "Desktop" dropdown menu
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Mac (1)')]")
    public WebElement macCategory;

    //Extract link to iMac product in the "Mac" category
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'iMac')]")
    public WebElement iMacProduct;

    //Extract title on the opened product page for "iMac"
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'iMac')]")
    public WebElement iMacTitle;

    /*
    ------------------------------------------------------------------------
     */

    //Extract "Laptops & Notebooks" from navigation bar section
    @FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Laptops & Notebooks')]")
    public WebElement laptopsNavigationBar;

    //Extract "Show All Laptops & Notebook" link from dropdown menu
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Show All Laptops & Notebooks')]")
    public WebElement showAllLaptops;

    //Extract link to "MacBook Pro" product in the Laptops category
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'MacBook Pro')]")
    public WebElement macBookProProduct;

    //Extract header of the "MacBook Pro" product from the product own page
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'MacBook Pro')]")
    public WebElement macBookProTitle;

    /*
    ------------------------------------------------------------------------
     */

    //Extract "Components" from navigation bar section
    @FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Components')]")
    public WebElement componentsNavigationBar;

    //Extract "Show all Components" link from dropdown menu
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Show All Components')]")
    public WebElement showAllComponents;

    //Extract link to "Monitors" subcategory
    @FindBy(how = How.XPATH, using = "//div[@class='col-sm-3']//a[contains(text(),'Monitors (2)')]")
    public WebElement showMonitors;

    //Extract "Apple Cinema" product link
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Apple Cinema 30\"')]")
    public WebElement appleCinemaProduct;

    //Extract header of "Apple Cinema" product on the product own page
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Apple Cinema 30\"')]")
    public WebElement appleCinemaTitle;

    /*
    ------------------------------------------------------------------------
     */

    //Extract "Tablets" from navigation bar
    @FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']//a[contains(text(),'Tablets')]")
    public WebElement tabletsNavigationBar;

    //Extract link to "Samsung Galaxy Tab" product
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Samsung Galaxy Tab 10.1')]")
    public WebElement samsungGalaxyTabProduct;

    //Extract header of "Samsung Galaxy Tab" product on the product own page
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Samsung Galaxy Tab 10.1')]")
    public WebElement samsungGalaxyTabTitle;

    /*
    ------------------------------------------------------------------------
     */

    //Extract "Cameras" from navigation bar
    @FindBy(how = How.XPATH, using = "//li[7]//a[1]")
    public WebElement camerasNavigationBar;

    //Extract link to "Canon EOS 5D" product
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Canon EOS 5D')]")
    public WebElement canonEOSProduct;

    //Extract header of "Canon EOS 5D" product on the product own page
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Canon EOS 5D')]")
    public WebElement canonEOSTitle;

    /*
    ------------------------------------------------------------------------
     */

    //Extract
    @FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'MP3 Players')]")
    public WebElement mp3NavigationBar;

    //Extract
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Show All MP3 Players')]")
    public WebElement showAllMP3;

    //Extract
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'iPod Classic')]")
    public WebElement iPodClassicProduct;

    //Extract
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'iPod Classic')]")
    public WebElement getiPodClassicTitle;

    /*
    ------------------------------------------------------------------------
     */

    public DemoShopPage(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /*
    Here we are testing that products has own product page from the "Desktop" category
     */
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

    public void didiMacPageOpens() {
        assertEquals((getiMacProductTitle()), iMacTitle.getText());
    }

    /*
    Here we are testing that products has own product page from the "Laptops & Notebooks" category
     */
    public void clickOnLaptopsNav() {
        laptopsNavigationBar.click();
    }

    public void clickOnShowAllLaptops() {
        showAllLaptops.click();
    }

    public String getMacBookProTitle() {
        return macBookProProduct.getText();
    }

    public void clickOnMacBookProProduct() {
        macBookProProduct.click();
    }

    public void didMacBookPageOpens() {
        assertEquals((getMacBookProTitle()), macBookProTitle.getText());
    }

    /*
    Here we are testing that products has own product page from the "Components" category
     */
    public void clickOnComponentsNav() {
        componentsNavigationBar.click();
    }

    public void clickOnShowAllComponents() {
        showAllComponents.click();
    }

    public void clickOnMonitorsGroup() {
        showMonitors.click();
    }

    public String getAppleCinemaTitle() {
        return appleCinemaProduct.getText();
    }

    public void clickOnAppleCinemaProduct() {
        appleCinemaProduct.click();
    }

    public void didAppleCinemaOpens() {
        assertEquals((getAppleCinemaTitle()), appleCinemaTitle.getText());
    }

    /*
    Here we are testing that products has own product page from the "Tablets" category
     */
    public void clickOnTabletsNav() {
        tabletsNavigationBar.click();
    }

    public void clickOnGalaxyTab() {
        samsungGalaxyTabProduct.click();
    }

    public String getGalaxyTabTitle() {
        return samsungGalaxyTabProduct.getText();
    }

    public void didGalaxyTabOpens() {
        assertEquals((getGalaxyTabTitle()), samsungGalaxyTabTitle.getText());
    }


    /*
    Here we are testing that products has own product page from the "Cameras" category
     */
    public void clickOnCamerasNav() {
        camerasNavigationBar.click();
    }

    public void clickOnCanonEOS() {
        canonEOSProduct.click();
    }

    public String getCanonEOSTitle() {
        return canonEOSProduct.getText();
    }

    public void didCanonEOSOpens() {
        assertEquals((getCanonEOSTitle()), canonEOSTitle.getText());
    }

    /*
    Here we are testing that products has own product page from the "MP3 Players" category
     */
    public void clickOnMP3Nav() {
        mp3NavigationBar.click();
    }
    public void clickOnShowAllMP3() {
        showAllMP3.click();
    }
    public void clickOniPodClassic() {
        iPodClassicProduct.click();
    }
    public String getiPodClassicTitle() {
        return iPodClassicProduct.getText();
    }
    public void didiPodClassicOpens() {
        assertEquals((getiPodClassicTitle()), getiPodClassicTitle.getText());
    }

}
