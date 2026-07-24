package Day_7;

public class TimeTesting {
	
	void slowOperation() {
		try {
			Thread.sleep(10000); 
			System.out.println("slow ops over"); 
			
		}
		catch (InterruptedException e) {
			System.out.println("interrupted");
		}
	}
	
	void fastOperation() {
		try {
			Thread.sleep(100); 
			System.out.println("slow ops over"); 
			
		}
		catch (InterruptedException e) {
			System.out.println("interrupted");
		}
	}

}
