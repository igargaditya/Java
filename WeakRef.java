import java.lang.ref.WeakReference;

class Phone {
    private String name;
    private String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

}

public class WeakRef {
    public static void main(String[] args) {
        WeakReference<Phone> ph = new WeakReference<Phone>(new Phone("Iphone", "14"));
        System.out.println(ph.get());
        System.gc();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        System.out.println(ph.get());

    }
}
