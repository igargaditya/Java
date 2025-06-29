abstract class Vehicle {

    public abstract void accelerate();

    public abstract void deaccelerate();

    public void running() {
        System.out.println("vehicle is running");
    }

}

class Van extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Van Accelerating");
    }

    @Override
    public void deaccelerate() {
        System.out.println("Van Deaccelerating");
    }

    public void speed() {
        System.out.println("Speed of van is shown");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        // Object of abstract class cant be created
        Vehicle v1 = new Van();
        // v1.speed(); // Not accessible
        v1.running();
        v1.accelerate();

        Van v2 = new Van();
        v2.running();
        v2.speed();
    }
}
