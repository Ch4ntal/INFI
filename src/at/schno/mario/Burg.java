package at.schno.mario;


import at.schno.mario.mariocharaktere;

import java.util.ArrayList;
import java.util.Random;
public class Burg {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<mariocharaktere> mmariocharaktereListe = new ArrayList();
        mariocharaktere mariocharaktere = new mariocharaktere();
        String[] TypListe = {"Toad", "Luma", "Koopa", "Kugelwilli", "Kettenhund"};
        String[] ZuhauseListe = {"Pilzkönigreich", "Rosalinas Sternenwarte", "Wald", "unbekannt", "Bowsers Festung"};
        String[] FarbeListe = {"schmimmert", "ist rosegolden", "ist schwarz", "ist gelb", "funkelt"};
        String[] FaehigkeitListe = {"kann Karate", "hat Flügel", "wurde mit dem Katzenpowerup zur Katze", "kommt aus PaperMario"};
        for (int i = 1; i < 100; i++) {
            //int randomNumber = random.nextInt(max + 1 - min) + min;
            int ci = r.nextInt(TypListe.length - 1 - 0) + 0;
            int ni = r.nextInt(ZuhauseListe.length - 1 - 0) + 0;
            int fi = r.nextInt(FarbeListe.length - 1 - 0) + 0;
            int oi = r.nextInt(FaehigkeitListe.length - 1 - 0) + 0;
            mmariocharaktereListe.add(new mariocharaktere(TypListe[ci], ZuhauseListe[ni], FarbeListe[fi], FaehigkeitListe[oi]));
        }
        mariocharaktere.setTyp("Luma");
        mariocharaktere.setZuhause("Rosalinas Sternenwarte");
        mariocharaktere.setFarbe("rosegold");
        mariocharaktere.setFaehigkeit("kann Karate");

        mariocharaktere mariocharaktere2 = new mariocharaktere("Luma", "Rosalinas Sternenwarte", "schimmernd", "kann Karate");
        mmariocharaktereListe.add(mariocharaktere2);

        int charakterezaehler = 1;

        Schloss Schloss = new Schloss(350, "Pilzkönigreich", 9);
        Schloss.getInfo();
//System.out.println("Meine Katze "+katze.getName() + " ist " + katze.getAlter() + " Jahre alt!");
        for (mariocharaktere m : mmariocharaktereListe) {
            System.out.println("Der Bewohner gehört der Species " + m.getTyp() + " an," + m.getFarbe() + " ,kommt aus " + m.getZuhause() + " und " + m.getFaehigkeit() + ".");


            Schloss.addmariocharaktere(m);
        }

        Schloss.getcharacterinBurg();
    }
}