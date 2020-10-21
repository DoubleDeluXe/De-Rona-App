package org.example.DaveLevi.RonaAppTests;

public class Tafel {

    int nr;
    int zitplaatsen;
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

    public int getZitplaatsen() {
        return zitplaatsen;
    }

    public void setZitplaatsen(int zitplaatsen) {
        this.zitplaatsen = zitplaatsen;
    }

    public Reservering getReservering() {
        return Reservering;
    }

    public void setReservering(Reservering resr) {
        this.Reservering = resr;
    }

    @Override
    public String toString() {
        return "Tafel{" +
                "nr=" + nr +
                ", zitplaatsen=" + zitplaatsen +
                ", Reservering=" + Reservering +
                '}';
    }
}
