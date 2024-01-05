package no.hiof.softeng2022gruppe23.tjenestedk.classes.ads;

import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.textfield.TextField;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.db.JsonFileHandler;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.*;

public class Ad  extends JsonFileHandler {
    private long clientNr;
    private String regNr;
    private Date startTime;
    private Date endTime;
    private String address;
    private ArrayList<Reservation> reservations;
    private int hourlyPrice;
    private int dailyPrice;

    public Ad(Client client, Car car, Date startTime, Date endTime, String address, int hourlyPrice, int dailyPrice) {
        this.clientNr = client.getPersonNumber();
        this.regNr = car.getRegNumber();
        this.startTime = startTime;
        this.endTime = endTime;
        this.address = address;
        this.hourlyPrice = hourlyPrice;
        this.dailyPrice = dailyPrice;
        this.reservations = new ArrayList<>();
    }
    public Ad() {
    }

    public static void saveAd(Client activeClient, DateTimePicker fromDateTimePicker, DateTimePicker toDateTimePicker, TextField hourlyPrice, TextField dailyPrice, TextField address) {
        Date fromDate = Date.from(fromDateTimePicker.getValue().toInstant(ZoneId.of("+01:00").getRules().getOffset(LocalDateTime.now())));
        Date toDate = Date.from(toDateTimePicker.getValue().toInstant(ZoneId.of("+01:00").getRules().getOffset(LocalDateTime.now())));

        Ad ad = new Ad(activeClient, activeClient.getCar(), fromDate, toDate, address.getValue(),
                Integer.parseInt(hourlyPrice.getValue()), Integer.parseInt(dailyPrice.getValue()));

        activeClient.getCar().addAd(ad);
        activeClient.saveAllToJson();
    }

    public static void SetNewReservationOnAd(Ad ad, Reservation reservation) {
        ad.writeToJson("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/ads/", ad.getRegNr() + ad.getStartTime().getTime());
        reservation.writeToJson("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/reservations/", reservation.getRegNumber() + reservation.getRentalStart().getTime());
    }

    public boolean addReservation(Reservation reservation) {
        Date rentalStart = reservation.getRentalStart();
        Date rentalEnd = reservation.getRentalEnd();
        // Conditions
        boolean rentalTimeStartsAfterAdStartTime = rentalStart.after(this.startTime) || rentalStart.equals(this.startTime);
        boolean rentalTimeEndsBeforeAdEndTime = rentalEnd.before(this.endTime) || rentalEnd.equals(this.endTime);
        boolean rentalTimeEndsAfterItStarts = rentalEnd.after(rentalStart);
        boolean reservationAdded = false;
        int overlaps = 0;

        if (rentalTimeEndsBeforeAdEndTime && rentalTimeStartsAfterAdStartTime && !this.reservations.isEmpty() && rentalTimeEndsAfterItStarts) {
            for (Reservation adReservation : this.reservations) {
                boolean doesNotOverlapReservationStart = rentalStart.after(adReservation.rentalEnd) || rentalStart.equals(adReservation.rentalEnd);
                boolean doesNotOverlapReservationEnd = rentalEnd.before(adReservation.rentalStart) || rentalEnd.equals(adReservation.rentalStart);
                if (!(doesNotOverlapReservationStart || doesNotOverlapReservationEnd)) {
                    overlaps++;
                }
            }
            if (overlaps == 0) {
                this.reservations.add(reservation);
                reservationAdded = true;
            }
        } else if (this.reservations.isEmpty() && rentalTimeEndsAfterItStarts && rentalTimeEndsBeforeAdEndTime && rentalTimeStartsAfterAdStartTime) {
            this.reservations.add(reservation);
            reservationAdded = true;
        }
        return reservationAdded;
    }

    public static File removeCarFromAd(Client activeClient) {
        // Delete car file and save client to json without car
        File carFile = new File("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/cars/"+ activeClient.getCar().getRegNumber()+".json");
        activeClient.setCar(null);
        String filepath = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/users/";
        activeClient.writeToJson(filepath, activeClient.getEmail());
        return carFile;
    }
    public static void deletaAllAdsForCar(Client activeClient) {
        // Delete all ads from logged in client
        String adFilePath = "src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/ads/";
        for (Ad ad : activeClient.getCar().getAds()) {
            String adFile = ad.getRegNr()+ad.getStartTime()+".json";
            ad.deleteJsonFile(adFilePath + adFile);
        }
    }



    public long getClientNr() {
        return clientNr;
    }

    public void setClient(Client client) {
        this.clientNr = client.getPersonNumber();
    }

    public String getRegNr() {
        return this.regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public int getHourlyPrice() {
        return hourlyPrice;
    }

    public void setHourlyPrice(int hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    public int getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }
}
