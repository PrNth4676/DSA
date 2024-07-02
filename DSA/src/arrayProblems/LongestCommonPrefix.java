package arrayProblems;

public class LongestCommonPrefix {
	
	//WRONG SOLUTION
	public String longestCommonPrefix(String[] strs) {
        String prefix="";
        for(int i=0;i<strs.length-2;i++){
            if(strs[i].charAt(i)==strs[i+1].charAt(i)){
                if(strs[i+1].charAt(i)==strs[i+2].charAt(i)){
                	prefix+=strs[i+2].charAt(i);
                	if(strs[i].charAt(i+1)==strs[i+1].charAt(i+1)) {
                		if(strs[i+1].charAt(i+1)==strs[i+2].charAt(i+1)) {
                			prefix+=strs[i+2].charAt(i+1);
                		} else {
                			prefix+=strs[i+1].charAt(i+1);
                		}
                	}
                }
            } else {
                prefix = "";
            }
        }
        return prefix;
    }

	public static void main(String[] args) {
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String[] strs = {"flower","flow","flight"};
		prefix.longestCommonPrefix(strs);
	}

}
