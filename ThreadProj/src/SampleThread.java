
public class SampleThread extends Thread{
	
	@Override
	public void run() {
		
		Thread thread = Thread.currentThread();
		
		System.out.println(thread.getName()+" : started execution.");
		
		if(thread.getName().equals("SampleThread1")) {
			try {
				
				Thread.sleep(500);
				
			}catch(Exception e) {
				e.printStackTrace();
			}			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(thread.getName()+" : "+i);
		}
	}
	
}
