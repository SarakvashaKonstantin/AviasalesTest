package pages;

import base.BaseForm;
import com.google.common.collect.Ordering;
import elements.Button;
import elements.Label;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class TicketPage extends BaseForm {

    private static final Button priceBtn = new Button(By.xpath("//span[@class='buy-button__price']"),
            "Ticket Price");

    private static final Label originCity = new Label(By.xpath("//div[@class='segment-route__endpoint origin']" +
            "//div[@class='segment-route__city']"),
            "City Origin");

    private static final Label originDate = new Label(By.xpath("(//div[@class='segment-route__date'])[1]"),
            "Date Origin");

    private static final Label returnDate = new Label(By.xpath("(//div[@class='segment-route__date'])[4]"),
            "Date Destination");

    private static final Label destinationCity = new Label(By.xpath("//div[@class='segment-route__endpoint destination']" +
            "//div[@class='segment-route__city']"),
            "City Destination");

    private static final Label price = new Label(By.xpath("//span[@class='buy-button__price']"),
            "Ticket Price");

    private static final Label add = new Label(By.xpath("//div[@class='ticket-desktop__expand-button-text']"),
            "Add");

    public TicketPage() {super(priceBtn, "Ticket Page");}

    public String checkCity(){
        waitForOpen(originCity);
        return originCity.getText();
    }

    public String checkCity2(){
        waitForOpen(destinationCity);
        return destinationCity.getText();
    }

    public String checkDateForward(){
        return originDate.getText();
    }

    public String checkDateBack(){
        return returnDate.getText();
    }

    public boolean price(){
        int k;
        waitForOpen(add);
        if (add.isDisplayed()==true) {
            k=1;
        }
        else {
            k=0;
        }
        return Ordering.natural().isOrdered(price.getList(k));
    }
}
