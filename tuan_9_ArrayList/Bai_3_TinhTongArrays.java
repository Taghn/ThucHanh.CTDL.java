import java.util.ArrayList;

public class Bai_3_TinhTongArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int result;
        list.add(13);
        list.add(47);
        list.add(15);
        list.add(9);
        list.add(5);
        list.add(2);
        list.add(89);

        for (int i=0;i<list.size();i++) {
            result = list.get(i);
            System.out.print(" "+result);
        }
        System.out.println();
        
        int sum=0;
        for (int i=0;i<list.size();i++) {
            result = list.get(i);
            sum+=result;
            
        }
        System.out.println();
        System.out.println("Tong Day La: "+sum);
    }
}
