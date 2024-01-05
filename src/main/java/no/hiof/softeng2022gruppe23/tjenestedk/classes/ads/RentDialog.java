package no.hiof.softeng2022gruppe23.tjenestedk.classes.ads;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
public class RentDialog {
    HorizontalLayout layout;
    Button rentButton;
    public RentDialog(HorizontalLayout layout, Button rentButton) {
        this.layout = layout;
        this.rentButton = rentButton;
    }
    public HorizontalLayout getLayout() {
        return layout;
    }
    public void setLayout(HorizontalLayout layout) {
        this.layout = layout;
    }
    public Button getRentButton() {
        return rentButton;
    }
    public void setRentButton(Button rentButton) {
        this.rentButton = rentButton;
    }
}
