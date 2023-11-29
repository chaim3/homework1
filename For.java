import java.util.Scanner;
public class For{
    public static void squared(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        double num= s.nextDouble();
        for(int i = 1; i <= num; i++)
        System.out.println(i + " " + i*i);
    }
//odd number
public static void odd(){
        
        Scanner s = new Scanner(System.in);
        int j = 0;
        for (int i = 0; i < 10; i++){
        System.out.println("print a number");
        int num = s.nextInt();
        
        if(num % 2 != 0){
            j = j + 1;
        }
    }
     
        System.out.println("You have "+ j + "odd nums");
    }
    public static void three(){
        Scanner s = new Scanner(System.in);
        double j = 0;
        System.out.println("Enter a number");
        double num = s.nextDouble();
        
        for (double i = 0; i <= num; i++){
        
        if(i % 3 == 0){
            j = j + 1;
        }
        
        
    }

    System.out.println("You have "+ j +" that is devisible by three");
}
    public static void DThree(){
         Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a number");
        double num = s.nextDouble();
        
        for (double i = num; i >= 0; i--){
        
        if(i % 3 == 0){
            System.out.println(i);
        }
        
        
    }

    }
    public static void Boom(){
        Scanner s = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        double num = s.nextDouble();
        System.out.println("");
        //for
        for (double i = 1; i <= num; i++){
        
        if(i % 7 == 0)
            System.out.println("boom");
        
        else
        System.out.println(i);
        
        
    }
}

    public static void main(String[]args){
        Boom();
    }
}
