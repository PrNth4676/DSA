package arrayProblems;

public class RainTrap {
	
	//BRUTE FORCE APPROACH
	public int trap(int[] height) {
		int total = 0;
		for (int index = 0; index < height.length; index++) {
			int maxLeft = height[index];
			for (int i = index + 1; i < height.length; i++) {
				maxLeft = Math.max(maxLeft, height[i]);
			}
			int maxRight = 0;
			for (int j = 0; j < index; j++) {
				maxRight = Math.max(maxRight, height[j]);
			}
			int value = Math.min(maxLeft, maxRight) - height[index];
			if (value >= 0) {
				total += value;
			}
		}
		return total;
	}
	
	// O(n) Time Complexity 
	public int trapOptimal(int[] height) {
	        int total = 0;
			int[] left_max = new int[height.length];
	        int[] right_max = new int[height.length];
	        left_max[0] = height[0];
	        right_max[height.length-1]=height[height.length-1];
	        //The max is found between two elements in comparison and placed in an array.
	        //Once found it is placed in the index and then the next comparison
	        //matches between the max and the other numbers to the left.
	        for(int i=1;i<height.length;i++){
	            left_max[i] = Math.max(height[i],left_max[i-1]);
	        }
	        for(int j=height.length-2;j>=0;j--){
	            right_max[j] = Math.max(height[j],right_max[j+1]);
	        }
	        
	        for(int i=1;i<height.length;i++){
	            total+=Math.min(left_max[i],right_max[i])-height[i];
	        }
			return total;
	    }
	

	public static void main(String[] args) {
		int[] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		RainTrap rainTrap = new RainTrap();
//		System.out.println(rainTrap.trap(heights) + " Rain Trapped");
		System.out.println(rainTrap.trapOptimal(heights) + " Rain Trapped");
	}
}
