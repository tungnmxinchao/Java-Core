import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        Set<Integer> integers = new TreeSet<>(Collections.reverseOrder());
        Set<Student> students = new TreeSet<>();
        Set<Student> studentsCopy = new TreeSet<>(Comparator.comparing(Student::getId));

        strings.add("Tung");
        strings.add("Tung");
        strings.add("Nhung");
        strings.add("Huong");

        integers.add(4);
        integers.add(3);
        integers.add(7);
        integers.add(10);

        students.add(new Student(2, "huong"));
        students.add(new Student(1, "anh"));
        students.add(new Student(1, "anh"));

        studentsCopy.add(new Student(2, "huong"));
        studentsCopy.add(new Student(1, "anh"));
        studentsCopy.add(new Student(1, "anh"));
        
        System.out.println(strings);
        System.out.println(integers);
        System.out.println(students);
        System.out.println(studentsCopy);

    }
}