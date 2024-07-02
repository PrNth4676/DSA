package arrayProblems;

public class ArrayProblemsPartOne {

	public int[] arrangeArrayToRHS(int[] input) {
		int[] arrangedArray = new int[input.length];
		for (int i = 0; i < input.length - 1; i++) {
			int max = input[i + 1];
			int j = i + 1;
			while (j < input.length - i) {
				if (input[j] >= max) {
					max = input[j];
				}
				j++;
			}
			arrangedArray[i] = max;
		}
		arrangedArray[input.length - 1] = -1;
		return arrangedArray;
	}

	// Space Complexity is reduced by using the same input array
	public int[] arrangeArrayToRHSSpace(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			int max = input[i + 1];
			int j = i + 1;
			while (j < input.length - i) {
				if (input[j] >= max) {
					max = input[j];
				}
				j++;
			}
			input[i] = max;
		}
		input[input.length - 1] = -1;
		return input;
	}

	// Using Math.max method to bring time complexity to O(n)
	public int[] arrangeArrayToFindMaxElement(int[] input) {
		int temp = input[input.length - 1];
		input[input.length - 1] = -1;
		for (int i = input.length - 2; i >= 0; i--) {
			int x = input[i];
			input[i] = Math.max(input[input.length - 1], temp);
			temp = x;
		}
		return input;
	}

	// Space Complexity is reduced by using the same input array
	public int[] arrangeArrayToRHSIncludingElement(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			int max = input[i];
			int j = i + 1;
			while (j < input.length - i) {
				if (input[j] >= max) {
					max = input[j];
				}
				j++;
			}
			input[i] = max;
		}
		return input;
	}

	public int[] arrangeArrayToLHS(int[] input) {
		for (int i = input.length - 1; i > 0; i--) {
			int max = input[i - 1];
			int j = i - 1;
			while (j < i && j != -1) {
				if (input[j] >= max) {
					max = input[j];
				}
				j--;
			}
			input[i] = max;
		}
		input[0] = -1;
		return input;
	}

	// Not completely correct
	public int[] twoSum(int[] nums, int target) {
		int[] resultArr = new int[2];
		int index = 0;
		int max = nums[0];
		int length = nums.length;
		while (length != 1) {
			for (int i = 1; i < length; i++) {
				if (nums[i] > max) {
					max = nums[i];
					index = i;
				}
			}
			length--;
			if (target > max) {
				System.out.println(max);
				System.out.println(index);
				resultArr[1] = index;
				target -= max;
			} else {
				max = nums[0];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i]) {
				resultArr[0] = i;
			}
		}
		return resultArr;
	}

	// Maximum Wealth Problem in LeetCode
	public int maximumWealth(int[][] accounts) {
		int[] wealthArray = new int[accounts.length];
		for (int i = 0; i < accounts.length; i++) {
			int wealth = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				wealth += accounts[i][j];
			}
			wealthArray[i] = wealth;
		}
		int richest = wealthArray[0];
		for (int i = 1; i < wealthArray.length; i++) {
			if (wealthArray[i] > richest) {
				richest = wealthArray[i];
			}
		}
		return richest;
	}

	// Running Sum of 1d Array
	public int[] runningSum(int[] nums) {
		int firstNo = nums[0];
		int[] returnedArr = new int[nums.length];
		returnedArr[0] = firstNo;
		for (int i = 1; i < nums.length; i++) {
			firstNo += nums[i];
			returnedArr[i] = firstNo;
		}
		return returnedArr;
	}
	
	public String convertToGoodString(String inputString) {
		String goodString = "";
//		Scanner scanner = new Scanner(System.in);
//		String inputString = scanner.nextLine();
		for(int i=0;i<inputString.length()-1;i++) {
			if(inputString.charAt(i)==inputString.charAt(i+1)) {
				goodString+=inputString.charAt(i);
			} else {
				goodString+=inputString.charAt(i+1);
			}
		}
		return goodString;
	}
	
	//Remove Duplicates
	public int removeDuplicates(int[] nums) {
        int unique = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
            	nums[unique]=nums[i];
                unique+=1;
            }
        }
        return unique;
    }
	
	
	public int maxProfit(int[] prices) {
        int buyIndex=0;
        int sellIndex=1;
        int profit=0;
        int max_profit=0;
        while(sellIndex<prices.length){
        	if(prices[sellIndex]>prices[buyIndex]) {
        		profit = prices[sellIndex]-prices[buyIndex];
        		max_profit=Math.max(max_profit, profit);
        	} else {
        		buyIndex=sellIndex;
        	}
            sellIndex++;
        }
        return max_profit;
    }

	public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
	
	public void swapElement(int elementOne, int elementTwo) {
		int temp=0;
		temp =elementOne;
		elementOne=elementTwo;
		elementTwo=temp;
	}
	
	
	public int linearSearch(int[] arr,int element) {
		for(int i=0;i<arr.length;i++) {
			if(element==arr[i]) {
				swapElement(arr[i], arr[i-1]);
				return i;
			}
		}
		return -1;
	}
	
	public int linearSearchMoveToHead(int[] arr,int element) {
		for(int i=0;i<arr.length;i++) {
			if(element==arr[i]) {
				swapElement(arr[i], arr[0]);
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] input = { 16, 17, 4, 5, 3, 2 };
		ArrayProblemsPartOne one = new ArrayProblemsPartOne();
		one.arrangeArrayToRHS(input);
		System.out.println(one.linearSearch(input, 4));
		System.out.println(one.linearSearchMoveToHead(input, 4));
	}
}
