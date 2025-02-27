package skalajava;

public class SkalaTest7 {
    public static void main(String[] args) {
        print0ddNumbers(0);
    }

    public static void print0ddNumbers(int number) {
        do {
            number++;
            if (number % 2 == 0) {
                continue;
            }
            System.out.println("홀수" + number);
        } while (number < 12);
    }

}
