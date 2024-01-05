package no.hiof.softeng2022gruppe23.tjenestedk.classes.ads;


import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Ad;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Car;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Reservation;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AdTest {
    Car testCar = new Car("Toyota", "Land cruiser", 1998 , "Red", 5, "CV93847");
    Client testClient = new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 145678, "this is a profile picture", 1234567890, false);

    long day = (1000*60*60*24);
    Date testTime1 = new Date();
    Date testTime2 = new Date(testTime1.getTime()+10*day);


    Ad testAd1 = new Ad(testClient, testCar, testTime1, testTime2, "Testgate 3", 100, 500);
    Ad testAd2 = new Ad(testClient, testCar, testTime1, testTime2, "Testgate 3", 100, 500);
    Ad testAd3 = new Ad(testClient, testCar, new Date(testTime1.getTime()+(day*11)), new Date (testTime2.getTime()+(day*15)), "Testgate 3", 100, 500);

    Reservation testReservation1 = new Reservation(testAd1.getRegNr(), testClient, testTime1, new Date(testTime1.getTime()+(2*day)), testAd1);
    Reservation testReservation2 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime()+(3*day)), new Date(testTime1.getTime()+(5*day)), testAd1);
    Reservation testReservation3 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime()+day), new Date(testTime1.getTime()+(4*day)), testAd1);
    Reservation testReservation4 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime()-day), new Date(testTime1.getTime()+(4*day)), testAd1);
    Reservation testReservation5 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime()+5*day), new Date(testTime1.getTime()+(4*day)), testAd1);


    @Test
    void testAdObject() { // Tests that object has been created and work as expected.
        assertAll(
                () -> assertEquals(testClient.getPersonNumber(), testAd1.getClientNr()),
                () -> assertEquals(testCar.getRegNumber(), testAd1.getRegNr()),
                () -> assertEquals(testTime1, testAd1.getStartTime()),
                () -> assertEquals(testTime2, testAd1.getEndTime()),
                () -> assertEquals("Testgate 3", testAd1.getAddress()),
                () -> assertEquals(100, testAd1.getHourlyPrice()),
                () -> assertEquals(500, testAd1.getDailyPrice()),

                () -> assertNotEquals(testClient.getAddress(), testAd1.getClientNr()),
                () -> assertNotEquals(testCar.getColor(), testAd1.getRegNr()),
                () -> assertNotEquals(new Date(testTime1.getTime()+(day*-2)), testAd1.getStartTime()),
                () -> assertNotEquals(new Date(testTime1.getTime()+(day*6)), testAd1.getEndTime()),
                () -> assertNotEquals("Testgate 6", testAd1.getAddress()),
                () -> assertNotEquals(130, testAd1.getHourlyPrice()),
                () -> assertNotEquals(700, testAd1.getDailyPrice()));

    }

    @Test
    void testAddReservation() {
        Reservation testReservation = new Reservation(testAd1.getRegNr(), testClient, testTime1, testTime2, testAd1);
        testAd1.addReservation(testReservation);

        assertEquals(testAd1.getReservations().get(0).getRentalClient(), testReservation.getRentalClient());
        assertEquals(testAd1.getReservations().get(0).getRentalStart(), testReservation.getRentalStart());
        assertEquals(testAd1.getReservations().get(0).getRentalEnd(), testReservation.getRentalEnd());

    }

    @Test
    void testReservationDoesNotOverlapWithAnotherReservation() {
        testAd1.getReservations().add(testReservation1);
        assert (testAd1.addReservation(testReservation2));
        assert !(testAd1.addReservation(testReservation3));
        assert !(testAd1.addReservation(testReservation4));
    }

    @Test
    void testReservationEndsAfterItStarts() {
        assert !(testAd1.addReservation(testReservation5));
        assert (testAd1.addReservation(testReservation2));
    }

    /*@Nested
    @DisplayName("Save an ad to client")
    public class SaveAdToClientTest { // Tests the method jsonToObject() it should convert a JSON file to an object
        @Test
        public void saveAdTest() {
            Ad ad = new Ad(testClient, testCar, testTime1, testTime2, "Testveien 3", 100, 1000);
            Client activeClient = null;
            DateTimePicker fromDateTimePicker = new DateTimePicker(LocalDateTime.ofInstant(Instant.ofEpochMilli(ad.getStartTime().getTime()), ZoneId.systemDefault()));
            DateTimePicker toDateTimePicker = new DateTimePicker(LocalDateTime.ofInstant(Instant.ofEpochMilli(ad.getEndTime().getTime()), ZoneId.systemDefault()));
            TextField hourlyPrice = new TextField("100");
            TextField dailyPrice = new TextField("1000");
            TextField address = new TextField("testveien 3");
            Ad.saveAd(activeClient, fromDateTimePicker, toDateTimePicker, hourlyPrice, dailyPrice, address); // FIXME funker ikke
        }

    }*/

    /*@Nested
    @DisplayName("Set a new reservation on ad")
    public class SetNewReservationOnAdTest {
        @Test
        public void settingAReservationTest() {
            Car testCar = new Car("Ferrari", "Enzo", 2004, "Red", 2, "FER 19987");
            Client client = new Client("Ola", "Nordmann", "passord", "adresse", "email", 12345678, "profilePicture", 19978, false);
            long hour = (1000*60*60);
            long day = (1000*60*60*24);
            Date testTime1 = new Date();
            Date testTime2 = new Date(testTime1.getTime()+10*day);
            Ad ad = new Ad(client, testCar, testTime1, testTime2, "Testgate 3", 100, 500);
            Reservation reservation = new Reservation(testCar.getRegNumber(), client, new Date(testTime1.getTime() + 5*hour), new Date(testTime1.getTime() + 54*hour), ad);
            Ad.SetNewReservationOnAd(ad, reservation);
        }

    }*/

    /*@Nested
    @DisplayName("Removing a car from an ad")
    public class removeCarFromAdTest {
        @Test
	    public void removeCarFromAd() {
		Client activeClient = null; // TODO Replace default value.
		File expected = null; // TODO Replace default value.
		File actual = Ad.removeCarFromAd(activeClient);

		Assertions.assertEquals(expected, actual);
	}

    }*/

    /*@Nested
    @DisplayName("Delete all ads for a car")
    public class deletaAllAdsForCarTest {
        @Test
	    public void Test() {
		Client activeClient = null; // TODO Replace default value.
		Ad.deletaAllAdsForCar(activeClient);
	}

    }*/

}


