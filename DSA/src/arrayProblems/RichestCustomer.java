package arrayProblems;

public class RichestCustomer {
	
	public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        int max=0;
        for(int c=0;c<accounts.length;c++){
            for(int b=0;b<accounts[c].length;b++){
            	wealth[c]+=accounts[c][b];
            }
            max=wealth[0];
            for(int z=1;z<wealth.length;z++){
                if(wealth[z]>max){
                    max=wealth[z];
                }
            }
        }
        return max;
    }

	public static void main(String[] args) {
		RichestCustomer customer = new RichestCustomer();
		int[][] accounts = {{1,5},{7,3},{3,5}};
		System.out.println("Richest Customer has value : "+customer.maximumWealth(accounts));
	}

}
