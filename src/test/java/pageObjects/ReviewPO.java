package pageObjects;

import cucumber.api.PendingException;
import flowWorkers.WebDriverLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReviewPO extends Page {

    public ReviewPO(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

//    Find all page objects:

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")
    public WebElement macBookProduct;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[2]/div[3]/p/a[2]")
    public WebElement reviewLink;

    @FindBy(how = How.XPATH, using = "//*[@id=\"button-review\"]")
    public WebElement continueReviewButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"input-name\"]")
    public WebElement yourNameField;

    @FindBy(how = How.ID, using = "input-review")
    public WebElement yourReviewField;

    @FindBy(how = How.XPATH, using = "//body//div//div//div//form//input[2]")
    public WebElement ratingOption;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement successMessage;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-danger alert-dismissible']")
    public WebElement errorMessage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[1]/ul[2]/li[3]/a")
    public WebElement macBookReviewPage;

//    Write all page function:

    public void clickMacBookProduct() {
        macBookProduct.click();
    }

    public void clickReviewLink() {
        reviewLink.click();
    }

    public void clickContinueReviewButton() {
        continueReviewButton.click();
    }

    public void writeReview() {
        String name = "Janis";
        String review = "I recently bought this MacBook and I am very satisfied with this purchase.";
        driver.waitForElementPresent(yourNameField);
        yourNameField.sendKeys(name);
        driver.waitForElementPresent(yourReviewField);
        yourReviewField.sendKeys(review);
    }

    public void clickOption() {
        ratingOption.click();
    }

    public String returnTextA() {
        return successMessage.getText();
    }

    public void iGetSuccessMessage() {
        driver.waitForElementPresent(successMessage);
        assertEquals("Thank you for your review. It has been submitted to the webmaster for approval.", returnTextA()); }

    public void isDisplayedErrorMessage() { errorMessage.isDisplayed(); }

    public void MacBookReviewPage() {
        driver.waitForElementPresent(macBookReviewPage);
        assertTrue(macBookReviewPage.isDisplayed()); }

}
