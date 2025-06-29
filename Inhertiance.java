class Grandparent {
    private String name;
    private int age;

    Grandparent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Grandparent Called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Parent extends Grandparent {
    Parent(String name, int age) {
        super(name, age);
        System.out.println("Parent Called");
    }

    public static void parentMethod() {
        System.out.println("Some Parent Method");
    }
}

class Child extends Parent {
    Child(String name, int age) {
        super(name, age);
        System.out.println("Child Called");
    }

    public void childMethod() {
        System.out.println("Some Child Method");
        super.parentMethod();
    }
}

public class Inhertiance {
    public static void main(String[] args) {
        Child ch = new Child("Aditya", 22);
        ch.childMethod();

        Parent.parentMethod(); // No object made and hence no construtor called

    }
}
