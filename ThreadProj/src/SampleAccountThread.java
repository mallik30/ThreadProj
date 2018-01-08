
public class SampleAccountThread extends Thread{

	//declaring reference variable
	private SavingsAccount account; 
	
	
	//through this constructor SampleThread class will take that reference
	public SampleAccountThread(SavingsAccount account) {
		this.account = account;
	}

	//Overriding run method
	@Override
	public void run() {
		System.out.println("Account No: "+account.accountNo);
		System.out.println("Balance : "+account.getBalance());
	}
	
}

