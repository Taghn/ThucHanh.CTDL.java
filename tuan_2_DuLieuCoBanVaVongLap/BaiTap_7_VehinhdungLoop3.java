public class BaiTap_7_VehinhdungLoop3 {
    public static void main(String[] args) {
        int i,j;
        for (i = 1; i <= 5; i++)
        {
            // Space
            for (j = 1; j <= (i-1); j++)
            {
                System.out.print(" ");
            }

            // *
            for (j = 1; j <= (11-2*i); j++)
            {
                System.out.print("*");
            }

            // xuong dong
            System.out.println();
        }
    }
}
