
import java.util.Scanner;

public class BaiTap_9Color {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Ban muon mau gi? ");
        String input = console.next();

        if (input.equalsIgnoreCase("R"))
        {
            System.out.println("Ban da chon [Red].");
        }
        else if (input.equalsIgnoreCase("G"))
        {
            System.out.println("Ban da chon [Green].");
        }
        else if (input.equalsIgnoreCase("B"))
        {
            System.out.println("Ban da chon [Blue].");
        }
        else
        {
            System.out.println("Mau khong xac dinh: " + input);
        }
    }
}
