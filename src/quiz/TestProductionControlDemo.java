package quiz;

import java.util.Random;
import java.util.Stack;

public class TestProductionControlDemo {
	    public static void main(String[] args) {
	        WareHouse ware = new WareHouse();
	        Producer p = new Producer(ware);
	        Thread t1 = new Thread(p);
	        t1.start();
	        Consumer[] consumers = new Consumer[5];
	        for (int i = 0; i < consumers.length; i++) {
	            consumers[i] = new Consumer(ware);
	            consumers[i].start();
	        }
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

class WareHouse {
    private Stack<Integer> stack = new Stack<>();
    public void push(int n) {  
            stack.push(n);  
    }
    public int pop() {  
            return stack.pop();   
    }
    public boolean isEmpty() { 
            return stack.isEmpty(); 
    }
}
class Producer implements Runnable {
    private WareHouse w;
    public Producer(WareHouse ware) {
        this.w = ware;
    }
    @Override
    public void run() {
        while (true) {
            Random r = new Random();
            int n = r.nextInt(1000);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (w) {
                w.push(n);
                System.out.println("Pushed: " + n);
                w.notifyAll(); 
            }
        }
    }
}
class Consumer extends Thread {
    private WareHouse ware;
    public Consumer(WareHouse ware) {
        this.ware = ware;
    }
    public void run() {
        while (true) {
            synchronized (ware) {
                while (!ware.isEmpty()) {
                    int n = ware.pop();
                    System.out.println("Popped: " + n);
                }
                try {
                    ware.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
