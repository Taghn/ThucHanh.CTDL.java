public class baitap_8 {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=5;i++){
            //in khoang trang
            for (j=1;j<=(i-1);j++) {
                System.out.print(" ");
            }

            // in ky tu *
            for ( j=1; j<=(11-2*i);j++){
                System.out.print("*");
            }
            // sau khi ket thuc 1 hang xuong hang
            System.out.println();
        }
        
        for ( i=5; i>=1; i--){
            // in khoang trang
            for(j=1;j<=(i-1);j++)
            {
                System.out.print(" ");
            }
            // in ky tu *
            for ( j=1; j<=(11-2*i);j++)
            {
                System.out.print("*");
            }

            //sau khi ket thuc 1 hang xuong hang 
            System.out.println();
        }
    }
}
