import java.util.Scanner;

public class BaiTap_2XepLoai {
    public static void main(String[] args) {
        int GradeInput;
        String Rank = "A";
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Nhap diem so: ");
            GradeInput = console.nextInt();
        }
        
        if (GradeInput >= 90)
        {
            Rank = "A";
        }
        else if (GradeInput >= 80)
        {
            Rank = "B";
        }
        else if (GradeInput >= 70)
        {
            Rank = "C";
        }
        else if (GradeInput >= 60)
        {
            Rank = "D";
        }
        else
        {
            Rank = "F";
        }

        System.out.println(Rank);
    }
    
}
