package pageObjects;

import flowWorkers.WebDriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ReviewPO extends Page {

    public ReviewPO(WebDriverLib driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

//
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]")
    public WebElement Product;


}
