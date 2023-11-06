import java.util.Scanner;
import java.text.DecimalFormat;
public class jc{
    public static void jumper() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how far you jumped in meters ");
        double j1 = s.nextInt();
        double j2 = s.nextInt();
        double j3 = s.nextInt();
        double average = (j1 + j2 + j3) / 3;
        if(average > 5){
            System.out.println("You passed");
        }
        else{
            System.out.println("You failed ");
        }

    }
    public static void candy(){
        Scanner s = new Scanner(System.in);
        System.out.println("How many packages do you have with 11 candies");
        int p11 = s.nextInt();
        System.out.println("How many packages do you have with 25 candies");
        int p25 = s.nextInt();
        System.out.println("How many kids are their");
        int kids = s.nextInt();
        double answer = p11 * 11 + p25 * 25 ;
        kids *= kids;
        int left = (int)answer - kids;
        if(answer > kids){
            System.out.println("You have enough candy for evryone!:");
            System.out.println("You have "+ left +"left");
        }
        else{
            System.out.println("You dont have enough candy");
        }
    }
    public static void Buses(){
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#");
        System.out.println(" Welcome to chaim's buses our buses can hold 51 people \n How many kids do you have? ");
        double kids = s.nextDouble();
        System.out.println("How many teachers ");
        double teachers = s.nextDouble();
        double amount = teachers + kids;
        double buses = amount / 51;
        buses = Math.ceil(buses);
        String b = d.format(buses);
        System.out.println("You need "+ b +" bus:");
        
     
    }
    public static void lottery(){
      Scanner s = new Scanner(System.in);
      System.out.println("What is the last 2 digits of your lottery ticket:");
      int lot = s.nextInt();
     
      if(lot == 25){
          System.out.println("You won 111 NIS!!");
      }
      else if(lot == 33){
          System.out.println("You won 251 NIS");
      }
      else{
        System.out.println("You lost");
      }
    }
public static void main(String[] args) {
    lottery();
}
    
}
