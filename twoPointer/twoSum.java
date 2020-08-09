/* EASY Problem: Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target. */

class Solution{
    public static int[] search(int[] arr, int targetSum) {
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0;i<arr.length;i++){
          if(map.containsKey(targetSum - arr[i])){
            return new int[] { map.get(targetSum - arr[i]), i };
          } 
          else{ 
            map.put(arr[i], i);
          }
        }
        return new int[] { -1, -1 };
    }
}