public class Bai_4_RutGonThapPascal {
    public static void thietlaptamgiac(int[][] tamgiac) {
        for(int i=0;i<tamgiac.length;i++)
        {
            tamgiac[i]=new int[i+1]; //thiet lap gia tri mang cua hang i
            tamgiac[i][0]=1;  // gia tri dau cua moi hang
            tamgiac[i][i]=1;    // gia tri cuoi moi hang

            //quy luat tao gia tri tai hang i dua vao gia tri i-1
            for(int j=1 ; j<i;j++)
            {
                tamgiac[i][j]=tamgiac[i-1][j-1]+tamgiac[i-1][j];
            }


        }
    }
    public static void printmatrix(int[][] tamgiac) {
        for(int i=0;i<tamgiac.length; i++)
        {
            //in lan luot gia tri tai hang i
            for(int j=0;j<tamgiac[i].length;j++)
            {
                System.out.printf("%d",tamgiac[i][j]);
                if (tamgiac[i][j] <= 9)
                {
                    System.out.print("   ");
                }
                else if (tamgiac[i][j] <= 99)
                {
                    System.out.print("  ");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            //sau lenh for la ket thuc hang i chung ta xuong dong
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int[][] tamgiac= new int[10][];
        thietlaptamgiac(tamgiac);
        printmatrix(tamgiac);
    }
}
