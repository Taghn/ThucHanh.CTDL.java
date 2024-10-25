public class baitap_2{
    public static void main(String[] args) {
        double height;
        double weight;
        double bmi;

        // tinh bmi
        height=70;
        weight=195;
        bmi=weight/(height*height)*703;

        // hien thi ket qua
        System.out.println("Gia tri BMI: ");
        System.out.println(bmi);

        // khoi tao gia tri ban dau 
        double height2=70;
        double weight2=195;
        double bmi2=weight2/(height2*height2)*703;

        //hien thi ket qua 
        System.out.println("Gia tri BMI 2: ");
        System.out.println(bmi2);
        System.out.println();
        
        // thuc hanh so 2 ---------------------------------------------
        //dung noi chuoi
        System.out.println("Gia tri BMI 2: " + bmi2);
        
    }
}