import java.util.Scanner;
public class BaiTap_11_SanXuatLich {
    public static void InLich(int firstDay, int numberOfDays)
    {
        boolean isADay = false;
        int NgayTrongTuan = 0;
        int StartDay = 0;
        int Day = 1;
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        System.out.println("+------+------+------+------+------+------+------+");

        for ( int slot = 0; slot < 35; slot++)
        {   
            // Xuong hang sau khi in 7 slot
            if (NgayTrongTuan == 7)
            {
                System.out.print("|");
                System.out.println();
                NgayTrongTuan = 1;
            }
            else
            {
                NgayTrongTuan++;
            }

            // Bat dau in khi dung ngay dau tien cua thang
            if (StartDay == firstDay)
            {
                isADay = true;
            }
            else 
            {
                StartDay++;
            }

            // Neu in du so ngay thi slot con lai trong
            if (Day - 1 == numberOfDays)
            {
                isADay = false;
            }

            //  Bat dau in ngay
            if (isADay)
            {
                if (Day < 10)
                {
                    System.out.print("|   " + Day + "  ");
                    Day++;
                }
                else
                {
                    System.out.print("|  " + Day + "  ");
                    Day++;
                }
            }
            else
            {
                System.out.print("|      ");
            }
            
        }
        System.out.print("|");
        System.out.println();
        System.out.println("+------+------+------+------+------+------+------+");
    }

    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            int ngayDau, soNgay;

            System.out.println("Ngay dau tien trong thang vao thu may? (0 - 6)");
            System.out.println("T2 - T3 - T4 - T5 - T6 - T7 - CN");
            System.out.println("0  - 1  - 2  - 3  - 4  - 5  - 6");
            System.out.print("Chon: ");
            ngayDau = console.nextInt();

            System.out.println("Thang co bao nhieu ngay? (29 - 31)");
            System.out.print("Chon: ");
            soNgay = console.nextInt();

            InLich(ngayDau, soNgay);
        } 
    }
}
