import java.util.Scanner;

public class Bai_2_NhietDoTrungBinhCoDemNgayCao {
    public static void main(String[] args) {
        //nhap so ngay`
        System.out.println("Ban muon nhap nhiet do bao nhieu ngay ?");

        
        Scanner console = new Scanner(System.in);
        int days= console.nextInt();
        double[] dayso = new double[days];
        //dat bien tong
        double sum=0;

        //su dung vong lap de nhap so va tinh tong cung luc
        for (int i=0;i<days;i++)
        {
            System.out.print("Nhiet do ngay thu "+(i+1)+" la: ");
            int next=console.nextInt();
            sum +=next;
            dayso[i]=next;
        }

        //tinh trung binh
        double trungbinh=sum/days;

        //dem ngay cao hon trung binh
        int count=0;
        for(int i=0;i<dayso.length;i++)
        {
            if(dayso[i]>trungbinh)
            {
                count++;
            }
        }
        System.out.println("Nhiet do trung binh = " + trungbinh);
        System.out.println("So ngay co nhiet do lon hon nhiet do trung binh la " + count);
    }
}
