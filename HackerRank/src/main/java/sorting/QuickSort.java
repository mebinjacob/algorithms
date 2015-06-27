package sorting;
//try this out someday
//TODO implement this, work on the comparison part
public class QuickSort {
	int partition(Integer[] input, int m, int p){
		Integer v = input[m];
		int i = m, j = p;
		do{
			do {
				i++;
			}while(input[i].compareTo(v) < 0);
			
			do {
				j--;
			}while(input[j].compareTo(v) > 0);
			
			if(i < j)
				interchange(input, i, j);
		}while(i < j);
		input[m] = input[j]; input[j] = v;
		return j;
	}
	
	public boolean isless(Number firstInput, Number secondInput){
		
		return false;
	}
	
	public void interchange(Object[] input, int i, int j){
		//Exchange input[i] with input[j]
		Object temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}

