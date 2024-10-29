
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Bai_2_LinkedList1 {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>(List.of("10","20","30","40"));
        Print(list);
        XoaDau(list);
        Themdau(list);
        SapXepBeDenLon(list);
        GTLN(list);
        GTNN(list);
        DoiViTri(list);
    }

    public static void Print(LinkedList<String> list) {
        String result;
        System.out.print("1) LinkedList: ");
        for (int i=0;i<list.size();i++) {
            result = list.get(i);
            System.out.print(" "+result);
        }
        System.out.println();
    }

    public static void XoaDau(LinkedList<String> list) {
        String result;
        LinkedList <String> list1 = new LinkedList<>(List.copyOf(list));
        list1.remove(0);
        System.out.print("2) LinkedList: ");
        for (int i=0;i<list1.size();i++) {
            result = list1.get(i);
            System.out.print(" "+result);
        }
        System.out.println();
    }

    public static void Themdau(LinkedList<String> list) {
        String result;
        LinkedList <String> list2 = new LinkedList<>(List.copyOf(list));
        list2.add(0,"50");
        System.out.print("3) LinkedList: ");
        for (int i=0;i<list2.size();i++) {
            result = list2.get(i);
            System.out.print(" "+result);
        }
        System.out.println();
    }

    public static void SapXepBeDenLon(LinkedList<String> list) {
        String result;
        LinkedList <String> list3 = new LinkedList<>(List.copyOf(list));
        System.out.print("4) LinkedList: ");
        Collections.sort(list3);
        for (int i=0;i<list3.size();i++) {
            result = list3.get(i);
            System.out.print(" "+result);
        }
        System.out.println();
    }

    public static void GTLN(LinkedList<String>list) {
        String result;
        LinkedList <String> list4 = new LinkedList<>(List.copyOf(list));
        System.out.print("5) GTLN:  " + Collections.max(list4) );
        System.out.println();
    }

    public static void GTNN(LinkedList<String>list) {
        String result;
        LinkedList <String> list5 = new LinkedList<>(List.copyOf(list));
        System.out.print("6) GTNN:  " + Collections.min(list5) );
        System.out.println();
    }

    public static void DoiViTri(LinkedList<String>list) {
        String result;
        LinkedList <String> list6 = new LinkedList<>(List.copyOf(list));
        System.out.print("7) LinkedList:  ");
        Collections.swap(list6, 1, 3);
        for (int i=0;i<list6.size();i++) {
            result = list6.get(i);
            System.out.print(" "+result);
        }
        System.out.println();
    }
}
