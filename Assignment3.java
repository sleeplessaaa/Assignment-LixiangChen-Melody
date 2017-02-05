package test;
/**
 * Created by Rose on 1/27/17.
 * Assignment for your lecture 3. Please finish all the questions under
 * 'Assignment'. Please try to think the extra credit questions. The deadline
 * of this assignment is 02/04/2017 23:59 PST. Please feel free to contact me
 * for any questions. Please write your comments about this assignment in the
 * end.
 */


public class Assignment3 {
    /**
     *  Given an array, reverse the elements within this array and print the result
     *  eg, given{1,2,3,4}, print{4,3,2,1}
     */
    public void reverseArray(int[] nums) {
        int n = nums.length;
        for(int i = 0, j = n/2; i<j; i++){
        	int x = nums[i];
        	nums[i]=nums[n-i-1];
        	nums[n-i-1]= x;
        }
        for(int i=0; i<n;i++){
        	System.out.print(nums[i]+",");
        }
    }
    //write your code here

    /**
     *  Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
     *  Assume the integer do not contain any leading zero, except the number 0 itself.
     *  The digits are stored such that the most significant digit is at the head of the array.
     *  eg, given {1,2,9}, reutrn{1,3,0}.
     */
    public int[] plusOne(int[] digits) {
    	for(int i=digits.length-1;i>=0;i--){
    	          digits[i] =1+digits[i];           
                  if(digits[i]==10)
    		      digits[i]=0;
    		      else
                  return digits;
    		     }
    		
                 int[] newdigit = new int[digits.length+1];
    	         newdigit[0]=1;
    	         for(int i=1;i<newdigit.length;i++){
    	         newdigit[i] = digits[i-1];
    	         }
                 return newdigit;
        
     }
     //write your code here

    /**
     *  Assume you have a method isSubstring which checks if one word is a substring of another.
     *  Given two strings, s1 and s2, write a program to check if s2 is a rotation of s1, using only one call
     *  to isSubstring
     *  eg, "pineapple" is a rotation of "neapplepi"
     */
    public boolean isRotation(String s1, String s2) {  
        if (s1.length() != s2.length())   
            return false;  
        String newStr = s1 + s2;  
        return isSubstring(newStr, s2);
    }   

    public static boolean isSubstring(String s1, String s2) {
        if (s2 == null || s2.length() == 0) return true;
        if (s1 == null || s1.length() == 0) return false;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                if (s1.substring(i, i + s2.length()).equals(s2)) {
                    return true;
                }
            }
        }
        return false;
    }
    /**
     *  Given two strings, write a method to decide if one is a permutation of the other
     *  hint: the comparison is case sensitive and whitespace is significant
     */
    public boolean isPermutation(String s1, String s2) {
    	if(s1.length()!=s2.length())
    		return false; 
        boolean[] check = new boolean[s2.length()];
        for(int i=0;i<s1.length();++i){
            int j = 0;
            for(;j<s2.length();++j){
                if(!check[j] && s1.charAt(i)==s2.charAt(j)){
                    check[j]=true;
                    break;
                }
            }
            if(j==s2.length())return false;
        }
        return true; //write your code here
    }
    /**
     *  Write a program to implement encoding and decoding string. The rule is simple: encode successive
     *  repeated characters by the repetition count and the character. For example, the input of encoding()
     *  is "aaaabcccaa", you should return "4a1b3c2a". The decoding of "3e4f2e" returns "eeeffffee". Assume
     *  the string to be encoded consists of letters of the alphabet, with no digits, and the string to be
     *  decoded is a valid encoding.
     */
    public static String encoding(String s) {
    	 if (s == null || s.isEmpty()) return "";
    	    int count = 1;
    	    StringBuilder result = new StringBuilder();
    	    for (int i = 1; i < s.length(); i++) {
    	      if (s.charAt(i-1) == s.charAt(i)) {
    	        count++;
    	      } else {
    	        result.append(count);
    	        result.append(s.charAt(i-1));
    	        count = 1;
    	      }
    	    }
    	    result.append(count);
    	    result.append(s.charAt(s.length()-1));
    	    return result.toString();
    }
    
    public static String decoding(String s) {
    	if (s == null || s.isEmpty() || (s.length() & 1) == 1) return "";
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
          if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            count = count * 10 + s.charAt(i) - '0';
          } else {
              for (int j = 0; j < count; j++) {
                  result.append(s.charAt(i));
              }
              count = 0;
          }
        }
        return result.toString();//write your code here
    }

    //Extra Credit
    /**
     *Given an m x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise).
     * For exmaple, given 1 2 3  , return 7 4 1
     *                    4 5,6           8 5 2
     *                    7,8,9           9 6 3
     *tip: image could be a square or a rectangle.
     */
    public void rotate(int[][] matrix) {
    	 int m = matrix.length;
         int n = matrix[0].length;
         int[][] result = new int[m][n];  
         for(int i = 0; i<m; i++){
             for(int j = 0; j<n; j++){
             result[j][m-1-i] = matrix[i][j];
              }
    	 }
         for(int i=0;i<m;i++){
    	     for(int j=0; j<n; j++){
    	        matrix[i][j] = result[i][j];
    	    }
         }//write your code here
    }

     /**
     *Given a string containing just the characters '(', ')', return the count of valid parentheses. If the
     * intput is not valid, return -1. A valid parentheses is "()". For example, given "(())", return 2;
     * given "(()))", return -1.
     */
     public int countValidParentheses(String s) {
    	 int leftParentheses = 0;
		 int rightParentheses = 0;
    	 char[] arr = s.toCharArray();
    	 for (int i = 0; i < arr.length; i++) {
    		 if(arr[i]=='(') leftParentheses++;
    		 if(arr[i]==')') rightParentheses++;
    	 }
    	 
    	 if (leftParentheses == rightParentheses)
    		 return leftParentheses;
    	 else
    		 return -1;
         //write your code here
     }
}

    /**
     * Write anything you think about this assignment here. Easy? Difficult? Too many questions? Less fun?
     * You could write any comments here
     */
