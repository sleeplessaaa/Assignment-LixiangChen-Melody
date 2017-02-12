package test;

import org.junit.Assert;
import org.junit.Test;


public class GasTankTest {
	GasTank gastank1 = new GasTank();
	
	@Test
	public void testaddGas() {
		Assert.assertEquals(10, gastank1.addGas(10), 0.01);
	}

	@Test
	public void testuseGas() {
		Assert.assertEquals(0, gastank1.useGas(10), 0.01);
	}

	@Test
	public void testgetGasLevel() {
		Assert.assertEquals(0, gastank1.getGasLevel(), 0.01);
	}
	
}
