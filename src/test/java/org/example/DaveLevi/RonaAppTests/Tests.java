package org.example.DaveLevi.RonaAppTests;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;


public class Tests {

    @Test
    void createreserveringTest() {
        Café hetPaardenhoofd = createCafé("Het Paardenhoofd", 5);
        hetPaardenhoofd.addTafel(Manager.addReservering());
    }

    @Test
    void sneltest() {
        Café hetPaardenhoofd = createCafé("Het Paardenhoofd", 5);
           /*
        Special credit to Donnie Bates, Barry McNamee and James Boland for name suggestions.
         */
        LocalDate localDate = LocalDate.now();
        int julianDay = localDate.getDayOfYear();
        System.out.println(julianDay);
        Tafel t1 = maakEentestTafel();
        hetPaardenhoofd.addTafel(t1);
        hetPaardenhoofd.printTafels();
    }

    @Test
    void testDATE() {
        Tafel t1 = maakEentestTafel();
//        Manager.checkDATE_Manager(t1);
    }

    Tafel maakEentestTafel() {
        LocalDate vandaag = LocalDate.of(2020,2,1);
        LocalTime time = LocalTime.of(10,0);
        Reservering resr = new Reservering(vandaag, time);
        Tafel deTafel = new Tafel(1,resr);
        return deTafel;
    }

    @Test
    void printReservering() {
        Tafel nr1 = maakEentestTafel();
        System.out.println(nr1.getReservering().toString());
    }

    Café createCafé(String naam, int aantalTafels) {
        Café thatCafé = new Café(naam, aantalTafels);
        for (int i = 0; i < aantalTafels; i++){

        }
        return thatCafé;
    }

    @Test
    void createCafeMetTafelsMetIGLO() {

    }
}