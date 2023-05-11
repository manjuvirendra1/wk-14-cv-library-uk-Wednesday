package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public void verifyTheResult(String excepted) {
        String actualText = getTextFromElement(resultText);
        String expectedText = excepted;
        Assert.assertEquals(actualText, expectedText, "Verify Results Title");
        Reporter.log("Verify result title" + resultText.toString() + "<br>");
        CustomListeners.test.log(Status.PASS,"Verify results");
    }

}
