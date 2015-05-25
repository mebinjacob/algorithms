package unclassified;

import java.util.Scanner;

/*
 * Problem statement :-
 * Insertion Sort is a simple sorting technique which was covered in previous challenges. Sometimes, arrays may be too large for us to wait around for insertion sort to finish. Is there some other way we can calculate the number of times Insertion Sort shifts each elements when sorting an array?

If ki is the number of elements over which ith element of the array has to shift then total number of shift will be k1 + k2 + ... + kN.

Input: 
The first line contains the number of test cases T. T test cases follow. The first line for each case contains N, the number of elements to be sorted. The next line contains N integers a[1],a[2]...,a[N].

Output: 
Output T lines, containing the required answer for each test case.

Constraints: 
1 <= T <= 5 
1 <= N <= 100000 
1 <= a[i] <= 1000000

Sample Input:

2  
5  
1 1 1 2 2  
5  
2 1 3 1 2
Sample Output:

0  
4   
 * 
 * 
 */
/*
 * Hackerrank passed test cases!!!!
 * 
 */
public class InversionCount {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for(int i=0;i<t;i++){
			int n = in.nextInt();
			int[] ar = new int[n];
			for(int j=0;j<n;j++){
				ar[j]=in.nextInt();
				//System.err.println(ar[j]);
			}
			long c = insertSort(ar);      
			System.out.println(c);
		}
	}


	public static long insertSort(int[] ar)
	{
		long count = 0;
		// Compute the required count
		return inversionCount(ar, 0, ar.length -1);

	}



	private static long inversionCount(int[] array, int start, int end){


		long inversionCount = 0;
		if(start == end)
			return 0;
		int mid = start + (end - start)/2;

		int[] temp = new int[end - start + 1];
		int tempCounter = 0;
		long inversionCountLeft = inversionCount(array, start, mid);
		long inversionCountRight = inversionCount(array, mid + 1, end);
		inversionCount = inversionCountLeft + inversionCountRight;

		//merge the list in O(n) time

		int i = start;
		int j = mid + 1;
		while(i <= mid && j <= end){
			if(array[i] > array[j]) //inversion count
			{
				inversionCount += end - j + 1;
				temp[tempCounter++] = array[i++];
			}
			else{
				temp[tempCounter++] = array[j++];
			}
		}

		while(j <= end){
			temp[tempCounter++] = array[j++];
		}

		while(i <= mid){
			temp[tempCounter++] = array[i++];
		}

		//copy to original array
		int c = 0;
		for( int k = start; k <= end; k++){
			array[k] = temp[c++]; 
		}
		return inversionCount;

	}
}
