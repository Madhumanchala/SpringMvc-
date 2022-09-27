package Multithreading;

public class joinAlive {
	
	public static void main(String[] args) throws Exception {
			
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<=5;i++) {
				System.out.println("Hi");
				try {  Thread.sleep(1000); } catch(Exception e) {}
			}
		}
			);
		Thread t2=new Thread(() ->
		{
			for(int i=0;i<=5;i++) {
				System.out.println("Hello" + Thread.currentThread().getPriority());
				try {  Thread.sleep(1000); } catch(Exception e) {}
			}
			}
			);
		
			/*
			 * t1.setName("Hiii Thread"); t2.setName("Hello thread");
			 */
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
		
		
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());

		System.out.println("Bye ");

			}}
