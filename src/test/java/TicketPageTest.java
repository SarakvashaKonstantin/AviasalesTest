import base.BrowserProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TicketPage;
import utils.BrowserUtils;
import utils.DateUtils;

public class TicketPageTest extends BaseTest {

    BrowserUtils browserUtils = new BrowserUtils();
    MainPage mainPage = new MainPage();
    TicketPage ticketPage = new TicketPage();

    String fromCity = BrowserProperties.getTestDataProperty("FromCity");
    String toCity = BrowserProperties.getTestDataProperty("ToCity");
    DateUtils dateUtils = new DateUtils();

    @Test
    public void fillInfoTest(){
        log.info("Open main page");
        browserUtils.openMainPage();
        log.info("Fill in tickets information");
        mainPage.fillInformation(fromCity,toCity, dateUtils.tomorrowDate(),dateUtils.dayAfterTomorrow());
        log.info("Check if origin city is correct");
        Assert.assertEquals(ticketPage.checkCity(),fromCity,"Origin city name is incorrect");
        log.info("Check if destination city is correct");
        Assert.assertEquals(ticketPage.checkCity2(),toCity,"Destination city name is incorrect");
        log.info("Check if origin date is correct");
        Assert.assertEquals(ticketPage.checkDateForward(),dateUtils.tomorrowDate(),"Days are different");
        log.info("Check if destination date is correct");
        Assert.assertEquals(ticketPage.checkDateBack(),dateUtils.dayAfterTomorrow(),"Days are different");
        log.info("Check if price is ordered");
        Assert.assertEquals(ticketPage.price(),true,"Price is not ordered");
    }
}