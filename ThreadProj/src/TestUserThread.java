
public class TestUserThread {

	public static void main(String[] args) {
		
		SampleThread sampleThread = new SampleThread();
		
		sampleThread.setName("SampleThread1");
		
		sampleThread.start();
		
		SampleThread sampleThread2 = new SampleThread();
		
		sampleThread2.setName("SampleThread2");
		
		sampleThread2.start();

		System.out.println(sampleThread.getPriority());
		System.out.println("MAX Priority :"+Thread.MAX_PRIORITY);
		System.out.println("MIN Priority :"+Thread.MIN_PRIORITY);
		System.out.println("NORM Priority :"+Thread.NORM_PRIORITY);
		
	}

}
