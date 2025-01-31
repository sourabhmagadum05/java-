package ifelse;
import java.util.Scanner;

public class ifelseequal {
    public static void main(String arag[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your a th number");
        int a = sc.nextInt();
        System.out.println("enter your b th number");
        int b = sc.nextInt();
        if (a==b){
            System.out.println("a equles to b");
        }
        else if(a>b){
            System.out.println("a is grater than b");
        }
       else if(a<b){
            System.out.println("a is lesser than b");
        }
    }
    
}
