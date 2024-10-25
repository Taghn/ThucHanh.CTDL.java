public class BaiTap_1_Vehinh {
    public static void writeSpace(int num)
    {
        for (int i = 1; i <= num ; i++)
            {
                System.out.print(" ");
            }
    }

    public static void drawTop()
    {
        for (int line = 1; line <= 4; line++)
        {
            System.out.print("|");

            writeSpace(line - 1);

            System.out.print("\\");

            for (int i = 1; i <= (8-2*line); i++)
            {
                System.out.print(".");
            }

            System.out.print("/");

            writeSpace(line - 1);
            
            System.out.println("|");
        }
    }
    
    public static void main(String[] args)
    {
        drawTop();
    }
}
