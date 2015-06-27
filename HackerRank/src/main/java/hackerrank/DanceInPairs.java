package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/*
 * https://www.hackerrank.com/contests/epiccode/challenges/dance-in-pairs
 */
public class DanceInPairs {


	public static void main(String[] args) {
		int N;
		int K;
		Scanner scanIn = new Scanner(System.in);
		String firstLine = scanIn.nextLine();

		String[] splitFirstLine = firstLine.split(" ");
		N = Integer.parseInt(splitFirstLine[0]);
		K = Integer.parseInt(splitFirstLine[1]);

		if (N < 1)
			return;
		if (K < 1)
			return;

		Double[] heightsOfBoys = new Double[N];

		String secondLine = scanIn.nextLine();

		String[] splitSecondLine = secondLine.split(" ");
		
		for(int i = 0; i < splitSecondLine.length; i++){
			heightsOfBoys[i] = Double.parseDouble(splitSecondLine[i]);
		}
		
//		heightsOfBoys[0] = Double.parseDouble(splitSecondLine[0]);
		
		Arrays.sort(heightsOfBoys, Collections.reverseOrder());
		/*for(int j = 1; j <= N-1; j++){
			Double item = Double.parseDouble(splitSecondLine[j]);
			int i = j - 1;
			while((i >= 0) && (item > heightsOfBoys[i])){
				heightsOfBoys[i + 1] = heightsOfBoys[i]; 
				i--;
			}
			
			heightsOfBoys[i + 1] = item;
		}*/

		Double[] heightsOfGirls = new Double[N];
		
		String thirdLine = scanIn.nextLine();

		String[] splitThirdLine = thirdLine.split(" ");
		for(int i = 0; i < splitThirdLine.length; i++){
			heightsOfGirls[i] = Double.parseDouble(splitThirdLine[i]);
		}
		Arrays.sort(heightsOfGirls, Collections.reverseOrder());
//		heightsOfGirls[0]=Double.parseDouble(splitThirdLine[0]);
		
		/*for(int j = 1; j < N; j++){
			Double item = Double.parseDouble(splitThirdLine[j]);
			int i = j - 1;
			while((i >= 0) && (item > heightsOfGirls[i])){
				heightsOfGirls[i + 1] = heightsOfGirls[i]; 
				i--;
			}
			heightsOfGirls[i + 1] = item;
		}*/
		
		// Both the arrays should be sorted now !! 
		int no_of_pairs = 0;
		for(int j = 0, i = 0; j < N && i < N;){
			if(Math.abs(heightsOfBoys[j] - heightsOfGirls[i]) <= K){
				
				no_of_pairs++;
				i++;j++;
			}
			else{
				if(heightsOfBoys[j] >= heightsOfGirls[i]){
					j++;
				}
				else{
					i++;
				}
			}
		}
		System.out.println(no_of_pairs);
	}
}
