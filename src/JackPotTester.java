import java.util.Random;

public class JackPotTester {
    public static void main(String[] args) {

        boolean do_while = true;
        int counter = 0;
        Random random = new Random();
        JackPot winner = new JackPot(7, 7, 7);

        do {
            JackPot game = new JackPot(random.nextInt(10),
                    random.nextInt(10),
                    random.nextInt(10));

            if (winner.equals(game)) {
                System.out.println(game.toString());
                System.out.println("Wygrana!!!");
                do_while = false;
            } else {
                System.out.println(game.toString());
                System.out.println("Zagraj jeszcze raz :)");
                counter++;
            }
        } while (do_while);
        System.out.println("Wygrałeś za " + counter + " razem.");
    }
}
