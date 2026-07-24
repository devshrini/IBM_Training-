package Day_7;

public class Banking {
	int account_num ; 
	int balance ; 
	
	void add_Account(int account_num , int balance) {
		this.account_num = account_num ; 
		this .balance = balance ; 
	}
	
	void deposit(int amount ) {
		this.balance += amount ; 
	}
	
	void withdraw(int amount) {
		this.balance -= amount ; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
