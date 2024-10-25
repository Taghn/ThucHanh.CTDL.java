import java.util.Scanner;

public class BaiTap_10_VeCayNoel {
    public static void DrawTree(int maxLenght, int batdau, int dong) {
        int i, j;
        for (i = 1; i <= dong; i++) {
            for (j = 1; j <= ((maxLenght - (batdau + 2 * (i - 1))) / 2); j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (batdau + 2 * (i - 1)); j++) {
                System.out.print("*");
            }

            for (j = 1; j <= ((maxLenght - batdau) / 2); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int batdau = 1;
        try (Scanner console = new Scanner(System.in)) {
            System.out.print("Xin moi nhap so doan: ");
            int n = console.nextInt();

            System.out.print("Xin moi nhap chieu cao: ");
            int dong = console.nextInt();

            int maxLenght = (1 + 2 * n) + 6;

            for (int i = 1; i <= n; i++) {
                DrawTree(maxLenght, batdau, dong);
                batdau = batdau + 2;
            }

            DrawTree(maxLenght, 1, 1);
            DrawTree(maxLenght, 1, 1);
            DrawTree(maxLenght, 7, 1);
        }
    }
}
