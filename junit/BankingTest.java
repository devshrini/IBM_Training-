package Day_7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankingTest {

    
    Banking account;

    @BeforeEach
    public void setUp() {
        account = new Banking();
    }
    
    @Test 
    public void testAddAccountFail() {
    	account.add_Account(1003,400); 
    	assertEquals(1002 , account.account_num,"Account num set to 1003 not 1002"); 
    	
    }
    
    @Test
    public void FailTestDeposit() {
    	account.add_Account(1001, 100);
    	account.deposit(200);
    	assertEquals(200,account.balance , "deposits wrong "); 
    }

    @Test
    public void testAddAccount() {
        account.add_Account(1001, 500);
        
        assertEquals(1001, account.account_num, "Account number should be set to 1001");
        assertEquals(500, account.balance, "Initial balance should be set to 500");
    }

    @Test
    public void testDeposit() {
        account.add_Account(1002, 1000);
        
        account.deposit(250);
        
        assertEquals(1250, account.balance, "Balance should increase by the deposit amount");
    }

    @Test
    public void testWithdraw() {
        
        account.add_Account(1003, 1000);
        
        
        account.withdraw(400);
        
       
        assertEquals(600, account.balance, "Balance should decrease by the withdrawal amount");
    }

    @Test
    public void testMultipleTransactions() {
        account.add_Account(1004, 0); 
        
        account.deposit(2000);
        account.withdraw(500);
        account.withdraw(100);
        
        assertEquals(1400, account.balance, "Balance should accurately reflect multiple transactions");
    }
    
   
    
}