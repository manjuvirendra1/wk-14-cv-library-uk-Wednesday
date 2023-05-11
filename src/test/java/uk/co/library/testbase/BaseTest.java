package uk.co.library.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utilities.Utility;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser"); //"Chrome"
    @BeforeMethod(alwaysRun = true)

    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod

    public void tearDown(){
        closeBrowser();
    }
}
