package sorting;

/*
 * This is preferred for sorting linked list. The slow random access performance of a linked list makes some other algorithms (such as quick sort) perform poorly, and others such as heapsort completely impossible.
 */
public class MergeSort {

	/* this is for array but remember it is good with linked list not with
	 arrays*/
	private int[] input;
	private int[] output; //auxialiary global array that will hold the output
	
	public MergeSort(int[] input){
		this.input = input;
		this.output = new int[input.length];
	}
	
	public void sort() {
		mergeSort(0, input.length - 1);
		//mergeSort1(0, input.length - 1);
	}
	
	
	// This is more efficient for large array
	public void mergeSort1(int low, int high){
		if((high - low + 1) < 16)
			 new InsertionSort().insertionSort(input);
		else{
			int mid = low + (high - low)/2;
			mergeSort1(low, mid);
			mergeSort1(mid + 1, high);
			merge(low, mid, high);
		}
	}

	private void mergeSort(int low, int high)
	{
		int mid;
		if(low < high) // that is to make sure there is more than one element, else its already sorted
		{
			int offset = low;
			if(low == 0){
				offset = 1;
			}
			mid = offset + (high - low)/2; //do not do high + low technique as that may cause overflow 
			//Solve the subproblems
			mergeSort(low, mid);
			mergeSort(mid + 1, high);
			merge(low, mid, high);
		}
		
	}
	
	
	//Remember auxiliary array is a must here
	public void merge(int low, int mid, int high){
		int h = low, i = low, j = mid + 1, k;
		while(h <= mid && j <= high){
			if(input[h] <= input[j]){
				output[i] = input[h];
				h++;
			}else{
				output[i] = input[j];
				j++;
			}
			i++;
		}
		if(h > mid)
			for(k = j; j <= high; k++){
				output[i] = input[k];
				i++;
			}
		else{
			for(k=h; k <= mid; k++){
				output[i] = input[k];
				i++;
			}
		}
		
		//putting it back into the original array
		for(k = low; k <= high; k++) input[k] = output[k];
	}
}