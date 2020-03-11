package pckg.gameSrch;

import java.util.Arrays;
import java.util.Scanner;

public class PlayGameInArray {

	public static void PlayGuessGame(int maxNumGuess, int arrSize, int bottom, int upper) {
		
		int cntr = 0;
		boolean gameStatus = true;
		int[] arr = AlgBasic.generateArray(arrSize, bottom, upper);
		Scanner sc = new Scanner(System.in);
		int guess;
		SearchResult res;
		
		while(gameStatus) {
			cntr ++;
			if (cntr <= maxNumGuess) {
				System.out.println("Trial -> " + cntr);
				guess = sc.nextInt();
				res = AlgBasic.isValueInArray(guess, arr);
				if (res.isStatus()) {
					System.out.println(Arrays.toString(arr));
					System.out.println(res.toString());
					System.out.println("YOU WIN! -> iteration -> " + cntr);
					gameStatus = false;
				}else {
					sc.nextLine();
					System.out.println("Wrong!");
			}
			
				
			}else {
				gameStatus = false;
				System.out.println(Arrays.toString(arr));
				System.out.println("YOU LOSE -> GAME OVER");
			}
		}
		sc.close();
	}
}
