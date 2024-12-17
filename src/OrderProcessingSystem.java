import java.util.LinkedList;
import java.util.Queue;

public class OrderProcessingSystem {
public static void main(String[] args) {
	Order o1=new Order(1,"xxx");
	Order o2=new Order(2,"yyy");
	Order o3=new Order(3,"zzz");
	Order o4=new Order(4,"aaa");
	OrderProcessing op=new OrderProcessing();
	op.add(o1);
	op.add(o2);
	op.add(o3);
	op.add(o4);
	op.pendingOrders();
	op.processing();
	op.pendingOrders();
}
}
class Order{
	private int id;
	private String description;
	Order(int id,String description){
		this.id=id;
		this.description=description;
	}
	int getId() {
		return id;
	}
	String getDescription() {
		return description;
	}
	public String toString(){
		return "id: "+id+"description: "+description;
	}
}
class OrderProcessing{
	private Queue<Order> orderProcessing;
	public OrderProcessing(){
		orderProcessing=new LinkedList<>();
	}
	public void add(Order order) {
		orderProcessing.add(order);
	}
	public Order processing() {
		if(!orderProcessing.isEmpty()) {
			Order next=orderProcessing.poll();
			System.out.println("Next element in queue:");
			return next;
		}
		else {
			System.out.println("no element");
			return null;
		}
		
	}
	public void pendingOrders() {
		if(!orderProcessing.isEmpty()) {
			for(Order o:orderProcessing) {
				System.out.println("Pending orders:"+o);
			}
		}
		else {
			System.out.println("no order found");
		}
	}
}

