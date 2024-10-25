
import java.util.Scanner;

public class BaiTap_5Input {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int Negative = 0;
        int sum = 0;

        System.out.print("Nhap so luong: ");
        int amount = console.nextInt();
        int arr[] = new int[amount];

        for (int i = 0; i <= amount - 1; i++)
        {
            System.out.print("Nhap gia tri [" + (i + 1) + "]: ");
            int input = console.nextInt();
            if (input < 0)
            {
                Negative++;
            }
            arr[i] = input;
            sum = sum + input;
        }

        for (int i = 0; i <= amount - 1; i++)
        {
            System.out.print("#" + i + "= " + arr[i]);
            System.out.println();
        }
        System.out.println("Tong = " + sum);
        System.out.println("Tong so am (<0) = " + Negative);

        console.close();
    }
}
