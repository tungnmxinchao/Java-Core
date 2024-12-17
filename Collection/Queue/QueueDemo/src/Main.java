import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> pq = new LinkedList<>();
        Queue<Integer> pq2 = new PriorityQueue<>();
        Queue<Student> students = new PriorityQueue<>();
//        Queue<Student> students = new PriorityQueue<>(Comparator.comparing(Student::getId).reversed());

        pq.add(1);
        pq.add(5);
        pq.add(3);

        pq2.add(1);
        pq2.add(5);
        pq2.add(3);

        students.add(new Student(1, "Tung"));
        students.add(new Student(7, "Tung"));
        students.add(new Student(5, "Tung"));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        System.out.println(pq2);

        System.out.println(students);

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }



    }
}