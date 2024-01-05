package no.hiof.softeng2022gruppe23.tjenestedk.views.profile;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dialog.Dialog;
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
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Ad;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Car;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import no.hiof.softeng2022gruppe23.tjenestedk.views.browsecar.BrowseCar;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * A Designer generated component for the profile-page template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("profile-page")
@JsModule("./profile-page.ts")
@Route("profile-page")
public class ProfilePage extends LitTemplate implements HasUrlParameter<String> {

    private Client activeClient;

    @Id("vaadinVerticalLayout")
    private VerticalLayout vaadinVerticalLayout;
    @Id("view_cars_button")
    private Button view_cars_button;
    @Id("home_button")
    private Button home_button;
    @Id("addCarButton")
    private Button addCarButton;
    @Id("editAdsButton")
    private Button editAdsButton;
    @Id("editProfileButton")
    private Button editProfileButton;
    @Id("editCarButton")
    private Button editCarButton;
    @Id("deleteCarButton")
    private Button deleteCarButton;
    @Id("newAdButton")
    private Button newAdButton;
    @Id("deleteAdButton")
    private Button deleteAdButton;

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

    /**
     * Creates a new ProfilePage.
     */
    public ProfilePage() {
        // You can initialise any data required for the connected UI components here.

        home_button.addClickListener(e ->
                home_button.getUI().ifPresent(ui ->
                        ui.navigate("")));

        view_cars_button.addClickListener(e ->
                view_cars_button.getUI().ifPresent(ui ->
                        ui.navigate(BrowseCar.class, activeClient.getEmail())));

        editProfileButton.addClickListener(e ->
            {
                Dialog dialog = new Dialog();
                dialog.setHeaderTitle("Edit profile information");

                VerticalLayout layout = editProfileLayout(activeClient);

                dialog.add(layout);
                vaadinVerticalLayout.add(dialog);
                dialog.open();
            });

        addCarButton.addClickListener(e ->
        {
            Dialog dialog = new Dialog();
            dialog.setHeaderTitle("Add car to profile");

            VerticalLayout layout = addCarLayout(activeClient);

            dialog.add(layout);
            vaadinVerticalLayout.add(dialog);
            dialog.open();
        });

        editCarButton.addClickListener(e ->
        {
            Dialog dialog = new Dialog();
            dialog.setHeaderTitle("Edit car");

            VerticalLayout layout = editCarLayout(activeClient);

            dialog.add(layout);
            vaadinVerticalLayout.add(dialog);
            dialog.open();
        });

        newAdButton.addClickListener(e ->
        {
            Dialog dialog = new Dialog();
            dialog.setHeaderTitle("New ad");

            VerticalLayout layout = createAdLayout(activeClient);

            dialog.add(layout);
            vaadinVerticalLayout.add(dialog);
            dialog.open();
        });

        editAdsButton.addClickListener(e ->
            {
                Dialog dialog = new Dialog();
                dialog.setHeaderTitle("Edit ads");

                VerticalLayout layout = editAdLayout(activeClient);

                dialog.add(layout);
                vaadinVerticalLayout.add(dialog);
                dialog.open();
            });


        deleteCarButton.addClickListener(e ->
        {
            Dialog dialog = new Dialog();
            dialog.setHeaderTitle("Are you sure you want to delete car?");

            VerticalLayout deleteCarLayout = deleteCarLayout(activeClient);

            dialog.add(deleteCarLayout);
            vaadinVerticalLayout.add(dialog);
            dialog.open();
        });

        deleteAdButton.addClickListener(e ->
        {
            Dialog dialog = new Dialog();
            dialog.setHeaderTitle("Delete ads");

            VerticalLayout deleteCarLayout = deleteAdLayout(activeClient);

            dialog.add(deleteCarLayout);
            vaadinVerticalLayout.add(dialog);
            dialog.open();
        });

    }

    private static VerticalLayout editProfileLayout(Client activeClient) {
        TextField firstName = new TextField("First name");
        firstName.setValue(activeClient.getFirstName());

        TextField lastName = new TextField("Last name");
        lastName.setValue(activeClient.getLastName());

        TextField password = new TextField("Password");
        password.setValue(activeClient.getPassword());

        TextField phoneNumber = new TextField("Phone number");
        phoneNumber.setValue(String.valueOf(activeClient.getPhoneNumber()));

        TextField address = new TextField("Address");
        address.setValue(activeClient.getAddress());

        Button saveEdit = new Button("Save");
        saveEdit.addClickListener(e ->
                {
                    saveChangesOfUserDetails(activeClient, firstName, lastName, password, phoneNumber, address);
                });

        return new VerticalLayout(firstName, lastName, password, phoneNumber, address, saveEdit);
    }

