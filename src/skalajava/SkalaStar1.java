package skalajava;

public class SkalaStar1 {
    public static void main(String[] args) {
        answer();
    }

    public static void my(){
        for(int i=1; i<=5; i++){
            System.out.println("*".repeat(i));
        }
    }
    public static void answer(){
        int size = 5;
        int floor = 1;

        while(floor <= size){

            for (int i=0; i<floor; i++){
                System.out.print("*");
            }
            System.out.println();
            floor++;
        }
            }
}
