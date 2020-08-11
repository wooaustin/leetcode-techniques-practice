/* EASY Problem:
Given an array of integers, find the contiguous subarray within an array(containing at least one number) which
has the largest sum and return its sum 
*/


class Solution{
    public int maxSubArray(int[] nums){
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for(int i =0;i<nums.length;i++){
            maxEndingHere = maxEndingHere + nums[i];
            if(maxEndingHere > maxSoFar){
                maxSoFar = maxEndingHere;
            }
            if(maxSoFar < 0){
                maxSoFar = 0;
            }
        }
        return maxSoFar;
    }
}

Time Complexity: O(N)
Space Complexity: O(1)