import java.util.Scanner;

public class BaiTap_6Input {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int Min = 1; int Max = 0;
        int sum = 0;

        System.out.print("Nhap so luong: ");
        int amount = console.nextInt();
        int arr[] = new int[amount];

        for (int i = 0; i <= amount - 1; i++)
        {
            System.out.print("Nhap gia tri [" + (i + 1) + "]: ");
            int input = console.nextInt();
            if (i == 0) { Min = input;} // Initialize
            if (input < Min)
            {
                Min = input;
            }
            else if (input > Max)
            {
                Max = input;
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
        System.out.println("Min = " + Min);
        System.out.println("Max = " + Max);

        console.close();
    }
}
