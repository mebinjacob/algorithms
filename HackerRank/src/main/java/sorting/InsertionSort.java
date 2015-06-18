package sorting;

//This works good when the number of elements are less than 16..
// this sorting algorithm is stable, in place and online!!
public class InsertionSort {
	void insertionSort(int[] input){
		for(int j = 2; j <= input.length; j++){
			//a[1:j-1] is already sorted
			int item = input[j];
			int i = j - 1;
			while((i >= 1) && (item < a[i])){
				input[i+1] = input[i]; i--;
			}
			input[i+1] = item;
		}
	}
}
