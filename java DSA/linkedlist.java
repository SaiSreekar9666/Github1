public class linkedlist {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public linkedlist() {
        this.size = 0;
    }
    //method to insert the value at last:
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    //Method to insert in middle:
    public void insert(int value,int index){
        if(index ==0){
            insertFirst(value);
            return;
        }
        if(index ==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;

    }
    //Method to delete :
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail =null;
            
        }
        size --;
        return val;
    }
    // Method to display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // Method to insert at the beginning
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    // Inner Node class
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
