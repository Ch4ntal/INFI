package at.schno.basics;

import java.util.Random;

public class ControlStructurs8 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10, 30);
        int gesamt = 0 ;
        boolean isFinished = true;
        while (isFinished) {
            gesamt = gesamt + randomNumber;
            System.out.println(randomNumber);
            System.out.println(gesamt);
            randomNumber = random.nextInt(10, 30);
            System.out.println(randomNumber);
            if ((randomNumber = 15)||(randomNumber = 25)) {
                isFinished = false;
            }
        }
    }
}
