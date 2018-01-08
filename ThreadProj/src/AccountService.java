
public class AccountService implements Runnable{

	private SavingsAccount account;
	
	public AccountService(SavingsAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			account.withdraw(1000);
			
//			System.out.println("Available Balance : "+account.getBalance());
			
		}
		if(account.getBalance() < 0) {
			System.err.println("your account is overdrawn");
		}
	}
	
}
