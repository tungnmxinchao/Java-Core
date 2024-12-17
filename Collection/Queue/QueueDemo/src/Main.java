import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(5);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }

        System.out.println(pq);

    }
}