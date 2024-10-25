public class BaiTap_6_tinhcongthuc {
    public static double canhC(double canhA, double canhB)
    {
        return Math.sqrt(canhA*canhA + canhB*canhB);
    }

    public static void main(String[] args) {
        System.out.println("Canh huyen can tinh la: " + canhC(12.5, 15.9));
    }
}
