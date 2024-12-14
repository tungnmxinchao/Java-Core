import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(2);

        System.out.println(" Vector: " + integers);

        // x2 capacity when number of elements in vector exceed default capacity of vector
        System.out.println("Capacity of vector = " + integers.capacity());

        Thread t1 = new WorkerThread(integers);
        Thread t2 = new WorkerThread(integers);

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Vector after start thread: " + integers);

    }

}