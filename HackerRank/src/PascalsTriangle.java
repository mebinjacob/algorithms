import java.util.Scanner;


public class PascalsTriangle {
	public static void main(String[] args) {
		System.out.println("Test");
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int[][] array = new int[6][6];
		// n and r are same
		for(int r = 0; r < rows; r++){
			for(int k = 0; k <= r; k++ ){
				if(k ==0 || r == k){
					array[r][k] = 1;
				}
				else{
					array[r][k] = array[r-1][k-1] + array[r-1][k];
				}
			}
		}

		//print the matrix
		for(int i = 0; i < 6; i++){
			for(int c = 0; c < 6; c++){
				if(array[i][c] != 0) 
					System.out.print(array[i][c]);
			}
			System.out.println();
		}

	}
}
