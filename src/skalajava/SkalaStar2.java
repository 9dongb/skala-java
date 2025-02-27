package skalajava;

public class SkalaStar2 {
    public static void main(String[] args) {
        answer();
    }
    public static void my(){

    }
    public static void answer(){
        int floor = 1;
        int size = 5;
        for (int i = floor; i<=size; i++){
            for (int j =0; j< size-1; j++){
                System.out.print(" ");
            }
            for (int j=0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
