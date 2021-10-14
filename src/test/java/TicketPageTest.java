import base.BrowserProperties;
import org.testng.annotations.Test;
import pages.MainPage;
import utils.BrowserUtils;

public class TicketPageTest extends BaseTest {

    BrowserUtils browserUtils = new BrowserUtils();
    MainPage mainPage = new MainPage();

    String fromCity = "Москва";
    String toCity = "Санкт-Петербург";

    @Test
    public void fillInfoTest(){
        browserUtils.openMainPage();
        mainPage.fillInformation(fromCity,toCity);
    }
}
