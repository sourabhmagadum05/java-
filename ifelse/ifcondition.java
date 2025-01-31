package ifelse;
import java.util.Scanner;


public class ifcondition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int a = sc.nextInt();
        if(a>18){
            System.out.println("you are adulet");
        }else{
            System.out.println("your are not adult");
        }


    }
}
