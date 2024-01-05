package no.hiof.softeng2022gruppe23.tjenestedk.classes.ads;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.db.JsonFileHandler;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class Reservation extends JsonFileHandler {
    protected String regNumber;
    protected Client rentalClient;
    protected Date rentalStart;
    protected Date rentalEnd;
    protected long totalPrice;
    protected int rentalHourlyPrice;
    protected int rentalDailyPrice;

    public Reservation(String regNumber, Client rentalClient, Date rentalStart, Date rentalEnd, Ad ad) {
        this.regNumber = regNumber;
        this.rentalClient = rentalClient;
        this.rentalStart = rentalStart;
        this.rentalEnd = rentalEnd;
        this.rentalHourlyPrice = ad.getHourlyPrice();
        this.rentalDailyPrice = ad.getDailyPrice();
        this.totalPrice = calculateTotalPrice();
    }

    public Reservation(LocalDateTime fromTime, LocalDateTime toTime, Ad ad) {
        this.rentalStart = Date.from(fromTime.toInstant(ZoneId.of("+01:00").getRules().getOffset(LocalDateTime.now())));
        this.rentalEnd = Date.from(toTime.toInstant(ZoneId.of("+01:00").getRules().getOffset(LocalDateTime.now())));
        this.rentalHourlyPrice = ad.getHourlyPrice();
        this.rentalDailyPrice = ad.getDailyPrice();
        this.totalPrice = calculateTotalPrice();
    }

    public Client getRentalClient() {
        return rentalClient;
    }

    public void setRentalClient(Client rentalClient) {
        this.rentalClient = rentalClient;
    }

    public Date getRentalStart() {
        return rentalStart;
    }

    public void setRentalStart(Date rentalStart) {
        this.rentalStart = rentalStart;
    }

    public Date getRentalEnd() {
        return rentalEnd;
    }

    public void setRentalEnd(Date rentalEnd) {
        this.rentalEnd = rentalEnd;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public long calculateTotalPrice() {
        LocalDateTime rentalStart = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.rentalStart.getTime()), ZoneId.systemDefault());
        LocalDateTime rentalEnd = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.rentalEnd.getTime()), ZoneId.systemDefault());
        long rentalDurationHours = Duration.between(rentalStart, rentalEnd).toHours();
        long rentalDurationDaily = Duration.between(rentalStart, rentalEnd).toDays();

        if (rentalDurationHours >= 8 && rentalDurationHours <= 23) {
            return rentalDailyPrice * (rentalDurationDaily + 1);
        }
        else if (rentalDurationHours >= 24) {
            return rentalDailyPrice * rentalDurationDaily;
        }
        else {
            return rentalHourlyPrice * rentalDurationHours;
        }
    }
}

