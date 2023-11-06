import java.util.Scanner;
 
public class tm {

    public static void main(String[] args) {







        






















        
        final float Start_Fee =  (float)10.20;
        final float Price_Per_KM = (float) 1.30;
        final float Price_Per_Luggage = (float) 2.50;

        Scanner p = new Scanner(System.in);
        System.out.print("How many KM do you want to travel?: ");
        float KM = p.nextFloat();
        System.out.print("How much luggage do you have?: ");
        float luggage = p.nextFloat();

        float total = Start_Fee + (KM * Price_Per_KM) + (luggage * Price_Per_Luggage);
        System.out.print("Your Fee is : " + total);
    }
}

