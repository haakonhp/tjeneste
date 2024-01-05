package no.hiof.softeng2022gruppe23.tjenestedk.views.createuser;

import com.vaadin.flow.component.Tag;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.converter.StringToIntegerConverter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.data.validator.EmailValidator;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;

/**
 * A Designer generated component for the create-user template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("create-user")
@JsModule("./create-user.ts")
@Route("create-user")
public class CreateUser extends LitTemplate {

    @Id("home_button")
    private Button home_button;
    @Id("view_cars_button")
    private Button view_cars_button;
    @Id("first-name-field")
    private TextField firstNameField;
    @Id("last-name-field")
    private TextField lastNameField;
    @Id("address-field")
    private TextField adressField;
    @Id("mail-field")
    private TextField mailField;
    @Id("id-number-field")
    private TextField idNumberField;
    @Id("phone-number-field")
    private TextField phoneNumberField;
    @Id("password-field")
    private TextField passwordField;
    @Id("confirm-password-field")
    private TextField confirmPasswordField;
    @Id("user-creation-button")
    private Button userCreationButton;

    public Button getHome_button() {
        return home_button;
    }

    public void setHome_button(Button home_button) {
        this.home_button = home_button;
    }

    public Button getView_cars_button() {
        return view_cars_button;
    }

    public void setView_cars_button(Button view_cars_button) {
        this.view_cars_button = view_cars_button;
    }


    public TextField getFirstNameField() {
        return firstNameField;
    }

    public void setFirstNameField(TextField firstNameField) {
        this.firstNameField = firstNameField;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(TextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public TextField getAdressField() {
        return adressField;
    }

    public void setAdressField(TextField adressField) {
        this.adressField = adressField;
    }

    public TextField getMailField() {
        return mailField;
    }

    public void setMailField(TextField mailField) {
        this.mailField = mailField;
    }

    public TextField getIdNumberField() {
        return idNumberField;
    }

    public void setIdNumberField(TextField idNumberField) {
        this.idNumberField = idNumberField;
    }

    public TextField getPhoneNumberField() {
        return phoneNumberField;
    }

    public void setPhoneNumberField(TextField phoneNumberField) {
        this.phoneNumberField = phoneNumberField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(TextField passwordField) {
        this.passwordField = passwordField;
    }

    public TextField getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public void setConfirmPasswordField(TextField confirmPasswordField) {
        this.confirmPasswordField = confirmPasswordField;
    }

    public Button getUserCreationButton() {
        return userCreationButton;
    }

    public void setUserCreationButton(Button userCreationButton) {
        this.userCreationButton = userCreationButton;
    }

    /**
     * Creates a new CreateUser.
     */
    public CreateUser() {
        // You can initialise any data required for the connected UI components here.
        home_button.addClickListener(e ->
                home_button.getUI().ifPresent(ui ->
                        ui.navigate("")));
        view_cars_button.addClickListener(e ->
                view_cars_button.getUI().ifPresent(ui ->
                        ui.navigate("browse-car")));

        userCreationButton.addClickListener(e -> {
                //createUser());
            if (Client.checkIfPersonalNumberMatchWithName(Long.parseLong(idNumberField.getValue()), firstNameField.getValue(), lastNameField.getValue())) {
                Client.createUser(new Client(firstNameField.getValue(), lastNameField.getValue(), passwordField.getValue(), adressField.getValue(), mailField.getValue(), Integer.parseInt(phoneNumberField.getValue()), "", Long.parseLong(idNumberField.getValue()), false));
                userCreationButton.getUI().ifPresent(ui ->
                        ui.navigate("user-login"));
            }
        });
        Binder<Client> clientBinder = new Binder<>();
        clientBinder.forField(mailField)
                // Explicit validator instance
                .withValidator(new EmailValidator(
                        "This doesn't look like a valid email address"))
                .bind(Client::getEmail, Client::setEmail);
        clientBinder.forField(phoneNumberField)
                .withValidator(
                        phoneNumberField -> phoneNumberField.length() == 8,
                        "Please enter a norwegian phone number")
                .withConverter(
                        new StringToIntegerConverter("This is not a number")
                )
                .bind(Client::getPhoneNumber, Client::setPhoneNumber);
    }
}
