package loops;

import java.util.Scanner;

public class table {
    public static void main(String arag[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the table number :");
        int table = sc.nextInt();
        int i;
        for( i=0; i<11; i++){
            int sum=table*i;
            System.out.println("2*"+i+"="+sum);
            
        }
       
    }
}
