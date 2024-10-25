import java.util.Scanner;

public class BaiTap_10TinhTong {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0.0;

        System.out.print("Nhap n: ");
        int n = console.nextInt();

        for (int i = 1; i <= n; i++)
        {
            sum += 1.0/i;
        }
        
        System.out.println("Ket qua: " + sum);

        console.close();
    }
}
