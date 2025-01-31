package loops;

import java.util.Scanner;

public class student {
    public static void main(String arag[]){
        System.out.println("if you want to enter your marks enter 1\nif you want to exit enter 0");
        Scanner sc = new Scanner(System.in);
        int enter = sc.nextInt();
        if(enter==1){
    int marks;
    do{
        System.out.println("enter your marks");
         marks = sc.nextInt();
        if(marks>=90){
            System.out.println("This is good");
        }
        else if(89>=marks && marks>=60){
            System.out.println("this is also good marks");
        }
        else if(59>=marks){
            System.out.println("this is also good as well because marks dont matter but our effort does");
        }
        }while(enter==1);
    }
        else if(enter==0)
        System.out.println("exit");
}

    }

