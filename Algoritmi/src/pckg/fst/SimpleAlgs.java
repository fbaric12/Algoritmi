package pckg.fst;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleAlgs {

	public static int[] genArray(int lng) {
		
		int[] arr = new int[lng];
		
		for (int k = 0; k< lng; k++) {
			arr[k] = ThreadLocalRandom.current().nextInt(10, 101);
			
		}
		
		return arr;
	}
	
	public static int retMax(int[] ar) {
		int mx = ar[0];
		
		for (int k = 1; k < ar.length; k++) {
			if(ar[k] > mx) {
				mx = ar[k];
				
		
			}
			
		}
		
		
		return mx;
	}
	
	
}
