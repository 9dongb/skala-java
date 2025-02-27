package skalajava;

public class SkalaTest6 {
    public static void main(String[] args) {
        print0ddNumbers();
    }

    public static void print0ddNumbers() {
        int number = 0;
        while (number < 12) {
            number++;
            if (number % 2 == 0) {
                continue;
            }
            System.out.println("홀수=" + number);
        }
    }
}
