import java.util.Scanner;

public class BaiTap_1Money {
    public static void main(String[] args) {
        int Money;
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Nhap so tien: ");
            Money = console.nextInt();
        }

        if (Money <= 500)
        {
            System.err.println("Cash is dangerously low. Bet carefully.");
        }
        else if (Money <= 1000)
        {
            System.err.println("Cash is somewhat low. Bet moderately.");
        }
        else
        {
            System.err.println("Cash is in good shape. Bet liberally.");
        }
    }
}
