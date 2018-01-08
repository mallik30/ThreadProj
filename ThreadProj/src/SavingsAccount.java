
public class SavingsAccount extends Object {

	//fields or instance variables or non-static variables
	int accountNo;
	private float balance;
	String status;
	private int pin;
	
	final static float interestRate =	2.25f;
	
	
	
	//default constructor ctrl+space to get it
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	//right click in class -> source -> generate constructor using fields to get parameters
						 //parameters
	public SavingsAccount(int accountNo, float balance, String status, int pin) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.status = status;
		this.pin = pin;
	}
		
	public float getBalance() {
		return balance;
	}
	
	void printDetails() {
		System.out.println("AccountNo : "+accountNo+"\nBalance : "+balance+"\nStatus : "+status);
	}
	
	public boolean isPinValid(int pin) {
		if(this.pin == pin) {
			return true;			
		}
		return false;
	}
	
	public static float getInterestrate() {
		synchronized (SavingsAccount.class) {
			return interestRate;	
		}	
	}
	
	// instance methods or non-static methods
	// withdraw(int)
	synchronized public void withdraw(int withdrawalAmount) {

		//business logic
		if(this.status == "active"){
			
			synchronized (this) {
			
				if(withdrawalAmount <= this.balance) {
				
					System.out.println(Thread.currentThread().getName()+" is about to withdraw");
					
					try {
						
						Thread.sleep(500);
						
					}catch(Exception e) {
						e.printStackTrace();
					 }
					
					this.balance = this.balance - withdrawalAmount;
				
					System.out.println(Thread.currentThread().getName()+" is done withdraw");
					
				}else{
					System.out.println("There is not enough balnce for the "+Thread.currentThread().getName()+" to withdraw");
				}
			}		
		}else{
			System.err.println("Account is inactive");
		}
	}
	
	//withdraw(int,int)
	synchronized public void withdraw(int withdrawalAmount,int pin) {
		
		if (isPinValid(pin)) {
			
			if(withdrawalAmount <= 40000) {
				
				withdraw(withdrawalAmount);
				
			}else {
				System.err.println("Withdrawal limit exceeded");
			}
			
		}else {			
			System.err.println("invalid Pin");
		}
		
		
	}
	
	synchronized public void deposit(int depositAmount) {
		
		if(depositAmount > 0) {
		
			balance = balance + depositAmount;
		
		}else {
		
			System.err.println("Invalid deposit amount");
			
		}
		
	}
	
}
