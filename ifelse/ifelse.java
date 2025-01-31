package ifelse;
import java.util.Scanner;

public class ifelse {
    public static void main(String arag[]){
        System.out.println("enter your number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 2;
        if(a % b == 0 ){
            System.out.println("this is even number");
        }else{
            System.out.println("this is odd number");
        }
    }
    
}
