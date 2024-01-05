package no.hiof.softeng2022gruppe23.tjenestedk.classes.users;

import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Ad;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Car;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Reservation;

import java.util.ArrayList;
public class Client extends User {

    long personNumber;
    boolean banned;
    private Car car;
    public Client() {}

    public Client(String firstName, String lastName, String password, String address, String email, int phoneNumber, String profilePicture, long personNumber, boolean banned) {
        super(firstName, lastName, password, address, email, phoneNumber, profilePicture);
        this.personNumber = personNumber;
        this.banned = banned;
    }

    public long getPersonNumber() {
        return personNumber;
    }

    public void addCar(String brand, String model, int year, String color, int nrOfSeats, String regNumber) {
        this.car = new Car(brand, model, year, color, nrOfSeats, regNumber);
    }

    public void saveAllToJson() {
        String userFilePath = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/";
        String carFilePath = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/cars/";
        String adFilePath = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/ads/";
        String reservationFilePath = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/reservations/";
        Car car = this.getCar();
        ArrayList<Ad> ads = car.getAds();
        ArrayList<Reservation> reservations = new ArrayList<>();
        for (Ad ad : ads) {
            reservations.addAll(ad.getReservations());
        }
        for (Reservation r : reservations) {
            r.writeToJson(reservationFilePath, r.getRegNumber() + r.getRentalStart().getTime());
        }
        for (Ad ad : ads) {
            ad.writeToJson(adFilePath, ad.getRegNr() + ad.getStartTime().getTime());
        }
        car.writeToJson(carFilePath, car.getRegNumber());
        this.writeToJson(userFilePath, this.getEmail());
    }

    // Takes in a client object and writes it to a JSON file, used for creating a new user in the CreateUser class.
    public static void createUser(Client client) {
        client.writeToJson("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/", client.getEmail());
    }

    // This is a dummy method that is "verifying" if the personal number belongs to the name of the user.
    // In reality would it have to be verified in an official register.
    public static boolean checkIfPersonalNumberMatchWithName(Long personalNumber, String firstName, String lastName) {
        String ownerOfPersonalNumber = firstName + " " + lastName;
        if (ownerOfPersonalNumber.equals(firstName + " " + lastName)) {
            return true;
        } else {
            return false;
        }
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return this.car;
    }
    public void setPersonNumber(long personNumber) {
        this.personNumber = personNumber;
    }
    public boolean getIsBanned() {
        return banned;
    }
    public void setBanned(boolean banned) {
        this.banned = banned;
    }
    public boolean isBanned() {
        return banned;
    }
}

