package org.example.DaveLevi.RonaAppTests;

public class Reservering{

    private int julian;
    private int tijdslot;

    public Reservering(int Julian, int tijdslot){
        setJulian(Julian);
        setTijdslot(tijdslot);
    }

    public int getJulian() {
        return julian;
    }

    public void setJulian(int julian) {
        this.julian = julian;
    }

    public int getTijdslot() {
        return tijdslot;
    }

    public void setTijdslot(int tijdslot) {
        this.tijdslot = tijdslot;
    }
}
