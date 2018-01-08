public class Test {

	public static void main(String[] args) throws InterruptedException {
		
//		Thread thread = Thread.currentThread();
//		
//		System.out.println("Thread Name: "+thread.getName());
//	
//		Thread.sleep(4500);
//		
//		System.out.println("End of main()");
	
		SavingsAccount account =  new SavingsAccount(101, 5000, "active", 1234);
		
		SampleAccountThread accountThread = new SampleAccountThread(account);
		
		accountThread.setName("AccountThread1");
		
		accountThread.start();
		
		SampleAccountThread accountThread2 = new SampleAccountThread(account);
		
		accountThread2.setName("AccountThread2");
		
		accountThread2.start();
		
		
	}

}