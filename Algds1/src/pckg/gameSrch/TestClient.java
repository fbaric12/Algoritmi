package pckg.gameSrch;

import java.util.Arrays;

public class TestClient {

	
	public static void main(String[] args) {
		
		
		// int[] ar = AlgBasic.generateArray(8, 0, 300);
//		System.out.println(Arrays.toString(ar));
//		int key = 100;
//		SearchResult srchRes = AlgBasic.isValueInArray(key, ar);
//		System.out.println(srchRes.toString());
		
		PlayGameInArray.PlayGuessGame(5, 8, 0, 200);
		
		
		
		
//		Arrays.parallelSort(ar) ;
//		System.out.println(Arrays.toString(ar));
//		int ind = Arrays.binarySearch(ar, key);
//		System.out.println("Return value from binary search alg -> " + ind);
	}
}
