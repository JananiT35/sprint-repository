import java.util.LinkedList;

/*public class SingleLinkedListDemo {
	static Node head;
 public static void main(String[] args) {
	SingleLinkedListDemo s1 = new SingleLinkedListDemo(); 
     s1 = insert(s1, 1); 
     s1 = insert(s1, 2); 
     s1 = insert(s1, 3); 
     s1 = insert(s1, 4); 
     // Print the LinkedList 
     printList(s1); 
 }
}

class Node{
	int data; 
    Node next; 
   
    Node(int d) 
    { 
        data = d; 
        next = null; 
      
    } 
}
public static LinkedList insert(LinkedList list, int data) 
{ 
    Node new_node = new Node(data); 
    if (list.head == null) { 
        list.head = new_node; 
    } 
    else {  
        Node last = list.head; 
        while (last.next != null) { 
            last = last.next; 
        } 
        last.next = new_node; 
    } 
    return list; 
} 
}
/*
public class StudentNode {
	 
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
 
    public String toString() {
        return student.toString();
    }
 
	
}*/
public class SingleLinkedListDemo {
    Node head;

    public static void main(String[] args) {
        SingleLinkedListDemo s1 = new SingleLinkedListDemo();
        s1 = insert(s1, 1);
        s1 = insert(s1, 2);
        s1 = insert(s1, 3);
        s1 = insert(s1, 4);
        // Print the LinkedList
        printList(s1);
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static SingleLinkedListDemo insert(SingleLinkedListDemo list, int data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(SingleLinkedListDemo list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
}

