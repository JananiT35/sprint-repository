package task;

public class StackwithClass {
	public static void main(String[] args) {
		FruitStack c=new FruitStack(5);
		 Fruit c1 = new Fruit(30,1,"apple");
		 Fruit c2 = new Fruit(50,4,"orange");
		 Fruit c3 = new Fruit(40,6,"grapes");
		 Fruit c4 = new Fruit(20,2,"gauva");
		 Fruit c5 = new Fruit(100,5,"Strawberry");

	        // Push employees onto the stack
	        c.push(c1);
	        c.push(c2);
	        c.push(c3);
	        c.push(c4);
	        c.push(c5);

	        // Peek at the top employee
	        System.out.println("Top fruit:");
	        c.peek().display();

	        // Pop employees from the stack
	        System.out.println("\nResult after Popping:");
	        Fruit d = c.pop();
	        if (d != null) {
	            d.display();
	        }
	       /* System.out.println("\nPopping fruits:");
	        while (!c.isEmpty()) {
	        	c.pop().display();
	        }*/
	       // System.out.println("\nNew top fruit after popping one:");
	        
	    }
	}
	class FruitStack {
		    private Fruit[] stack;
		    private int top;
		    private int capacity;

		    // Constructor to initialize the stack
		    public FruitStack(int size) {
		        stack = new Fruit[size];
		        capacity = size;
		        top = -1;
		    }

		    // Method to add an employee to the stack
		    public void push(Fruit fruit) {
		        if (isFull()) {
		            System.out.println("Stack Overflow");
		            return;
		        }
		        stack[++top] = fruit;
		    }

		    // Method to remove and return the top employee of the stack
		    public Fruit pop() {
		        if (isEmpty()) {
		            System.out.println("Stack Underflow");
		            return null; // Return null indicating the stack is empty
		        }
		        return stack[top--];
		    }

		    // Method to return the top employee of the stack without removing it
		    public Fruit peek() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty");
		            return null; // Return null indicating the stack is empty
		        }
		        return stack[top];
		    }

		    // Method to check if the stack is empty
		    public boolean isEmpty() {
		        return top == -1;
		    }

		    // Method to check if the stack is full
		    public boolean isFull() {
		        return top == capacity - 1;
		    }

		    // Method to get the size of the stack
		    public int size() {
		        return top + 1;
		    }
}
class Fruit{
	int price;
	int quantity;
	String name;
	public Fruit(int price,int quantity,String name) {
		this.price=price;
		this.quantity=quantity;
		this.name=name;
	}

public void display() {
    System.out.println("Name of the fruit: " + name);
    System.out.println("quantity: " + quantity);
    System.out.println("price: " + price);
}
}
