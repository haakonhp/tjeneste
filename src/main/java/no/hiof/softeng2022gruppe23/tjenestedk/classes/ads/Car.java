package no.hiof.softeng2022gruppe23.tjenestedk.classes.ads;

import no.hiof.softeng2022gruppe23.tjenestedk.classes.db.JsonFileHandler;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.*;

public class Car extends JsonFileHandler {

    private String brand;
    private String model;
    private int year;
    private String color;
    private int nrOfSeats;
    private String regNumber;
    private ArrayList<Ad> ads;
    public Car() {}

    public Car (String brand, String model, int year, String color, int nrOfSeats, String regNumber){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.nrOfSeats = nrOfSeats;
        this.regNumber = regNumber;
        this.ads = new ArrayList<>();
    }
    public void addAd(Client client, Date startTime, Date endTime, String address, int hourlyPrice, int dailyPrice) {
        Ad ad = new Ad(client, this, startTime, endTime, address, hourlyPrice, dailyPrice);
        this.ads.add(ad);
    }
    //TODO add logic to avoid overlapping
    public void addAd(Ad ad) {
        this.ads.add(ad);
    }
    public void deleteAd(Ad ad) {
        int i = 0;
        int adIndex = -1;
        for (Ad a : this.getAds()) {
            if (a.getStartTime() == ad.getStartTime()) {
                adIndex = i;
            }
            i++;
        }
        if (adIndex != -1) {this.getAds().remove(adIndex);}
    }

    @Override
    public String toString() {
        return StringUtils.capitalize(this.color) +" "+ this.brand +" "+ this.model +" "+ this.year + " with " + this.nrOfSeats + " seats.";
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats(int nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public ArrayList<Ad> getAds() {
        return ads;
    }

    public void setAds(ArrayList<Ad> ads) {
        this.ads = ads;
    }
}
