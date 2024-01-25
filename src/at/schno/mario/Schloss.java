package at.schno.mario;

import java.util.ArrayList;

public class Schloss {
    private int flaeche;
    private String koenigreich;
    private int maxcharaktere;

    public int getmaxcharaktere() {
        return maxcharaktere;
    }

    public void setmaxcharaktere(int maxcharaktere) {
        this.maxcharaktere = maxcharaktere;
    }

    private ArrayList<mariocharaktere> mariocharaktereListe;

    public Schloss(int flaeche, String koenigreich, int maxcharaktere) {
        this.flaeche = flaeche;
        this.koenigreich = koenigreich;
        this.mariocharaktereListe = new ArrayList<>();
        this.maxcharaktere = maxcharaktere;
    }

    public int getFlaeche() {
        return flaeche;
    }

    public void setFlaeche(int flaeche) {
        this.flaeche = flaeche;
    }

    public String getkoenigreich() {
        return koenigreich;
    }

    public void setkoenigreich(String koenigreich) {
        this.koenigreich = koenigreich;
    }

    public void getInfo() {
        System.out.println("maxcharaktere: "+ this.maxcharaktere +
                "\nFlaeche:" + this.flaeche );

    }

    public void addmariocharaktere(mariocharaktere mariocharaktere) {
        if (mariocharaktereListe.size() >= this.maxcharaktere) {
            System.out.println("Der/Die König/in will nicht mehr als " + this.maxcharaktere + " Bewohner im Schloss!!");
        } else {
            mariocharaktereListe.add(mariocharaktere);
        }
    }
    public void getcharacterinBurg () {
        for (mariocharaktere k: mariocharaktereListe) {
            k.getInfo();
        }

    }
}

