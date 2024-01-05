package no.hiof.softeng2022gruppe23.tjenestedk.classes.ads;

import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Ad;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Car;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Reservation;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class ReservationTest {
    long hour = (1000*60*60);
    long day = (1000*60*60*24);
    Date now = new Date();
    Client client = new Client("Ola", "Nordmann", "passord", "adresse", "email", 12345678, "profilePicture", 19978, false);
    Car ferrari = new Car("Ferrari", "Enzo", 2004, "Red", 2, "FER 19987");
    Ad ad = new Ad(client, ferrari, now, new Date(now.getTime() + 5*day), "Adress", 100, 1000);
    Reservation reservation = new Reservation(ferrari.getRegNumber(), client, new Date(now.getTime() + 5*hour), new Date(now.getTime() + 10*hour), ad);
    Reservation reservation2 = new Reservation(ferrari.getRegNumber(), client, new Date(now.getTime() + 5*hour), new Date(now.getTime() + 20*hour), ad);
    Reservation reservation3 = new Reservation(ferrari.getRegNumber(), client, new Date(now.getTime() + 5*hour), new Date(now.getTime() + 54*hour), ad);
    @Test
    void testCalculateReservationPriceWhenRentalDurationIsLessThanEightHours() {
        assertEquals(500, reservation.getTotalPrice());
    }
    @Test
    void testCalculateReservationPriceWhenRentalDurationIsOverOrEqualToEightHoursAndLessThanOrEqualToTwentyThreeHours() {
        assertEquals(1000, reservation2.getTotalPrice());
    }
    @Test
    void testCalculateReservationPriceWhenRentalDurationIsOverOrEqualToTwentyFourHours() {
        assertEquals(2000, reservation3.getTotalPrice());
    }


}

