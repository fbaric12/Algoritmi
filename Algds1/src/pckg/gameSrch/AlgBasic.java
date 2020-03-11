package pckg.gameSrch;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class AlgBasic {

	
	public static int[] generateArray(int size, int bottom, int upper) {
		
		int[] arr = new int[size];
		
		for(int k = 0;k < size; k++) {
			arr[k] = ThreadLocalRandom.current().nextInt(bottom, upper+1);
			
		
		}
		return arr;
	}
	
	public static SearchResult isValueInArray(int val, int[] arr) {
		
		Arrays.sort(arr);
		int indx = Arrays.binarySearch(arr, val);
		SearchResult srchRes;
		
		if (indx >= 0) {
			srchRes = new SearchResult(indx,val);
			
		}else{
			srchRes = new SearchResult(val);
		}
		
		
		
		
		
		return srchRes;
	}


}
