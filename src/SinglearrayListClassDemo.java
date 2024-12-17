
public class SinglearrayListClassDemo {

    private StudentNode head;
    private int size;

    public void addToFront(Student student) {
        StudentNode node = new StudentNode(student);
        node.setNext(head);
        head = node;
        size++;
    }

    public void addToEnd(Student student) {
        StudentNode node = new StudentNode(student);
        if (head == null) {
            head = node;
        } else {
            StudentNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }

    public StudentNode removeFromFront() {
        if (head == null) {
            return null;
        }
        StudentNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public StudentNode removeFromEnd() {
        if (head == null) {
            return null;
        }
        if (head.getNext() == null) {
            StudentNode removedNode = head;
            head = null;
            size--;
            return removedNode;
        }
        StudentNode current = head;
        StudentNode previous = null;
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(null);
        size--;
        return current;
    }

    public void printList() {
        StudentNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        SinglearrayListClassDemo list = new SinglearrayListClassDemo();

        list.addToFront(new Student("xxx", "yyy", 123));
        list.addToFront(new Student("aaa", "AAA", 456));
        list.addToEnd(new Student("BBB", "CCC", 789));
        list.addToEnd(new Student("LLL", "TTT", 101));
        list.printList();
        System.out.println("Size: " + list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println("Size: " + list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println("Size: " + list.getSize());
        
        list.addToEnd(new Student("Janani", "AAA", 123));
        list.printList();
        System.out.println("Size: " + list.getSize());
        
        
    }
}

class StudentNode {
    private Student student;
    private StudentNode next;

    public StudentNode(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return student.toString();
    }
}
class Student {
    private String firstName;
    private String lastName;
    private int id;

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", id=" + id +'}';
    }
}


