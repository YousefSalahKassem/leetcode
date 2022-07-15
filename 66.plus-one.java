import java.util.List;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for (int i =n-1 ; i >=0; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else if(digits[i]==9){
            digits[i]=0;
            }
        }
    int[] newNumber= new int[n+1];
    newNumber[0]=1;
    return newNumber;    
  }
}
// @lc code=end

