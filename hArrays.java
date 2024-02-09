import java.util.Scanner;
public class hArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int[] a = new int[10];
         for(int i=0;i<10;i++){
             System.out.println("write a num");
             int n = s.nextInt();
             a[i]=n;
         }
          for(int j=9; j >= 0;j--){
          System.out.printf("%d, ",a[j]);
      }
     

    if(a[0]==a[4]){
         System.out.println("Yes");
     }
     else{
         System.out.println("No");
     }
   System.out.println(a[2]);
}
}
