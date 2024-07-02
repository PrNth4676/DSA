package arrayProblems;

import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultedList = new ArrayList<Boolean>();
        int maxCandies = candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>maxCandies) {
            	maxCandies = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxCandies){
                resultedList.add(i,true);
            } else {
                resultedList.add(i,false);
            }
        }
        return resultedList;
    }
	
	public static void main(String[] args) {
		int[] candiesArray = {2,3,5,1,3};
		int extraCandies = 3;
		MaxCandies candies = new MaxCandies();
		candies.kidsWithCandies(candiesArray, extraCandies);
	}
}
