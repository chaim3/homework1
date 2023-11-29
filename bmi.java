import java.util.Scanner;

import java.text.DecimalFormat;

public class bmi{
    public static void main(String[] args) {
        DecimalFormat decimalFormat=new DecimalFormat("#.##");
        Scanner s=new Scanner(System.in);
        
        System.out.println("what is your height in meters?: ");
        double h = s.nextDouble();
        System.out.println("how much do you weigh in kg?: ");
        
        double w = s.nextDouble();
        double BMI = w/(h*h);
        String f = decimalFormat.format(BMI);
        System.out.println("Your BMI is " + f);
        s.close();

    }
    
}
