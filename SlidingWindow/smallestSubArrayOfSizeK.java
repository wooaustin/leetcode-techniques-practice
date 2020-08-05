class Solution{
    /* EASY Given an array of positive numbers and a positive number ‘S’,
     find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.

    Input: [2, 1, 5, 2, 3, 2], S=7 
    Output: 2
    Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2]. */

    public int findSmallestSubArray(int S, int[] arr){

        //Declarations
        int windowStart = 0, minLength = Integer.MAX_VALUE;
        int windowSum = 0;

        //Normal sliding window traversal
        for(int windowEnd = 0; windowEnd < arr.length;windowEnd++){
            windowSum += arr[windowEnd];
            //Constantly try to shrink the window with each iteration of the for loop, compare to the smallest previously  found length
            while(windowSum >= S){
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }

        //This return statement covers some error checking, if there was no minLength found, then we wouldnt want to return Integer.MAX_LENGTH
        //So instead if minLength == Integer.MAX_VALUE then we return 0, else we return the minLength we found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}