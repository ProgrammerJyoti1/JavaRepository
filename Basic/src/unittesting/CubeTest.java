package unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CubeTest {
	
	       @Before  
		    public void setUp() throws Exception {  
		        System.out.println("before");  
		    }  

 @Test
	public void checkCube()
	{
	
	 
 	assertEquals(27, CubeExample.cube(3));
		
	}
 	@After  
    public void tearDown() throws Exception {  
	        System.out.println("after");  
    }  

}
