package sorting;
/*This is good if the number of possible values is less
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
		//counts the elements
		for(int j = 0; j < input.length; j++){
			if(input[j] < maxRage){
				count[input[j]]++;
			}
			else{
				System.out.println("Value greater than allowed range");
			}
		}
		
		for(int k=1; k < maxRage; k++){
			count[k] += count[k-1];
		}
		
		int[] output = new int[input.length];
		//Build the output character array 
		for(int l = input.length - 1; l > 0 ; l--){
			output[--count[input[l]]] = input[l]; 
		}
		return output;
	}
}
