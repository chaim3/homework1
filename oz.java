import java.util.Scanner;
import java.text.DecimalFormat;
public class oz {
   public static void main(String[] args) {
    //only two numbers after the .
    DecimalFormat decimalFormat=new DecimalFormat("#.##");
    //find out ho many ounces
    Scanner idk= new Scanner(System.in);
    System.out.println("how many liters do you have? ");
    double leaters = idk.nextDouble();
    double answer = leaters * 33.814;
    //to make sure their are 2 numbes after answer
 String formattednum=decimalFormat.format(answer);
    System.out.println("You have "+ formattednum+" ounces");
    double cups = answer / 36;
    
    String gatorade = decimalFormat.format(cups);
    System.out.println("You need to use "+ gatorade+ "cups");
   }
}