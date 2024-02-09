import java.util.Scanner;
public class weather {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String type;
        float weather, f,w,celsius;
        loop: for(int i =0 ; i<100;i++){
        System.out.println("Would you like to convert from celsius or from fahrenheit");
        type = s.next().toLowerCase();
        
        
        switch (type) {
            case "celsius":
                System.out.println("What is the weather in Celsius");
                 weather = s.nextFloat();
                 f = (weather * 9/5) + 32;
                System.out.println("The weather in fahrenheit is "+f);
                break loop;
            case "fahrenheit":
                System.out.println("What is the wheather in fahrenheit");
                 w = s.nextFloat();
                 celsius = (w -32) * 5/9;
                System.out.println("the tempiture in Celsius is "+celsius);
           
            break loop;
        
            default:
            System.out.println(type+ " is not an option");
                break;
        }
    }
    
    
}
}
