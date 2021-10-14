package pages;

import base.BaseForm;
import elements.Button;
import elements.TextField;
import org.openqa.selenium.By;

public class MainPage extends BaseForm {

    /*private static final Label pageLbl = new Label(By.xpath("//h1[@class='header__title']"),
            "Main Page");*/

    private static final TextField origin = new TextField(By.xpath("//input[@id='origin']"),
            "From city");

    private static final TextField destination = new TextField(By.xpath("//input[@id='destination']"),
            "To city");

    private static final TextField dayForward = new TextField(By.xpath("//div[@class='trip-duration__input-wrapper --departure']"),
            "From day");

    private static String day = "16";
    private static final Button dayNumber = new Button(By.xpath("//div[text()='"+day+"']"),
            "Day Number");

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

    public void fillInformation(String fromCity, String toCity){
        origin.click();
        origin.sendKeys(fromCity);
        destination.sendKeys(toCity);
        dayForward.click();
        dayNumber.click();
        day = "18";
        waitForOpen(dayNumber);
        dayNumber.click();
        addPassBtn.click();
        childrenIncBtn.click();
        bookingBtn.click();
        searchTicketBtn.click();
    }
}
