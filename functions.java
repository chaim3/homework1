import java.util.Scanner;
import java.util.Random;
    public class functions {
        public static int sheela2(int x,int y){
            int sum = x + y;
            return sum;
            
            
            
        }
        public static int Sheela3(int x){
            int sum = (x%10) + (x/10%10)+(x/100);
            return sum;
        }
        public static int jkl(int r){
            return r*6+2;
        }
        public static double sheela4(int x){
            return Math.random()*Math.pow(10,x);

        }
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        
    //sheela 2
            //sum of nums in sheela2
            //  int z = sheela2(5, 6);
            //  System.out.println("the sum of nums is "+z);
             
    //sheela 3
            //     int x;
       
            //     System.out.println("What is your num");
            //     x = s.nextInt();
            
            //      if(((x<1000) && (x>99)) || ((x>-1000)&&(x<-99))){
            //      System.out.println(Sheela3(x));    
            //      }
            //else{
            //     System.out.println("-1");
            // }
            //     int num;
            //     do{
            //     System.out.println("Write a num");
            //     num = s.nextInt();
            //     System.out.println(jkl(num));
            //    }while(num!=-1);{
            //    }

    //sheela 4
             System.out.println("what num");
             int x = s.nextInt();
             System.out.printf("%.0f",sheela4(x));
        }
        
    }
    

