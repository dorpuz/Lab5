import java.util.Arrays;
import java.util.Random;

public class Lab4_2 {
    public static void main(String[] args) {
        int[] winner = {7, 7, 7};
        int[] game = new int[3];
        int counter = 0;
        boolean do_while = true;

        Random random = new Random();

        do {
            for (int i = 0; i < game.length; i++) {
                game[i] = random.nextInt(10);
            }

            System.out.println("Twoje liczby to: ");
            for (int i = 0; i < game.length; i++) {
                System.out.print(game[i] + " ");
            }

            if (Arrays.equals(winner, game)) {
                System.out.println("\nWygrana!");
                do_while = false;

            } else {
                System.out.println("\nZagraj jeszcze raz");
                counter++;
            }
        } while (do_while);
        System.out.println(counter);
    }
}


