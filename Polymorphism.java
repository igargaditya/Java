class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("..");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Woof");
    }

    public void saybye() {
        System.out.println("Bye " + getName());
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Meow");
    }

    public void saybye() {
        System.out.println("Bye " + getName());
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Childs and parents inhertied methods and variables accessible
        Dog dog = new Dog("Lucy");
        dog.sayHello();
        dog.saybye();

        // Parents methods and variables accessbile
        Animal animal = new Animal("Loki");
        animal.sayHello();

        // Run time polymorphism
        // Methods and variables of parents is accessible and those methods which are
        // overriden by child
        Animal doggy = new Dog("Mils");
        doggy.sayHello();
        // doggy.saybye(); // Not Accessible

        Animal catty = new Cat("Bils");
        catty.sayHello();

    }
}
