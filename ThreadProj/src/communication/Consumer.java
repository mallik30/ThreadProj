package communication;

public class Consumer implements Runnable{
	
	private X x;

	public Consumer(X x) {
		this.x = x;
	}
	
	@Override
	public void run() {
		
		while(true) {
			x.get();
		}	
	}
}
