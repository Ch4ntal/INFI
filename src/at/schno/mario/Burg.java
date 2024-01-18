package at.schno.mario;


import at.schno.cat.Haus;
import at.schno.cat.Katze;

import java.util.ArrayList;
import java.util.Random;
public class Burg {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<mariocharaktere> mmariocharaktereListe = new ArrayList();
        mariocharaktere mariocharaktere = new mariocharaktere ();
        String [] TypListe = {"Toad","Luma","Koopa","Kugelwilli","Kettenhund"};
        String [] ZuhauseListe = {"Pilzkönigreich","Rosalinas Sternenwarte","Wald","unbekannt","Bowsers Festung"};
        String [] FarbeListe = {"schmimmernd","rosegoldig","schwarz","gelb","funkelnd"};
        String [] FaehigkeitListe = {"Karate","großmaulig","rau","samtig","weich","flauschig"};
        int[] alterListe= {3,2,1,4,5,6,10,11};
        for (int i = 1; i<100;i++) {
            //int randomNumber = random.nextInt(max + 1 - min) + min;
            int ci = r.nextInt(TypListe.length - 1 -0) + 0;
            int ni = r.nextInt(ZuhauseListe.length - 1 -0) + 0;
            int fi = r.nextInt(FarbeListe.length - 1 -0) + 0;
            int oi = r.nextInt(FaehigkeitListe.length - 1 -0) + 0;
            mmariocharaktereListe.add(new mariocharaktere(TypListe[ci],ZuhauseListe[ni],FarbeListe[fi],FaehigkeitListe[oi]));
        }
        mariocharaktere.setTyp("");
        mariocharaktere.setZuhause("bösartig");
        mariocharaktere.setFarbe("karriert");
        mariocharaktere.setFaehigkeitliste("flauschig");

        mariocharaktere mariocharaktere2 = new mariocharaktere ("" "nette","weich",6,"weiße","Snow");
        mmariocharaktereListe.add(mariocharaktere2);

        int charakterezaehler = 1;

        Haus haus = new Haus(350,"Heaststraße 24, 88732 Hamburg",8,5);
        haus.getInfo();

}