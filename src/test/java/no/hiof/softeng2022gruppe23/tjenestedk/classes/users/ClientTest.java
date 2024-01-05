package no.hiof.softeng2022gruppe23.tjenestedk.classes.users;

import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Car;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {


    @Test
    public void testClientObject() { // Tests that object has been created and work as expected.
        Client testClientObject = new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 12345678, "this is a profile picture", 1234567890, false);
        assertAll(
                () -> assertEquals("Ola", testClientObject.getFirstName()),
                () -> assertEquals("Nordmann", testClientObject.getLastName()),
                () -> assertEquals("1234", testClientObject.getPassword()),
                () -> assertEquals("vei veien 7", testClientObject.getAddress()),
                () -> assertEquals("example@example.com", testClientObject.getEmail()),
                () -> assertEquals(12345678, testClientObject.getPhoneNumber()),
                () -> assertEquals("this is a profile picture", testClientObject.getProfilePicture()),
                () -> assertEquals(1234567890, testClientObject.getPersonNumber()),
                () -> assertFalse(testClientObject.getIsBanned()),

                () -> assertNotEquals("Ola", testClientObject.getLastName()),
                () -> assertNotEquals("Nordmann", testClientObject.getFirstName()),
                () -> assertNotEquals(false, testClientObject.getPassword()),
                () -> assertNotEquals("1234", testClientObject.getEmail()),
                () -> assertNotEquals("vei veien 7", testClientObject.getPhoneNumber()),
                () -> assertNotEquals("example@example.com", testClientObject.getAddress()),
                () -> assertNotEquals(12345678, testClientObject.getProfilePicture()),
                () -> assertNotEquals("this is a profile picture", testClientObject.getPersonNumber()),
                () -> assertNotEquals(1234567890, testClientObject.getIsBanned()));

    }


    @Test
    public void testWritingClientInfoToNewJsonFileOrOverWritExistingFile() { // Tests that the client info is written to JSON file.
        Client testClientObject = new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 12345678, "this is a profile picture", 1234567890, false);
        assertDoesNotThrow(() -> testClientObject.writeToJson("src/main/resources/db-JSON-files/test/users/", "testClientObject"));
    }

    @Test
    public void testReadingClientInfoFromJSON() { // Tests that the client info is read from JSON file, and successfully made an object.

        Client ola = new Client().jsonToObject("src/main/resources/db-JSON-files/test/users/testClientObject.json", Client.class);
        assertEquals("Ola", ola.getFirstName());

        assertEquals("Ola", ola.getFirstName());
        assertNotEquals("Ola", ola.getLastName());
        assertEquals("""
                {
                  "personNumber": 1234567890,
                  "banned": false,
                  "car": null,
                  "firstName": "Ola",
                  "lastName": "Nordmann",
                  "password": "1234",
                  "address": "vei veien 7",
                  "email": "example@example.com",
                  "phoneNumber": 12345678,
                  "profilePicture": "this is a profile picture"
                }""", ola.objectToJsonString());

    }

    @Test
    public void testAddCar() {
        Client ola = new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 12345678, "this is a profile picture", 1234567890, false);
        ola.addCar("Toyota", "Land cruiser", 1998 , "Red", 5, "CV93847");
        Car testCarObject = new Car("Toyota", "Land cruiser", 1998 , "Red", 5, "CV93847");
        assertEquals(ola.getCar().getRegNumber(), testCarObject.getRegNumber());
        assertEquals(ola.getCar().getColor(), testCarObject.getColor());
        assertEquals(ola.getCar().getModel(), testCarObject.getModel());
    }

    /*@Nested
    @DisplayName("Save all client info to json")
    public class saveAllToJsonTest {
        @Test
	    public void savingAllToJson() {
		Client c = null; // TODO Replace default value.
		c.saveAllToJson();
	}

    }*/

}
