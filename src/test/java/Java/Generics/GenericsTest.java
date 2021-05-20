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
}
