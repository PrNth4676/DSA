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
				total = total + value;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int[] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		RainTrap rainTrap = new RainTrap();
		System.out.println(rainTrap.trap(heights) + " Rain Trapped");
	}
}
