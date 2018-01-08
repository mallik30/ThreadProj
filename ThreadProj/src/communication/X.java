package communication;

public class X {

	//if flag is false then it is producers turn
	//if flag is true then it is consumers turn
	private boolean flag = false;
	
	private int data;
	
	public X() {
		// TODO Auto-generated constructor stub
	}
	
	synchronized public int get() {
		if(flag == false) {
			try {
				this.wait();
			}catch(Exception e) {
				e.printStackTrace();
			}				
		}
		
		System.out.println(Thread.currentThread().getName()+" : "+data);
		
		flag = false;
		
		this.notify();
		
		return data;
	}
	
	synchronized public void put(int data) {
		
		if(flag) {
			try {
				this.wait(80000);
			}catch(Exception e) {
				e.printStackTrace();
			}				
		}

		System.out.println(Thread.currentThread().getName()+" : "+data);
		this.data = data;
		
		flag = true;
		
		this.notify();
	}
	
}
