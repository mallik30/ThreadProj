
public class SampleRunnable implements Runnable{

	Thread thread;

	public SampleRunnable(Thread thread) {
		this.thread = thread;
	}
	
	@Override
	public void run() {
		try {
			thread.join();
		}catch(Exception e) {
			e.printStackTrace();
		} 
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
	
	
	
	
	
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("Creating Thread using Runnable interface");		
//	}
	
}
