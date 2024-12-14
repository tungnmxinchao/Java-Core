import java.util.ArrayList;

public class MainUnsafe { public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    Thread thread1 = new WorkerThreadUnsafe(list);
    Thread thread2 = new WorkerThreadUnsafe(list);

    thread1.start();
    thread2.start();

    try {
        thread1.join();
        thread2.join();
    } catch (InterruptedException e) {
        System.out.println(e.getMessage());
    }

    System.out.println("ArrayList: " + list);
}

}
