package at.schno.Würfelspiel;
import java.util.Random;
public class würfelspiel {
    public static void main(String[] args) {
        Random random = new Random();
        int PC = 0;
        int User = 0;

        for (int i = 0; i < 6; i++) {
            int randomUser = random.nextInt(6) + 1;            int randomPC = random.nextInt(6) + 1;

            System.out.println("PC:" + randomPC + " user:" + randomUser);

            if (randomPC > randomUser) {
                PC++;
            } else if (randomPC == randomUser) {
                PC++;
                User++;
            } else if (randomPC < randomUser) {
                User++;
            }
        }
            if (PC > User) {
                System.out.println("PC won");
            } else if (PC == User) {
                System.out.printf("draw");
            } else if (PC < User) {
                System.out.println("Wins PC:" + PC);
                System.out.println("Wins User:"+ User);
                System.out.println("User won");
            }



    }
}
