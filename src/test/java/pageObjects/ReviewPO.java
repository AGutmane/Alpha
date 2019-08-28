package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReviewPO extends Page {

    public ReviewPO(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

//    Find all page objects:

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]")
    public WebElement macBookProduct;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[2]/div[3]/p/a[2]")
    public WebElement reviewLink;

    @FindBy(how = How.ID, using = "button-review")
    public WebElement continueReviewButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"input-name\"]")
    public WebElement yourNameField;

    @FindBy(how = How.ID, using = "input-review")
    public WebElement yourReviewField;

    @FindBy(how = How.NAME, using = "rating")
    public List<WebElement> ratingOption;

//    Write all page function/methodss:

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
        yourNameField.sendKeys(name);
        yourReviewField.sendKeys(review);
        ratingOption.get(3).click();


    }







}
