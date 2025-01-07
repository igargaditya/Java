class a36Static {
    static {
        System.out.println("Class is Loaded");
    }
}

class a36 {
    public void show() throws ClassNotFoundException {
        Class.forName("a36Static");
        Class.forName("a36stat");
    }
}

public class a36_Throws {
    public static void main(String[] args) {
        a36 obj = new a36();

        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Error");
        }
    }
}
