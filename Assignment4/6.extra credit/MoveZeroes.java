package test;

import java.util.Arrays;
public class MoveZeroes {
	
	public static void moveZeroes(int[] nums) {
		int i=0;
	    int j=0;
	 
	    while(j<nums.length){
	        if(nums[j]==0){
	            j++;
	        }else{
	            nums[i]=nums[j];
	            i++;
	            j++;
	        }
	    }
	 
	    while(i<nums.length){
	        nums[i]=0;
	        i++;
	    }
	    
	    System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
	    MoveZeroes test = new MoveZeroes();
	    int[] nums= {0,1,0,3,0,5,0,12};
	    test.moveZeroes(nums);
	      
	   }
}
