package sorting;

//This works good when the number of elements are less than 16..
// this sorting algorithm is stable, in place and online!!
public class InsertionSort {
	void insertionSort(int[] input){
		/*doesnt work
		 * for(int j = 2; j <= input.length; j++){
			//a[1:j-1] is already sorted
			int item = input[j];
			int i = j - 1;
			while((i >= 1) && (item < input[i])){
				input[i+1] = input[i]; i--;
			}
			input[i+1] = item;
		}*/
		
		/*
		 * this one works -- tested on hackerrank 
		 * N is input size
		 * for(int j = 1; j <= N-1; j++){
			Double item = Double.parseDouble(splitSecondLine[j]);
			int i = j - 1;
			while((i >= 0) && (item > heightsOfBoys[i])){
				heightsOfBoys[i + 1] = heightsOfBoys[i]; 
				i--;
			}
			
			heightsOfBoys[i + 1] = item;
		}*/	
		
	}
}

