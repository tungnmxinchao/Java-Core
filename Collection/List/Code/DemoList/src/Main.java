import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();

        listString.add("Tung");
        listString.add("Hieu");
        listString.add("Nhung");

        System.out.println("----------- for i --------------");

        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }

        System.out.println("----------- for ListIterator --------------");
        ListIterator<String> stringListIterator = listString.listIterator();

        while(stringListIterator.hasNext()){
            String element = stringListIterator.next();
            System.out.println(element);
        }

        System.out.println("----------- for Iterator --------------");
        Iterator<String> stringIterator = listString.iterator();

        while(stringIterator.hasNext()){
            String elementItorator = stringIterator.next();
            System.out.println(elementItorator);
        }

        System.out.println("----------- Check contain --------------");
        System.out.println(listString.contains("Tung"));

        System.out.println("----------- filter --------------");
        List<String> stream = listString.stream()
                .filter(x -> x.equalsIgnoreCase("Tung"))
                .toList();
        for (String o : stream){

            System.out.println(o);
        }

        System.out.println("----------- sort natural  --------------");
        List<String> sort = listString.stream()
                .sorted().toList();

        for (String o : sort){
            System.out.println(o);
        }

        System.out.println("----------- test sort stream object  (error)--------------");
        Student student1 = new Student("Tung");
        Student student2 = new Student("Hieu");
        Student student3 = new Student("Nhung");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

//        List<Student> sortStudent = students.stream()
//                .sorted().toList();
//
        for (Student o : students){
            System.out.println(o);
        }

        System.out.println("----------- uppercase (error)--------------");
        List<String> uppercase = students.stream()
                .map(x -> x.getName().toUpperCase())
                .sorted()
                .toList();

        for (String o : uppercase){
            System.out.println(o);
        }

        System.out.println("----------- find max min--------------");
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 7);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        System.out.println(max);


    }
}