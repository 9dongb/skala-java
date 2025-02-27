package skalajava;

public class SkalaTest9 {
    public static void main(String[] args) {
        String[] arrayOfStrings = { "Amy", "Berry", "Clack", "Ellit" };

        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i].equals(("Clack"))) {
                System.out.println(("hi " + arrayOfStrings[i]));
                break;
            }
        }
    }
}
