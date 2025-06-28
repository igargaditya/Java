public class Wrapper_class {
    public static void main(String[] args) {
        int a = 10;
        Integer b = Integer.valueOf(19); // Boxing
        Integer c = 19; // Auto Boxing

        int d = b.intValue(); // Unboxing
        int e = b; // Auto-unboxing

        System.out.println(a + b + c + d + e);
    }
}
