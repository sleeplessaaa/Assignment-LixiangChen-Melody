package midTerm;

import java.util.*;;

public class midTerm{
		
		
	/*  Q1:
	 */
	public static void reverse(ArrayList<E> list) {
		int n = list.size() - 1;
		for(int i = 0; i<n; i++){
			list.add(i, list.remove(n));
		}
		
	}
	
	
	
	
	/*  Q2:
	*/

	public static String generateStrings(String s1, String s2){
		String newStr = "";
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				newStr=s1.substring(i, i+1)+s2.substring(j, j+1) +" ";
			}
		}
		return newStr;
	}
	
	
	
	/*  Q3:
	*/
	
	public static int singleNumber(int[] nums){
		int n = 0;
		for(int i = 0; i<nums.length; i++){
			n = n^nums[i];
		}
		
		return n;
	}
	
	
	/*  Q4:
	*/
	
	public int[] twoSum(int[] nums, int target){
		 int[] result = new int[2];
		 Map<Integer, Integer> map = new HashMap<>();
		 for(int i=0;i<nums.length;i++){
				if(map.containsKey(nums[i])){
					int number = map.get(nums[i]); 
					result[0] = number; 
					result[1] = i; 
				}
				else{
					map.put(target-nums[i], i); 
				}
			}
			return result;
	}
	
	
	/*  Q5:
	*/
	
	public List<Integer> getRow(int rowIndex){
		ArrayList<Integer>result = new ArrayList<Integer>();
		
		if(rowIndex < 0)
			return result;
		
		result.add(1);
		for(int i = 1; i <= rowIndex; i++){
			for(int j = result.size() - 2; j>= 0; j--){
				result.set(j+1, result.get(j)+result.get(j+1));
			}
			
			result.add(1);
		}
		
		return result;
	}
	
}