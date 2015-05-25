package sorting;
/*
 * Constraints 
 *100≤n≤106 
 *0≤x<100,x∈ar
 *x is the range of possible values
 */
public class CountingSort {
	private int maxRage = 100;
	private int[] count = new int[maxRage];
	public int[] sort(int[] input){
		//count the occurrence of each element
		//initialize the count array with 0 
		for(int i = 0; i < maxRage; i++){
			count[i] = 0;
		}
		
		for(int j = 0; j < input.length; j++){
			if(input[j] < maxRage){
				count[input[j]]++;
			}
			else{
				System.out.println("Value greater than allowed range");
			}
		}
		return count;
	}
}
