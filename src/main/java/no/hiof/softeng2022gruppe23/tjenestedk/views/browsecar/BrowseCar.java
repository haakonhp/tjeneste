package no.hiof.softeng2022gruppe23.tjenestedk.views.browsecar;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.Route;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.*;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import no.hiof.softeng2022gruppe23.tjenestedk.views.profile.ProfilePage;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * A Designer generated component for the browse-car template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("browse-car")
@JsModule("./browse-car.ts")
@Route("browse-car")
public class BrowseCar extends LitTemplate implements HasUrlParameter<String>, AdFinder {
    @Id("view_cars_button")
    private Button view_cars_button;
    @Id("profile_button")
    private Button profile_button;
    @Id("home_button")
    private Button home_button;
    @Id("searchButton")
    private Button searchButton;
    @Id("toDateTime")
    private DateTimePicker toDateTime;
    @Id("fromDateTime")
    private DateTimePicker fromDateTime;
    @Id("verticalLayout")
    private VerticalLayout verticalLayout;
    private Client activeClient;
    ZoneOffset offset = ZoneId.of("+02:00").getRules().getOffset(LocalDateTime.now());
    @Override
    public void setParameter(BeforeEvent event,
                             @OptionalParameter String parameter) {

        // If user email is sent as a parameter, the user is set as activeUser (logged-in user)
        if (parameter != null) {
            String filepath = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/" + parameter + ".json";
            Client client = new Client();
            client = client.jsonToObject(filepath, Client.class);
            setActiveClient(client);
        }
    }
    public BrowseCar() { //Creates a new BrowseCar.
        // You can initialise any data required for the connected UI components here.
        // Navigation buttons
        home_button.addClickListener(e ->
                home_button.getUI().ifPresent(ui ->
                        ui.navigate("")));

        view_cars_button.addClickListener(e ->
                view_cars_button.getUI().ifPresent(ui ->
                        ui.navigate("browse-car")));

        profile_button.addClickListener(e ->
                {
                   if (activeClient != null) {
                       profile_button.getUI().ifPresent(ui->
                               ui.navigate(ProfilePage.class, activeClient.getEmail()));
                   }
                });
        searchButton.addClickListener(e ->
            {
                viewAvailableCars();
            });
    }
    public void viewAvailableCars() {
        verticalLayout.removeAll();
        LocalDateTime fromTime = fromDateTime.getValue();
        LocalDateTime toTime = toDateTime.getValue();

        ArrayList<Ad> ads = AdFinder.getAdsInTimeslot(fromTime, toTime);
        for (Ad ad : ads) {
            Car car = new Car();
            car = car.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/cars/" + ad.getRegNr() + ".json", Car.class);
            Div div = new Div();
            TextArea description = new TextArea();
            Button viewCarButton = new Button("View car");
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yy hh:mm");
            String from = dateFormatter.format(ad.getStartTime());
            String to = dateFormatter.format(ad.getEndTime());
            description.setValue(car.toString() + "\nAvailable from: " + from + ". To: " + to);
            description.setMinWidth("80%");
            description.setReadOnly(true);
            viewCarButton.addClickListener(f ->
                    {
                        viewCar(fromTime, toTime, ad);
                    }
                    );
            div.add(description, viewCarButton); // Add elements and style to ad div
            div.getStyle().set("align-self", "center");
            div.setWidth("50%");
            verticalLayout.add(div);
        }
    }

    public void viewCar(LocalDateTime fromTime, LocalDateTime toTime, Ad ad) {
        Dialog dialog = new Dialog();
        dialog.setHeaderTitle("New reservation");
        dialog.setMinWidth("40%");
        RentDialog rentDialog = createRentDialog(ad, fromTime, toTime);
        HorizontalLayout dialogLayout = rentDialog.getLayout();
        Button rentButton = rentDialog.getRentButton();
        rentButton.addClickListener(b ->
                {
                    rentCar(fromTime, toTime, ad);
                });
        dialog.add(dialogLayout);
        verticalLayout.add(dialog);
        dialog.open();
    }

    public void rentCar(LocalDateTime fromTime, LocalDateTime toTime, Ad ad) {
        if (activeClient != null) {
            setReservation(fromTime, toTime, ad);
            Notification n = Notification
                    .show("Reservation added");
            n.setPosition(Notification.Position.MIDDLE);
        } else {
            Notification n = Notification
                    .show("You must be logged in to reserve a car.");
            n.setPosition(Notification.Position.MIDDLE);
        }
    }

    public void setReservation(LocalDateTime rentalFromTime, LocalDateTime rentalToTime, Ad ad) {
        // Set timezone offset to local offset and get date and time as Date object
        Date startDateTime = Date.from(rentalFromTime.toInstant(offset));
        Date endDateTime = Date.from(rentalToTime.toInstant(offset));
        // Create new reservation and save as json file, and update ad file with new reservation
        Reservation reservation = new Reservation(ad.getRegNr(), activeClient, startDateTime, endDateTime, ad);
        if (ad.addReservation(reservation)) {
            Ad.SetNewReservationOnAd(ad, reservation);
        } else {
            Notification n = Notification
                    .show("Can't reserve car at this time. Car might be taken.");
            n.setPosition(Notification.Position.MIDDLE);
        }
    }

    private static RentDialog createRentDialog(Ad ad, LocalDateTime rentalFromTime, LocalDateTime rentalToTime) {
        StringBuilder reservationString = new StringBuilder();
        ArrayList<Reservation> reservationArray = ad.getReservations();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yy hh:mm");
        for (Reservation reservation : reservationArray) {
            String reservationStart = dateFormatter.format(reservation.getRentalStart());
            String reservationEnd = dateFormatter.format(reservation.getRentalEnd());

            reservationString.append("Reservation start: ").append(reservationStart).append("\nReservation end: ").append(reservationEnd).append("\n\n");
        }
        // Add reservations to dialog window
        TextArea reservations = new TextArea("Reservations");
        reservations.setValue(reservationString.toString());
        reservations.setReadOnly(true);
        reservations.setMinWidth("65%");
        // Create temp reservation to calculate price of reservation
        Reservation tempReservation = new Reservation(rentalFromTime, rentalToTime, ad);
        TextField price = new TextField("Price");
        price.setValue(Long.toString(tempReservation.getTotalPrice()));
        price.setMaxWidth("40%");
        price.setReadOnly(true);

        Button rentButton = new Button("Rent car");
        VerticalLayout priceDiv = new VerticalLayout(price, rentButton);

        HorizontalLayout layout = new HorizontalLayout(reservations, priceDiv);
        return new RentDialog(layout, rentButton);
    }
    public void setActiveClient(Client activeClient) {
        this.activeClient = activeClient;
    }
}
