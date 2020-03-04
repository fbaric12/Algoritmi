package pckg.fst;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		
		int[] arr = SimpleAlgs.genArray(5);
		System.out.println(Arrays.toString(arr));
		int mx = SimpleAlgs.retMax(arr);
		System.out.println("Max -> " + mx);

	}

}
