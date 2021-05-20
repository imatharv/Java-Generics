package Java.Generics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiParametersTest {
	@Test
	public void shouldReturnTrue_ForMaxInteger()
	{	
		Integer [] arr1= {55,70,38};	
		int max1 = MultiParameters.maximum(arr1);
		assertEquals( 70 , max1 );
		
		Integer [] arr2= {17,18,11,22,3};	
		int max2 = MultiParameters.maximum(arr2);
		assertEquals( 22 , max2 );
	}
	    
	@Test
	public void shouldReturnTrue_ForMaxDouble()
	{	
		Double [] arr1 = {2.5 , 5.1 , 3.4};
	    double max1 = MultiParameters.maximum(arr1);
	    assertEquals(5.1 , max1 , 0);
	    
	    Double [] arr2 = {2.5 , 5.1 , 3.4 , 22.4 , 13.4 , 6.4};
	    double max2 = MultiParameters.maximum(arr2);
	    assertEquals(22.4 , max2 , 0);
	}
    
    @Test
    public void shouldReturnTrue_ForMaxString()
    {	
    	String [] arr1={"Peach","Apple","Banana"};
    	String max1 = MultiParameters.maximum(arr1);
        assertEquals("Peach" , max1);
        
        String [] arr2 = {"Peach","Apple","Banana","Mango","Pineapple"};
    	String max2 = MultiParameters.maximum(arr2);
        assertEquals("Pineapple" , max2);
    }
}
