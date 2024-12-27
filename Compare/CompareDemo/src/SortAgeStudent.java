import java.util.Comparator;

public class SortAgeStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
       return Integer.compare(o1.getAge(), o2.getAge());
//        return o1.getName().compareTo(o2.getName());
    }
}
