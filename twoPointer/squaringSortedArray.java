/* EASY Problem : Given a sorted array, create a new array containing squares 
                  of all the number of the input array in the sorted order. 
                  
                  Input: [-2, -1, 0, 2, 3]
                  Output: [0, 1, 4, 4, 9]
*/

class Solution{
    public int[] squareSortedArray(int[] arr){
        int left = 0, right = arr.length-1;
        int currIndex = arr.length-1;
        int[] squared = new int[arr.length];
        //Find the larger of the two squared indexes, and build the new array from the end until all values are computed
        while(left <= right){
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if(leftSquare < rightSquare){
                squared[currIndex--] = leftSquare;
                left++;
            }
            else{
                squared[currIndex--] = rightSquare;
                right--;
            }
        }
        return squared;
    }
}