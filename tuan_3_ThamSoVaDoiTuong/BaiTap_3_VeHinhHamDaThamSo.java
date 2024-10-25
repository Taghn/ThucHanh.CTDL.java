public class BaiTap_3_VeHinhHamDaThamSo {
    public static void writeChars(char symbol, int num)
    {
        for (int i = 1; i <= num; i++)
        {
            System.out.print(symbol);
        }
    }

    public static void main(String[] args) {
        writeChars('=', 20);
        System.out.println();
        for (int i = 1; i <= 10; i++)
        {
            writeChars('>', i);
            writeChars(' ', 20-2*i);
            writeChars('<', i);
            System.out.println();
        }
    }
}
