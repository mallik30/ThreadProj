package communication;

public class Test {

	public static void main(String[] args) {
		
		X x = new X();
		
		Thread producer = new Thread(new Producer(x),"producer");

		Thread consumer = new Thread(new Consumer(x), "consumer");
	
		producer.start();
		
		consumer.start();
		
	}

}
