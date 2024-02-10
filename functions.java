import java.util.Scanner;
import java.util.Random;
    public class functions {
        public static int fgh(int x,int y){
            int sum = x + y;
            return sum;
        }
        public static int sumOfThreeNums(int x){
            int sum = (x%10) + (x/10%10)+(x/100);
            return sum;
        }
        public static double amntOfNums(int x){
            
            return Math.random()*Math.pow(10,x);

        }
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        
    //sheela 2
            //sum of nums in fgh
            //  int z = fgh(5, 6);
            //  System.out.println("the sum of nums is "+z);
             
    //sheela 3
            //      int x;
       
            //      System.out.println("What is your num");
            //      x = s.nextInt();
            
            //       if(((x<1000) && (x>99)) || ((x>-1000)&&(x<-99))){
            //       System.out.println(sumOfThreeNums(x));    
            //       }
            // else{
            //      System.out.println("-1");
            //  }
                

    //sheela 4
            //int x;
            //do{
            //System.out.println("what num");
            //x = s.nextInt();
            //System.out.printf("%.0f",amntOfNums(x));
            //String str = String.valueOf(x);
            //System.out.println();
            //int length = str.length() - 1;
            
            //if(x>0)
            //System.out.println(x + " The length of your num is " + str.length());
            //else
            //System.out.println(x + " The length of your num is " + length);

            //}while(x!=-1);{
            //System.out.println("Hope you enjoyed");
            //}
        }
        
    }
    

