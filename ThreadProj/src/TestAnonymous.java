
public class TestAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Runnable runnable = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("**Runnable()**");
//				
//			}
//		};
//		
//		Runnable runnableLambda = () -> {System.out.println("Test Runnable");};
		
		new Thread(() -> {System.out.println("Test Runnable");}).start();
	}

}
