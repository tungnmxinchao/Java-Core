import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Set<Person> personSet = new HashSet<>();
        Set<Person> personSet2 = new HashSet<>();

        names.add("Tung");
        names.add("Tung");
        names.add("Huong");

        Person p1 = new Person("Tung", 19);
        Person p2 = new Person("Tung", 19);
        Person p3 = new Person("Huong", 19);

        Person p4 = new Person("Nhung", 19);
        Person p5 = new Person("Hieu", 19);

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);

        personSet2.add(p4);
        personSet2.add(p5);


//        System.out.println( "Union: " + personSet.addAll(personSet2));
//        System.out.println( "Intersection: " + personSet.retainAll(personSet2));
//        System.out.println( "Difference : " + personSet.removeAll(personSet2));



        System.out.println("p1 = p2 with equal function ? " + p1.equals(p2));
        System.out.println("Hashcode of p1: " + p1.hashCode());
        System.out.println("Hashcode of p2: " + p2.hashCode());

        System.out.println(names);
        System.out.println(personSet);
        System.out.println(personSet2);


    }
}