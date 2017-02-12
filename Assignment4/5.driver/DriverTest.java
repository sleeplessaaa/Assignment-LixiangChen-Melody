package test;

import org.junit.Assert;
import org.junit.Test;


public class DriverTest {
	Driver test = new Driver();

	@Test
	public void testdrive() {
		Assert.assertEquals(true, test.drive());
	}
	
	@Test
	public void testaddGas(){
		Assert.assertEquals(200, test.addGas(100), 0.01);
	}

	@Test
	public void testuseGas(){
		Assert.assertEquals(50, test.useGas(50), 0.01);
	}
	
}
