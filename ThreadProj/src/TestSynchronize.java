
public class TestSynchronize {

	public static void main(String[] args) {
		
		SavingsAccount account =  new SavingsAccount(101, 5000, "active", 1234); 

		AccountService accountService = new AccountService(account);
		
		Thread thread1 = new Thread(accountService);
		
		thread1.setName("Thread1");
		
		thread1.start();
		
		Thread thread2 = new Thread(accountService);
		
		thread2.setName("Thread2");
		
		thread2.start();
		
	}

}