package test;

public class ThirdMax {
	
	public int thirdMax(int[] nums) {                    //correct
		long first = Long.MIN_VALUE;
	     long second = Long.MIN_VALUE;
	     long third = Long.MIN_VALUE;
	     for (int i:nums){
	         if (i>first){
	             third = second;
	             second = first;
	             first = i;
	         }else if (i == first)    
	             continue;
	         else if (i > second){
	             third = second;
	             second = i;
	         }else if (i == second)   
	             continue;
	         else if (i > third){
	             third = i;
	         }
	     }
	     return third == Long.MIN_VALUE ? (int)first : (int)third;
   }
	
	 public static void main(String[] args) {
	        ThirdMax test = new ThirdMax();
	        int[] nums= {0,1,2,3,5};
	        System.out.println(test.thirdMax(nums));

	 }
}	 
	 
