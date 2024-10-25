public class BaiTap_2_BMI_concatenate {
    public static void main(String[] args) {
        double height;
        double weight;
        double bmi;
        
        height = 70;
        weight = 195;
        bmi = weight / (height*height) * 703;

        System.out.println("Gia tri BMI: " + bmi);

        double height2;
        double weight2;
        double bmi2;

        height2 = 70;
        weight2 = 195;
        bmi2 = weight2 / (height2*height2) * 703;

        System.out.println("Gia tri  BMI 2: " + bmi2);
    }
}
