package org.example.DaveLevi.RonaAppTests;

import java.util.Date;

public class Tafel {

    int nr;
    Reservering Reservering;

    public Tafel(int nr, Reservering resr) {
        this.nr = nr;
        this.Reservering = resr;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public Reservering getReservering() {
        return Reservering;
    }

    public void setReservering(Reservering resr) {
        this.Reservering = resr;
    }
}
