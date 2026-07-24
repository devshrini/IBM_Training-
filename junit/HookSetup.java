package Day_7;
import java.util.ArrayList;
public class HookSetup {
	
	ArrayList<Integer> list = new ArrayList<>() ; 
	
	void add_Ele(int num) {
		list.add(num);
	}
	
	void fetch_Ele(int num) {
		list.forEach(i -> System.out.println(i==num?"present":"absent"));
			}
				
	}
	
	
	
	
	
