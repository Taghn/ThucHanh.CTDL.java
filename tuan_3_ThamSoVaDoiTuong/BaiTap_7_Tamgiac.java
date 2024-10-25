public class BaiTap_7_Tamgiac {
    public static double chuvi(double A, double B, double C)
    {
        return A + B + C;
    }

    public static double nuachuvi(double A, double B, double C)
    {
        return (chuvi(A, B, C) / 2);
    }

    public static double dientich(double A, double B, double C)
    {
        double chuvitamgiac = chuvi(A, B, C);

        return Math.sqrt(chuvitamgiac*(chuvitamgiac - A)*(chuvitamgiac - B)*(chuvitamgiac - C));
    }

    public static void main(String[] args) {
        double ketquachuvi = chuvi(10, 2, 3);
        System.out.println(ketquachuvi);
    }
}
