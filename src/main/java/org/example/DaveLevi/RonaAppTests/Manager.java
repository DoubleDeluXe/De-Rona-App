package org.example.DaveLevi.RonaAppTests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    private static int nextResrNr = 1;
    private ArrayList<Tafel> whiteboard;
    private static final int TIJDSLOT_MAX = 4;
    private static final int TIJDSLOT_MIN = 1;

    public static Tafel addReservering_Manager() {

        LocalDate vandaag = LocalDate.now();
        int julianVandaag = vandaag.getDayOfYear();

        System.out.println("Vandaag is het dag: " + julianVandaag);
        System.out.println("Welke dag wilt u een reservering maken?");
        int reserveringsDag = inputGetal("De datum");
        System.out.println("De reservering wordt geplaats op dag: " + reserveringsDag);
        System.out.println("Welk tijdslot wilt u? 1, 2, 3 of 4?");
        int tijdslot = inputGetal("Het reserveringsslot");
        System.out.println("Uw gekozen tijdslot is: " + tijdslot);
        return createReservering_Manager(reserveringsDag, tijdslot);
    }

    private static Tafel createReservering_Manager(int reserveringsDag, int tijdslot) {
        String tafelnaam = "T" + nextResrNr;
        String reserveringNummer = "R" + nextResrNr;
        Reservering r1 = new Reservering(reserveringsDag, tijdslot);
        Tafel t1 = new Tafel(nextResrNr, r1);
        nextResrNr++;
        return t1;
    }

    private static int inputGetal(String subject) {
        Scanner eye = new Scanner(System.in);
        while (!eye.hasNextInt()) {
            System.out.println(subject + " dient een getal te zijn, probeer het opnieuw!");
            eye.next();
        }
        return eye.nextInt();
    }

    public static void checkDATE_Manager(Tafel t1) {
        LocalDate vandaag = LocalDate.now();
        int julianVandaag = vandaag.getDayOfYear();
        int reserveringsDag = t1.getReservering().getJulian();
        int reserveringsTijdslot = t1.getReservering().getTijdslot();
        if (reserveringsDag < julianVandaag) {
            System.err.println("ERROR: De reserveringsdag ligt in het verleden!");
        } else {
            System.out.println("De reserverings dag is mogelijk");
        }
        if (TIJDSLOT_MIN > reserveringsTijdslot || reserveringsTijdslot > TIJDSLOT_MAX) {
            System.err.println("ERROR: Het opgegeven tijdslot ligt buiten het geldige berijk(1 t/m 4)");
        } else {
            System.out.println("Het opgegeven tijdslot is open");
        }
    }
}