import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.ClientTest;
import com.vaadin.flow.component.button.Button;
import com.vaadin.testbench.unit.UIUnitTest;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Ad;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Car;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Reservation;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.db.JsonFileHandler;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.payment.Payment;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import no.hiof.softeng2022gruppe23.tjenestedk.views.landingsite.LandingSite;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Date;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

// This class is meant for testing the system requirements from the documentation.
// The requirement may or may not yet be implemented in the prototype. If the requirement is not implemented, the test will be left empty until it's implemented.

@DisplayName("Krav Spesifikasjon:")
public class SystemRequirementsTest {
    // TODO
    // [x] 1.0 - En bruker skal kunne opprette en konto
    // TODO [ ] 1.1 - Navigering ifra start siden av applikasjonen til en side for å opprette konto. FIXME - GUI test - selenium?
    // [x] 1.2 - Persistent lagring av kontodetaljer.
    // [x] 1.3 - Opprette en database til å holde på bruker objekter.
    @Nested
    @DisplayName("1.0 - En bruker skal kunne opprette en konto")
    public class userRequirement10Test {
        /*
        @Nested
        @DisplayName("1.1 - Navigering ifra start siden av applikasjonen til en side for å opprette konto.")
        public class systemRequirement11Test {
            @Test
            @DisplayName("01: xxxxxxxx")
            public void systemRequirement11parameter01Test() {
            }
         */
        @Nested
        @DisplayName("1.2 - Persistent lagring av kontodetaljer.")
        public class systemRequirement12Test {
            @Test
            @DisplayName("01: This method is used in the create user form in the application, it takes an object and writes it to a JSON file.")
            public void systemRequirement12parameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                Client.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
            @Test
            @DisplayName("02: Tests that object has been created and work as expected.")
            public void systemRequirement12parameter02Test() { // From ClientTest Class - Mats Hansen
                ClientTest clientTest = new ClientTest();
                clientTest.testReadingClientInfoFromJSON();
            }
        }
        @Nested
        @DisplayName("1.3 - Opprette en database til å holde på bruker objekter.")
        public class systemRequirement13Test {
            @Test
            @DisplayName("01: Tests that the client info is written to JSON file.")
            public void systemRequirement13parameter01Test() { // From ClientTest Class - Mats Hansen
                Client testClientObject = new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 12345678, "this is a profile picture", 1234567890, false);
                assertDoesNotThrow(() -> testClientObject.writeToJson("src/main/resources/db-JSON-files/test/users/", "testClientObject"));
            }
            @Test
            @DisplayName("02: Tests that the client info is read from JSON file, and successfully made an object.")
            public void systemRequirement13parameter02Test() { // From ClientTest Class - Fredrik
                ClientTest clientTest = new ClientTest();
                clientTest.testReadingClientInfoFromJSON();
            }
        }
    }

