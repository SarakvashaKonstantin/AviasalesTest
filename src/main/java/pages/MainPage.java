package pages;

import base.BaseForm;
import elements.Button;
import elements.TextField;
import org.openqa.selenium.By;
import utils.DateUtils;

import java.util.Date;

public class MainPage extends BaseForm {

    private static final TextField origin = new TextField(By.xpath("//input[@id='origin']"),
            "From city");

    private static final TextField destination = new TextField(By.xpath("//input[@id='destination']"),
            "To city");

    private static final TextField dayForward = new TextField(By.xpath("//div[@class='trip-duration__input-wrapper" +
            " --departure']"),
            "From day");

    private static final Button addPassBtn = new Button(By.xpath("//div[@class='avia-form__field --passengers']"),
            "Passenger count list");

    private static final Button childrenIncBtn = new Button(By.xpath("//div[@data-testid='passengers-children-field']" +
            "//a[@class='additional-fields__passenger-control --increment']"),
            "Add child");

    private static final Button searchTicketBtn = new Button(By.xpath("//button[@type='submit']"),
            "Search tickets");

    private static final Button bookingBtn = new Button(By.xpath("//label[@class='of_input_checkbox__label']"),
            "Booking CheckBox");

    public MainPage() {super(origin, "Main Page");}

    public void fillInformation(String fromCity, String toCity, String day1, String day2){
        Button dayNumber = new Button(By.xpath("//div[text()='"+day1+"']"),
                "Day Number");
        origin.click();
        origin.sendKeys(fromCity);
        destination.sendKeys(toCity);
        dayForward.click();
        waitForOpen(dayNumber);
        dayNumber.click();
        Button dayNumber2 = new Button(By.xpath("//div[text()='"+day2+"']"),
                "Day Number");
        waitForOpen(dayNumber2);
        dayNumber2.click();
        addPassBtn.click();
        childrenIncBtn.click();
        bookingBtn.click();
        searchTicketBtn.click();
    }
}
