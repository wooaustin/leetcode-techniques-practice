class Solution{
    /* EASY Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
    Input: [2, 1, 5, 1, 3, 2], k=3 
    Output: 9
    Explanation: Subarray with maximum sum is [5, 1, 3]. */

    public int findMaxSubArray(int k, int[] arr){
        int windowStart = 0, maxSum = 0, currSum = 0;
        for(int windowEnd = 0;windowEnd < arr.length;windowEnd++){
            //Add values arr[windowEnd] to currSum at every step, this is expansion of your window to the right
            currSum += arr[windowEnd];
            //If your window has exceeded K, this means you have built your first total sum of size K elements, now you must shrink your window at each
            //step so you maintain K number of elements
            if(windowEnd >= k-1){
                //Shrink your window by incrementing windowStart
                maxSum = Math.max(maxSum, currSum);
                currSum -= arr[windowStart++];
            }
        }
        return maxSum;
    }
}