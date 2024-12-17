package assigned;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(2, "E");
        System.out.println("Initial LinkedList: " + list);

        // Peek methods
        System.out.println("Peek: " + list.peek());
        System.out.println("PeekFirst: " + list.peekFirst());
        System.out.println("AFTER PEEKFIRST:"+list);
        System.out.println("PeekLast: " + list.peekLast());

        // Poll methods
        System.out.println("Poll: " + list.poll());
        System.out.println("After poll: " + list);
        System.out.println("PollFirst: " + list.pollFirst());
        System.out.println("After pollFirst: " + list);
        System.out.println("PollLast: " + list.pollLast());
        System.out.println("After pollLast: " + list);

        // Add elements again for further operations
        list.add("F");
        list.add("G");
        list.add("H");
        System.out.println("Repopulated LinkedList: " + list);

        // Pop method
        System.out.println("Pop: " + list.pop());
        System.out.println("After pop: " + list);

        // Push method
        list.push("I");
        System.out.println("After push: " + list);
    }
}

