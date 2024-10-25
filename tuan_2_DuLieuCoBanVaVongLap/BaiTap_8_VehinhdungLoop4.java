public class BaiTap_8_VehinhdungLoop4 {
    public static void main(String[] args) {
        int i,j;
        for (i = 5; i >= 1; i--)
        {
            // Khoang trang
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
