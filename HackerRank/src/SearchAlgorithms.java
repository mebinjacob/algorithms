
public class SearchAlgorithms {
	//Recursive binary search
	public int binarySearch(int[] a, int start, int end, int x){
		if(start == end){
			if(x == a[start]) return start;
			else
				return 0;
		}
		else{
			//Reduce P into a smaller subproblems 
			int mid = (start + end)/2;
			if(x == a[mid]) return mid;
			else if(x < a[mid])
				return binarySearch(a, start, mid - 1, x);
			else return binarySearch(a, mid + 1, end, x);
		}
	}
	//iterative binary search
	public int binarySearch(int[] a, int x){
		int low = 1;
		int high = a.length;
		
		while(low <= high){
			int mid = (high - low)/2;
			if(x < a[mid]) high = mid - 1;
			else if(x > a[mid]) low = mid + 1;
			else return mid;
		}
		
		return 0;
	}
}
