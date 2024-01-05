package no.hiof.softeng2022gruppe23.tjenestedk.classes.ads;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Ad;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
public interface AdFinder {
    static ArrayList<Ad> getAdsInTimeslot(LocalDateTime from, LocalDateTime to) {
        ZoneOffset offset = ZoneId.of("+01:00").getRules().getOffset(LocalDateTime.now());

        File filepath = new File("src/main/java/no/hiof/softeng2022gruppe23/tjenestedk/db/ads/");
        File[] allAds = filepath.listFiles();
        ArrayList<Ad> ads = new ArrayList<>();
        Date fromTime = Date.from(from.toInstant(offset));
        Date toTime = Date.from(to.toInstant(offset));

        if (allAds != null) {
            for (File ad : allAds) {
                Ad i = new Ad();
                i = i.jsonToObject(ad.getPath(), Ad.class);
                if (i.getStartTime().toInstant().isBefore(fromTime.toInstant()) && i.getEndTime().toInstant().isAfter(toTime.toInstant())) {
                    ads.add(i);
                }
            }
        }
        return ads;
    }
}
