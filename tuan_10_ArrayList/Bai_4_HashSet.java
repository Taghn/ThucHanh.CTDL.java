import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Bai_4_HashSet {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = System.getProperty("user.dir") + File.separator + "mission.txt";
        Scanner console= new Scanner(new File("mission.txt"));
        HashSet<String> chuoi = new HashSet<String>();
        while(console.hasNext())
        {   
            chuoi.add(console.next());
        }
        System.out.println("Do dai danh sach la: "+chuoi.size());




    }
}
