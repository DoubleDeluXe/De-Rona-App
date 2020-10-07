package org.example.DaveLevi.RonaAppTests;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Scanner;


public class TestWerknemers {

    @Test
    void sneltest(){
        LocalDate localDate = LocalDate.now();
        int julianDay = localDate.getDayOfYear();
        System.out.println(julianDay);
        Tafel t1 = maakEentestTafel();

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
}
