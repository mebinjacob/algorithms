package hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 *https://www.hackerrank.com/contests/epiccode/challenges/perfect-hiring 
 */

public class PerfectHiring {
	private Integer N; // no. of candidates
	private BigDecimal[] A; // scores of n candidates
	private Double P;// = P
	private Double X; // = X the patience being lost after each interview

	public Integer getN() {
		return N;
	}

	public void setN(Integer n) {
		N = n;
	}

	public BigDecimal[] getA() {
		return A;
	}

	public void setA(BigDecimal[] a) {
		A = a;
	}

	public Double getP() {
		return P;
	}

	public void setP(Double p) {
		P = p;
	}

	public Double getX() {
		return X;
	}

	public void setX(Double x) {
		X = x;
	}

	public BigDecimal getRating(final int i, final Double score) {
		if(score < 1)
			return new BigDecimal(-1.0);
		BigDecimal scoreB = new BigDecimal(score); // Patience is the starting patience
		BigDecimal patienceB = new BigDecimal(P);
		BigDecimal ans = scoreB.multiply(patienceB);
		if (P - X > 1)
			this.P = P - X;
		return ans;
	}

	public static void main(String[] args) {

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		String firstLine;
		Scanner scanIn = new Scanner(System.in);
		firstLine = scanIn.nextLine();

		PerfectHiring perfectHiring = new PerfectHiring();
		String[] split = firstLine.trim().split(" ");

		perfectHiring.setN(Integer.parseInt(split[0]));
		perfectHiring.setP(Double.parseDouble(split[1]));
		perfectHiring.setX(Double.parseDouble(split[2]));

		if(perfectHiring.getN() < 1 || perfectHiring.getP() < 1 || perfectHiring.getX() < 1)
			return;
		
		String secondLine = scanIn.nextLine();
		String[] scores = secondLine.trim().split(" ");

		BigDecimal maxRating = new BigDecimal(-1.0);
		int[] indexs = new int[perfectHiring.getN()];
		int j = 0;
		int index = -1;
		for (int i = 0; i < perfectHiring.getN(); i++) {
			BigDecimal currentRating = perfectHiring.getRating(i,
					Double.parseDouble(scores[i]));
			
			if (currentRating.compareTo(maxRating) == 1) {
//				System.out.println(currentRating);
//				System.out.println(maxRating);
				maxRating = currentRating;
				index = i + 1;
			}
		}
		System.out.println(index);

	}
}
