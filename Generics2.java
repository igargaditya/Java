import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box {
    public <T> Box(T value) {

    }

    public <T> void printarray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public <T> void display(T element) {
        System.out.println("Generic Method Used");
        System.out.println(element);
    }

    public void display(int element) {
        System.out.println("Int Method Used");
        System.out.println(element);
    }
}

enum Operations {
    Add, Subtract, Multiply, Divide;

    public <T extends Number> double operation(T a, T b) throws Exception {
        switch (this) {
            case Add:
                return a.doubleValue() + b.doubleValue();
            case Subtract:
                return a.doubleValue() - b.doubleValue();
            case Multiply:
                return a.doubleValue() * b.doubleValue();
            case Divide:
                return a.doubleValue() / b.doubleValue();
            default:
                throw new Exception("No");
        }
    }
}

public class Generics2 {
    public static void main(String[] args) throws Exception {
        Box box = new Box(1);
        Integer[] arr = { 1, 2, 3, 4 };
        String[] arr1 = { "Hello", "I", "am" };
        box.printarray(arr);
        box.printarray(arr1);

        box.display(1);
        box.display("Aditya");

        System.out.println(Operations.Add.operation(10, 20));

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 34));
        printarray(array);
        System.out.println("Sum ->" + sum(array));
    }

    public static <T> void printarray(ArrayList<T> List) {

        for (T o : List) {
            System.out.print(o + " ");
        }
    }

    public static double sum(List<? extends Number> arr) {
        double sum = 0;
        for (Number o : arr) {
            sum += o.doubleValue();
        }
        return sum;
    }

}
