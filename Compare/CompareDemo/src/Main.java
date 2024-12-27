import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(12,"aTung"));
        students.add(new Student(11,"cnhung"));
        students.add(new Student(17,"bHuong"));

//        Collections.sort(students);
//        Collections.sort(students, new SortAgeStudent());

//        students.sort((s1, s2) -> s2.getAge() - s1.getAge());
        students.sort((s1, s2) -> s2.getName().compareTo(s1.getName()));

        System.out.println(students);

    }
}