package Java.Generics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GenericsTest {
	@Test
    public void shouldReturnTrue_WhenMaxIntegerAt1stPosition ()
    {
    	int max = Generics.maxInteger(8,3,4);
        assertEquals( 8 , max );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxIntegerAt2ndPosition()
    {
    	int max = Generics.maxInteger(8,9,7);
        assertEquals( 9 , max );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxIntegerAt3rdPosition()
    {
    	int max = Generics.maxInteger(4,5,7);
        assertEquals( 7 , max );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxDoubleAt1stPosition ()
    {
    	double max=Generics.maxDouble(5.1,1.3,2.8);
        assertEquals( 5.1 , max , 0);
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxDoubleAt2ndPosition()
    {
    	double max=Generics.maxDouble(1.3,5.1,2.8);
        assertEquals( 5.1 , max , 0 );
    }
    
    @Test
    public void shouldReturnTrue_WhenMaxDoubleAt3rdPosition()
    {
    	double max=Generics.maxDouble(1.3,2.8,5.1);
        assertEquals( 5.1 , max , 0 );
    }
}
