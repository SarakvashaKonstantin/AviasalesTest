import base.BrowserProperties;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TicketPage;
import utils.BrowserUtils;

public class TicketPageTest extends BaseTest {

    BrowserUtils browserUtils = new BrowserUtils();
    MainPage mainPage = new MainPage();
    TicketPage ticketPage = new TicketPage();

    String fromCity = "Москва";
    String toCity = "Санкт-Петербург";

    @Test
    public void fillInfoTest(){
        browserUtils.openMainPage();
        mainPage.fillInformation(fromCity,toCity);
        System.out.println(ticketPage.checkCity());
        System.out.println(ticketPage.checkDate());
        System.out.println(ticketPage.checkPrice());
    }
}
