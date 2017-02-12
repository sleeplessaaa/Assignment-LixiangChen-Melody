package test;

import org.junit.Assert;
import org.junit.Test;


public class StudentTest {
     Student Student1 = new Student("melody",123);
  
	@Test
	public void testgetStudentName() {
		Assert.assertEquals("melody", Student1.getStudentName());
	}
	
	@Test
	public void testgetStudentId(){
		Assert.assertEquals(123, Student1.getStudentId());
	}
}
