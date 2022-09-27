package Multithreading;


class Hii implements Runnable

{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hi");
			try {  Thread.sleep(1000); } catch(Exception e) {}
		}
	}
	
}

class Helloo implements Runnable
{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hello");
			try {  Thread.sleep(1000); } catch(Exception e) {}
		}	
	}
}
public class ThreadRunnableinterface {
	public static void main(String[] args) {
		Runnable  obj=new Hii();
		Runnable obj1=new Helloo();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		t1.start();
		t2.start();
	}
	}

