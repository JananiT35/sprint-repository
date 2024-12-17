package assigned;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Deque;
public class QueueDemo {
	    public static void main(String[] args) {
	        PriorityQueue<String> queue = new PriorityQueue<>();
	        // Add elements
	        queue.add("C");
	        queue.add("A");
	        queue.add("B");
	        System.out.println("PriorityQueue: " + queue);
	        // Peek at the head of the queue
	        System.out.println("Peek: " + queue.peek());
	        // Poll (retrieve and remove) the head of the queue
	        System.out.println("Poll: " + queue.poll());
	        System.out.println("After poll: " + queue);
	        // Iterate through the queue
	        for (String element : queue) {
	            System.out.println("Element: " + element);
	        }
	        // Clear the queue
	        queue.clear();
	        System.out.println("After clear: " + queue);
	    }
	}


/*public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add elements
        deque.add("A");
        deque.addFirst("B");
        deque.addLast("C");
        System.out.println("Deque: " + deque);

        // Peek at the head and tail of the deque
        System.out.println("PeekFirst: " + deque.peekFirst());
        System.out.println("PeekLast: " + deque.peekLast());

        // Poll (retrieve and remove) the head and tail of the deque
        System.out.println("PollFirst: " + deque.pollFirst());
        System.out.println("After pollFirst: " + deque);
        System.out.println("PollLast: " + deque.pollLast());
        System.out.println("After pollLast: " + deque);

        // Iterate through the deque
        for (String element : deque) {
            System.out.println("Element: " + element);
        }

        // Clear the deque
        deque.clear();
        System.out.println("After clear: " + deque);
    }
}*/

