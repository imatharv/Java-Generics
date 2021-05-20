package Java.Generics;

//Using generic class
public class GenericsClass <E extends Comparable<E>>
{	
	E x , y , z;

	public GenericsClass(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public  E maximum(){
		return GenericsClass.getMaximum(x, y, z); 
	}

	public static <E extends Comparable<E>> E getMaximum(E x , E y , E z) {
		E max=x;
		
		if(y.compareTo(max) > 0 )
			max = y;
		if(z.compareTo(max) > 0 )
			max = z;
			
		return max;
	}
}
