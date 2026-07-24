package Day_7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class Demo01_Basic_UnitTest {
	@Test 
	void testAdd() {
		Calc calc = new Calc() ; 
		assertEquals(25, calc.add(20, 5)); 
	}

   @Test
   void testAddition() {
       Calc calc = new Calc();
       assertEquals(15, calc.add(10, 5));
   }
   @Test
   void testAdditionFail() {
       Calc calc = new Calc();
       //fails
       assertEquals(20, calc.add(10, 5), "Expected 20 but actual is 15");
   }
   
   
}