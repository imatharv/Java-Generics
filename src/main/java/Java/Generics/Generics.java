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
	public static String maxString(String str1, String str2, String str3) {
		String max=str1;
		
		if(str2.compareTo(max) > 0 )
			max=str2;
		if(str3.compareTo(max) > 0 )
			max=str3;
			
		return max;
	}
}
