import java.util.Scanner;

class addIt{
    public static void main(String[] args) {
        
        Scanner mynum = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1=mynum.nextInt();
        System.out.println("Enter another number that you want to add");
        int num2= mynum.nextInt();
        int sum = num1 + num2;
        System.out.println("You'r numbers = " + sum);
        mynum.close();

    }
}