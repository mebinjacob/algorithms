package sorting;

public class shellSort {
	public  void sort(int[] a)
	{
		int N = a.length;
		
		int h = 1;
		
		while(h < N/3) h = 3*h + 1;
		
		while(h >= 1)
		{
			//sort the array 
			for(int i = h; i < N; i++){
				for(int j = i; j >= h && less(a[j], a[j-h]); j -= h)
					exch(a, j, j-h);
			}
			
			h = h/3;
			
		}
	}
	
	private void exch(int[] input, int i, int j){
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	
	private boolean less(int i, int j){
		return i < j;
	}
}
