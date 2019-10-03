	//Multitheading versus Multitasking
	public class MultipleThreads extends Thread
	{
	String name;
	public void run()
		{
		
		for(int i=0;i<5;i++)
	
//while (true)
		{

	 		name = Thread.currentThread().getName();
			 System.out.println(name  +" " +  i);
			try
			  {
			  Thread.sleep(500);
			
			  }
			 catch (InterruptedException e)
	  		  {
			  break;
	 		  }
			 }
			}
	public static void main (String args[])
		{
		MultipleThreads t1=new MultipleThreads();
		MultipleThreads t2 = new MultipleThreads();
		MultipleThreads t3 = new MultipleThreads();

		t1.setPriority(10);
		t1.setName ("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Number of threads running: "+ Thread.activeCount());
		}
	}
