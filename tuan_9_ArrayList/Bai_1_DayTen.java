
import java.util.ArrayList;

public class Bai_1_DayTen {
    public static void main(String[] args) {
        ArrayList<String> bands= new ArrayList<>();
        String result;
        
        bands.add("Hoa");
        bands.add("Mai");
        bands.add("Dung");
        bands.add("Hoang");
        bands.add("Hai"); 
        bands.add("Vinh");
        bands.add("Tu");
        bands.add("Bao");
        bands.add("Anh");

        System.out.print("1) Array: ");
        for (int i=0;i<bands.size();i++) {
            result = bands.get(i);
            System.out.print(" "+result);
        }
        System.out.println();

        bands.add(2,"Tung");
        
        System.out.print("2) Array: ");
        for (int i=0;i<bands.size();i++) {
            result = bands.get(i);
            System.out.print(" "+result);
        }
        System.out.println();

        bands.add("Oanh");

        System.out.print("3) Array: ");
        for (int i=0;i<bands.size();i++) {
            result = bands.get(i);
            System.out.print(" "+result);
        }
        System.out.println();

        System.out.print("4) Array:  ");
        String Vitri=bands.get(7);
        System.out.print(Vitri);
        System.out.println();

        System.out.print("5) Array:  ");
        int ChieuDaiDay = bands.size();
        System.out.print(ChieuDaiDay);
        System.out.println();
        
        bands.remove(3);
        bands.remove(6);
        System.out.print("6) Array: ");
        for (int i=0;i<bands.size();i++) {
            result = bands.get(i);
            System.out.print(" "+result);
        }
        System.out.println();

        System.out.print("7) Array: ");
        bands.set(2, "Toang");
        for (int i=0;i<bands.size();i++) {
            result = bands.get(i);
            System.out.print(" "+result);
        }
        System.out.println();

        System.out.print("8) Array:  ");
        System.out.print(ChieuDaiDay);
    }
}