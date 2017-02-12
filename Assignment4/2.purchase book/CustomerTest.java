package test;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    Customer costomer1 = new Customer("amanda");
	
	@Test
	public void testgetCustomerName() {
		Assert.assertEquals("amanda", costomer1.getCustomerName());
	}
	
	@Test 
	public void testPurchase(){
		Book book1 = new Book("head first java", 40.0);
		Assert.assertEquals(40, costomer1.purchase(book1),0.01 );
	}

}
