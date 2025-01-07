
class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class a40_Thread_Mutation {

    public static void main(String[] args) throws InterruptedException {

        Counter c1 = new Counter();

        Runnable obj3 = () -> {
            for (int i = 0; i < 500; i++) {
                c1.increment();
            }
        };
        Runnable obj4 = () -> {
            for (int i = 0; i < 500; i++) {
                c1.increment();
            }
        };

        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c1.count);
    }
}

// start method is used to start the thread
// Join method is used wait for the completion of the threadsn