package Java.Generics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiParametersTest {
	@Test
	public void shouldReturnTrue_ForMaxInteger()
	{	
		//Integer [] arr1= {55,70,38};	
		//int max1 = MultiParameters.maximum(arr1);
		//assertEquals( 70 , max1 );
		
		Integer [] arr2= {66, 45, 73, 92, 8, 23};	
		int max2 = MultiParameters.maximum(arr2);
		assertEquals(92 , max2);
	}
	    
	@Test
	public void shouldReturnTrue_ForMaxDouble()
	{	
		//Double [] arr1 = {2.5 , 5.1 , 3.4};
	    //double max1 = MultiParameters.maximum(arr1);
	    //assertEquals(5.1 , max1 , 0);
	    
	    Double [] arr2 = {66.5, 45.8, 73.4, 92.4, 8.4, 23.4};
	    double max2 = MultiParameters.maximum(arr2);
	    assertEquals(92.4 , max2 , 0);
	}
    
    @Test
    public void shouldReturnTrue_ForMaxString()
    {	
    	//String [] arr1={"Peach","Apple","Banana"};
    	//String max1 = MultiParameters.maximum(arr1);
        //assertEquals("Peach" , max1);
        
        String [] arr2 = {"Peach","Apple","Banana","Mango","Pineapple"};
    	String max2 = MultiParameters.maximum(arr2);
        assertEquals("Pineapple" , max2);
    }
}
