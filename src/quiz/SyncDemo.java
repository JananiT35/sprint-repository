package quiz;
	public class SyncDemo extends Thread{
		public static void main(String[] args) {
			SyncDemo s1= new SyncDemo();
			s1.setName("A");
			SyncDemo s2= new SyncDemo();
			s2.setName("B");
			s1.start();
			s2.start();
		}
		public void run()
		{
			Customer c= new Customer();
			for(int i=0;i<3;i++)
			{
			System.out.println("After deposit balance:"+c.deposit(100)+"by"+Thread.currentThread().getName());
			try {
				System.out.println("After Withdrawl balance:"+ c.withdraw(50)+"by"+Thread.currentThread().getName());	
			} catch (InsufficentBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
	class Customer
	{
		private float loan ;
		public synchronized float withdraw(float amount) throws InsufficentBalanceException
		{
			if(amount > loan)
			{
				throw new InsufficentBalanceException(amount+"is insufficent to withdraw");
			}
			else
			{
				loan-=amount;
			}
			return loan;
		}
		public synchronized float deposit(float amount)
		{
			loan+=amount;
			return loan;
		}
	}
	class InsufficentBalanceException extends Exception//compile time exception
	{
		InsufficentBalanceException(String msg)
		{
			super(msg);
		}
	}


