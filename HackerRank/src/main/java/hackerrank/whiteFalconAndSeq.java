package hackerrank;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/contests/epiccode/challenges/white-falcon-and-sequence
 */
public class whiteFalconAndSeq {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		String firstLine = scanIn.nextLine();
		int N = Integer.parseInt(firstLine);
		if (N > 1) {

			String secondLine = scanIn.nextLine();
			String[] split = secondLine.split(" ");
			Long[] intArray = new Long[N];
			for (int i = 0; i < N; i++) {
				if (!split[i].trim().isEmpty())
					intArray[i] = Long.parseLong(split[i]);
			}

			long[][] matrix = new long[N + 1][N + 1]; // the matrix,
			int remainingElements = 0;

			for (int i = 0; i < N; i++) {
				matrix[i][0] = 0;
			}

			long max = Integer.MIN_VALUE;

			for (int i = 1; i <= N; i++) {
				remainingElements = N - i;
				int k = i;
				for (int j = 1; j <= N; j++) {

					// if(j > remainingElements/2) break;
					/*
					 * if(k - 1 >= N - (j-1) - 1) break;
					 */

					if (k - 1 < N - (j - 1) - 1) {

						matrix[i][j] = intArray[k - 1]
								* intArray[N - (j - 1) - 1] + matrix[i][j - 1];
						if (matrix[i][j] > max) {
							max = matrix[i][j];
						}
						k++;
					}
				}
			}

			System.out.println(max);

		}
		else{
			System.out.println(0);
		}
	}

}
