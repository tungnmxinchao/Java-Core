public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(120);
        list.removeIndex(3);
        list.display();

    }
}