final class Final { // Cant be inherited
    public static final double pie = 3.14;
    public static final double e;
    public final int age;

    public Final() {
        age = 18;
    }

    static {
        e = 2.67;
    }

    public final void finall() {
        System.out.println("Cannot be overriden");
    }

}

public class Final_Keyword {
    public static void main(String[] args) {

    }
}
