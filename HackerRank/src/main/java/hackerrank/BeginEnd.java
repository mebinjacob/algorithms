package hackerrank;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * https://www.hackerrank.com/contests/epiccode/challenges/begin-end/submissions/code/3354575
 */
public class BeginEnd {
	public static void main(String[] args) {
		Long N; 
		Scanner scanIn = new Scanner(System.in);
		String firstLine = scanIn.nextLine();
		N = Long.parseLong(firstLine);
		String input = scanIn.nextLine();
		String[] split = input.trim().split("");
		Map<String, Long> stringIntMap = new HashMap<String, Long>();
		
		for(String s : split){
			if(!s.isEmpty())
			stringIntMap.put(s, stringIntMap.get(s) == null?1:stringIntMap.get(s) + 1);
		}
		
		long sum = 0;
		for(String key : stringIntMap.keySet()){
			sum += (stringIntMap.get(key) * (stringIntMap.get(key) + 1))>>1;
		}
		System.out.println(sum);
	}
}
