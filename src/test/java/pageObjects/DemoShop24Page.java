package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

public class DemoShop24Page extends Page {
    @FindBy(how = How.XPATH, using = "/html/body/nav[@id='top']/div[@class='container']/div[@id='top-links']/ul[@class='list-inline']/li[3]/a[@id='wishlist-total']/span[@class='hidden-xs hidden-sm hidden-md']")
    public WebElement wishlist;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
    public WebElement LaptopsAndNotebooks;
    @FindBy(how = How.XPATH, using = "/html/body/div[@class='container'][1]/nav[@id='menu']/div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul[@class='nav navbar-nav']/li[@class='dropdown'][3]/div[@class='dropdown-menu']/a[@class='see-all']")
    public WebElement Components;
    @FindBy(how = How.XPATH, using = "/html/body/div[@class='container'][1]/nav[@id='menu']/div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul[@class='nav navbar-nav']/li[4]/a")
    public WebElement Tablets;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")
    public WebElement MacBook;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/h4/a")
    public WebElement iPhone;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/h4/a")
    public WebElement AppleCinema30;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[4]/div/div[2]/h4/a")
    public WebElement CanonEOS5D;





    public DemoShop24Page(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search() {
        driver.waitForElementPresent(wishlist);
    }

    public void assertWishlistVisibility() {
        search();
        assertTrue(wishlist.isDisplayed());
    }

    public void clickonLaptopsAndNotebooks() {
      //  driver.waitForElementPresent(LaptopsAndNotebooks);
        LaptopsAndNotebooks.click();
    }

    public void clickonComponents() {
        Components.click();
    }

    public void clickonTablets() {
        Tablets.click();
    }

    public void clickonMacBook() {
        MacBook.click();
    }

    public void clickoniPhone() {
        iPhone.click();
    }

    public void clickonAppleCinema30() {
        AppleCinema30.click();
    }

    public void clickonCanonEOS5D() {
        CanonEOS5D.click();
    }


}