// TODO
// TODO 1. Krav [ ] 2.0 - En brukers kontoinformasjon skal inneholde; Fornavn, Etternavn, Passord, Personnummer, Adresse, Epost, mobil, Profilbilde, En liste over en brukers registrerte biler.
// [X] 2.1 - Kontroll av personnummer mot fornavn, etternavn.
// [ ] 2.2 - Funksjon for å laste opp bilder eller ta bilder i applikasjonen.
// [x] 2.3 - Legge til følgende variabler til bruker klassen; fornavn, etternavn, passord(hashed), personnummer, adresse(hele, string), epost, mobilnummer, profilbilde(blob), array over biler en bruker har registrert.
    @Nested
    @DisplayName("2.0 En brukers kontoinformasjon skal inneholde; Fornavn, Etternavn, Passord, Personnummer, Adresse, Epost, mobil, Profilbilde, En liste over en brukers registrerte biler.")
    public class userRequirement20Test {

                @Nested
                @DisplayName("2.1 Kontroll av personnummer mot fornavn, etternavn.")
                public class systemRequirement21Test {
                    @Test
                    @DisplayName("Verifiserer at personnummer tilhører brukeren ved å sjekke offentlig register. Utført med en dummy metode!")
                    public void systemRequirement21parameter01Test() {
                        assertEquals(true, Client.checkIfPersonalNumberMatchWithName(Long.parseLong("11223312345"), "Ola", "Nordmann"));
                        assertNotEquals(false, Client.checkIfPersonalNumberMatchWithName(Long.parseLong("11223312345"), "Ola", "Nordmann"));
                    }
                }
                /*
                @Nested
                @DisplayName("2.2 Funksjon for å laste opp bilder eller ta bilder i applikasjonen.")
                public class systemRequirement22Test {
                    @Test
                    @DisplayName("xx")
                    public void systemRequirementXXparameter01Test() {
                        Client client = new Client();
                        Client client2 = new Client();
                        client.setEmail("persitentStorageWorks@example.com");
                        GuiLogic.createUser(client);
                        assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                        JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
                    }
                }
*/
        @Nested
        @DisplayName("2.3 Legge til følgende variabler til bruker klassen; fornavn, etternavn, passord(hashed), personnummer, adresse(hele, string), epost, mobilnummer, profilbilde(blob), array over biler en bruker har registrert.")
        public class systemRequirement23Test {
            @Test
            @DisplayName("01: Tests that a car object can be added to the user class.")
            public void systemRequirement23parameter01Test() { // From ClientTest Class - Fredrik
                ClientTest clientTest = new ClientTest();
                clientTest.testAddCar();
            }
            @Test
            @DisplayName("02: Tests that object has been created and work as expected.")
            public void systemRequirement23parameter02Test() { // From ClientTest Class - Mats Hansen
                ClientTest clientTest = new ClientTest();
                clientTest.testClientObject();
            }

            /*
            @Nested
            @DisplayName("GUI test av at lag bruker skjema.")
            public class systemRequirement23parameter03Test extends UIUnitTest { // FIXME
                CreateUser createUser = new CreateUser();

                String firstName;
                String lastName;
                long personNumber;
                String password;
                String address;
                String email;
                int phoneNumber;
                String profilePicture;

                @BeforeEach
                public void setup() {
                    createUser.getFirstNameField().setValue(firstName);
                    createUser.getLastNameField().setValue(lastName);
                    createUser.getPasswordField().setValue(password);
                    createUser.getIdNumberField().setValue(String.valueOf(personNumber));
                    createUser.getAdressField().setValue(address);
                };

                @Test
                public void kskm() {

                    //test();
                    // Tester om knappen er synlig
                    //assertEquals(true, landingSite.login_button.isVisible());
                    //assertNotEquals(false, landingSite.login_button.isVisible());
                }
            }*/
        }
    }
    // TODO
    // [ ] 3.0 En bruker skal kunne logge inn og ut av tjenesten.
    // TODO [ ] 3.1 - På start siden skal det være en knapp for login.
    // TODO [ ] 3.2 - Pålogging via epost og passord.
    // TODO [ ] 3.3 - Glemt passord funksjon via email med link til generering av nytt passord.

    /*@Nested
    @DisplayName("3.0 En bruker skal kunne logge inn og ut av tjenesten.")
    public class userRequirement30Test {


        @Nested
        @DisplayName("3.1 På start siden skal det være en knapp for login.")
        public class systemRequirement31Test extends UIUnitTest { // This test works but is commentd out because we did not need UI tests and it need a valid vaadin license to run.
            @Test
            @DisplayName("GUI test av at login knappen er synlig på landingssiden.")
            public void systemRequirement31parameter01Test() {
                LandingSite landingSite = new LandingSite();
                Button button = test(landingSite.login_button).getComponent();

                // Tester om knappen er synlig
                assertEquals(true, landingSite.login_button.isVisible());
                assertNotEquals(false, landingSite.login_button.isVisible());
            }
        }
    }*/
    /*
    @Nested
        @DisplayName("3.1 På start siden skal det være en knapp for login.")
        public class systemRequirement31Test extends TestBenchTestCase {            // FIXME
            private ChromeDriver driver;
            @Before
            public void setUp() throws Exception {
                setDriver(driver = new ChromeDriver());
            }

            @Test
            @DisplayName("GUI test av login knapp.")
            public void systemRequirement31parameter01Test() {
                driver.get("http://localhost:8080/");
                $(ButtonElement.class).id("login_button").click();
                assertEquals("http://localhost:8080/user-login", driver.getCurrentUrl());
            }

            @After
            public void tearDown() throws Exception {
                driver.close();
            }


        @Nested
        @DisplayName("3.2 Pålogging via epost og passord.")
        public class systemRequirement32Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Testt() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("3.3 Glemt passord funksjon via email med link til generering av nytt passord.")
        public class systemRequirement33Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // [ ] 4.0 En bruker skal kunne redigere kontoinformasjon
    // TODO [ ] 4.1 - Etter en bruker har logget på applikasjonen så skal det være en knapp på min konto/min profil siden hvor det står redigere. (Følgende kontoinfo kan ikke endres av bruker kun admin: fornavn, etternavn, personnummer.)
    // [ ] 4.2 - Opprette variabler for når kontoen var endret sist og av hvem.
    // [ ] 4.3 - Hvis kontoinformasjonen oppdateres skal det oppdateres variabler for når kontoen var endret sist og av hvem(i dette tilfelle av brukeren selv)

    @Nested
    @DisplayName("4.0 En bruker skal kunne redigere kontoinformasjon")
    public class userRequirement40Test {

        @Nested
        @DisplayName("4.1 Etter en bruker har logget på applikasjonen så skal det være en knapp på min konto/min profil siden hvor det står redigere. (Følgende kontoinfo kan ikke endres av bruker kun admin: fornavn, etternavn, personnummer.)")
        public class systemRequirement41Test {
            @Test
            @DisplayName("xxx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("4.2 Opprette variabler for når kontoen var endret sist og av hvem.")
        public class systemRequirement42Test {
            @Test
            @DisplayName("xxx")
            public void systemRequirementXXparameter01Testt() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("4.3 Hvis kontoinformasjonen oppdateres skal det oppdateres variabler for når kontoen var endret sist og av hvem(i dette tilfelle av brukeren selv)")
        public class systemRequirement43Test {
            @Test
            @DisplayName("xxx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
    // DONE
    // [x] 6.0 En utleier skal kunne legge til biler/annonser til kontoen sin
    // [x] 6.1 - Opprette klasse for biler. Klassen må ha følgende variabler; Område,  Bilmerke,  Bilmodell,  Årsmodell,  Biltype,  Antall seter,  Rekkevidde for elbil, bilder(blob).
    // [x] 6.2 - Opprette array variabel i bruker klassen som holder på annonse klasse objekter.
    @Nested
    @DisplayName("6.0 En utleier skal kunne legge til biler/annonser til kontoen sin")
    public class userRequirement60Test {
        @Nested
        @DisplayName("6.1 Opprette klasse for biler. Klassen må ha følgende variabler; Område,  Bilmerke,  Bilmodell,  Årsmodell,  Biltype,  Antall seter,  Rekkevidde for elbil, bilder(blob).")
        public class systemRequirement61Test {
            Car testCar = new Car("Toyota", "Land cruiser", 1998, "Red", 5, "CV93847");
            Client testClient = new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 145678, "this is a profile picture", 1234567890, false);
            long day = (1000 * 60 * 60 * 24);
            Date testTime1 = new Date();
            Date testTime2 = new Date(testTime1.getTime() + 10 * day);
            Ad testAd1 = new Ad(testClient, testCar, testTime1, testTime2, "Testgate 3", 100, 500);
            Ad testAd2 = new Ad(testClient, testCar, testTime1, testTime2, "Testgate 3", 100, 500);
            Ad testAd3 = new Ad(testClient, testCar, new Date(testTime1.getTime() + (day * 11)), new Date(testTime2.getTime() + (day * 15)), "Testgate 3", 100, 500);
            Reservation testReservation1 = new Reservation(testAd1.getRegNr(), testClient, testTime1, new Date(testTime1.getTime() + (2 * day)), testAd1);
            Reservation testReservation2 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime() + (3 * day)), new Date(testTime1.getTime() + (5 * day)), testAd1);
            Reservation testReservation3 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime() + day), new Date(testTime1.getTime() + (4 * day)), testAd1);
            Reservation testReservation4 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime() - day), new Date(testTime1.getTime() + (4 * day)), testAd1);
            Reservation testReservation5 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime() + 5 * day), new Date(testTime1.getTime() + (4 * day)), testAd1);
            @Test
            @DisplayName("01: Tests that object has been created and work as expected.")
            public void systemRequirement61parameter01Test() { // From AdTest Class - Fredrik
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
                        () -> assertNotEquals(new Date(testTime1.getTime() + (day * -2)), testAd1.getStartTime()),
                        () -> assertNotEquals(new Date(testTime1.getTime() + (day * 6)), testAd1.getEndTime()),
                        () -> assertNotEquals("Testgate 6", testAd1.getAddress()),
                        () -> assertNotEquals(130, testAd1.getHourlyPrice()),
                        () -> assertNotEquals(700, testAd1.getDailyPrice()));
            }
        }
        @Nested
        @DisplayName("6.2 Opprette array variabel i bruker klassen som holder på annonse klasse objekter.")
        public class systemRequirement62Test { // From AdTest Class - Fredrik
            Car testCar = new Car("Toyota", "Land cruiser", 1998, "Red", 5, "CV93847");
            Client testClient = new Client("Ola", "Nordmann", "1234", "vei veien 7", "example@example.com", 145678, "this is a profile picture", 1234567890, false);
            long day = (1000 * 60 * 60 * 24);
            Date testTime1 = new Date();
            Date testTime2 = new Date(testTime1.getTime() + 10 * day);
            Ad testAd1 = new Ad(testClient, testCar, testTime1, testTime2, "Testgate 3", 100, 500);
            Ad testAd2 = new Ad(testClient, testCar, testTime1, testTime2, "Testgate 3", 100, 500);
            Ad testAd3 = new Ad(testClient, testCar, new Date(testTime1.getTime() + (day * 11)), new Date(testTime2.getTime() + (day * 15)), "Testgate 3", 100, 500);
            Reservation testReservation1 = new Reservation(testAd1.getRegNr(), testClient, testTime1, new Date(testTime1.getTime() + (2 * day)), testAd1);
            Reservation testReservation2 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime() + (3 * day)), new Date(testTime1.getTime() + (5 * day)), testAd1);
            Reservation testReservation3 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime() + day), new Date(testTime1.getTime() + (4 * day)), testAd1);
            Reservation testReservation4 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime() - day), new Date(testTime1.getTime() + (4 * day)), testAd1);
            Reservation testReservation5 = new Reservation(testAd1.getRegNr(), testClient, new Date(testTime1.getTime() + 5 * day), new Date(testTime1.getTime() + (4 * day)), testAd1);
            @Test
            @DisplayName("01: Test add reervartin to array.")
            public void systemRequirement62parameter01Test() { // From AdTest Class - Fredrik
                    Reservation testReservation = new Reservation(testAd1.getRegNr(), testClient, testTime1, testTime2, testAd1);
                    testAd1.addReservation(testReservation);
                    assertEquals(testAd1.getReservations().get(0).getRentalClient(), testReservation.getRentalClient());
                    assertEquals(testAd1.getReservations().get(0).getRentalStart(), testReservation.getRentalStart());
                    assertEquals(testAd1.getReservations().get(0).getRentalEnd(), testReservation.getRentalEnd());
            }
            @Test
            @DisplayName("02: Reservation doesnt overlap.")
            public void systemRequirement62parameter02Test() { // From AdTest Class - Fredrik
                testAd1.getReservations().add(testReservation1);
                assert (testAd1.addReservation(testReservation2));
                assert !(testAd1.addReservation(testReservation3));
                assert !(testAd1.addReservation(testReservation4));
            }
            @Test
            @DisplayName("03: Test reservation start end date.")
            public void systemRequirement62parameter03Test() { // From AdTest Class - Fredrik
                assert !(testAd1.addReservation(testReservation5));
                assert (testAd1.addReservation(testReservation2));
            }
        }
    }
/*
    // TODO
    // [ ] 9.0 En utleier skal kunne opprette annonser for utleie av bil(er) via sine registrerte biler
    // TODO [ ] 9.1 - Etter en bruker har logget inn og brukeren har registrert biler i sin bruker konto så vil opprette annonse valget i applikasjonen bli tilgjengelig, ellers skjult.
    // TODO [ ] 9.2 - På siden for å opprette annonser velger man ifra tilgjengelige biler (drop down) registrert på sin profil. Med tilgjengelig vil det si biler det ikke er laget annonser for fra før av.
    // TODO [ ] 9.3 - Opprette klasse for å holde på annonser med variabler for start tid tilgjengelig, stopp tid tilgjengelig, bilen(objekt), pris pr time, pris pr dag.
    @Nested
    @DisplayName("9.0 En utleier skal kunne opprette annonser for utleie av bil(er) via sine registrerte biler")
    public class userRequirement90Test {
        @Nested
        @DisplayName("9.1 Etter en bruker har logget inn og brukeren har registrert biler i sin bruker konto så vil opprette annonse valget i applikasjonen bli tilgjengelig, ellers skjult.")
        public class systemRequirement91Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("9.2 På siden for å opprette annonser velger man ifra tilgjengelige biler (drop down) registrert på sin profil. Med tilgjengelig vil det si biler det ikke er laget annonser for fra før av.")
        public class systemRequirement92Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("9.3  Opprette klasse for å holde på annonser med variabler for start tid tilgjengelig, stopp tid tilgjengelig, bilen(objekt), pris pr time, pris pr dag.")
        public class systemRequirement93Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
    // TODO
    // [ ] 10.0 En utleier skal kunne velge tidsrom bilen er tilgjengelig for utleie
    // TODO 1. Krav [ ] 10.1 - Det skal gjøres sjekk mot databasen for om hva tidspunkt bilen er ifra før av leid ut på.
    // [ ] 10.2 - Sjekk for at bilen er eu godkjent for det tidsrommet som velges av utleieren.
    @Nested
    @DisplayName("10.0 En utleier skal kunne velge tidsrom bilen er tilgjengelig for utleie")
    public class userRequirement101Test {

        @Nested
        @DisplayName("10.1 Det skal gjøres sjekk mot databasen for om hva tidspunkt bilen er ifra før av leid ut på.")
        public class systemRequirement101Test {
            @Test
            @DisplayName("FIXME")
            public void systemRequirementXXparameter01Test() {
                //BrowseCar browseCar = new BrowseCar();
                // TODO usikker på hvordan denne skal testes
                //FIXME assertEquals("", browseCar.rentACar());
            }
        }
    }
        /*
        @Nested
        @DisplayName("10.2 Sjekk for at bilen er eu godkjent for det tidsrommet som velges av utleieren.")
        public class systemRequirement102Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
/*
    // TODO
    // [ ] 11.0 En utleier skal kunne administrere annonser/tilgjengelighet av sine registrerte biler
    // TODO [ ] 11.1 - Når en bruker er innlogget og har aktive annonser så vil det på min profil være valg for å gå til siden mine annonser.
    // TODO [ ] 11.2 - Den siden lister opp dem annonsene brukeren har opprettet, med tidsrom, pris og bil pr annonse.
    // TODO [ ] 11.3 - Ved å klikke på en annonse i listen skal brukeren se en rediger annonse side.
    // [ ] 11.4 - Opprette variabler i annonse klassen for når annonsen er redigert og av hvem(i dette tilfellet brukeren).
    // [ ] 11.5 - Sjekk for at annonsen ikke kan endres dersom det er gjort reserverasjoner basert på den annonsen.
    @Nested
    @DisplayName("11.0 En utleier skal kunne administrere annonser/tilgjengelighet av sine registrerte biler")
    public class userRequirement11Test {
        @Nested
        @DisplayName("11.1 Når en bruker er innlogget og har aktive annonser så vil det på min profil være valg for å gå til siden mine annonser.")
        public class systemRequirement111Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("11.2 Den siden lister opp dem annonsene brukeren har opprettet, med tidsrom, pris og bil pr annonse.")
        public class systemRequirement112Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("11.3 Ved å klikke på en annonse i listen skal brukeren se en rediger annonse side.")
        public class systemRequirement113Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("11.4 Opprette variabler i annonse klassen for når annonsen er redigert og av hvem(i dette tilfellet brukeren).")
        public class systemRequirement114Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
        @Nested
        @DisplayName("11.5 Sjekk for at annonsen ikke kan endres dersom det er gjort reserverasjoner basert på den annonsen.")
        public class systemRequirement115Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Testt() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
*/
    // TODO
    // TODO 1. Krav [ ] 12.0 En leier skal kunne søke etter tilgjengelige biler i en gitt tidsperiode
    // TODO 1. Krav [ ] 12.1 - På siden annonser kan en bruker legge inn en fra til dato og tidspunkt. Ved å trykke søk vil brukeren få listet opp tilgjengelige bilers annonser.
    @Nested
    @DisplayName("12.0 En leier skal kunne søke etter tilgjengelige biler i en gitt tidsperiode")
    public class userRequirement12Test {
        @Nested
        @DisplayName("12.1 På siden annonser kan en bruker legge inn en fra til dato og tidspunkt. Ved å trykke søk vil brukeren få listet opp tilgjengelige bilers annonser.")
        public class systemRequirement21Test {
            @Test
            @DisplayName("FIXME")
            public void systemRequirementXXparameter01Test() {
                //BrowseCar browseCar = new BrowseCar();
                // TODO usikker på hvordan denne skal testes
                //FIXME assertEquals("", browseCar.viewAvailableCars());
            }
        }
    }
    // TODO
    // TODO 1. Krav [ ] 16.0 En leier skal kunne betale for leie av bil med ulike betalingsløsninger;  Visa, Paypal,  Vipps.
    // TODO 1. Krav [ ] 16.1 - Når en bruker er på en annonse og trykker på knappen reserver/lei så taes brukeren til betalings siden. Her vil brukeren få valg om å betale med kort(visa), paypal(epost/brukerkonto) eller vipps(mobilnummer).
    @Nested
    @DisplayName("16.0 En leier skal kunne betale for leie av bil med ulike betalingsløsninger;  Visa, Paypal,  Vipps.")
    public class userRequirement16Test {

        @ParameterizedTest
        @MethodSource("payment")
        @DisplayName("Tester de forskjellige betalingsmetodene")
        public void testEnoughMoneyOnAccount(String paymentMethod, int amount, boolean enoughMoney, boolean expected, boolean notExpected) {
            assertEquals(expected, new Payment().makePayment(paymentMethod, amount, enoughMoney));
            assertNotEquals(notExpected, new Payment().makePayment(paymentMethod, amount, enoughMoney));
        } public static Stream payment() {
            return Stream.of(
                    Arguments.of("paypal", 100, true, true, false),
                    Arguments.of("stripe", 100, true, true, false),
                    Arguments.of("vipps", 100, true, true, false),
                    Arguments.of("This service does not exist", 100, true, false, true)
            );
        }
    }
/*
        @Nested
        @DisplayName("16.1 Når en bruker er på en annonse og trykker på knappen reserver/lei så taes brukeren til betalings siden. Her vil brukeren få valg om å betale med kort(visa), paypal(epost/brukerkonto) eller vipps(mobilnummer).")
        public class systemRequirement161Test {
            @Test
            @DisplayName("xx")
            public void systemRequirementXXparameter01Test() {
                Client client = new Client();
                Client client2 = new Client();
                client.setEmail("persitentStorageWorks@example.com");
                GuiLogic.createUser(client);
                assertEquals("persitentStorageWorks@example.com", client2.jsonToObject("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json", Client.class).getEmail());
                JsonFileHandler.deleteJsonFile("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/persitentStorageWorks@example.com.json");
            }
        }
    }
*/
}
