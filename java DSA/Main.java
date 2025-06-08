
public class Main {
    public static void main(String[] args) {

        linkedlist list = new linkedlist();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(90);
        list.insertFirst(67);
        list.insertFirst(45);
        list.insertLast(100);
        list.insert(99, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        


    }
}
