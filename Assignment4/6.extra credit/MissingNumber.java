package test;

public class MissingNumber {
	
	public int missingNumber(int[] nums) {            //correct
	    int sum=0;
	    for(int i=0; i<nums.length; i++){
	        sum+=nums[i];
	    }
	 
	    int n=nums.length;
	    return n*(n+1)/2-sum;
	}

    public static void main(String[] args) {
        MissingNumber test = new MissingNumber();
        int[] nums= {0,1,2,3,5};
        System.out.println(test.missingNumber(nums));
      
    }
}
