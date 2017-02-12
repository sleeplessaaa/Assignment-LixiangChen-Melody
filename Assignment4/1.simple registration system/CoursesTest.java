package test;

import org.junit.Assert;
import org.junit.Test;

public class CoursesTest {
      Courses course1 = new Courses("Application Engineering");
           
           
        @Test
       	public void testgetClassName() {
        	String cName = course1.getClassName();
       	    Assert.assertEquals("Application Engineering", cName);
       	}
        
        @Test
       	public void testgetNumberOfStudent() {
       	    Assert.assertEquals(0, course1.getNumberOfStudent());
       	}
     
        @Test
        public void testgetStudents(){
        	Student[] teststudent = new Student[10];
        	Assert.assertArrayEquals(teststudent, course1.getStudents());
        }
        
        @Test
        public void testisFull(){
        	Assert.assertEquals(false, course1.isFull());
        }
        
        @Test
        public void testregisterStudent(){
        	Student kevin = new Student("kevin", 456);
        	course1.registerStudent(kevin);
        	Student[] list = new Student[10];
        	list[1] = kevin;
        	Assert.assertEquals(1, course1.getNumberOfStudent());
        	Assert.assertArrayEquals(list, course1.getStudents());
        }
        
}
