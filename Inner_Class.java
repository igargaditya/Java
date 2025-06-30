class Car {
    private String model;
    private Boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    static public class Color {
        public String color;

        Color(String color) {
            this.color = color;
        }

        public void showColor() {
            System.out.println("The color of the car is " + color);
        }
    }

    class Engine {
        public void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " Engine Was Turned On");
            } else {
                System.out.println(model + " Engine Already Turned On ");
            }
        }

        public void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " Engine Was Turned Off");
            } else {
                System.out.println(model + " Engine Already Turned Off ");
            }
        }
    }
}

// Local Inner Class
class Hotel {
    private int totalRooms;
    private String name;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestname, int numberofRooms) {
        class roomValidator {
            boolean validate() {
                if (guestname == null || guestname.isBlank()) {
                    System.out.println("Invalid name");
                    return false;
                }
                if (numberofRooms < 0) {
                    System.out.println("Number of Rooms should be positive");
                    return false;
                }
                if (reservedRooms + numberofRooms > totalRooms) {
                    System.out.println("Not enough rooms avaiable");
                    return false;
                }
                return true;
            }
        }
        roomValidator roomcheck = new roomValidator();
        if (roomcheck.validate()) {
            reservedRooms += numberofRooms;
            System.out.println(
                    "Reservation Confirmed by " + guestname + " for " + numberofRooms + " rooms in hotel" + name);
        } else {
            System.out.println("Reservation Failed");
        }
    }

}

public class Inner_Class {
    public static void main(String[] args) {
        // Method Inner Class
        Car car = new Car("Toyoto");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();

        // Static Nested Class - inner class not attached with instance and rather the
        // outer class
        // Color of all Car is set to blue
        Car.Color color = new Car.Color("Blue");
        color.showColor();

        // Using Anonymous inner class
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread Created using Anonymous class");
            }
        });
        t1.start();

        // Using Local inner class
        Hotel hotel = new Hotel("Hillton", 20, 10);
        hotel.reserveRoom("Aditya", 8);
        hotel.reserveRoom("Aditya", -2);

    }
}
