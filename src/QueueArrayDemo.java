
public class QueueArrayDemo {
	public static void main(String[] args) {
		 
		QueueArray q= new QueueArray(3);
		q.enqueue(new Demo(55,123));
		q.enqueue(new Demo(9,456));
		q.enqueue(new Demo(50,789));
		q.enqueue(new Demo(5,901));
		q.print();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}
 
}
class QueueArray
{
	Demo arr[];
	int front=0;
	int rear=0;
	public QueueArray(int size)
	{
		arr= new Demo[size];
	}
	public void enqueue(Demo d)
	{
		if(rear==arr.length)
		{
			System.out.println("array is full");
		}

		else
		{
			arr[rear++]=d;
		}
	}
	public Demo dequeue()
	{
		if(front>=rear)
		{
			System.out.println("Queue is empty");
			return null;
		}
		else
		{		
			return arr[front++];
		}
	}
	void print()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public Demo peek() {
       /* if (front == rear) {
            System.out.println("Queue is empty");
            return null;
        } */
		//else {
            return arr[front];
    }
	
}
 

class Demo{
	int number;
	int id;
	Demo(int number,int id){
		this.number=number;
		this.id=id;
	}
	public String toString() {
        return "Demo{" + "number=" + number + ", id=" + id +'}';
}
}
