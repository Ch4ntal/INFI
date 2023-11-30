
package at.schno.tictactoe;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args) {
        char[][] field = new char[3][3];
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String[] in = input.split(",");
        int X = Integer.parseInt(in[0]);
        int Y = Integer.parseInt(in[1]);
        System.out.println("Zahl 1: " + X + "Zahl 2: " + Y);


        for (int i = 0; i < 9; i++) {

            if (i % 2 == 0) {

                field[X][Y] = 'o';

            }
            else if (i % 2 == 1){
                field[X][Y] = 'x';
            }


        }


    }
}
