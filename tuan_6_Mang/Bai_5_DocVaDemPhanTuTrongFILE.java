
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai_5_DocVaDemPhanTuTrongFILE {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = System.getProperty("user.dir") + File.separator + "tally.txt";
        Scanner console= new Scanner(new File("tally.txt"));
        int [] count = new int[5];//mang chua dem so
        while (console.hasNextInt())
        {
            int next = console.nextInt(); 
            count[next]++;
        }
        System.out.println("Gia tri\tSo luong");
        for (int i=0;i<count.length;i++) 
        {
            System.out.println(i + "\t"+ count[i]);
        }
    }
}
