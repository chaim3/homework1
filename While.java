import java.util.Scanner;
import java.text.DecimalFormat;
public class While {
    public static void Average_grade(){
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.##");
        double count = 0, g, grade = 0,average;
        g = 0;
        while(g != -1){
            count++;
            System.out.println("What is your final grade");
            g = s.nextDouble();
            grade += g;
        }
        grade = (grade+1);
        count--; 
        average = grade/count;
        String a = d.format(average);
        System.out.println("your average is " + a);
        


        
    }
    public static void Basketball(){
        Scanner s = new Scanner(System.in);
        int count = 0, h;
        h = 0;
        while(h != -1){
           System.out.println("What is your height in cm? /nwrite -1 when done."); 
           h = s.nextInt();
            if(h >= 170 && h <= 180)
            count ++;
        
            }
            System.out.println("you have "+ count +" player of valid height");
           
        }

    public static void main(String[] args) {
        Basketball();
    }
    
}
