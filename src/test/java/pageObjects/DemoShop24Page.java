package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class DemoShop24Page extends Page {
    @FindBy(how = How.CLASS_NAME, using = "hidden-xs hidden-sm hidden-md")
    public WebElement wishlist;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")
    public WebElement MacBook;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/h4/a")
    public WebElement iPhone;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/h4/a")
    public WebElement AppleCinema30;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[4]/div/div[2]/h4/a")
    public WebElement CanonEOS5D;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
    public WebElement LaptopsAndNotebooks;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[3]/div/a")
    public WebElement Components;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[4]/a")
    public WebElement Tablets;



    public DemoShop24Page(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search() {
        driver.waitForElementPresent(wishlist);
    }

    public void assertWishlistVisibility () {
        search();
        assertTrue(wishlist.isDisplayed());
    }

    public void clickonMacBook() {
        MacBook.click();
        search();
    }

    public void clickoniPhone() {
        iPhone.click();
        search();
    }

    public void clickonAppleCinema30() {
        AppleCinema30.click();
        search();
    }

    public void clickonCanonEOS5D() {
        CanonEOS5D.click();
        search();
    }

    

}

