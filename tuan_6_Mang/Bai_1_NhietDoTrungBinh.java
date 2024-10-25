import java.util.Scanner;

public class Bai_1_NhietDoTrungBinh {
    public static void main(String[] args) {
        //nhap so ngay`
        System.out.println("Ban muon nhap nhiet do bao nhieu ngay ?");

        Scanner console = new Scanner(System.in);
        int days= console.nextInt();

        //dat bien tong
        double sum=0;

        //su dung vong lap de nhap so va tinh tong cung luc
        for (int i=1;i<=days;i++)
        {
            System.out.print("Nhiet do ngay thu "+i+" la: ");
            int next=console.nextInt();
            sum +=next;
        }

        //tinh trung binh
        double trungbinh=sum/days;
        System.out.println("Nhiet do trung binh = " + trungbinh);

    }
}
