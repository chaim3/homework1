import java.util.Scanner;
public class otherHomwork {
    public static void Weights(){
        Scanner s = new Scanner(System.in);
        System.out.println("How much does the first person way in kg?");
        double Weight1 = s.nextDouble();
        System.out.println("How much does the second person way in kg?");
        double Weight2  = s.nextDouble();
        
        if(Weight1 > Weight2){
            System.out.println("weight1 is heavier than weight2 by " +(double)(Weight1 - Weight2) +"kg" );
        }
        else if( Weight1 < Weight2){
            System.out.println("weight2 is heavier than weight1 by " +(double)(Weight2 - Weight1) +"kg");
        }
        else{
            System.out.println("You weigh the same");
        }
        s.close();
    }
    public static void Sum(){
        Scanner s = new Scanner(System.in);
        System.out.println("what is num1?");
        int num1 = s.nextInt();
        System.out.println("What is num2?");
        int num2 = s.nextInt();
        if(num1 > num2){
            int sum = num1 + num2;
            System.out.println("You'r sum is " + sum);
        }
        else{
            int times = num1 * num2;
            System.out.println("num1 * num2 = " + times);
        }
        s.close();
    }
    public static void bigger(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("What is all three nums ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        if(num1 > num2 && num2 > num3)
            System.out.println("yes");
        
        else 
        System.out.println("No");
        s.close();
    }
    public static void equalSum(){
        Scanner s = new Scanner(System.in);
        int num1, num2;
        System.out.println("what is num1?");
        num1 = s.nextInt();
        System.out.println("what is num2?");
        num2 = s.nextInt();
        if((num1 % 10 + num1 / 10 % 10)==(num2 % 10 + num2 / 10 % 10))
        System.out.println("Its equal");
        else
        System.out.println("Its not equal");
        s.close();
    }
    public static void uperOrLower(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a letter");
        char letter = s.next().charAt(0);
        if(letter>='a' && letter <= 'z')
        System.out.println("Its lower case");
        else
        System.out.println("Its upper case");
        s.close();
        
    }
    public static void ifNum(){
        Scanner s = new Scanner(System.in);
        System.out.println("Write a number");
        char num = s.next().charAt(0);
        if(num > 47 && num < 57){
            System.out.println("Its a number");
        }
        else{
            System.out.println("Its not a num");
        }
        s.close();
    }
    public static void main(String[] args) {
    
    }
}
