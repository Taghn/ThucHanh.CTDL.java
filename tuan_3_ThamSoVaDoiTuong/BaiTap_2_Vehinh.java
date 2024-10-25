public class BaiTap_2_Vehinh {
    public static void writeSpace(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            System.out.print(" ");
        }
    }

    public static void drawSymbol(char a)
    {
        System.out.print(a);
    }

    public static void main(String[] args) {
        char symbols[] = {'*', '!', '`', '<', '>'};
        int space = 3;
        for (int line = 0; line < 4; line++)
        {
            drawSymbol(symbols[line]);
            writeSpace(space);
            if (line == 3)
            {
                drawSymbol(symbols[line + 1]);
            }
            else
            {
                drawSymbol(symbols[line]);
            }
            System.out.println(line + " % 2 = " + line % 2);

            if (line % 2 == 0)
            {
                space += 2;
            }
            else
            {
                space += 3;
            }
            
            System.out.println();
        }

        
    }
}
