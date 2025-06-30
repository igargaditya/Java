import java.io.FileReader;
import java.io.IOException;

public class Exceptions {

    // Arithmetic and indexoutofBounds Exception
    public static void numbyDen() {
        double[] numerator = { 30, 10, 100, 2 };
        double[] denominator = { 12, 12, 1, 0 };
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(divide(numerator[i], denominator[i]));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds");
            }
        }
    }

    // Seeing Catching Different Types of Exceptions
    public static double divide(double a, double b) {

        try {
            // Car car = null;
            // car.hashCode();
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return -1;
        } catch (NullPointerException e) {
            System.out.println(e);
            return -1;
        }
    }

    // To learn about stack trace
    public static void level2() {
        int[] arr = new int[4];
        arr[5] = 10;
    }

    public static void level1() {
        level2();
    }

    // To learn about throws and throw keyword
    public static void level3() throws IOException {
        try {
            FileReader file = new FileReader("a.txt");
            file.close();
        } catch (IOException e) {
            System.out.println("File not found");
            // We can send our own Exception Object
            throw new IOException("OOPSIE");
        }
    }

    public static void main(String[] args) throws IOException {

        numbyDen();
        // how to print stack trace
        try {
            level1();
        } catch (Exception o) {
            // o.printStackTrace();
        }

        level3();

    }
}
