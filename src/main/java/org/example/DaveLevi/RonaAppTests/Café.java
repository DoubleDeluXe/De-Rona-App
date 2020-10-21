package org.example.DaveLevi.RonaAppTests;

import java.util.ArrayList;

public class Café {


    String CaféNaam;
    int aantalTafels;
    private ArrayList<Tafel> alleTafels = new ArrayList<Tafel>();


    public Café(String caféNaam, int aantalTafels) {
        CaféNaam = caféNaam;
        this.aantalTafels = aantalTafels;

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

    public ArrayList<Tafel> getAlleTafels() {
        return alleTafels;
    }

    public void addTafel(Tafel nieuweTafel) {
//        this.alleTafels = alleTafels;
        alleTafels.add(nieuweTafel);
    }

    public void printTafels() {
        System.out.println("Er zijn totaal " + alleTafels.toArray().length + " tafels met een reservering");
        System.out.println();
        for (int i = 0; i < alleTafels.toArray().length; i++) {
            System.out.println(alleTafels.get(i).toString() + "\n" + alleTafels.get(i).getReservering().toString());
            System.out.println();
        }
    }
}
