class AdityaException extends Exception {

    public AdityaException(String s) {
        super(s); // Calls the constructor of parent class
    }
}

record Alien(int id, String name) {
    public Alien { // Compact Canonical Constructor
        if (id == 0) {
            throw new IllegalArgumentException("Nah");
        }

    }
}

public class a50_RecordClass {
    public static void main(String[] args) {

        Alien a1 = new Alien(1, "Aditya");
        Alien a2 = new Alien(2, "Pearl");

        System.out.println(a1);
        System.out.println(a1.name());
        System.out.println(a1.equals(a2));
    }
}

// TO make a class that will only make object we have write so many functions
// like the tostring hascode isequal mehthods.
// TO improve upon this we use record class
// Record -> Doesnot have a default constructor
// All instance variable are private and final
// Immutatble and cannot be changed only used when we hace to send only data
