
public class TestJoin {

	public static void main(String[] args) throws InterruptedException {
		
//		Runnable runnable = () -> { 
//			for (int i = 0; i < 5; i++) {
//				System.out.println(Thread.currentThread().getName()+" : "+i);
//			}
//		};
//		
//		Thread thread = new Thread(runnable);
		
		Thread thread = new Thread(new SampleRunnable(Thread.currentThread()));;
		
		thread.setName("TestThread");
		
		thread.start();
		
//		thread.join();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
	}
}
