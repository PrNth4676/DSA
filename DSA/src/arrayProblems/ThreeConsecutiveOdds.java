package arrayProblems;

public class ThreeConsecutiveOdds {

	public boolean threeConsecutiveOdds(int[] arr) {
        boolean isPresent = false;
        for(int i=0;i<(arr.length-2);i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0) {
                isPresent = true;
                break;
            } else {
                isPresent = false;
            }
        }
        return isPresent;
    }
	
	
	public static void main(String[] args) {
		ThreeConsecutiveOdds consecutiveOdds = new ThreeConsecutiveOdds();
		int[] inputArray = {1,2,34,3,4,5,7,23,12};
		consecutiveOdds.threeConsecutiveOdds(inputArray);
	}
}
