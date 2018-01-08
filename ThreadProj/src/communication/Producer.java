package communication;

public class Producer implements Runnable{

	private X x;

	public Producer(X x) {
		this.x = x;
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			x.put(++i);
		}
	}
}
