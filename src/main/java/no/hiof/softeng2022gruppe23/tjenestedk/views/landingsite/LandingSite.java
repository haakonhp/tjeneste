package no.hiof.softeng2022gruppe23.tjenestedk.views.landingsite;


import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import no.hiof.softeng2022gruppe23.tjenestedk.views.browsecar.BrowseCar;


/**
 * A Designer generated component for the landing-site template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("landing-site")
@JsModule("./landing-site.ts")
@Route("")
public class LandingSite extends LitTemplate {
    @Id("home_button")
    private Button home_button;
    @Id("view_cars_button")
    private Button view_cars_button;
    @Id("login_button")
    public Button login_button;
    @Id("create_user_button")
    private Button create_user_button;
    @Id("logInasUserButton")
    private Button logInasUserButton;
    /**
     * Creates a new LandingSite.
     */
    public LandingSite() {
        // You can initialise any data required for the connected UI components here
        home_button.addClickListener(e ->
            home_button.getUI().ifPresent(ui ->
            ui.navigate("")));

        view_cars_button.addClickListener(e ->
                view_cars_button.getUI().ifPresent(ui ->
                        ui.navigate("browse-car")));

        login_button.addClickListener(e ->
                login_button.getUI().ifPresent(ui ->
                        ui.navigate("user-login")));

        create_user_button.addClickListener(e ->
                create_user_button.getUI().ifPresent(ui ->
                        ui.navigate("create-user")));

        logInasUserButton.addClickListener(e ->
                logInasUserButton.getUI().ifPresent(ui ->
                        ui.navigate(BrowseCar.class, "default@user.com")));
        }
    }

