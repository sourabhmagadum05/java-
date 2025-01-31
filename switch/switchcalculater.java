import java.util.Scanner;

public class switchcalculater {
    public static void main(String arag[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your A th number ");
        int a = sc.nextInt();
        System.out.println("enter your B th number");
        int b = sc.nextInt();
        System.out.println("sub option 1 :\ndeff option 2:\nmulti option 3 :\ndevi option 4:");
        int option= sc.nextInt();
        switch(option){
            case 1:
                int sum = a+b;
                System.out.println("A th and B th sum valu is "+sum);
                break;
            case 2:
                int deff = a-b;
                System.out.println("A th and B th valu diff is :"+deff);
                break;
            case 3:
                int mult = a*b;
                System.out.println("A th and B th valu of multification is :"+ mult);
                break;
            case 4:
                int dev= a/b;
                System.out.println("A th and B th devision valu is :"+dev);
                break;
        }
    }
    
}
