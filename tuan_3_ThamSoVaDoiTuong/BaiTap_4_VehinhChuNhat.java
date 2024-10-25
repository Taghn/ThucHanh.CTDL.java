public class BaiTap_4_VehinhChuNhat {
    public static void VehinhChuNhat(int ngang, int doc)
    {
        // in hang
        for (int i = 1; i <= ngang; i++ )
        {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 1; i <= doc - 2; i++)
        {
            System.out.print("*");
            for (int j = 1; j <= ngang - 2; j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        // in hang
        for (int i = 1; i <= ngang; i++ )
        {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        VehinhChuNhat(10, 5);
    }
}
