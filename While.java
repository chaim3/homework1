import java.util.Scanner;
import java.text.DecimalFormat;
public class While {
    public static void Average_grade(){
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.##");
        double count = 0, g = 0, grade = 0,average;
       
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
        int count = 0, h = 0;
        
        while(h != -1){
           System.out.println("What is your height in cm? /n write -1 when done."); 
           h = s.nextInt();
            if(h >= 170 && h <= 180)
            count ++;
        
            }
            System.out.println("you have "+ count +" player of valid height");
             
        }
        public static void Test(){
            Scanner s =  new Scanner(System.in);
            int count = 0, num1,num2;
            double mana, big = 0;
            do{
                System.out.println("what is num1?");
                num1 = s.nextInt();
                System.out.println("what is num2?");
                num2 = s.nextInt();
                count++;
                System.out.println("The sum is "+ num1 + num2);
                if(num2 == 0 ){
                    System.out.println("indivisible");
                }
                else{
                    System.out.println("The division is" + (double) num1/num2);
                    mana = s.nextDouble();
                    if(mana>big){
                        big = mana; 
                    }

                }

            }while(count < 30);{
                System.out.println(big);
            }
        }


    public static void main(String[] args) {
        Test();
    }
    
}
