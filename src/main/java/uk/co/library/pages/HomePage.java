package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utilities.Utility;


public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement LocationField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;



    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter job title " + jobTitleField.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter job title" + jobTitle);
        sendTextToElement(jobTitleField, jobTitle);
    }

    public void enterLocation(String Location) {
        Reporter.log("Enter Location " + LocationField.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter LocationField" + Location);
        sendTextToElement(LocationField, Location);
    }

    public void selectDistance(String Distance) {
        Reporter.log("Enter Distance " + distanceDropDown.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter LocationField" + Distance);
        selectByVisibleTextFromDropDown(distanceDropDown, Distance);
    }

    public void MoreSearchOptionLink() {
        Reporter.log("Click on more Option Link " + moreSearchOptionsLink.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Click on moreSearchOption");
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter Min Salary " + salaryMin.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter MinSalary" + minSalary);
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter Max Salary " + salaryMax.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter MaxSalary" + maxSalary);
        sendTextToElement(salaryMax, maxSalary);
    }

    public void salaryTypeDropDownLink(String Salary) {
        Reporter.log("Click on Salary TypeDropDown Link " + salaryTypeDropDown.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Click on salary type dropdown" + Salary);
        selectByVisibleTextFromDropDown(salaryTypeDropDown, Salary);
    }

    public void jobTypeDropDownLink(String jobType) {
        Reporter.log("Click on job TypeDropDown Link " + jobTypeDropDown.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Click on job type dropdown" + jobType);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }

    public void findJobsButton() {
        Reporter.log("Click on find Jobs Button " + findJobsBtn.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Click on find jobs Button");
        clickOnElement(findJobsBtn);
    }
    public void acceptCookies(){
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }

}