    private static void saveChangesOfUserDetails(Client activeClient, TextField firstName, TextField lastName, TextField password, TextField phoneNumber, TextField address) {
        Client user = new Client(firstName.getValue(), lastName.getValue(), password.getValue(), address.getValue(), activeClient.getEmail(),
                                Integer.parseInt(phoneNumber.getValue()), "", activeClient.getPersonNumber(), false);
        String filePath = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/";
        user.writeToJson(filePath, user.getEmail());
    }

    private static VerticalLayout addCarLayout(Client activeClient) {
        TextField brand = new TextField("Brand");
        TextField model = new TextField("Model");
        TextField year = new TextField("Year");
        TextField color = new TextField("Color");
        TextField seats = new TextField("Number of seats");
        TextField regNumber = new TextField("Registration number");

        Button saveCar = new Button("Save");
        saveCar.addClickListener(e ->
        {
            saveCarDetails(activeClient, brand, model, year, color, seats, regNumber);
        });
        return new VerticalLayout(brand, model, year, color, seats, regNumber, saveCar);
    }

    private static void saveCarDetails(Client activeClient, TextField brand, TextField model, TextField year, TextField color, TextField seats, TextField regNumber) {
        Car car = new Car(brand.getValue(), model.getValue(), Integer.parseInt(year.getValue()),
                color.getValue(), Integer.parseInt(seats.getValue()), regNumber.getValue());
        saveChangesToCarDetails(activeClient, car, car);
    }

    private static VerticalLayout editCarLayout(Client activeClient) {
        Car car = activeClient.getCar();

        TextField brand = new TextField("Brand");
        brand.setValue(car.getBrand());

        TextField model = new TextField("Model");
        model.setValue(car.getModel());

        TextField year = new TextField("Year");
        year.setValue(String.valueOf(car.getYear()));

        TextField color = new TextField("Color");
        color.setValue(car.getColor());

        TextField seats = new TextField("Number of seats");
        seats.setValue(String.valueOf(car.getNrOfSeats()));

        TextField regNumber = new TextField("Registration number");
        regNumber.setValue(car.getRegNumber());

        Button saveEdit = new Button("Save");
        saveEdit.addClickListener(e ->
            {
                saveChangesToCarDetails(activeClient, new Car(brand.getValue(), model.getValue(), Integer.parseInt(year.getValue()), color.getValue(), Integer.parseInt(seats.getValue()), regNumber.getValue()), car);
            }
        );
        return new VerticalLayout(brand, model, year, color, seats, regNumber, saveEdit);
    }

    private static void saveChangesToCarDetails(Client activeClient, Car brand, Car car) {
        activeClient.setCar(brand);
        String filePath = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/cars/";
        car.writeToJson(filePath, car.getRegNumber());
        filePath = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/";
        activeClient.writeToJson(filePath, activeClient.getEmail());
    }

    private static VerticalLayout editAdLayout(Client activeClient) {
        Car car = activeClient.getCar();
        VerticalLayout editAdLayout = new VerticalLayout();

        for (Ad ad : car.getAds()) {
            TextArea carDescription = new TextArea("Car");
            carDescription.setValue(car.toString());
            carDescription.setReadOnly(true);

            LocalDateTime fromDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(ad.getStartTime().getTime()), ZoneId.systemDefault());
            LocalDateTime toDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(ad.getEndTime().getTime()), ZoneId.systemDefault());

            DateTimePicker fromDateTimePicker = new DateTimePicker(fromDateTime);
            fromDateTimePicker.setLabel("From date");
            DateTimePicker toDateTimePicker = new DateTimePicker(toDateTime);
            toDateTimePicker.setLabel("To date");

            TextField address = new TextField("Address");
            address.setValue(ad.getAddress());
            TextField hourlyPrice = new TextField("Hourly price");
            hourlyPrice.setValue(String.valueOf(ad.getHourlyPrice()));
            TextField dailyPrice = new TextField("Daily price");
            dailyPrice.setValue(String.valueOf(ad.getDailyPrice()));

