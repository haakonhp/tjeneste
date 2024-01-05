package no.hiof.softeng2022gruppe23.tjenestedk.views.userlogin;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.login.AbstractLogin;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.Route;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import no.hiof.softeng2022gruppe23.tjenestedk.views.browsecar.BrowseCar;

import java.io.File;
import java.util.Arrays;

/**
 * A Designer generated component for the user-login template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Route("user-login")
@Tag("user-login")
@JsModule("./user-login.ts")
public class UserLogin extends LitTemplate {
        @Id("home_button")
    private Button home_button;
    @Id("view_cars_button")
    private Button view_cars_button;
    @Id("logInasUserButton")
    private Button logInasUserButton;
    @Id("vaadinLoginForm")
    private LoginForm vaadinLoginForm;
    /**
     * Creates a new UserLogin.
     */
    public UserLogin() {
        // You can initialise any data required for the connected UI components here.

        LoginI18n i18n = LoginI18n.createDefault();

        LoginI18n.Form i18nForm = i18n.getForm();
        i18nForm.setUsername("E-mail");
        vaadinLoginForm.setI18n(i18n);
        home_button.addClickListener(e ->
                home_button.getUI().ifPresent(ui ->
                        ui.navigate("")));
        view_cars_button.addClickListener(e ->
                view_cars_button.getUI().ifPresent(ui ->
                        ui.navigate("browse-car")));
        logInasUserButton.addClickListener(e ->
                logInasUserButton.getUI().ifPresent(ui ->
                        ui.navigate(BrowseCar.class, "default@user.com")));
        vaadinLoginForm.addLoginListener(e ->
                    {
                        logIn(e);
                    }
                );
    }
    private void logIn(AbstractLogin.LoginEvent e) {
        String username = e.getUsername();
        File filepath = new File("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/");
        File[] users = filepath.listFiles();
        String userPath = "";
        boolean userFound = false;
        if (users != null) {
            for (File user : users) {
                if (user.getName().equals(username + ".json")) {
                    userFound = true;
                    userPath = user.getPath();
                }
            }
        }
        setUserLogInStatus(e, userPath, userFound);
    }
    private void setUserLogInStatus(AbstractLogin.LoginEvent e, String userPath, boolean userFound) {
        if (userFound) {
            Client client = new Client();
            client = client.jsonToObject(userPath, Client.class);
            if (e.getPassword().equals(client.getPassword())) {
                Client finalClient = client;
                System.out.println("logged in");
                vaadinLoginForm.getUI().ifPresent(ui ->
                        ui.navigate(BrowseCar.class, finalClient.getEmail()));
            } else {
                vaadinLoginForm.setError(true);
            }
        } else {
            vaadinLoginForm.getUI().ifPresent(ui ->
                    ui.navigate("browse-car"));
        }
    }



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

    public LoginForm getVaadinLoginForm() {
        return vaadinLoginForm;
    }

    public void setVaadinLoginForm(LoginForm vaadinLoginForm) {
        this.vaadinLoginForm = vaadinLoginForm;
    }
}
