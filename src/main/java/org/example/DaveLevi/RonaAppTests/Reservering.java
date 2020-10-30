package org.example.DaveLevi.RonaAppTests;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservering {
    private LocalDate datum;
    private LocalTime tijd;

    public Reservering(LocalDate datum, LocalTime tijd) {
        this.datum = datum;
        this.tijd = tijd;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalTime getTijd() {
        return tijd;
    }

    public void setTijd(LocalTime tijd) {
        this.tijd = tijd;
    }

    @Override
    public String toString() {
        return "Reservering{" +
                "datum=" + datum +
                ", tijd=" + tijd +
                '}';
    }
}