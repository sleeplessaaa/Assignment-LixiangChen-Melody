package test;

import org.junit.Assert;
import org.junit.Test;


public class BookTest {
    Book book1 = new Book("Head First Java",40); 
	
	@Test
	public void testgetBookTitle() {
		Assert.assertEquals("Head First Java", book1.getBookTitle());
	}

	@Test
	public void testgetPrice() {
		Assert.assertEquals(40, book1.getPrice(),0.01);
	}
		
}
