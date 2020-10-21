package org.example.DaveLevi.RonaAppTests;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class Tests {

    @Test
    void sneltest(){
        Café hetPaardenhoofd = createCafé("Het Paardenhoofd", 0);
           /*
        Special credit to Donnie Bates, Barry McNamee and James Boland for name suggestions.
         */
        LocalDate localDate = LocalDate.now();
        int julianDay = localDate.getDayOfYear();
        System.out.println(julianDay);
        Tafel t1 = maakEentestTafel();
        try {

            hetPaardenhoofd.addTafel(t1);
        } catch(Exception e) {
            System.err.println("Er ging iets fout");
            System.out.println(e);
        }
        hetPaardenhoofd.printTafels();
    }

    @Test
    void testDATE(){
        Tafel t1 = maakEentestTafel();
        Manager.checkDATE_Manager(t1);
    }

    Tafel maakEentestTafel(){
        return Manager.addReservering_Manager();
    }

    @Test
    void printReservering() {
        Tafel nr1 = maakEentestTafel();
        System.out.println(nr1.getReservering().toString());
    }

    Café createCafé(String naam, int aantalTafels){
        Café thatCafé = new Café(naam, aantalTafels);
        return thatCafé;
    }
}