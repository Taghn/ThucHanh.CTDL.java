import java.util.ArrayList;
import java.util.Collections;

public class Bai_4_SapXepArrays {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String result;
        list.add("four");
        list.add("score");
        list.add("and");
        list.add("seven");
        list.add("years");
        list.add("ago");

        for (int i=0;i<list.size();i++) {
            result = list.get(i);
            System.out.print(" "+result);
        } 
        System.out.println();

        Collections.sort(list);
        
        for (int i=0;i<list.size();i++) {
            result = list.get(i);
            System.out.print(" "+result);
        }
        System.out.println();
    }
}
