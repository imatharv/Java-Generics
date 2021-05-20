package Java.Generics;

public class MultiParameters {
	public static <E extends Comparable<E>> E maximum(E[] params ) {
		E max = params[0];
		
		for(int i=1 ; i< params.length ; i++) {
			if(params[i].compareTo(max) > 0 )
				max = params[i];	
		}
		
		printMaximum(params, max);
		return max;
	}
	public static <E> void printMaximum(E[] params, E max) {
		for(int i=1; i< params.length; i+=params.length) {
			System.out.println("Maximum: "+ max);
		}	
		
	}
}
