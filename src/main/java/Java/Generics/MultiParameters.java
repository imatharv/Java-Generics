package Java.Generics;

public class MultiParameters {
	public static <E extends Comparable<E>> E maximum(E[] params ) {
		E max = params[0];
		
		for(int i=1 ; i< params.length ; i++) {
			if(params[i].compareTo(max) > 0 )
				max = params[i];	
		}
		
		return max;
	}
}
