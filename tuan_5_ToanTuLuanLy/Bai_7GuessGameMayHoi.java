
import java.util.Random;
import java.util.Scanner;

public class Bai_7GuessGameMayHoi {
    public static void main(String[] args) {
        System.out.println("Day la chuong trinh doan so cho truoc.");
        System.out.println("Xin moi nhap so ma ban muon doan.");

        Scanner console= new Scanner(System.in);
        int count=1;
        Random r = new Random();
        String ketqua;
        int soao=r.nextInt(10)+1;
        System.out.print("So cua ban co phai so "+soao+" khong: ");
        ketqua=console.next();

        while (!ketqua.equalsIgnoreCase("Y"))
        {
            count++;
            soao=r.nextInt(10)+1;
            System.out.print("So cua ban co phai so "+soao+" khong: ");
            ketqua=console.next();
        }
        System.out.println("Toi da doan dung so cua ban sau "+count+" lan.");
    }
}
