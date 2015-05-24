
public class Shell {
	public static void sort(Comparable[] a)
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
}
