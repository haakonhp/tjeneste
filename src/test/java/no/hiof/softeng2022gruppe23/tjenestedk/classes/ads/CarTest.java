package no.hiof.softeng2022gruppe23.tjenestedk.classes.ads;

import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Ad;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Car;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CarTest {

    Date now = new Date();
    long day = (1000*60*60*24);

    @Test
    void testCarObject() { // Tests that object has been created and work as expected.
        Car testCarObject = new Car("Toyota", "Land cruiser", 1998 , "Red", 5, "CV93847");
        assertAll(
                () -> assertEquals("Toyota", testCarObject.getBrand()),
                () -> assertEquals("Land cruiser", testCarObject.getModel()),
                () -> assertEquals(1998, testCarObject.getYear()),
                () -> assertEquals("Red", testCarObject.getColor()),
                () -> assertEquals(5, testCarObject.getNrOfSeats()),
                () -> assertEquals("CV93847", testCarObject.getRegNumber()),

                () -> assertNotEquals("Ola", testCarObject.getBrand()),
                () -> assertNotEquals("Nordmann", testCarObject.getModel()),
                () -> assertNotEquals(2001, testCarObject.getYear()),
                () -> assertNotEquals("1234", testCarObject.getColor()),
                () -> assertNotEquals(2, testCarObject.getNrOfSeats()),
                () -> assertNotEquals("CV23947", testCarObject.getRegNumber()));

    }

    @Test
    void testAddAd() {
        Car testCarObject = new Car("Toyota", "Land cruiser", 1998 , "Red", 5, "CV93847");
        Client testClientObject = new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 12345678, "this is a profile picture", 1234567890, false);
        testCarObject.addAd(testClientObject, now, new Date(now.getTime() + 2*day), "Testveien 5", 100, 500);
        Ad testAdObject = new Ad(testClientObject, testCarObject, now, new Date(now.getTime() + 2*day), "Testveien 5", 100, 500);
        assertEquals(testAdObject.getRegNr(), testCarObject.getAds().get(0).getRegNr());
        assertEquals(testAdObject.getAddress(), testCarObject.getAds().get(0).getAddress());
        assertEquals(testAdObject.getDailyPrice(), testCarObject.getAds().get(0).getDailyPrice());
        assertEquals(testAdObject.getClientNr(), testCarObject.getAds().get(0).getClientNr());
    }

    /*@Nested
    @DisplayName("Delete an ad)
    public class deleteAdTest {
        @Test
	    public void Ad() {
		Car c = null; // TODO Replace default value.
		Ad ad = null; // TODO Replace default value.
		c.deleteAd(ad);
	}

    }*/

}


