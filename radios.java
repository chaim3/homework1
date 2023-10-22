import java.util.Scanner;
public class radios {
public static void ex1() {
    Scanner s = new Scanner(System.in);
    System.out.println("What is the radios");
    double radios = s.nextDouble();
    double area = 3.14 * radios * radios;
    double hekef =  2 * 3.14 * radios;
    System.out.println("your hekef is "+ hekef);
    System.out.println("your area is "+ area);
} 

public static void main(String[] args){
    ex1();
}
}