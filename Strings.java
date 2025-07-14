public class Strings {
    public static void main(String[] args) throws InterruptedException {

        String a = "Aditya"; // String Pool
        String b = "Aditya"; // String Pool
        System.out.println(a == b);
        String c = new String("Aditya"); // Heap
        System.out.println(a == c);
        String d = new String("Aditya"); // Heap
        System.out.println(c == d);

        // No changes are in string Pool
        String str1 = "Aditya";
        str1.concat(" Garg");
        System.out.println(str1);

        String result = "";
        // This creates new string everytime hence poor performance
        for (int i = 0; i < 10; i++) {
            result = result + "hello";
        }

        // StringBuiler Implemetation
        // char array (16);
        // When full then new char array double the size created and is old copied to
        // new array

        // StringBuilder = Mutable but not thread safe
        System.out.println("StringBuilder----->");
        StringBuilder s1 = new StringBuilder("Hello");
        System.out.println(s1);
        s1.append(" World").toString();
        System.out.println(s1);

        // StringBuffer = Mutable but thread safe
        System.out.println("StringBuffer----->");
        StringBuffer s3 = new StringBuffer("Aditya");
        System.out.println(s3);

        // StringBuilder Not thread Safe
        StringBuilder s4 = new StringBuilder("");
        Task t1 = new Task(s4);
        Task t2 = new Task(s4);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(s4.length());

        // StringBuffer Thread Safe
        StringBuffer s5 = new StringBuffer("");
        Task2 t3 = new Task2(s5);
        Task2 t4 = new Task2(s5);

        t3.start();
        t4.start();
        t4.join();
        t4.join();
        System.out.println(s5.length());

    }

}

class Task extends Thread {
    StringBuilder s;

    public Task(StringBuilder s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            s.append("a");
        }
    }
}

class Task2 extends Thread {
    StringBuffer s;

    public Task2(StringBuffer s) {
        this.s = s;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            s.append("a");
        }
    }
}
