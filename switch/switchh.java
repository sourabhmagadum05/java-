import java.util.Scanner;

public class switchh {
    public static void main(String arag[]){
        System.out.println(" enter the button :");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
    //     if(button == 1){
    //         System.out.println("hello");
    //     }
    //     else if(button == 2){
    //         System.out.println("namsthe");
    //     }
    //     else if(button == 3){
    //         System.out.println("bonjour");
    //     }else{
    //         System.out.println("invalid number");
    //     }
    switch (button) {
        case 1:
            System.out.println("hello");
            break;
        case 2:
            System.out.println("namsthe");
            break;
        case 3:
             System.out.println("banjur");
             break;
    
        default:
            System.out.println("what you enterd thet was wrong number");
            break;
    }
     }
    
}
