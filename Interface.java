interface Vehicle {
    public static final int mileage;

    public abstract void accelerate();

    public abstract void deaccelerate();

    public void static set(int mileage){
        this.mileage = mileage ; 
    }

    public static void accessinterface() {
        System.out.println("From interface only");
    }

    public default void accessclass() {
        System.out.println("From object of class which implements ");
    }

}

class Truck implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Truck Accelerate");
    }

    @Override
    public void deaccelerate() {
        System.out.println("Truck Deaccelarate");
    }

}

public class Interface {
    public static void main(String[] args) {

        Truck truck = new Truck();

        // Abstract Method could be called from objects of implemented class
        truck.accelerate();
        truck.deaccelerate();

        // Static Constant can be called from Interface directly, class implementing it
        // directly and object of the class which implements it
        // System.out.println(truck.mileage);
        System.out.println(Truck.mileage);
        System.out.println(Vehicle.mileage);

        // Static Method can be called only from the interface
        Vehicle.accessinterface();

        // Default Methods can be called both fun interface and objects which implement
        // it
        truck.accessclass();

    }
}
