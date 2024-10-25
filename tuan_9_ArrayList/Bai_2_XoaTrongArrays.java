import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai_2_XoaTrongArrays {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = System.getProperty("user.dir") + File.separator + "speech.txt";
        Scanner console= new Scanner(new File("speech.txt"));
        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("a");
        list.add("to");
        list.add("time");
        list.add("of");
        list.add("in");

        


    }
}
