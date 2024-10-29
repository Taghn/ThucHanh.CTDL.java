
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Bai_1_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("Hung","Vuong","University","of","Ho","Chi","Minh"));
        print(list);
        themdau(list);
        print3(list);
        XoaChuoiChan(list);
        ChuoiLonNhat(list);
        HienThiTungGiaTri(list);
    }
    
    public static void print(LinkedList<String> list) {
        String result;

        System.out.print("1) LinkedList: ");
        for (int i=0;i<list.size();i++) {
            result = list.get(i);
            System.out.print(" "+result);
        }
        System.out.println();
    }

    public static void themdau(LinkedList<String> list) {
        String result;
        LinkedList <String> list1 = new LinkedList<>(List.copyOf(list)); 
        list1.add(0,"Hello!");

        System.out.print("2) LinkedList: Them Hello vao dau.... ");
        System.out.println();
    }

    public static void print3(LinkedList<String> list) {
        String result;
        LinkedList <String> list2 = new LinkedList<>(List.copyOf(list)); 
        System.out.print("3) LinkedList: ");
        for (int i=0;i<list2.size();i++) {
            result = list2.get(i);
            System.out.print(" "+result);
        }
        System.out.println();
    }
    
    public static void XoaChuoiChan(LinkedList<String> list) {
        LinkedList <String> list3 = new LinkedList<>(List.copyOf(list)); 
        String result;
        System.out.print("3,4) LinkedList: ");
        Iterator <String> y = list3.iterator();
        while (y.hasNext())
        {
            String Quan = y.next();
            if (Quan.length()%2==0)
            {
                y.remove();
            }
        }
        for (int i=0;i<list3.size();i++) {
            result = list3.get(i);
            System.out.print(" "+result);
        }
        System.out.println();
    }

    public static void ChuoiLonNhat(LinkedList<String> list) {
        LinkedList <String> list4 = new LinkedList<>(List.copyOf(list)); 
        String result;
        System.out.print("5) LinkedList: ");
        Iterator <String> z = list4.iterator();
        String Max = z.next();
        while (z.hasNext())
        {
            String Element = z.next();
            if (Element.length()>Max.length())
            {
                Max=Element;
            }
        }
        System.out.println(Max);
    }

    public static void HienThiTungGiaTri(LinkedList<String> list) {
        String result;
        System.out.println("6) LinkedList: ");
        Iterator <String> z = list.iterator();
        while (z.hasNext())
        {
            String Element = z.next();
            System.out.println(Element + "\t" + Element.length());
            
        }
    }
}