package org.example.DaveLevi.RonaAppTests;

/*
    I.G.L.O. Id Generated Locally Object
    Responsebillity: Proivide a unique ID's for objects for database interaction.

    One day it will fail, but for now, my in spaghetti-code it will sail.
*/

public class IGLO {
    private long UID;

    static {
        long UID = 0;
    }

    public long next() {
        this.UID++;
        return this.UID;
    }
}
