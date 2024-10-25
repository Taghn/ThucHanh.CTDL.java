import java.util.Scanner;

public class BaiTap_3XulyString{
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Nhap [Yes] / [No]: ");
            String Input = console.next();

            if (Input.equalsIgnoreCase("yes"))
            {
                System.out.println("Ban da nhap [Yes]");
            }
            else if (Input.equalsIgnoreCase("no"))
            {
                System.out.println("Ban da nhap [No]");
            }
        }
    }
}
