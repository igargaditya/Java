
// VIA EXTEND CLASS 
class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hey");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

// VIA INTERFACE

class C implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Yo!");
        }
    }
}

class D implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("YOO YOOO");
        }
    }
}

public class a39_Thread {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority()); // Prints the priority
        // obj2.setPriority(Thread.MAX_PRIORITY); // Sets the priority
        obj1.start(); // starting the threads
        obj2.start();

        Runnable obj3 = new C();
        Runnable obj4 = new D();
        Thread t1 = new Thread(obj3); // Making thread to use start method
        Thread t2 = new Thread(obj4);
        t1.start();
        t2.start();

    }

}

// to make thread extend it to the extend class

// In every thread we need a run method
// We can set the priority of threads and give suggestion to the scheduler
// and We can sleeep the threads so that gap in between

// We can also implement runnable interface but it doesnt have start method
// Can also be shortened using lambda expression to make it short