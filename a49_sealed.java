sealed class A permits B, C {
    public void show1() {
        System.out.println("In A");
    }
}

final class B extends A {
    public void show2() {
        System.out.println("In B");
    }
}

sealed class C extends A permits D {
    public void show3() {
        System.out.println("In C");
    }
}

final class D extends C {
    public void show4() {
        System.out.println("In D");
    }
}

public class a49_sealed {
    public static void main(String[] args) {

        D obj1 = new D();
        obj1.show1();
    }
}

// When we want to use a parent class only accessable to some classes then we
// use sealed classes
// Permits comes at the end