
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bai_3_ThuatToanSieveOfEratosthenes {
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = console.nextInt();

        List<Integer> Songuyento=Day(max);
         System.out.println("SO nguyen to tu 2 toi "+ max +" la: ");
         System.out.println(Songuyento);
     }

    public static List<Integer>Day(int max) {
        LinkedList<Integer> Dayso = new LinkedList<>();
        LinkedList<Integer> Songuyento = new LinkedList<>();
        for (int i=2;i<=25;i++)
        {
           Dayso.add(i);
        }
        System.out.println("Day so: " + Dayso);
        System.out.println("So nguyen to: " + Songuyento);
        //tim so nguyen to 
        while(!Dayso.isEmpty())
        {
           int front=Dayso.remove(0);
           Songuyento.add(front);

           Iterator<Integer> number = Dayso.iterator();
           while (number.hasNext())
           {
              int y = number.next();
              if(y % front == 0) {
                number.remove();
              }
           }
        }
        return Songuyento;
    }
}
