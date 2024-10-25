public class BaiTap_9_haimu {
    public static double[] TinhSoMu(int n)
    {
        double array[] = new double[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = Math.pow(2, i + 1);
        }
        return array;
    }

    public static void main(String[] args) {
        double Ketqua[] = TinhSoMu(10);
        for ( int i = 0; i < Ketqua.length; i++ )
        {
            System.out.print(Ketqua[i] + " ");
        }
    }
}
