package test;

import org.junit.Assert;
import org.junit.Test;



public class CarTest {
	Car car1 = new Car("ABC", 12345, 55555);
	
	@Test
	public void testgetCarName() {
		Assert.assertEquals("ABC", car1.getCarName());
	}

	@Test
	public void testgetCarNumber() {
		Assert.assertEquals(12345, car1.getCarNumber(),0.01);
	}
	
	@Test
	public void testgetCarPrice() {
		Assert.assertEquals(55555, car1.getCarPrice(),0.01);
	}
	
	@Test
	public void testsetCarName() {
		car1.setCarName("ABC");
		Assert.assertEquals("ABC", car1.getCarName());
	}
	
	@Test
	public void testsetCarNumber() {
		car1.setCarNumber(12345);
		Assert.assertEquals(12345, car1.getCarNumber(),1);
	}
	
	@Test
	public void testsetCarPrice() {
		car1.setCarPrice(55555);
		Assert.assertEquals(55555, car1.getCarPrice(),0.01);
	}
	
}
