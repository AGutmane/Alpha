package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomepageDemoshop extends Page {

    @FindBy(how = How.XPATH, using = "//*[@id=\"logo\"]/h1/a")
    public WebElement demoshoplogo;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]")
    public WebElement wishmacbook;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[2]")
    public WebElement wishiphone;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[2]")
    public WebElement wishcinema;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[4]/div/div[3]/button[2]")
    public WebElement wishcanon;
    @FindBy(how = How.XPATH, using = "/html/body/nav[@id='top']/div[@class='container']/div[@id='top-links']/ul[@class='list-inline']/li[3]/a[@id='wishlist-total']/span[@class='hidden-xs hidden-sm hidden-md']")
    public WebElement wishlist;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[8]/a")
    public WebElement mp3playersdropdown;

    @FindBy(how = How.XPATH, using = "/html/body/div[@class='container'][1]/nav[@id='menu']/div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul[@class='nav navbar-nav']/li[@class='dropdown'][4]/div[@class='dropdown-menu']/a[@class='see-all']")
    public WebElement mp3playerspage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[2]/button[2]")
    public WebElement ipodclassicwish;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[2]")
    public WebElement ipodnanowish;

    @FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[2]/a")
    public WebElement logindropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    public WebElement login;

    @FindBy(how = How.XPATH, using = "//*[@id=\"input-email\"]")
    public WebElement emailinput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"input-password\"]")
    public WebElement passinput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    public WebElement loginbutton;

    @FindBy(how = How.XPATH, using = "//table//td[contains(@class, 'text-left')]/a")
    private List<WebElement> resultThing;

    @FindBy(how = How.ID, using = "wishlist-total")
    public WebElement wishlistspan;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
    public WebElement phonepda;

    @FindBy(how = How.XPATH, using = "/html/body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[@class='row'][2]/div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][1]/div[@class='product-thumb']/div[2]/div[@class='button-group']/button[2]")
    public WebElement touchdwish;

    @FindBy(how = How.XPATH, using = "/html/body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[@class='row'][2]/div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][1]/div[@class='product-thumb']/div[2]/div[@class='button-group']/button[2]")
    public WebElement iphonewish;

    @FindBy(how = How.XPATH, using = "/html/body/div[@id='account-wishlist']/div[@class='row']/div[@id='content']/div[@class='table-responsive']/table[@class='table table-bordered table-hover']/tbody/tr[1]/td[@class='text-right'][3]/a[@class='btn btn-danger']")
    public WebElement removefirstwishlistitem;

    @FindBy(how = How.XPATH, using = "/html/body/div[@id='account-wishlist']/div[@class='row']/div[@id='content']/div[@class='table-responsive']/table[@class='table table-bordered table-hover']/tbody/tr[2]/td[@class='text-right'][3]/a[@class='btn btn-danger']")
    public WebElement removesecondwishlistitem;

    @FindBy(how = How.XPATH, using = "/html/body/div[@id='account-wishlist']/div[@class='row']/div[@id='content']/div[@class='table-responsive']/table[@class='table table-bordered table-hover']/tbody/tr[3]/td[@class='text-right'][3]/a[@class='btn btn-danger']")
    public WebElement removethirdwishlistitem;

    @FindBy(how = How.XPATH, using = "/html/body/div[@id='account-wishlist']/div[@class='row']/div[@id='content']/div[@class='table-responsive']/table[@class='table table-bordered table-hover']/tbody/tr[4]/td[@class='text-right'][3]/a[@class='btn btn-danger']")
    public WebElement removeforthwishlistitem;

    public List<WebElement> getResultThing() {
        return resultThing;
    }


    public HomepageDemoshop(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickMacbookWish() {
        //driver.waitForElementPresent(wishmacbook);
        wishmacbook.click();
        driver.waitForElementPresent(wishiphone);
        wishiphone.click();
    }

    public void clickMP3playersPage() {
        driver.waitForElementPresent(mp3playersdropdown);
        mp3playersdropdown.click();
        driver.waitForElementPresent(mp3playerspage);
        mp3playerspage.click();
    }

    public void clickMP3playerpageadd2items() {
        //driver.waitForElementPresent(ipodclassicwish);
        ipodclassicwish.click();
        //driver.waitForElementPresent(ipodnanowish);
        ipodnanowish.click();
    }

    public void clickGotowishlistpage() throws InterruptedException {
        Thread.sleep(1000);
        driver.waitForElementPresent(wishlist);
        wishlist.click();
    }


    public void clickloginpage() {
        driver.waitForElementPresent(logindropdown);
        logindropdown.click();
        driver.waitForElementPresent(login);
        login.click();
    }

    public void loginuser(String username, String password) {
        driver.waitForElementPresent(emailinput);
        emailinput.click();
        emailinput.sendKeys(username);
        passinput.click();
        passinput.sendKeys(password);
        loginbutton.click();
    }

    public void clickHomepagelogo() {
        driver.waitForElementPresent(demoshoplogo);
        demoshoplogo.click();
    }

    public String getwishlistspan() {
        driver.waitForElementPresent(wishlistspan);
        return wishlistspan.getText();
    }

    public void clickphonepda() {
        driver.waitForElementPresent(phonepda);
        phonepda.click();

    }

    public void clickiphonehtcwish() {
        driver.waitForElementPresent(touchdwish);
        touchdwish.click();
        driver.waitForElementPresent(iphonewish);
        iphonewish.click();

    }

    public void clickfeaturedIphoneWish() {
        driver.waitForElementPresent(wishiphone);
        wishiphone.click();
    }

    public void clickremovefirstwishlistitem() {
        driver.waitForElementPresent(removefirstwishlistitem);
        removefirstwishlistitem.click();

    }

    public void clickremovefirstwishlistitemall() {
        driver.waitForElementPresent(removefirstwishlistitem);
        removefirstwishlistitem.click();
        driver.waitForElementPresent(removefirstwishlistitem);
        removefirstwishlistitem.click();

    }
}