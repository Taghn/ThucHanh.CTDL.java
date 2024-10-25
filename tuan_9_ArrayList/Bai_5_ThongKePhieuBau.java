import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai_5_ThongKePhieuBau {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> ungvien = new ArrayList<>(); 
        ArrayList<String> phieubau = new ArrayList<>();
        int DemPhieu[]= new int[4];

        Scanner input= new Scanner(new File("phieu.txt"));  //doc file
        
        while(input.hasNext()) {  //doc den ki tu cuoi cung
            String name= input.next();
            phieubau.add(name);
            if(!ungvien.contains(name))
            {
                ungvien.add(name);
            }

        }
        System.out.println("list= "+phieubau);

        Collections.sort(ungvien); 
        
        for(int i = 0;i<phieubau.size();i++)
        {
            if(phieubau.get(i).equals("A"))
            {
                DemPhieu[0]++;
            }
            else if(phieubau.get(i).equals("B"))
            {
                DemPhieu[1]++;
            }
            else if(phieubau.get(i).equals("C"))
            {
                DemPhieu[2]++;
            }
            else if(phieubau.get(i).equals("D"))
            {
                DemPhieu[3]++;
            }
        }

        System.out.println("Ung vien\tSo phieu\tTy le bau (%)");
        for (int i=0;i<DemPhieu.length;i++) 
        {
            double TyLe1=phieubau.size()/ungvien.size();
            double TyLe2=(TyLe1/phieubau.size())*100;
            System.out.println(i + "\t\t"+ DemPhieu[i] + "\t\t" + TyLe2 +"%" );
        }
        System.out.println();
        System.out.println("Nguuoi chien thang la: All");

    }
}