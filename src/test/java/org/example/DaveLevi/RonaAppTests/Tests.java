package org.example.DaveLevi.RonaAppTests;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class Tests {

    @Test
    void sneltest(){
        Café hetPaardenhoofd = createCafé("Het Paardenhoofd");
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

    Café createCafé(String naam){
        Café thatCafé = new Café(naam, 6);
        return thatCafé;
    }
}
