package Java.Generics;

public class Generics {
	public static int maxInteger(Integer i, Integer j, Integer k) {
		int max=i;
		
		if(j.compareTo(max) > 0 )
			max=j;
		if(k.compareTo(max) > 0 )
			max=k;
	
		return max;
	}
	public static double maxDouble(Double d, Double e, Double f) {
		double max=d;
		
		if(e.compareTo(max) > 0 )
			max=e;
		if(f.compareTo(max) > 0 )
			max=f;
			
		return max;
	}
}
