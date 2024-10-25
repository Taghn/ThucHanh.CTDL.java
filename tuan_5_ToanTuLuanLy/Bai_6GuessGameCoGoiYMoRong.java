import java.util.Scanner;

public class Bai_6GuessGameCoGoiYMoRong {
    
    public static void main(String[] args) {
        //gioi thieu
        System.out.println("Day la chuong trinh doan so cho truoc.");
        System.out.println("Xin moi nhap so ma ban muon doan.");

        int so=44;

        Scanner console = new Scanner(System.in);
        
        int sodoan= console.nextInt();

        int cout=0;
        while ((sodoan < 0 || sodoan >= 100))
        {
            System.out.println("So ban nhap da vuot gioi han.");
            System.out.println("Xin moi nhap lai so ban doan [0-99].");
            sodoan = console.nextInt();
        }
        while (sodoan!=so)
        {
            System.out.print("Ban da doan sai...(");

            //goi y 
            int hit=0;
            if((sodoan/10==so/10)||(sodoan/10==so%10))
            {
                hit++;
            }
            if((sodoan/10!=sodoan%10)&&(sodoan%10==so/10)||(sodoan%10==so%10))
            {
                hit++;
            }
            System.out.print("Ban da doan dung " +hit+ " so)\n");
            System.out.println("Xin moi nhap lai");
            sodoan=console.nextInt();
            cout++;
        }
        System.out.println("Chuc mung ban da doan dung. So lan ban da doan la "+cout+" lan.");
    }
}