            Button saveAdButton = new Button("Save ad");
            saveAdButton.addClickListener(e ->
                    {
                        Date fromDate = Date.from(fromDateTimePicker.getValue().toInstant(ZoneId.of("+01:00").getRules().getOffset(LocalDateTime.now())));
                        Date toDate = Date.from(toDateTimePicker.getValue().toInstant(ZoneId.of("+01:00").getRules().getOffset(LocalDateTime.now())));

                        ad.setStartTime(fromDate);
                        ad.setEndTime(toDate);
                        ad.setAddress(address.getValue());
                        ad.setHourlyPrice(Integer.parseInt(hourlyPrice.getValue()));
                        ad.setHourlyPrice(Integer.parseInt(dailyPrice.getValue()));

                        activeClient.saveAllToJson();
                    }
                    );

            HorizontalLayout row = new HorizontalLayout(carDescription, fromDateTimePicker, toDateTimePicker, address, hourlyPrice, dailyPrice, saveAdButton);
            editAdLayout.add(row);
        }

        return editAdLayout;
    }

    private static VerticalLayout deleteAdLayout(Client activeClient) {
        Car car = activeClient.getCar();
        VerticalLayout deleteAdLayout = new VerticalLayout();

        String adFolder = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/ads/";

        for (Ad ad : car.getAds()) {
            TextArea carDescription = new TextArea("Car");
            carDescription.setValue(car.toString());
            carDescription.setReadOnly(true);

            LocalDateTime fromDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(ad.getStartTime().getTime()), ZoneId.systemDefault());
            LocalDateTime toDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(ad.getEndTime().getTime()), ZoneId.systemDefault());

            DateTimePicker fromDateTimePicker = new DateTimePicker(fromDateTime);
            fromDateTimePicker.setLabel("From date");
            DateTimePicker toDateTimePicker = new DateTimePicker(toDateTime);
            toDateTimePicker.setLabel("To date");

            fromDateTimePicker.setReadOnly(true);
            toDateTimePicker.setReadOnly(true);

            TextField address = new TextField("Address");
            address.setValue(ad.getAddress());
            address.setReadOnly(true);
            TextField hourlyPrice = new TextField("Hourly price");
            hourlyPrice.setValue(String.valueOf(ad.getHourlyPrice()));
            hourlyPrice.setReadOnly(true);
            TextField dailyPrice = new TextField("Daily price");
            dailyPrice.setValue(String.valueOf(ad.getDailyPrice()));
            dailyPrice.setReadOnly(true);

            Button deleteAdButton = new Button("Delete ad");
            deleteAdButton.addClickListener(e ->
                    {
                        String filename = ad.getRegNr() + ad.getStartTime().getTime() + ".json";
                        ad.deleteJsonFile(adFolder + filename);
                        activeClient.getCar().deleteAd(ad);
                        activeClient.saveAllToJson();
                    }
            );

            HorizontalLayout row = new HorizontalLayout(carDescription, fromDateTimePicker, toDateTimePicker, address, hourlyPrice, dailyPrice, deleteAdButton);
            deleteAdLayout.add(row);
        }
        return new VerticalLayout(deleteAdLayout);
    }

    private static VerticalLayout createAdLayout (Client activeClient) {

        DateTimePicker fromDateTimePicker = new DateTimePicker();
        DateTimePicker toDateTimePicker = new DateTimePicker();

        TextField hourlyPrice = new TextField("Hourly price");
        TextField dailyPrice = new TextField("Daily price");
        TextField address = new TextField("address");

        Button saveAd = new Button("Save");

        saveAd.addClickListener(e ->
                {
                    Ad.saveAd(activeClient, fromDateTimePicker, toDateTimePicker, hourlyPrice, dailyPrice, address);
                }
                );

        return new VerticalLayout(fromDateTimePicker, toDateTimePicker, address, hourlyPrice, dailyPrice, saveAd);
    }

    VerticalLayout deleteCarLayout (Client activeClient) {
        TextArea warning = new TextArea("Warning");
        warning.setValue("Deleting car will also delete all ads created with this car");
        warning.setReadOnly(true);

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.addClickListener(y->
        {
            Ad.deletaAllAdsForCar(activeClient);
            deleteCar(activeClient);
        });

        HorizontalLayout buttonLayout = new HorizontalLayout(noButton, yesButton);
        return new VerticalLayout(warning, buttonLayout);
    }

    public static void deleteCar(Client activeClient) {
        File carFile = Ad.removeCarFromAd(activeClient);
        if (carFile.delete()) {
            Notification n = Notification
                    .show("Car deleted successfully");
            n.setPosition(Notification.Position.MIDDLE);
        }
    }

    public Client getActiveClient() {
        return activeClient;
    }

    public void setActiveClient(Client activeClient) {
        this.activeClient = activeClient;
    }
}
