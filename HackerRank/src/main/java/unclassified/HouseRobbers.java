package unclassified;


public class HouseRobbers {
	//this is awesome ...
	public int rob(int[] nums){
		
		int t0 = 0; 
        int t1 = 0; 
        for (int i = 0; i < nums.length; i++) { 
            int t = t1; 
            t1 = max(t1, t0 + nums[i]); 
            t0 = t; 
        } 
        return t1;
		
	}
	
	private int max(int i, int j){
		return i > j ? i : j;
	}
}


