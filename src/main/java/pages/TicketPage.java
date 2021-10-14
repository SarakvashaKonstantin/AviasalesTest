package pages;

import base.BaseForm;
import elements.Button;
import elements.Label;
import org.openqa.selenium.By;

public class TicketPage extends BaseForm {

    private static final Button priceBtn = new Button(By.xpath("//span[@class='buy-button__price']"),
            "Ticket Price");

    private static final Label originCity = new Label(By.xpath("//div[@class='segment-route__city']"),
            "City Origin");

    private static final Label originDate = new Label(By.xpath("//div[@class='segment-route__date']"),
            "Date Origin");

    private static final Label destinationCity = new Label(By.xpath("//span[@class='buy-button__price']"),
            "City Destination");

    public TicketPage() {super(priceBtn, "Ticket Page");}

    public String checkCity(){
        waitForOpen(originCity);
        return originCity.getText();
    }

    public String checkDate(){
        return originDate.getText();
    }

    public String checkPrice(){
        return priceBtn.getText();
    }
}
