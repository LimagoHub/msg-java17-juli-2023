package de.tiere;

import main.cleaner.DefaultCleaner;

import java.lang.ref.Cleaner;

public class Schwein {

    private String name;
    private int gewicht;

    private static int counter;

    static {
        counter = 0;

    }

    public static int getCounter() {
        return counter;
    }

    public Schwein() {
        this("Nobody");
    }



    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
        counter ++;
        DefaultCleaner.instance.register(this, ()->counter--);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        this.gewicht = gewicht;
    }

    public void fuettern(){
        gewicht ++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
