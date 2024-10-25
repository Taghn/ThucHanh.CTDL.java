import java.util.Scanner;

public class BaiTap_4Input {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Nhap so luong: ");
        int amount = console.nextInt();
        int arr[] = new int[amount];
        int sum = 0;

        for (int i = 0; i <= amount - 1; i++)
        {
            System.out.print("Nhap gia tri [" + (i + 1) + "]: ");
            int input = console.nextInt();
            arr[i] = input;
            sum = sum + input;
        }

        for (int i = 0; i <= amount - 1; i++)
        {
            System.out.print("#" + i + "= " + arr[i]);
            System.out.println();
        }
        System.out.println("Tong = " + sum);

        console.close();
    }
}
