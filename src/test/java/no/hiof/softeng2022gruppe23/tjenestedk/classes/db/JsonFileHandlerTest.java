package no.hiof.softeng2022gruppe23.tjenestedk.classes.db;

import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Car;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.db.JsonFileHandler;

import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Each method of the JsonFileHandler class is tested in a separate test class.
 * The test class is named after the method it tests.
 * Every test class has several test methods, they will test different aspects of the method.
 * Every class and method has a display name, which is used to describe the test.
 */
public class JsonFileHandlerTest {

    @Nested
    @DisplayName("Tests converting object to a string in JSON format")
    public class ObjectToJsonStringTest {
        @Test
        @DisplayName("Converting client object to JSON string")
        public void testClientToJsonString() {
            assertEquals("{\n" +
                    "  \"personNumber\": 1234567890,\n" +
                    "  \"banned\": false,\n" +
                    "  \"car\": null,\n" +
                    "  \"firstName\": \"Ola\",\n" +
                    "  \"lastName\": \"Nordmann\",\n" +
                    "  \"password\": \"1234\",\n" +
                    "  \"address\": \"vei veien 7\",\n" +
                    "  \"email\": \"example@example.com\",\n" +
                    "  \"phoneNumber\": 12345678,\n" +
                    "  \"profilePicture\": \"this is a profile picture\"\n" +
                    "}",
                    new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 12345678, "this is a profile picture", 1234567890, false).objectToJsonString());
            assertNotEquals("", new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 12345678, "this is a profile picture", 1234567890, false).objectToJsonString());
        }
        @Test
        @DisplayName("Converting car object to JSON string")
        public void testCarToJsonString() {
            assertEquals("{\n" +
                    "  \"brand\": \"Toyota\",\n" +
                    "  \"model\": \"Camry\",\n" +
                    "  \"year\": 1999,\n" +
                    "  \"color\": \"Blue\",\n" +
                    "  \"nrOfSeats\": 5,\n" +
                    "  \"regNumber\": \"AA12345\",\n" +
                    "  \"ads\": []\n" +
                    "}",
                    new Car("Toyota", "Camry", 1999, "Blue", 5, "AA12345").objectToJsonString());
            assertNotEquals("", new Car("Toyota", "Camry", 1999, "Blue", 5, "AA12345").objectToJsonString());
        }
        @ParameterizedTest
        @MethodSource("objectsToJsonString")
        @DisplayName("Converting a bunch of objects to JSON string")
        public void testObjectsToJsonString(String expected, JsonFileHandler object) {
            assertEquals(expected,  object.objectToJsonString());
            assertNotEquals("", object.objectToJsonString());
        } public static Stream objectsToJsonString() {
            return Stream.of(
                    Arguments.of("{\n" +
                            "  \"personNumber\": 1234567890,\n" +
                            "  \"banned\": false,\n" +
                            "  \"car\": null,\n" +
                            "  \"firstName\": \"Ola\",\n" +
                            "  \"lastName\": \"Nordmann\",\n" +
                            "  \"password\": \"1234\",\n" +
                            "  \"address\": \"vei veien 7\",\n" +
                            "  \"email\": \"example@example.com\",\n" +
                            "  \"phoneNumber\": 12345678,\n" +
                            "  \"profilePicture\": \"this is a profile picture\"\n" +
                            "}", new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 12345678, "this is a profile picture", 1234567890, false)),
                    Arguments.of(   "{\n" +
                        "  \"brand\": \"Toyota\",\n" +
                        "  \"model\": \"Camry\",\n" +
                        "  \"year\": 1999,\n" +
                        "  \"color\": \"Blue\",\n" +
                        "  \"nrOfSeats\": 5,\n" +
                        "  \"regNumber\": \"AA12345\",\n" +
                        "  \"ads\": []\n" +
                            "}", new Car("Toyota", "Camry", 1999, "Blue", 5, "AA12345")),
                    Arguments.of(   "{\n" +
                        "  \"brand\": null,\n" +
                        "  \"model\": null,\n" +
                        "  \"year\": 0,\n" +
                        "  \"color\": null,\n" +
                        "  \"nrOfSeats\": 0,\n" +
                        "  \"regNumber\": null,\n" +
                        "  \"ads\": null\n" +
                            "}", new Car())
            );
        }
    }
    @Nested
    @DisplayName("Test writing objects to JSON file")
    public class WriteToJsonTest {
        @Test
        @DisplayName("Writing client object to JSON file")
        public void testWriteClientObjectToJsonFile() {
            Client jsonTestClient = new Client();
            assertDoesNotThrow(() -> jsonTestClient.writeToJson("src/main/resources/db-JSON-files/test/db/", "jsonTestWriteClient"));
            assertTrue(new File("src/main/resources/db-JSON-files/test/db/jsonTestWriteClient.json").exists());
        }
        @Test
        @DisplayName("Writing car object to JSON file")
        public void testWriteCarObjectToJsonFile() {
            Car jsonTestCar = new Car();
            assertDoesNotThrow(() -> jsonTestCar.writeToJson("src/main/resources/db-JSON-files/test/db/", "jsonTestWriteCar"));
            assertTrue(new File("src/main/resources/db-JSON-files/test/db/jsonTestWriteCar.json").exists());
        }
    }

    // FIXME test for readFromJson
    @Nested
    @DisplayName("Test reading objects from JSON file")
    public class ReadFromJsonTest {
        @Test
        @DisplayName("Reading client object from JSON file")
        public void testReadClientObjectFromJson() {
            Client jsonTestClient = new Client();
            jsonTestClient.writeToJson("src/main/resources/db-JSON-files/test/db/", "jsonTestReadClient");
            assertDoesNotThrow(() -> jsonTestClient.readFromJson("src/main/resources/db-JSON-files/test/db/jsonTestReadClient.json"));
            assertEquals("java.io.BufferedReader", jsonTestClient.readFromJson("src/main/resources/db-JSON-files/test/db/jsonTestReadClient.json").getClass().getName());
        }
        @Test
        @DisplayName("Reading car object from JSON file")
        public void testReadCarObjectFromJson() {
            Car jsonTestCar = new Car();
            jsonTestCar.writeToJson("src/main/resources/db-JSON-files/test/db/", "jsonTestReadCar");
            assertDoesNotThrow(() -> jsonTestCar.readFromJson("src/main/resources/db-JSON-files/test/db/jsonTestReadCar.json"));
            assertEquals("java.io.BufferedReader", jsonTestCar.readFromJson("src/main/resources/db-JSON-files/test/db/jsonTestReadCar.json").getClass().getName());
        }
    }
    @Nested
    @DisplayName("Test converting JSON string to object")
    public class JsonToObjectTest { // Tests the method jsonToObject() it should convert a JSON file to an object
        @Test
        public void testJsonToClientObject() {
            Client jsonTestClient = new Client();
            jsonTestClient.setFirstName("Pablo");
            jsonTestClient.writeToJson("src/main/resources/db-JSON-files/test/db/", "jsonTestToClientObject");
            assertDoesNotThrow(() -> jsonTestClient.jsonToObject("src/main/resources/db-JSON-files/test/db/jsonTestToObject.json", Client.class));
            assertEquals("Pablo", jsonTestClient.jsonToObject("src/main/resources/db-JSON-files/test/db/jsonTestToObject.json", Client.class).getFirstName());
        }
        @Test
        @DisplayName("Reading car object from JSON file")
        public void testJsonToCarObject() {
            Car jsonTestCar = new Car();
            jsonTestCar.setBrand("Toyota");
            jsonTestCar.writeToJson("src/main/resources/db-JSON-files/test/db/", "jsonTestToCarObject");
            assertDoesNotThrow(() -> jsonTestCar.jsonToObject("src/main/resources/db-JSON-files/test/db/jsonTestToCarObject.json", Car.class));
            assertEquals("Toyota", jsonTestCar.jsonToObject("src/main/resources/db-JSON-files/test/db/jsonTestToCarObject.json", Car.class).getBrand());
        }
    }
}

