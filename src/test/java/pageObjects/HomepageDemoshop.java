package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.Keys;
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
    @FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[3]")
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

    public void clickGotowishlistpage() {
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
}
