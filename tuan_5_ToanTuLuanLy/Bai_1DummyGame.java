import java.util.Random;
import java.util.Scanner;

public class Bai_1DummyGame {
    public static void main(String[] args) {
        // Initiaize
        Random r = new Random();
        try (Scanner console = new Scanner(System.in)) {
            int RandomNum = r.nextInt(11) + 1;  // 1 -> 10
            int UserGuess;
            int count = 1;
            
            //Start the game
            System.out.println("Guess the number from [1] -> [10]");
            System.out.print("Guess: ");
            UserGuess = console.nextInt();

            while (UserGuess != RandomNum)
            {
                count++;
                System.out.print("Wrong! ");
                System.out.print("Again: ");
                UserGuess = console.nextInt(11) + 1;
                
            }

            System.out.println("You won! ");
            System.out.println("Number of Guesses: " + count);
        }
    }
}
