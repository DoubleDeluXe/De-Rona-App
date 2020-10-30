package org.example.DaveLevi.RonaAppTests;

import java.util.ArrayList;

public class Café {

    static {
        ArrayList<Tafel> totaalTafels;
    }

    String CaféNaam;
    int aantalTafels;
    ArrayList<Tafel> totaalTafels = new ArrayList<>();

    public Café(String caféNaam, int aantalTafels, ArrayList<Tafel> totaalTafels) {
        CaféNaam = caféNaam;
        this.aantalTafels = aantalTafels;
        this.totaalTafels = totaalTafels;
    }

    public Café(String caféNaam, int aantalTafels) {
        Café(caféNaam, aantalTafels, new ArrayList<Tafel>);
    }

    public String getCaféNaam() {
        return CaféNaam;
    }

    public void setCaféNaam(String caféNaam) {
        CaféNaam = caféNaam;
    }

    public int getAantalTafels() {
        return aantalTafels;
    }

    public void setAantalTafels(int aantalTafels) {
        this.aantalTafels = aantalTafels;
    }

    public ArrayList<Tafel> getTotaalTafels() {
        return totaalTafels;
    }

    public void addTafel(Tafel nieuweTafel) {
        boolean teVeelTafels;
        teVeelTafels = aantalTafels <= totaalTafels.toArray().length;
//        this.alleTafels = alleTafels;
        if (teVeelTafels) {
            try {
                throw new TafelListException
                        ("Het maximaal aantal tafels is al bereikt");
            } catch (Exception e) {
                System.err.println("Er ging iets fout");
                System.out.println(e);
            }

            totaalTafels.add(nieuweTafel);
        }
    }

    public void printTafels() {
        System.out.println("Er zijn totaal " + totaalTafels.toArray().length + " tafels met een reservering");
        System.out.println();
        for (int i = 0; i < totaalTafels.toArray().length; i++) {
            System.out.println(totaalTafels.get(i).toString() + "\n" + totaalTafels.get(i).getReservering().toString());
            System.out.println();
        }
    }
}
