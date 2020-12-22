import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> ll = new MyLinkedList<Integer>();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(2,9);
        ll.add(2,9);
        System.out.println(ll);
    }
}
