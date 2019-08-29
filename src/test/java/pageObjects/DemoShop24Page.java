package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class DemoShop24Page extends Page {
    @FindBy(how = How.XPATH, using = "//*[@id=\"logo\"]/h1/a")
    public WebElement TestingDemoShop;
    @FindBy(how = How.XPATH, using = "/html/body/nav[@id='top']/div[@class='container']/div[@id='top-links']/ul[@class='list-inline']/li[3]/a[@id='wishlist-total']/span[@class='hidden-xs hidden-sm hidden-md']")
    public WebElement wishlist;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]")
    public WebElement MacBookHeart;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[2]")
    public WebElement iPhoneHeart;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[2]")
    public WebElement AppleCinema30Heart;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[4]/div/div[3]/button[2]")
    public WebElement CanonEOS5DHeart;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
    public WebElement LaptopsAndNotebooks;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
    public WebElement AllLaptopsAndNotebooks;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[3]/a")
    public WebElement Components;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[3]/div/a")
    public WebElement AllComponents;
    @FindBy(how = How.XPATH, using = "/html/body/div[@class='container'][1]/nav[@id='menu']/div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul[@class='nav navbar-nav']/li[4]/a")
    public WebElement Tablets;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")
    public WebElement MacBook;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[2]/div[1]/button[1]")
    public WebElement MacBookHeart2;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/h4/a")
    public WebElement iPhone;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")
    public WebElement iPhoneHeart2;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/h4/a")
    public WebElement AppleCinema30;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")
    public WebElement AppleCinema30Heart2;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[4]/div/div[2]/h4/a")
    public WebElement CanonEOS5D;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[2]/div[1]/button[1]")
    public WebElement CanonEOS5DHeart2;


    public DemoShop24Page(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnTestingDemoShop() {
        TestingDemoShop.click();
    }

    public void search() {
        driver.waitForElementPresent(wishlist);
    }

    public void assertWishlistVisibility() {
        search();
        assertTrue(wishlist.isDisplayed());
    }

    public void searchMacBookHeart() {
        driver.waitForElementPresent(MacBookHeart);
    }

    public void assertMacBookHeartVisibility() {
        searchMacBookHeart();
        assertTrue(MacBookHeart.isDisplayed());
    }

    public void searchiPhoneHeart() {
        driver.waitForElementPresent(iPhoneHeart);
    }

    public void assertiPhoneHeartVisibility() {
        searchiPhoneHeart();
        assertTrue(iPhoneHeart.isDisplayed());
    }

    public void searchAppleCinema30Heart() {
        driver.waitForElementPresent(AppleCinema30Heart);
    }

    public void assertAppleCinema30HeartVisibility() {
        searchAppleCinema30Heart();
        assertTrue(AppleCinema30Heart.isDisplayed());
    }

    public void searchCanonEOS5DHeart() {
        driver.waitForElementPresent(CanonEOS5DHeart);
    }

    public void assertCanonEOS5DHeartVisibility() {
        searchCanonEOS5DHeart();
        assertTrue(CanonEOS5DHeart.isDisplayed());
    }

    public void clickonAllLaptopsAndNotebooks() {
        //  driver.waitForElementPresent(LaptopsAndNotebooks);
        LaptopsAndNotebooks.click();
        AllLaptopsAndNotebooks.click();
    }

    public void clickonComponents() {
        Components.click();
        AllComponents.click();
    }

    public void clickonTablets() {
        Tablets.click();
    }

    public void clickonMacBook() {
        driver.waitForElementPresent(MacBook);
        MacBook.click();
    }

    public void assertMacBookHeart2Visibility() {
        driver.waitForElementPresent(MacBookHeart2);
        assertTrue(MacBookHeart2.isDisplayed());
    }

    public void clickoniPhone() {
        driver.waitForElementPresent(iPhone);
        iPhone.click();
    }

    public void assertiPhoneHeart2Visibility() {
        driver.waitForElementPresent(iPhoneHeart2);
        assertTrue(iPhoneHeart2.isDisplayed());
    }

    public void clickonAppleCinema30() {
        driver.waitForElementPresent(AppleCinema30);
        AppleCinema30.click();
    }

    public void assertiAppleCinema30Heart2Visibility() {
        driver.waitForElementPresent(AppleCinema30Heart2);
        assertTrue(AppleCinema30Heart2.isDisplayed());
    }

    public void clickonCanonEOS5D() {
        driver.waitForElementPresent(CanonEOS5D);
        CanonEOS5D.click();
    }

    public void assertCanonEOS5DHeart2Visibility() {
        driver.waitForElementPresent(CanonEOS5DHeart2);
        assertTrue(CanonEOS5DHeart2.isDisplayed());
    }


}

