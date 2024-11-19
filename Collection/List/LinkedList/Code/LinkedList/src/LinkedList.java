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
