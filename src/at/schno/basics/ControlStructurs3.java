// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

package at.schno.basics;

import java.util.Random;

    public class ControlStructurs3 {
        public static void main(String[] args) {
            // Erstelle eine Zufallszahl zwischen 0 und 100
            Random random = new Random();
            int randomNumber = random.nextInt(100);

            System.out.println(randomNumber);

            // Gib die Zufallszahl aus

            // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
            if (randomNumber<20){
                System.out.println("Mini");
            } else if ((randomNumber>=20)&&(randomNumber<=50)){
                System.out.println("Medium");
            } else {
                System.out.println("Large");
            }
            // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
            // Wenn die Zahl größer als 50 ist gib aus "Large"


        }
    }
