
import java.util.Scanner;

public class Bai_3TinhTong {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        int input = 0;

        System.out.println("Moi nhap so can tinh, nhap [-1] de thoat chuong trinh");
        System.out.print("[" + count + "] = ");
        input = console.nextInt();

        while (input != -1)
        {
            sum += input;
            count++;
            System.out.print("[" + count + "] = ");
            input = console.nextInt();
        }

        System.out.println("Ket qua: Sum = " + sum);
    }
}
