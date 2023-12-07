import java.util.Scanner;

public class main{
    public static void main(String[] args){
       
        Scanner s = new Scanner(System.in);
        System.out.println("Print a number from 5-10");
        int num = s.nextInt();
        for(int i = 0; num < 10; num++){
            if(num == 5){
            System.out.println("*        *");
            }
            else if(num == 6){;
            System.out.println("**      **");
        }
            else if(num == 7){
            System.out.println("***    ***");
            }
            else if(num == 8){ 
            System.out.println("****  ****");
            }
            else if(num == 9){
            System.out.println("**********");
            }
            s.close();
        }
    }
}