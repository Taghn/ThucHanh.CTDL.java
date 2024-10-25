public class BaiTap_11ThapPascal {
    public static void Initialize(int tamgiac[][])
    {
        for (int i = 0; i < tamgiac.length; i++)
        {
            tamgiac[i] = new int[i + 1];
            tamgiac[i][0] = 1;  // Gia tri dau day
            tamgiac[i][i] = 1;  // Gia tri cuoi day

            for (int j = 1; j < i; j++)
            {
                tamgiac[i][j] = tamgiac[i - 1][j - 1] + tamgiac[i - 1][j];
            }
        }
    }

    public static void printSpace(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            System.out.print("  ");
        }
    }
    public static void print(int tamgiac[][])
    {
        int spacenum = 10;
        for (int i = 0; i < tamgiac.length; i++)
        {   
            printSpace(spacenum);
            spacenum--;
            for (int j = 0; j < tamgiac[i].length;j++)
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
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int tamgiac[][] = new int[11][];
        Initialize(tamgiac);
        print(tamgiac);
    }
}
