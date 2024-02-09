import java.util.Scanner;
public class notes {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //The printf's

        // System.out.println("whats your number do you want");
        // int n = s.nextInt();
        // System.out.printf("%c,%x,%d",n,n,n,"/n");

        //Array's I think
        String[] g = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        System.out.println("enter a number");
        int num = s.nextInt()-1;
        System.out.println(g[num]);
    }
}
 