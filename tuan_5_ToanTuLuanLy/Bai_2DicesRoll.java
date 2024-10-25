import java.util.Random;
import java.util.Scanner;

public class Bai_2DicesRoll {
    public static void main(String[] args) {
        // initialize
        Random r = new Random();
        try (Scanner console = new Scanner(System.in)) {
            int count = 1;
            int sum = 0;
            String User;

            // Start
            System.out.println("2 Dices Roll. Get 7 to win");
            System.out.println("Enter [P] to play");
            System.out.println("      [Q] to quit");
            User = console.next();


            if (User.equalsIgnoreCase("Q"))
            {
                System.out.println("Leaving...");
                count = 0;
            }

            while (User.equalsIgnoreCase("P"))
            {
                int Dice1 = r.nextInt(6) + 1;   // 1 -> 6
                int Dice2 = r.nextInt(6) + 1;

                sum = Dice1 + Dice2;

                System.out.println("You got: [" + sum + "].");
                if (sum == 7)
                {
                    System.out.println("You won! ");
                    break;
                }

                System.out.println("Enter [P] to play again");
                System.out.println("      [Q] to quit");
                User = console.next();
                if(User.equalsIgnoreCase("Q"))
                {
                    System.out.println("Leaving...");
                    break;
                }

                count++;
            }
            System.out.println("Rolls: " + count);
        }
    }
}
