public class BaiTap_8_Thetich {
    public static double TheTich(double bankinh)
    {
        return 4/3 * 3.14 * (bankinh * bankinh * bankinh);
    }

    public static void main(String[] args) {
        double TheTichHinhTron = TheTich(2);
        System.out.println(TheTichHinhTron);
    }
}
