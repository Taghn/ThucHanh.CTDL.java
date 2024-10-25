
import java.util.Scanner;

public class Bai_4GuessGame {
    public static void main(String[] args) {
        int KetQua = 42;
        int UserInput;
        int count = 0;
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Guess the number!");
            System.out.print("Answer: ");
            UserInput = console.nextInt();

            while (KetQua != UserInput)
            {
                System.out.print("Wrong! Again: ");
                UserInput = console.nextInt();
                count++;
            }
        }
        
        System.out.println("Correct! You Won!");
        System.out.println("Guess counted: " + count);
    }
}
