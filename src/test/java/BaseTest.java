import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.BrowserUtils;
import utils.LoggerUtils;

public abstract class BaseTest {

    Logger log = LoggerUtils.logger(this.getClass().getName());
    @BeforeTest
    protected void setUp(){
        BrowserUtils.maximizeWindow();}

    @AfterTest
    protected void tearDown(){
        BrowserUtils.quit();
    }
}
