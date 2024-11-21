public class LinkedList {
    private Node head;
    private Node tail;


    public boolean isEmpty(){
        return head == null && tail == null;
    }
    public void addFirst(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            tail = head;
        }else {
            node.next = head;
            head = node;
        }

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addIndex(int data, int index){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node node = new Node(data);
        Node current = head;
        int currenIndex = 0;
        while (current.next != null && currenIndex < index - 1){

            current = current.next;
            currenIndex++;
        }

        node.next = current.next;
        current.next = node;
    }

    public void removeIndex(int index){
        if(index == 0){
            removeFirst();
            return;
        }
        Node current = head;
        int possison = 0;

        while (current.next != null && possison < index - 1){
            System.out.println(possison < index - 1);
            current = current.next;
            possison++;
        }

        current.next = current.next.next;

        if (current.next == null) {
            tail = current;
        }

    }

    public void  removeFirst(){
        head = head.next;
        tail = null;
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node current = head;
        Node next = null;
        tail = head;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    public void display() {
        if (head == null) {
            System.out.println("Danh sách rỗng.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
