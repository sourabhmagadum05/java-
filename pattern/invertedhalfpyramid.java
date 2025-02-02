package pattern;

public class invertedhalfpyramid {
    public static void main(String arag[]){
    for(int i = 4; i >= 0; i--){
        for(int j = 0; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}