package sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.Test;

public class CountingSortTest {

	@Test
	public void test() {
		int inputSize = 100;
		String input = "63 25 73 1 98 73 56 84 86 57 16 83 8 25 81 56 9 53 98 67 99 12 83 89 80 91 39 86 76 85 74 39 25 90 59 10 94 32 44 3 89 30 27 79 46 96 27 32 18 21 92 69 81 40 40 34 68 78 24 87 42 69 23 41 78 22 6 90 99 89 50 30 20 1 43 3 70 95 33 46 44 9 69 48 33 60 65 16 82 67 61 32 21 79 75 75 13 87 70 33";
		String[] split = input.split(" ");
		int[] integerInput = new int[inputSize];
		int i = 0;
		for(String str : split){
			integerInput[i++] = Integer.parseInt(str);
		}
		CountingSort cs = new CountingSort();
		int[] sorted = cs.sort(integerInput);
		for(int k : sorted){
			System.out.print(k + " ");
		}
	}
	
/*	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int inputSize=(scanner.nextInt());
        scanner.nextLine();
        int[] input = new int[inputSize];
        while(scanner.hasNextLine()){
        	String currentInput = scanner.nextLine();
            String[] split = currentInput.split(" ");
            int i = 0;
    		
            for(String str : split){
            	if(!"".equals(str))
            		input[i++] = Integer.parseInt(str);
    		}
            break;
        }
        
        CountingSort cs = new CountingSort(); //Solution.CountingSort cs = new Solution().new CountingSort(); -- after making inner class for hackerrank
		int[] sorted = cs.sort(input);
		for(int k : sorted){
			System.out.print(k + " ");
		}
        scanner.close();
	}*/
	
	//https://www.hackerrank.com/challenges/countingsort4 fix for input sizes and submit here
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int inputSize=(scanner.nextInt());
        scanner.nextLine();
        int[] input = new int[inputSize];
        int l = 0;
        Map<Integer, String> mapInput = new HashMap<Integer,String>();
        while(scanner.hasNextLine()){
        	String currentInput = scanner.nextLine();
            String[] split = currentInput.split(" ");
            int key = Integer.parseInt(split[0]);
            input[l++] = key;
            String value = split[1];
            mapInput.put(key, value);
            if(l == inputSize)
            	break;
        }
        
        int[] otherHalf = new int[inputSize/2];
        int m = 0;
        for(int i =inputSize/2; i < inputSize; i++, m++){
        	otherHalf[m] = input[i];
        }
        CountingSort cs = new CountingSort(); //Solution.CountingSort cs = new Solution().new CountingSort(); -- after making inner class for hackerrank
		int[] sorted = cs.sort(otherHalf);
		
		//first half
		for(int i =0 ; i < inputSize/2; i++){
        	System.out.print(mapInput.get(i) + " ");
        }
		//otherhalf
		for(int i =0 ; i < sorted.length; i++){
			System.out.print(mapInput.get(sorted[i]) + " ");
		}
        scanner.close();
	}
}
