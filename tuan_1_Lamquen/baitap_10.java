public class baitap_10 {
    public static void drawline(){
        System.out.print("+");
        for ( int i=1;i<=10;i++){
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println();
    }
    public static void drawtop() {
        int i,j;
        for (i=1;i<=5;i++) {
            // |
            System.out.print("|");
            // space
            for(j=1;j<=i-1;j++) {
                System.out.print(" ");
            }
            // \\
            System.out.print("\\");
            // .
            for(j=1;j<=(10-2*i);j++) {
                System.out.print(".");
            }

            // /
            System.out.print("/");
            // space
            for(j=1;j<=i-1;j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            // xuong dong 
            System.out.println();
        }
        
    }
    public static void drawdown() {
        int i,j;
        for (i=5;i>=1;i--) {
            // |
            System.out.print("|");
            // space
            for(j=1;j<=i-1;j++) {
                System.out.print(" ");
            }
            // /
            System.out.print("/");
            // .
            for(j=1;j<=(10-2*i);j++) {
                System.out.print(".");
            }

            // \\
            System.out.print("\\");
            // space
            for(j=1;j<=i-1;j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            // xuong dong 
            System.out.println();
        }   
    }






    public static void main(String[] args) {
        drawline();
        drawtop();
        drawdown();
        drawline();
        drawdown();
        drawtop();
        drawline();
    }   
}
