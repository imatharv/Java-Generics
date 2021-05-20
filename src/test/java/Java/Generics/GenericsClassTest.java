package Java.Generics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GenericsClassTest {
	@Test
	public void shouldReturnTrue_ForMaxInteger()
	{
		int max1 = GenericsClass.getMaximum(8,3,4);
		assertEquals( 8 , max1 );
		int max2 = GenericsClass.getMaximum(8,9,4);
		assertEquals( 9 , max2 );
		int max3 = GenericsClass.getMaximum(4,5,7);
		assertEquals( 7 , max3 );
	}
	    
	@Test
	public void shouldReturnTrue_ForMaxDouble()
	{
		double max1 = GenericsClass.getMaximum(5.1,1.3,2.8);
	    assertEquals( 5.1 , max1 , 0);
	    double max2 = GenericsClass.getMaximum(1.3,5.1,2.8);
		assertEquals( 5.1 , max2 , 0 );
		double max3 = GenericsClass.getMaximum(1.3,2.8,5.1);
		assertEquals( 5.1 , max3 , 0 );
	}
    
    @Test
    public void shouldReturnTrue_ForMaxString()
    {
    	String max1 = GenericsClass.getMaximum("Peach","Apple","Banana");
        assertEquals( "Peach" , max1 );
        String max2 = GenericsClass.getMaximum("Apple","Peach","Banana");
        assertEquals( "Peach" , max2 );
        String max3 = GenericsClass.getMaximum("Apple","Banana","Peach");
        assertEquals( "Peach" , max3 );
    }
}
