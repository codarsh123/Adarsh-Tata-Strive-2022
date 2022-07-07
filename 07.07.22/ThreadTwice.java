package assignment0707;

public class ThreadTwice implements Runnable {
	
	@Override
	public void run() {
		System.out.println("This is a Runnable Thread ");
	}

	public static void main(String[] args) {
		ThreadTwice t1 = new ThreadTwice();
		Thread thread1=new Thread(t1,"Thread1");
	    thread1.start();
	    thread1.start();          //(java.lang.IllegalThreadStateException)Hence it is not possible to run thread twice
	       
	}
	
}
