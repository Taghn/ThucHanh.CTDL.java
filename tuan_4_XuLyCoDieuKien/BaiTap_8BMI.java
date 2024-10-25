import java.util.Scanner;

public class BaiTap_8BMI {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Nhap chieu cao (cm): ");
        double Height = console.nextDouble();

        System.out.print("Nhap can nang (kg): ");
        double Weight = console.nextDouble();

        double BMI = (Weight / (Height * Height) * 703);

        if (BMI < 16)
        {
            System.out.println("Ket qua: Gay do III");  // :))))
        }
        else if (BMI < 17)
        {
            System.out.println("Ket qua: Gay do II");  // :))))
        }
        else if (BMI < 18.5)
        {
            System.out.println("Ket qua: Gay do II");  // :))))
        }
        else if (BMI < 30)
        {
            System.out.println("Ket qua: Binh thuong");
        }
        else if (BMI < 35)
        {
            System.out.println("Ket qua: Beo phi do I");
        }
        else if (BMI < 40)
        {
            System.out.println("Ket qua: Beo phi do II");
        }
        else
        {
            System.out.println("Ket qua: Beo phi do III");
        }
    }
}
