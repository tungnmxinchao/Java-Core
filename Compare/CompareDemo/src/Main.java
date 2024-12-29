import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(12,"aTung"));
        students.add(new Student(11,"cnhung"));
        students.add(new Student(17,"bHuong"));
        students.add(new Student(16,"bHuong"));

//        Collections.sort(students);
//        Collections.sort(students, new SortAgeStudent());

//        students.sort((s1, s2) -> s2.getAge() - s1.getAge());
//        students.sort((s1, s2) -> s2.getName().compareTo(s1.getName()));


        // sort by many field
        // syntax 1
        students.sort((s1, s2) -> {
                    int nameSort = s2.getName().compareTo(s1.getName());
                    if(nameSort == 0){
                        return Integer.compare(s1.getAge(), s2.getAge());
                    }
                    return  nameSort;

                });

        //syntax 2
//        Comparator<Student> sortByNameThenAge = (s1, s2) ->{
//            //same code
//        };
//        students.sort(sortByNameThenAge);
//
//        System.out.println(students);

    }
}