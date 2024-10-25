public class BaiTap_9_VehinhLoopvaFunction {
    public static void DrawLine() {
        System.out.print("+");

        for (int i = 1; i <= 6; i++)
        {
            System.out.print("-");
        }

        System.out.print("+");
        System.out.println();
    }

    public static void DrawTop() {
        int i,j;
        for (i = 1; i <= 3; i++)
        {
            // Dau '|'
            System.out.print("|");

            //Space
            for (j = 1; j <= i - 1; j++)
            {
                System.out.print(" ");
            }

            // Dau '\'
            System.out.print("\\");
            
            // Dau '*'
            for (j = 1; j <= (6-2*i); j++)
            {
                System.out.print("*");
            }

            // Dau '/'
            System.out.print("/");

            // Space
            for (j = 1; j <= i - 1; j++)
            {
                System.out.print(" ");
            }

            // Dau '|'
            System.out.print("|");

            // xuong dong
            System.out.println();
        }
        
    }

    public static void DrawBottom() {
        int i,j;
        for (i = 3; i >= 1; i--)
        {
            // Dau '|'
            System.out.print("|");

            //Space
            for (j = 1; j <= i - 1; j++)
            {
                System.out.print(" ");
            }

            // Dau '\'
            System.out.print("/");
            
            // Dau '*'
            for (j = 1; j <= (6-2*i); j++)
            {
                System.out.print("*");
            }

            // Dau '/'
            System.out.print("\\");

            // Space
            for (j = 1; j <= i - 1; j++)
            {
                System.out.print(" ");
            }

            // Dau '|'
            System.out.print("|");

            // xuong dong
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DrawLine();
        DrawTop();
        DrawBottom();
        DrawLine();
    }
}
